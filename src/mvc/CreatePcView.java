package mvc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CreatePcView extends Frame implements WindowListener, ActionListener {
    private final String title;
    public JFrame frame;
    private JTextField name_txt;
    private JButton execute_button;
    private final MdbModel model = new mvc.MdbModel();

    public CreatePcView(String title){
        super(title);
        this.title = title;
        initialize();
        execute_button.addActionListener(this);
    }

    private String get_name() {
        return this.name_txt.getText();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = get_name();
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        dispose();
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    private void initialize() {
        this.frame = GenUIElements.gen_frame(this.title, 50, 50, 350, 250);

        JLabel name_label = GenUIElements.gen_label("Company name", 25, 31, 86, 14);
        frame.getContentPane().add(name_label);

        this.name_txt = GenUIElements.gen_text_field(98, 28, 86, 20);
        frame.getContentPane().add(this.name_txt);
        this.name_txt.setColumns(10);

        this.execute_button = GenUIElements.gen_button("Create", 25, 150, 290, 30);
        this.frame.getContentPane().add(this.execute_button);
    }
}
