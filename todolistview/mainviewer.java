package todolistview;

import javax.swing.*;
import java.awt.*;

public class mainviewer extends JFrame {

    public mainviewer(){
        this.setTitle("to do list <3");
        this.setSize(500, 400);
        this.setLayout(new BorderLayout());
        this.setBackground(Color.PINK);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}
}
