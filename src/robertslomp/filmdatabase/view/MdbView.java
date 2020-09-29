package robertslomp.filmdatabase.view;

import robertslomp.filmdatabase.util.CheckList;

import javax.swing.*;
import java.awt.*;

public class MdbView {
    public CreateActorView create_actor_view = new CreateActorView("Create Actor");
    public CreateFilmView create_film_view = new CreateFilmView("Create Film");
    public CreatePcView create_prod_comp_view = new CreatePcView("Create Production Company");

    public MdbView(){

    }
}