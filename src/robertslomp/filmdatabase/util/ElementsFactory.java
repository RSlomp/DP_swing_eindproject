package robertslomp.filmdatabase.util;

import javax.swing.*;
import java.awt.*;

public class ElementsFactory {
    public static JFrame gen_frame(String title, int x, int y, int width, int height){
        JFrame frame = new JFrame(title);
        frame.setBounds(x, y, width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        return frame;
    }

    public static JLabel gen_label(String text, int x, int y, int width, int height){
        JLabel label = new JLabel(text);
        label.setBounds(x, y, width, height);
        return label;
    }

    public static JTextField gen_text_field(int x, int y, int width, int height){
        JTextField text_field = new JTextField();
        text_field.setBounds(x, y, width, height);
        return text_field;
    }

    public static JComboBox<String> gen_combo_box(String[] values, int x, int y, int width, int height){
        JComboBox<String> box = new JComboBox<>(values);
        box.setBounds(x, y, width, height);
        return box;
    }

    public static JPanel gen_checkbox_list(String[] values, int x, int y, int width, int height){
        JPanel mainPanel = new JPanel();
        CheckList list = new CheckList();
        list.fill_list(values);
        list.setBounds(0, 0, width, height);
        JPanel newPanel = new JPanel();
        newPanel.add(list);
        newPanel.setBounds(0, 0, width+10, height+10);
        JScrollPane pane = new JScrollPane(newPanel);
        pane.setBounds(0, 0, width+15, height+15);
        mainPanel.add(pane);
        mainPanel.setBounds(x, y, width+20, height+20);
        return mainPanel;
    }

    public static JButton gen_button(String text, int x, int y, int width, int height){
        JButton button = new JButton(text);
        button.setBackground(Color.GRAY);
        button.setForeground(Color.BLACK);
        button.setBounds(x, y, width, height);
        return button;
    }
}