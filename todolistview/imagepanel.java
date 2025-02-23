package todolistview;

import javax.swing.*;

public class imagepanel extends JPanel {
    private String placeholder;

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    public imagepanel(String placeholder){
        this.placeholder = placeholder;
    }
}
