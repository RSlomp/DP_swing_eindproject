package robertslomp.filmdatabase.util;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * A UI element for java swing, creating a list of checkboxes.
 */
public class CheckList extends JPanel {
    //private final List<JCheckBox> check_boxes = new ArrayList<>();
    //private JPanel panel = new JPanel(new GridLayout(0, 1));

    /**
     * Creates a new checklist to specifications.
     */
    public CheckList() {
        //super(new GridLayout(0, 1)); //1 column, any number of rows...
        //this.setLayout(new BorderLayout());
        //this.setBounds(0, 0, 300, 400);
        //this.add(this.panel);
        //this.setVisible(true);
        //this.panel.setVisible(true);
    }

    /**
     * Adds a new checkbox item to the list.
     * @param text The text to be displayed.
     * @param x X-coordinate of the checkbox.
     * @param y Y-coordinate of the checkbox.
     * @param width With of the checkbox.
     * @param height Height of the checkbox.
     * @see JCheckBox
     */
    private void add_checkbox(String text, int x, int y, int width, int height){
        JCheckBox box = new JCheckBox(text);
        box.setBounds(x, y, width, height);
        this.add(box);
        //this.add(this.check_boxes.get(this.check_boxes.size()-1));
    }

    /**
     * Fills the checklist with provided items and removes all other.
     * @param values Array of values to be displayed in the checklist.
     */
    public void fill_list(String[] values){
        int x = 10;
        int y = 177;
        //this.check_boxes.clear();

        for (String value : values) {
            add_checkbox(value, x, y, 170, 20);
            y = y + 22;
        }
        refresh_panel();
    }

    /**
     * Gets all the selected items in the list.
     * @return A list of selected items.
     */
    /*public List<String> get_selected_items(){
        List<String> selected = new ArrayList<>();
        for(JCheckBox box : this.check_boxes){
            if(box.isSelected()){
                selected.add(box.getText());
            }
        }
        return selected;
    }*/


    private void refresh_panel(){
        this.removeAll();
        super.removeAll();
        //this.panel.removeAll();
        this.revalidate();
        super.revalidate();
        //this.panel.revalidate();
        this.repaint();
        super.repaint();
        //this.panel.repaint();
    }
}
