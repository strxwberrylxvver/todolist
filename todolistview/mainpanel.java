package todolistview;

import todolistmodel.task;
import todolistmodel.taskgroup;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class mainpanel extends JPanel {
    public taskgroup tg = new taskgroup();

    public mainpanel() {
        if (this != null) {
            this.remove(this);
            this.remove(this);
        //this.setLayout(new GridLayout(0, 1));
        this.setLayout(new BorderLayout());
            JPanel taskpanel = new JPanel();
            taskpanel.setLayout(new GridLayout(0, 1));

        for (task task : tg.getTasks()) {
           // imagepanel i = new imagepanel("filler text");
           // this.add(i, BorderLayout.NORTH);
            rowpanel r = new rowpanel(task, tg);
            taskpanel.add(r);
        }
            JScrollPane scrollPane = new JScrollPane(taskpanel);
            this.add(scrollPane, BorderLayout.CENTER);

            addbuttonpanel a = new addbuttonpanel(tg, taskpanel);
            this.add(a,BorderLayout.SOUTH);
            this.revalidate();
            this.repaint();
    }
    }
}
