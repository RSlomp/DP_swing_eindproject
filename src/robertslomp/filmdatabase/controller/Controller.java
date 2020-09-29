package robertslomp.filmdatabase.controller;

import robertslomp.filmdatabase.model.Actor;
import robertslomp.filmdatabase.model.MdbModel;
import robertslomp.filmdatabase.view.CreateFilmView;
import robertslomp.filmdatabase.view.MdbView;

import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Controller implements PropertyChangeListener {

    private final MdbModel model = new MdbModel();
    private final MdbView view = new MdbView();

    public Controller(){
        model.addPropertyChangeListener(this);
    }

    /*public Actor[] get_actors(){
        return model.get_actors();
    }

    public Actor[] get_companies(){
        return model.get_actors();
    }*/


    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if(evt.getPropertyName().equals("actors")){
            this.model.add_actor((Actor) evt.getNewValue());
        }
    }

    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Controller controller = new Controller();
                    CreateFilmView myWindow = controller.view.create_film_view;
                    myWindow.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

