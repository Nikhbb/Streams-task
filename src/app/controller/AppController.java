package app.controller;

import app.entity.User;
import app.model.AppModel;
import app.view.AppView;

import java.util.List;
import java.util.stream.Collectors;

public class AppController {
    public void run() {
        AppView appView = new AppView();
        AppModel appModel = new AppModel();
        String searchEmailParam = "123";

        appView.printList(appModel.initList(), "BEGIN LIST");
        appView.printList(getFilterListForEmailContains(appModel.initList(), searchEmailParam), "FILTER LIST >> email contains: " + searchEmailParam);
    }

    public List<User> getFilterListForEmailContains(List<User> users, String param) {
        return users.stream().filter(user -> user.getEmail().contains(param)).collect(Collectors.toList());
    }

}
