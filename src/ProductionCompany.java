import java.util.ArrayList;
import java.util.List;

public abstract class ProductionCompany {
    private String name;
    private List<Person> employees = new ArrayList<>();

    public ProductionCompany(String name){
        this.name = name;
    }

    public void add_employee(Person person){
        this.employees.add(person);
    }

    public String get_name() {
        return name;
    }
}