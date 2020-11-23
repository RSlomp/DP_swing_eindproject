package robertslomp.filmdatabase.model;

import robertslomp.filmdatabase.controller.Controller;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class MdbModel {
    private final PropertyChangeSupport support;
    private final Controller controller;

    private List<Film> films = new ArrayList<>();

    public MdbModel(Controller controller) {
        this.controller = controller;
        this.support = new PropertyChangeSupport(this);
    }


    public void create_film(String title, int year, String country, int budget){
        List<Film> films_new = this.films;
        films_new.add(new Film(title, year, country, budget));
        support.firePropertyChange("films", this.films, films_new);
        this.films = films_new;
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


    public void addPropertyChangeListener(String name, PropertyChangeListener pcl) {
        support.addPropertyChangeListener(name, pcl);
    }


    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }
}
