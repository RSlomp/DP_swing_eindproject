package robertslomp.filmdatabase.view;

import robertslomp.filmdatabase.controller.Controller;

public class MdbView {
    public CreateFilmView create_film_view;
    public FilmListView film_list_view;
    public CountryBarChartView country_bar_chart_view;

    public MdbView(Controller controller){
        this.create_film_view = new CreateFilmView("Create Film", controller);
        this.film_list_view = new FilmListView("List of Films");
        this.country_bar_chart_view = new CountryBarChartView("Country Chart");

        this.create_film_view.frame.setVisible(true);
        //this.film_list_view.setVisible(true);
    }

    public CreateFilmView get_create_film_view(){
        return this.create_film_view;
    }

    public void set_create_film_view(CreateFilmView create_film_view){
        this.create_film_view = create_film_view;
        this.create_film_view.frame.setVisible(true);
    }
}