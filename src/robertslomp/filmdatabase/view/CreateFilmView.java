package robertslomp.filmdatabase.view;

import robertslomp.filmdatabase.model.Actor;
import robertslomp.filmdatabase.model.MdbModel;
import robertslomp.filmdatabase.model.ProductionCompany;
import robertslomp.filmdatabase.util.ElementsFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CreateFilmView extends Frame implements WindowListener, ActionListener {
    private String window_title;
    public JFrame frame;
    private JTextField title_txt;
    private JTextField budget_txt;
    private JComboBox<String> country_box;
    private ProductionCompany[] companies;
    private JComboBox<String> company_box;
    private Actor[] actors;
    private JPanel actors_check;
    private JButton execute_button;
    private final MdbModel model = new MdbModel();
    //private final Controller controller = new robertslomp.mvc.Controller();


    public CreateFilmView(String title){
        super(title);
        //this.actors = controller.get_actors();
        //this.companies = controller.get_companies();
        initialize();
    }

    private void initialize(){
        String[] countries = new String[]{"Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra", "Angola",
                "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia",
                "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium",
                "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia and Herzegowina", "Botswana",
                "Bouvet Island", "Brazil", "British Indian Ocean Territory", "Brunei Darussalam", "Bulgaria",
                "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands",
                "Central African Republic", "Chad", "Chile", "China", "Christmas Island", "Cocos (Keeling) Islands",
                "Colombia", "Comoros", "Congo", "Congo, the Democratic Republic of the", "Cook Islands", "Costa Rica",
                "Cote d'Ivoire", "Croatia (Hrvatska)", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti",
                "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea",
                "Eritrea", "Estonia", "Ethiopia", "Falkland Islands (Malvinas)", "Faroe Islands", "Fiji", "Finland",
                "France", "France Metropolitan", "French Guiana", "French Polynesia", "French Southern Territories",
                "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada",
                "Guadeloupe", "Guam", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti",
                "Heard and Mc Donald Islands", "Holy See (Vatican City State)", "Honduras", "Hong Kong", "Hungary",
                "Iceland", "India", "Indonesia", "Iran (Islamic Republic of)", "Iraq", "Ireland", "Israel", "Italy",
                "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati",
                "Korea, Democratic People's Republic of", "Korea, Republic of", "Kuwait", "Kyrgyzstan",
                "Lao, People's Democratic Republic", "Latvia", "Lebanon", "Lesotho", "Liberia",
                "Libyan Arab Jamahiriya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau", "North Macedonia",
                "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique",
                "Mauritania", "Mauritius", "Mayotte", "Mexico", "Micronesia, Federated States of",
                "Moldova, Republic of", "Monaco", "Mongolia", "Montserrat", "Morocco", "Mozambique", "Myanmar",
                "Namibia", "Nauru", "Nepal", "Netherlands", "Netherlands Antilles", "New Caledonia", "New Zealand",
                "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island", "Northern Mariana Islands", "Norway",
                "Oman", "Pakistan", "Palau", "Palestine", "Panama", "Papua New Guinea", "Paraguay", "Peru",
                "Philippines", "Pitcairn", "Poland", "Portugal", "Puerto Rico", "Qatar", "Reunion", "Romania",
                "Russian Federation", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia",
                "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia",
                "Senegal", "Seychelles", "Sierra Leone", "Singapore", "Slovakia (Slovak Republic)", "Slovenia",
                "Solomon Islands", "Somalia", "South Africa", "South Georgia and the South Sandwich Islands",
                "South Sudan", "Spain", "Sri Lanka", "St. Helena", "St. Pierre and Miquelon", "Sudan", "Suriname",
                "Svalbard and Jan Mayen Islands", "Swaziland", "Sweden", "Switzerland", "Syrian Arab Republic",
                "Taiwan, Province of China", "Tajikistan", "Tanzania, United Republic of", "Thailand", "Togo",
                "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan",
                "Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom",
                "United States", "United States Minor Outlying Islands", "Uruguay", "Uzbekistan", "Vanuatu",
                "Venezuela", "Vietnam", "Virgin Islands (British)", "Virgin Islands (U.S.)",
                "Wallis and Futuna Islands", "Western Sahara", "Yemen", "Yugoslavia", "Zambia", "Zimbabwe"};
        //String[] companies = companies_to_string(this.companies);
        //String[] actors = actors_to_string(this.actors);
        String[] companies = {"A", "B"};
        String[] actors = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
                "S", "T", "U", "V", "W", "X", "Y", "Z"};

        this.frame = ElementsFactory.gen_frame(this.window_title, 50, 50, 400, 400 + (25 * actors.length));

        JLabel title_label = ElementsFactory.gen_label("Title", 25, 31, 86, 14);
        frame.getContentPane().add(title_label);

        JLabel budget_label = ElementsFactory.gen_label("Budget", 25, 68, 86, 14);
        frame.getContentPane().add(budget_label);

        JLabel country_label = ElementsFactory.gen_label("Country", 25, 105, 86, 14);
        frame.getContentPane().add(country_label);

        JLabel prod_comp_label = ElementsFactory.gen_label("Production Company", 25, 142, 146, 14);
        frame.getContentPane().add(prod_comp_label);

        this.title_txt = ElementsFactory.gen_text_field(168, 28, 146, 20);
        frame.getContentPane().add(this.title_txt);
        this.title_txt.setColumns(10);

        this.budget_txt = ElementsFactory.gen_text_field(168, 65, 146, 20);
        frame.getContentPane().add(this.budget_txt);
        this.budget_txt.setColumns(10);

        this.country_box = ElementsFactory.gen_combo_box(countries, 168, 102, 170, 20);
        frame.getContentPane().add(this.country_box);

        this.company_box = ElementsFactory.gen_combo_box(companies, 168, 140, 170, 20);
        frame.getContentPane().add(this.company_box);

        this.actors_check = ElementsFactory.gen_checkbox_list(actors, 168, 177, 80, (25 * actors.length));
        frame.getContentPane().add(this.actors_check);

    }

    private String[] companies_to_string(ProductionCompany[] companies){
        String[] company_names = new String[companies.length];
        for (int i = 0; i < companies.length; i++){
            company_names[i] = companies[i].get_name();
        }
        return company_names;
    }

    private String[] actors_to_string(Actor[] actors){
        String[] company_names = new String[actors.length];
        for (int i = 0; i < actors.length; i++){
            company_names[i] = actors[i].get_fullname();
        }
        return company_names;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
