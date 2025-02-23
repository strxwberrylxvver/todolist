package todolistview;

import todolistmodel.task;
import todolistmodel.taskgroup;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

public class rowpanel extends JPanel implements ActionListener {
    private task task = new task();
    private JCheckBox check;
    private taskgroup tg = new taskgroup();

    public rowpanel(task task){
        this.check = new JCheckBox(task.getName());
        this.tg = tg;
        JButton edit = new JButton("Edit");

        check.setPreferredSize(new Dimension(200, 25));
        edit.setPreferredSize(new Dimension(65, 25));

        check.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                tg.getTasks().remove(this.task);
                JPanel parent = (JPanel) getParent();
                parent.remove(this);
                parent.revalidate();
                parent.repaint();
                System.out.println("Checkbox is selected");
            } else {
                System.out.println("Checkbox is deselected");
            }
            });

        edit.addActionListener(this);
        edit.setActionCommand("Edit");

        this.add(check);
        this.add(edit);
        this.revalidate();
        this.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "Edit":
                String newName = JOptionPane.showInputDialog(this, "Edit task name:", check.getText());
                if (newName != null && !newName.trim().isEmpty()) {
                    task.setName(newName);
                    check.setText(newName);
                }
                System.out.println(this.task.getName());
                break;

        }
    }
}
