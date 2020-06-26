package mvc;

import javax.swing.*;
import java.awt.*;

public class MdbView {
    public CreateActorView create_actor_view = new CreateActorView("Create Actor");
    public CreateFilmView create_film_view = new CreateFilmView("Create Film");
    public CreatePcView create_prod_comp_view = new CreatePcView("Create Production Company");

    public MdbView(){

    }
}

interface GenUIElements {
    static JFrame gen_frame(String title, int x, int y, int width, int height){
        JFrame frame = new JFrame(title);
        frame.setBounds(x, y, width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        return frame;
    }

    static JLabel gen_label(String text, int x, int y, int width, int height){
        JLabel label = new JLabel(text);
        label.setBounds(x, y, width, height);
        return label;
    }

    static JTextField gen_text_field(int x, int y, int width, int height){
        JTextField text_field = new JTextField();
        text_field.setBounds(x, y, width, height);
        return text_field;
    }

    static JComboBox<String> gen_combo_box(String[] values, int x, int y, int width, int height){
        JComboBox<String> box = new JComboBox<>(values);
        box.setBounds(x, y, width, height);
        return box;
    }

    static JButton gen_button(String text, int x, int y, int width, int height){
        JButton button = new JButton(text);
        button.setBackground(Color.GRAY);
        button.setForeground(Color.BLACK);
        button.setBounds(x, y, width, height);
        return button;
    }
}