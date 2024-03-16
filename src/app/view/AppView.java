package app.view;

import app.entity.User;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class AppView {
    public void printList(List<User> users, String message) {
        AtomicInteger count = new AtomicInteger(1);
        System.out.println("\n" + message);
        users.stream().forEach(user -> System.out.println(count.getAndIncrement() + ") " + user));
    }
}
