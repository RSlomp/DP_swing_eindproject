package robertslomp.filmdatabase.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class MdbModel {
    private static PropertyChangeSupport support;

    private List<Film> films = new ArrayList<>();
    private List<Actor> actors = new ArrayList<>();

    public MdbModel() {
        support = new PropertyChangeSupport(this);
    }


    public void add_actor(Actor actor){
        this.actors.add(actor);
    }


    public void create_film(String title, int year, String country, int budget, List<Actor> actors){
        List<Film> films_new = this.films;
        films_new.add(new Film(title, year, country, budget, actors));
        support.firePropertyChange("films", this.films, films_new);
        this.films = films_new;
    }


    public void create_actor(String firstname, String lastname, int dob_year, int dob_month, int dob_day){
        List<Actor> actors_new = this.actors;
        actors_new.add(new Actor(firstname, lastname, dob_year, dob_month, dob_day));
        support.firePropertyChange("actors", this.actors, actors_new);
        this.actors = actors_new;
    }


    public List<Film> get_film_by_title(String title){
        List<Film> films_new = this.films;
        List<Film> result = new ArrayList<>();
        for (Film film : films_new){
            if (film.get_title().equals(title)){
                result.add(film);
            }
        }
        return result;
    }


    public List<Film> get_film_by_year(int year){
        List<Film> films_new = this.films;
        List<Film> result = new ArrayList<>();
        for (Film film : films_new){
            if (film.get_year() == year){
                result.add(film);
            }
        }
        return result;
    }


    public List<Film> get_film_by_country(String country){
        List<Film> films_new = this.films;
        List<Film> result = new ArrayList<>();
        for (Film film : films_new){
            if (film.get_country().equals(country)){
                result.add(film);
            }
        }
        return result;
    }


    public List<Actor> get_all_actors(){
        return this.actors;
    }


    public List<Actor> get_actor_by_name(String firstname, String lastname){
        List<Actor> actors_new = this.actors;
        List<Actor> result = new ArrayList<>();
        for (Actor actor : actors_new){
            if(firstname.isEmpty()){
                if (actor.get_lastname().equals(lastname)){
                    result.add(actor);
                }
            }
            else if(lastname.isEmpty()){
                if (actor.get_firstname().equals(firstname)){
                    result.add(actor);
                }
            }
            else {
                if (actor.get_firstname().equals(firstname) && actor.get_lastname().equals(lastname)){
                    result.add(actor);
                }
            }
        }
        return result;
    }


    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }


    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }
}
