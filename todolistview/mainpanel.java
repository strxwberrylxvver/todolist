package todolistview;

import todolistmodel.task;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class mainpanel extends JPanel {
    private ArrayList<task> tasks = new ArrayList<>();

    public mainpanel(){
        this.setLayout(new GridLayout(0, 1));

        tasks.add(new task("tester"));
        tasks.add(new task("homework"));
        tasks.add(new task("job"));

        for (task task: tasks){
            rowpanel r = new rowpanel();
            this.add(r, BorderLayout.SOUTH);

        }
    }
}
