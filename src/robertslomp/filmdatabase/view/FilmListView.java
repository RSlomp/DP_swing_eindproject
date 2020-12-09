package robertslomp.filmdatabase.view;

import robertslomp.filmdatabase.util.CheckList;
import robertslomp.filmdatabase.util.ElementsFactory;

import javax.swing.*;
import java.awt.event.ActionEvent;


public class FilmListView extends View{
    private JFrame frame;
    private JPanel panel;
    private CheckList checklist;
    private JButton execute_button;

    public FilmListView(String title) {
        super(title);
        this.setBounds(200, 0, 400, 500);
        initialize(title);
    }


    public void add_items(String[] values){
        this.checklist.fill_list(values);
    }


    @Override
    public void actionPerformed(ActionEvent e){

    }


    @Override
    protected void initialize(String title){
        String[] list_of_film_titles = new String[0];

        //this.frame = ElementsFactory.gen_frame(title, 0, 0, 400, 500);
        //this.setSize(400, 500);
        this.setVisible(true);
        //this.add(this.frame);

        this.panel = ElementsFactory.gen_panel(0, 0, 400, 500, 0);
        this.panel.setVisible(true);
        this.add(this.panel);

        this.checklist = ElementsFactory.gen_checkbox_list(list_of_film_titles, 10, 10, 300, 400);
        this.checklist.setVisible(true);
        this.panel.add(this.checklist);

        //this.execute_button = ElementsFactory.gen_button("Remove", 50, 335, 300, 30);
        //this.add(this.execute_button);
        //this.execute_button.addActionListener(this);
    }
}
