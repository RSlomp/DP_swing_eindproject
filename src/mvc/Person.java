package mvc;

public class Person {
    private String firstname;
    private String lastname;
    private DOB date_of_birth;

    public Person(String firstname, String lastname, int dob_year, int dob_month, int dob_day){
        this.firstname = firstname;
        this.lastname = lastname;
        this.date_of_birth = new DOB(dob_year, dob_month, dob_day);
    }
    public Person(String name, int dob_year, int dob_month, int dob_day){
        set_name(name);
        this.date_of_birth = new DOB(dob_year, dob_month, dob_day);
    }

    public String get_firstname(){
        return this.firstname;
    }

    public String get_lastname(){
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
        private int year;
        private int month;
        private int day;

        protected DOB(int year, int month, int day){
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public int get_day(){
            return this.day;
        }

        public int get_month(){
            return this.month;
        }

        public int get_year(){
            return this.year;
        }

        public String get_date(){
            return this.year + "-" + this.month + "-" + this.day;
        }
    }
}