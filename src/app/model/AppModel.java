package app.model;

import app.entity.User;

import java.util.Arrays;
import java.util.List;

public class AppModel {
    public List<User> initList() {
        return Arrays.asList(
                new User("Ann", "a123@gmail.com"),
                new User("Ivan", "ivan23@gmail.com"),
                new User("Jon", "jon91234@i.ua"),
                new User("Tom", "t123om@ukr.net"),
                new User("Fox", "fox@i.ua")
        );
    }

}
