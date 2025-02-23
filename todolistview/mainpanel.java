package todolistview;

import todolistmodel.task;
import todolistmodel.taskgroup;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class mainpanel extends JPanel {
    private taskgroup tg = new taskgroup();

    public mainpanel() {
        if (this != null) {
            this.remove(this);
            this.remove(this);
        this.setLayout(new GridLayout(0, 1));

        for (task task : tg.getTasks()) {
            imagepanel i = new imagepanel("filler text" +
                    "fillerrrrr" +
                    "fillerrrr");
            this.add(i, BorderLayout.NORTH);
            rowpanel r = new rowpanel(task);
            this.add(r, BorderLayout.SOUTH);

        }
            this.revalidate();
            this.repaint();
    }
    }
}
