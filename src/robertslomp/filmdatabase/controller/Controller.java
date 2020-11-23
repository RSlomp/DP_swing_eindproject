package robertslomp.filmdatabase.controller;

import robertslomp.filmdatabase.model.MdbModel;
import robertslomp.filmdatabase.view.MdbView;

import java.awt.*;

public class Controller /*implements PropertyChangeListener*/ {

    private final MdbModel model = new MdbModel(this);
    private final MdbView view = new MdbView(this);

    public Controller(){
        //model.addPropertyChangeListener("actors", this);
    }


    public void create_film(String title, int year, String country, int budget){
        model.create_film(title, year, country, budget);
    }


    //@Override
   /* public void propertyChange(PropertyChangeEvent evt) {
        if(evt.getPropertyName().equals("actors")){
            //this.model.add_actor((Actor) evt.getNewValue());
            this.view.get_create_film_view().update_actors(this.model.get_all_actors());
        }
    }*/

    public static void main(String[] args)
    {
        EventQueue.invokeLater(() -> {
            try {
                Controller controller = new Controller();

                //CreateFilmView create_film_view = controller.view.get_create_film_view();
                //create_film_view.frame.setVisible(true);

                //CreateActorView create_actor_view = controller.view.get_create_actor_view();
                //create_actor_view.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}

