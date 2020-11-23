package robertslomp.filmdatabase.view;

import robertslomp.filmdatabase.controller.Controller;
import robertslomp.filmdatabase.util.CheckList;

import javax.swing.*;
import java.awt.*;

public class MdbView {
    public CreateFilmView create_film_view;

    public MdbView(Controller controller){
        this.create_film_view = new CreateFilmView("Create Film", controller);

        this.create_film_view.frame.setVisible(true);
    }

    public CreateFilmView get_create_film_view(){
        return this.create_film_view;
    }

    public void set_create_film_view(CreateFilmView create_film_view){
        //this.create_film_view.frame.setVisible(false);
        this.create_film_view = create_film_view;
        this.create_film_view.frame.setVisible(true);
    }
}