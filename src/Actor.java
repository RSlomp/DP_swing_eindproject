import java.util.ArrayList;
import java.util.List;

public class Actor extends Person{
    private List<Role> roles = new ArrayList<>();

    public Actor(String firstname, String lastname, int dob_day, int dob_month, int dob_year) {
        super(firstname, lastname, dob_day, dob_month, dob_year);
    }

    public void add_role(Film film, String role_name, String role_type){
        this.roles.add(new Role(film, role_name, role_type));
    }

    public List<Role> get_roles_by_film(Film film){
        List<Role> roles = new ArrayList<>();

        for (int i = 0; i < this.roles.size(); i++) {
            if(this.roles.get(i).get_film() == film) {
                roles.add(this.roles.get(i));
            }
        }
        return roles;
    }

    public List<Role> get_roles_by_name(String role_name){
        List<Role> roles = new ArrayList<>();

        for (int i = 0; i < this.roles.size(); i++) {
            if(this.roles.get(i).get_name().equals(role_name)) {
                roles.add(this.roles.get(i));
            }
        }
        return roles;
    }

    public List<Role> get_roles_by_type(String role_type){
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

        public Film get_film(){
            return this.film;
        }

        public String get_name() {
            return this.name;
        }

        public String get_type() {
            return this.type;
        }
    }
}
