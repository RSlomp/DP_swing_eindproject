package robertslomp.filmdatabase.view;

import robertslomp.filmdatabase.controller.Controller;
import robertslomp.filmdatabase.util.CheckList;

import javax.swing.*;
import java.awt.*;

public class MdbView {
    private final CreateActorView create_actor_view;
    private final CreateFilmView create_film_view;

    public MdbView(Controller controller){
        this.create_actor_view = new CreateActorView("Create Actor", controller);
        this.create_film_view = new CreateFilmView("Create Film", controller);
    }

    public CreateFilmView get_create_film_view(){
        return this.create_film_view;
    }

    public CreateActorView get_create_actor_view(){
        return this.create_actor_view;
    }
}