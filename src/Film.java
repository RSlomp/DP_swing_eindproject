import java.util.ArrayList;
import java.util.List;

public abstract class Film {
    private String title;
    private int year;
    private String country;
    private int budget;
    private ProductionCompany production_company;
    private List<Actor> actors = new ArrayList<>();
    private List<Person> crew = new ArrayList<>();

    public Film(String title, int year, String country, int budget, ProductionCompany production_company, List<Actor> actors, List<Person> crew) {
        this.title = title;
        this.year = year;
        this.country = country;
        this.budget = budget;
        this.production_company = production_company;
        this.actors = actors;
        this.crew = crew;
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

    public ProductionCompany get_production_company(){
        return this.production_company;
    }

    public List<Actor> get_all_actors(){
        return actors;
    }

    public Actor get_actor_by_name(String fullname){
        for (int i = 0; i < this.actors.size(); i++) {
            if(this.actors.get(i).get_fullname().equals(fullname)) {
                return this.actors.get(i);
            }
        }
        return null;
    }

    public List<Person> get_all_crew(){
        return crew;
    }
}
