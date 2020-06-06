import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class MdbModel {
    private PropertyChangeSupport support;

    private List<Film> films = new ArrayList<>();
    private List<Actor> actors = new ArrayList<>();
    private List<Person> crew = new ArrayList<>();
    private List<ProductionCompany> production_companies = new ArrayList<>();

    public MdbModel() {
        support = new PropertyChangeSupport(this);
    }

    public void add_film(String title, int year, String country, int budget, ProductionCompany production_company, List<Actor> actors, List<Person> crew){
        List<Film> films_new = this.films;
        films_new.add(new Film(title, year, country, budget, production_company, actors, crew));
        support.firePropertyChange("films", this.films, films_new);
        this.films = films_new;
    }

    public void add_actor(String firstname, String lastname, int dob_day, int dob_month, int dob_year){
        List<Actor> actors_new = this.actors;
        actors_new.add(new Actor(firstname, lastname, dob_day, dob_month, dob_year));
        support.firePropertyChange("actors", this.actors, actors_new);
        this.actors = actors_new;
    }

    public void add_crew(String firstname, String lastname, int dob_day, int dob_month, int dob_year){
        List<Person> crew_new = this.crew;
        crew_new.add(new Person(firstname, lastname, dob_day, dob_month, dob_year));
        support.firePropertyChange("crew", this.crew, crew_new);
        this.crew = crew_new;
    }

    public void add_production_company(String name){
        List<ProductionCompany> pr_comps_new = this.production_companies;
        pr_comps_new.add(new ProductionCompany(name));
        support.firePropertyChange("production_companies", this.production_companies, pr_comps_new);
        this.production_companies = pr_comps_new;
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }
}
