package menu;

import tasks.TaskInterface;

import java.util.Collections;
import java.util.LinkedList;

public class MenuGroup implements TaskInterface {
    public MenuGroup(String name, TaskInterface... tasks) {
        this.name = name;
        Collections.addAll(this.menuItems, tasks);
    }
    final String name;
    LinkedList<TaskInterface> menuItems = new LinkedList<>();
    @Override
    public void act() {
        MenuHandler menuHandler = new MenuHandler(menuItems);
        menuHandler.act();
    }

    @Override
    public String getName() {
        return this.name;
    }
}
