package robertslomp.filmdatabase.model;

import java.util.ArrayList;
import java.util.List;

public class Actor extends Person{
    private List<Role> roles = new ArrayList<>();

    protected Actor(String firstname, String lastname, int dob_year, int dob_month, int dob_day) {
        super(firstname, lastname, dob_year, dob_month, dob_day);
    }

    protected void add_role(Film film, String role_name, String role_type){
        this.roles.add(new Role(film, role_name, role_type));
    }

    protected List<Role> get_roles_by_film(Film film){
        List<Role> roles = new ArrayList<>();

        for (int i = 0; i < this.roles.size(); i++) {
            if(this.roles.get(i).get_film() == film) {
                roles.add(this.roles.get(i));
            }
        }
        return roles;
    }

    protected List<Role> get_roles_by_name(String role_name){
        List<Role> roles = new ArrayList<>();

        for (int i = 0; i < this.roles.size(); i++) {
            if(this.roles.get(i).get_name().equals(role_name)) {
                roles.add(this.roles.get(i));
            }
        }
        return roles;
    }

    protected List<Role> get_roles_by_type(String role_type){
        List<Role> roles = new ArrayList<>();

        for (int i = 0; i < this.roles.size(); i++) {
            if(this.roles.get(i).get_type().equals(role_type)) {
                roles.add(this.roles.get(i));
            }
        }
        return roles;
    }

    private class Role{
        private Film film;
        private String name;
        private String type; //i.e. main, supportive, voice-only, self...

        protected Role(Film film, String name, String type){
            this.film = film;
            this.name = name;
            this.type = type;
        }

        protected Film get_film(){
            return this.film;
        }

        protected String get_name() {
            return this.name;
        }

        protected String get_type() {
            return this.type;
        }
    }
}
