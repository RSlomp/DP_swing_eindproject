package robertslomp.filmdatabase.model;

public class Person {
    private String firstname;
    private String lastname;
    private final DOB date_of_birth;

    protected Person(String firstname, String lastname, int dob_year, int dob_month, int dob_day){
        this.firstname = firstname;
        this.lastname = lastname;
        this.date_of_birth = new DOB(dob_year, dob_month, dob_day);
    }
    protected Person(String name, int dob_year, int dob_month, int dob_day){
        set_name(name);
        this.date_of_birth = new DOB(dob_year, dob_month, dob_day);
    }

    protected String get_firstname(){
        return this.firstname;
    }

    protected String get_lastname(){
        return this.lastname;
    }

    public String get_fullname(){
        return this.firstname + " " + this.lastname;
    }

    private void set_name(String name){
        String[] names = name.split(" ");
        this.firstname = names[0];
        this.lastname = names[1];
    }

    private static class DOB{
        private final int year;
        private final int month;
        private final int day;

        protected DOB(int year, int month, int day){
            this.day = day;
            this.month = month;
            this.year = year;
        }

        protected int get_day(){
            return this.day;
        }

        protected int get_month(){
            return this.month;
        }

        protected int get_year(){
            return this.year;
        }

        protected String get_date(){
            return this.year + "-" + this.month + "-" + this.day;
        }
    }
}