package robertslomp.filmdatabase.util;

import javax.swing.*;
import java.awt.*;


/**
 * Factory Pattern for UI elements.
 */
public class ElementsFactory {
    /**
     * Creates a new frame to specification.
     * @param title Frame title.
     * @param x X-coordinate of the frame.
     * @param y Y-coordinate of the frame.
     * @param width Width of the frame.
     * @param height Height of the frame.
     * @return Created frame.
     * @see JFrame
     */
    public static JFrame gen_frame(String title, int x, int y, int width, int height){
        JFrame frame = new JFrame(title);
        frame.setBounds(x, y, width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        return frame;
    }


    /**
     * Creates a new label to specification.
     * @param text The text to be displayed.
     * @param x X-coordinate of the label.
     * @param y Y-coordinate of the label.
     * @param width Width of the label.
     * @param height Height of the label.
     * @return Created label.
     * @see JLabel
     */
    public static JLabel gen_label(String text, int x, int y, int width, int height){
        JLabel label = new JLabel(text);
        label.setBounds(x, y, width, height);
        return label;
    }


    /**
     * Creates a new text field to specifications.
     * @param x X-coordinate of the text field.
     * @param y Y-coordinate of the text field.
     * @param width Width of the text field.
     * @param height Height of the text field.
     * @return Created text field.
     * @see JTextField
     */
    public static JTextField gen_text_field(int x, int y, int width, int height){
        JTextField text_field = new JTextField();
        text_field.setBounds(x, y, width, height);
        return text_field;
    }


    /**
     * Creates a new combo-box to specifications.
     * @param values Array of values to be displayed in the combo-box.
     * @param x X-coordinate of the combo-box.
     * @param y Y-coordinate of the combo-box.
     * @param width Width of the combo-box.
     * @param height Height of the combo-box.
     * @return Created combo-box.
     * @see JComboBox
     */
    public static JComboBox<String> gen_combo_box(String[] values, int x, int y, int width, int height){
        JComboBox<String> box = new JComboBox<>(values);
        box.setBounds(x, y, width, height);
        return box;
    }


    /**
     * Creates a new checklist to specifications.
     * @param values Array of values to be displayed in the checklist.
     * @param x X-coordinate of the checklist.
     * @param y Y-coordinate of the checklist.
     * @param width Width of the checklist.
     * @param height Height of the checklist.
     * @return Created Checklist.
     * @see CheckList
     */
    public static CheckList gen_checkbox_list(String[] values, int x, int y, int width, int height){
        //JPanel mainPanel = new JPanel();
        CheckList list = new CheckList();
        list.fill_list(values);
        list.setBounds(x, y, width, height);
        /*JPanel newPanel = new JPanel();
        newPanel.add(list);
        newPanel.setBounds(0, 0, width+10, height+10);
        JScrollPane pane = new JScrollPane(newPanel);
        pane.setBounds(0, 0, width+15, height+15);
        mainPanel.add(pane);
        mainPanel.setBounds(x, y, width+20, height+20);*/
        return list;
    }


    /**
     * Creates a new button to specification.
     * @param text The text to be displayed on the button.
     * @param x X-coordinate of the button.
     * @param y Y-coordinate of the button.
     * @param width Width of the button.
     * @param height Height of the button.
     * @return Created button.
     * @see JButton
     */
    public static JButton gen_button(String text, int x, int y, int width, int height){
        JButton button = new JButton(text);
        button.setBackground(Color.GRAY);
        button.setForeground(Color.BLACK);
        button.setBounds(x, y, width, height);
        return button;
    }
}