package mvc;

import javax.swing.*;
import java.awt.*;

public class CheckList extends JPanel {

    public CheckList() {
        super(new GridLayout(0, 1)); //1 column, any number of rows...
    }

    public void add_checkbox(String text){
        super.add(new JCheckBox(text));
    }

    public void fill_list(String[] values){
        for (int i = 0; i < values.length; i++){
            add_checkbox(values[i]);
        }
    }
}
