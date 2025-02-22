package todolistmodel;

import java.util.ArrayList;

public class taskgroup {
    static ArrayList<task>tasks = new ArrayList<>();

    public static ArrayList<task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<task> tasks) {
        this.tasks = tasks;
    }

    public taskgroup()
    {}

}
