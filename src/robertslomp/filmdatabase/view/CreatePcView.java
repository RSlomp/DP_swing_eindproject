package robertslomp.filmdatabase.view;

import robertslomp.filmdatabase.model.MdbModel;
import robertslomp.filmdatabase.util.ElementsFactory;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

public class CreatePcView extends CreateView {
    private final String title;
    public JFrame frame;
    private JTextField name_txt;
    private JButton execute_button;
    private final MdbModel model = new MdbModel();

    public CreatePcView(String title){
        super(title);
        this.title = title;
        initialize();
        execute_button.addActionListener(this);
    }


    private String get_name() {
        return this.name_txt.getText();
    }


    public void create_object(String name){
        model.create_production_company(name);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String name = get_name();
        create_object(name);
    }


    @Override
    public void windowClosing(WindowEvent e) {
        dispose();
        System.exit(0);
    }


    protected void initialize() {
        this.frame = ElementsFactory.gen_frame(this.title, 50, 50, 280, 150);

        JLabel name_label = ElementsFactory.gen_label("Company name", 25, 31, 95, 14);
        frame.getContentPane().add(name_label);

        this.name_txt = ElementsFactory.gen_text_field(120, 28, 120, 20);
        frame.getContentPane().add(this.name_txt);
        this.name_txt.setColumns(10);

        this.execute_button = ElementsFactory.gen_button("Create", 25, 70, 215, 30);
        this.frame.getContentPane().add(this.execute_button);
    }
}
