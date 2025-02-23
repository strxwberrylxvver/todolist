package todolistmodel;

import java.util.ArrayList;

public class taskgroup {
    private ArrayList<task>tasks = new ArrayList<>();

    public ArrayList<task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<task> tasks) {
        this.tasks = tasks;
    }

    public taskgroup()
    {
        tasks.add(new task("tester"));
        tasks.add(new task("homework"));
        tasks.add(new task("job"));
    }

}
