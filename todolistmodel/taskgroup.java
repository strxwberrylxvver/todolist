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

    public void addTask(task t){
        tasks.add(t);
    }

    public taskgroup()
    {
        tasks.add(new task("write your first task!"));
        tasks.add(new task("write your first task!"));
        tasks.add(new task("write your first task!"));
        tasks.add(new task("write your first task!"));
        tasks.add(new task("write your first task!"));
        tasks.add(new task("write your first task!"));
        tasks.add(new task("write your first task!"));
        tasks.add(new task("write your first task!"));
        tasks.add(new task("write your first task!"));
        tasks.add(new task("write your first task!"));
    }

}
