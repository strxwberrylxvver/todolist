package todolistview;

import todolistmodel.task;
import todolistmodel.taskgroup;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

public class rowpanel extends JPanel implements ActionListener {
task task;
    public rowpanel(){
        Checkbox check = new Checkbox(task.getName());
            JButton edit = new JButton("Edit");
            JButton delete = new JButton("Delete");

            check.setPreferredSize(new Dimension(200, 25));
            edit.setPreferredSize(new Dimension(65, 25));
            delete.setPreferredSize(new Dimension(65, 25));

        check.addItemListener(e -> {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Checkbox is selected");
                } else {
                    System.out.println("Checkbox is deselected");
                }
            });

            edit.addActionListener(this);
            edit.setActionCommand("Edit");
            delete.addActionListener(this);
            delete.setActionCommand("Delete");

            this.add(check);
            this.add(edit);
            this.add(delete);
       // }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "Edit":
                System.out.println("Edit");
                break;

            case "Delete":
                System.out.println("Delete");
                break;
        }
    }
}
