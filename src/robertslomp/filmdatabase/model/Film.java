package robertslomp.filmdatabase.model;

import java.util.ArrayList;
import java.util.List;

public class Film {
    private final String title;
    private final int year;
    private final String country;
    private final int budget;
    //private final ProductionCompany production_company;
    private List<Actor> actors = new ArrayList<>();

    public Film(String title, int year, String country, int budget, List<Actor> actors) {
        this.title = title;
        this.year = year;
        this.country = country;
        this.budget = budget;
        this.actors = actors;
    }

    public String get_title() {
        return title;
    }

    public int get_year() {
        return year;
    }

    public String get_country() {
        return country;
    }

    public int get_budget() {
        return budget;
    }


    public List<Actor> get_all_actors(){
        return actors;
    }

    public Actor get_actor_by_name(String firstname, String lastname){
        for (Actor actor : this.actors) {
            if (actor.get_firstname().equals(firstname) && actor.get_lastname().equals(lastname)) {
                return actor;
            }
        }
        return null;
    }
}
