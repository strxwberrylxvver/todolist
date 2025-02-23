package todolistview;

import todolistmodel.task;
import todolistmodel.taskgroup;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addbuttonpanel extends JPanel implements ActionListener {
    private JButton add = new JButton("+");
    private taskgroup tg;
    private JPanel tp;

    public addbuttonpanel(taskgroup tg, JPanel tp)
    {
        this.tg = tg;
        this.tp = tp;
        add.addActionListener(this);
        add.setActionCommand("Add");
        this.add(add);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = JOptionPane.showInputDialog(this,"add new task");
        if (input != null && !input.trim().isEmpty()) {
            task newt = new task(input);
            tg.addTask(newt);
            rowpanel r = new rowpanel(newt, tg);
            tp.add(r);
            tp.revalidate();
            tp.repaint();
        }
    }
}
