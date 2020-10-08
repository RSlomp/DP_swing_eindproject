package robertslomp.filmdatabase.controller;

import robertslomp.filmdatabase.model.Actor;
import robertslomp.filmdatabase.model.MdbModel;
import robertslomp.filmdatabase.view.CreateFilmView;
import robertslomp.filmdatabase.view.MdbView;

import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

public class Controller implements PropertyChangeListener {

    private final MdbModel model = new MdbModel();
    private final MdbView view = new MdbView(this);

    public Controller(){
        model.addPropertyChangeListener(this);
    }


    public void create_actor(String firstname, String lastname, int[] dob){
        model.create_actor(firstname, lastname, dob[0], dob[1], dob[2]);
    }


    public void create_film(String title, int year, String country, int budget, List<Actor> actors){
        model.create_film(title, year, country, budget, actors);
    }


    public List<Actor> get_actor_by_name(String firstname, String lastname){
        return model.get_actor_by_name(firstname, lastname);
    }


    public List<Actor> get_all_actors(){
        return model.get_all_actors();
    }


    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if(evt.getPropertyName().equals("actors")){
            this.model.add_actor((Actor) evt.getNewValue());
        }
    }

    public static void main(String[] args)
    {
        EventQueue.invokeLater(() -> {
            try {
                Controller controller = new Controller();
                CreateFilmView myWindow = controller.view.get_create_film_view();
                myWindow.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}

