package robertslomp.filmdatabase.model;

import java.util.ArrayList;
import java.util.List;

public class Film {
    private final String title;
    private final int year;
    private final String country;
    private final int budget;

    public Film(String title, int year, String country, int budget) {
        this.title = title;
        this.year = year;
        this.country = country;
        this.budget = budget;
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
}
