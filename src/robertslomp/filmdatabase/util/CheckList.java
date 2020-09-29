package robertslomp.filmdatabase.util;

import javax.swing.*;
import java.awt.*;

public class CheckList extends JPanel {

    public CheckList() {
        super(new GridLayout(0, 1)); //1 column, any number of rows...
    }

    public void add_checkbox(String text, int x, int y, int width, int height){
        JCheckBox box = new JCheckBox(text);
        box.setBounds(x, y, width, height);
        this.add(box);
    }

    public void fill_list(String[] values){
        int x = 0;
        int y = 177;
        for (int i = 0; i < values.length; i++){
            add_checkbox(values[i], x, y, 170, 20);
            y = y + 22;
        }
    }
}
