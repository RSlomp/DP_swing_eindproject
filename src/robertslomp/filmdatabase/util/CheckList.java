package robertslomp.filmdatabase.util;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CheckList extends JPanel {
    private final List<JCheckBox> check_boxes = new ArrayList<>();

    public CheckList() {
        super(new GridLayout(0, 1)); //1 column, any number of rows...
    }

    public void add_checkbox(String text, int x, int y, int width, int height){
        JCheckBox box = new JCheckBox(text);
        box.setBounds(x, y, width, height);
        this.check_boxes.add(box);
        this.add(this.check_boxes.get(this.check_boxes.size()-1));
    }

    public void fill_list(String[] values){
        int x = 0;
        int y = 177;
        for (String value : values) {
            add_checkbox(value, x, y, 170, 20);
            y = y + 22;
        }
    }

    public List<String> get_selected_items(){
        List<String> selected = new ArrayList<>();
        for(JCheckBox box : this.check_boxes){
            if(box.isSelected()){
                selected.add(box.getText());
            }
        }
        return selected;
    }
}
