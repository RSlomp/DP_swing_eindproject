package robertslomp.filmdatabase.view;

import robertslomp.filmdatabase.controller.Controller;
import robertslomp.filmdatabase.util.ElementsFactory;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class CreateActorView extends View {
    private final String title;
    public JFrame frame;
    private JTextField firstname_txt;
    private JTextField lastname_txt;
    private JComboBox<String> day_box;
    private JComboBox<String> month_box;
    private JComboBox<String> year_box;
    private JButton execute_button;
    private final Controller controller;

    public CreateActorView(String title, Controller controller) {
        super(title);
        this.title = title;
        this.controller = controller;
        initialize();
        execute_button.addActionListener(this);
    }


    private String get_firstname() {
        return this.firstname_txt.getText();
    }


    private String get_lastname() {
        return this.lastname_txt.getText();
    }


    private int[] get_dob() {
        int day = 0;
        int month = 0;
        int year = 0;

        if (this.day_box.getSelectedItem() != null) day = this.day_box.getSelectedIndex() + 1;
        if (this.month_box.getSelectedItem() != null) month = this.day_box.getSelectedIndex() + 1;
        if (this.year_box.getSelectedItem() != null) year = this.day_box.getSelectedIndex() + 1;

        return new int[]{year, month, day};
    }


    public void create_object(String firstname, String lastname, int[] dob){
        controller.create_actor(firstname, lastname, dob);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String firstname = get_firstname();
        String lastname = get_lastname();
        int[] dob = get_dob();

        create_object(firstname, lastname, dob);
    }


    @Override
    protected void initialize() {
        this.frame = ElementsFactory.gen_frame(this.title, 50, 50, 350, 250);

        JLabel firstname_label = ElementsFactory.gen_label("First name", 25, 31, 86, 14);
        frame.getContentPane().add(firstname_label);

        JLabel lastname_label = ElementsFactory.gen_label("Last name", 25, 68, 86, 14);
        frame.getContentPane().add(lastname_label);

        JLabel dob_label = ElementsFactory.gen_label("Date of Birth", 25, 105, 86, 14);
        frame.getContentPane().add(dob_label);

        this.firstname_txt = ElementsFactory.gen_text_field(98, 28, 86, 20);
        frame.getContentPane().add(this.firstname_txt);
        this.firstname_txt.setColumns(10);

        this.lastname_txt = ElementsFactory.gen_text_field(98, 65, 86, 20);
        frame.getContentPane().add(this.lastname_txt);
        this.lastname_txt.setColumns(10);

        String[] days = int_array(1, 31);
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        String[] years = int_array(1850, 2020);

        this.day_box = ElementsFactory.gen_combo_box(days, 98, 102, 40, 20);
        frame.getContentPane().add(this.day_box);

        this.month_box = ElementsFactory.gen_combo_box(months, 155, 102, 80, 20);
        frame.getContentPane().add(this.month_box);

        this.year_box = ElementsFactory.gen_combo_box(years, 252, 102, 60, 20);
        frame.getContentPane().add(this.year_box);

        this.execute_button = ElementsFactory.gen_button("Create", 25, 150, 290, 30);
        this.frame.getContentPane().add(this.execute_button);
        this.execute_button.addActionListener(this);
    }


    private String[] int_array(int first_value, int last_value) {
        String[] array = new String[last_value - first_value + 1];
        int pos = 0;
        for (int i = first_value; i < (last_value + 1); i++) {
            array[pos] = String.valueOf(i);
            pos++;
        }
        return array;
    }
}


