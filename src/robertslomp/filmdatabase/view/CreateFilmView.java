package robertslomp.filmdatabase.view;

import robertslomp.filmdatabase.controller.Controller;
import robertslomp.filmdatabase.util.ElementsFactory;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.event.ActionEvent;


public class CreateFilmView extends View {
    public JFrame frame;
    private JPanel panel;
    private JTextField title_txt;
    private JTextField year_txt;
    private JTextField budget_txt;
    private JComboBox<String> country_box;
    private JButton execute_button;
    private final Controller controller;


    public CreateFilmView(String title, Controller controller) {
        super(title);
        this.controller = controller;
        initialize(title);
    }


    public void create_object(String title, int year, String country, int budget){
        controller.create_film(title, year, country, budget);
    }

    @Override
    public void refresh_frame(){
        //this.frame.removeAll();
//        this.removeAll();
        this.frame.revalidate();
//        this.revalidate();
        this.frame.repaint();
//        this.repaint();
        this.frame.revalidate();
        SwingUtilities.updateComponentTreeUI(this.frame);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        GetString get_string = JTextComponent::getText;
        GetInt get_int = (JTextField txt) -> Integer.parseInt(txt.getText());
        GetBoxItem get_box_item = (JComboBox<String> box) -> (String) box.getSelectedItem();

        String title = get_string.get_value(title_txt);
        int year = get_int.get_value(year_txt);
        String country = get_box_item.get_value(country_box);
        int budget = get_int.get_value(budget_txt);

        refresh_frame();
        create_object(title, year, country, budget);
    }


    @Override
    protected void initialize(String title) {
        String[] countries = new String[]{"Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra", "Angola",
                "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia",
                "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium",
                "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana",
                "Bouvet Island", "Brazil", "British Indian Ocean Territory", "Brunei Darussalam", "Bulgaria",
                "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands",
                "Central African Republic", "Chad", "Chile", "China", "Christmas Island", "Cocos (Keeling) Islands",
                "Colombia", "Comoros", "Congo", "Congo, the Democratic Republic of the", "Cook Islands", "Costa Rica",
                "Cote d'Ivoire", "Croatia (Hrvatska)", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti",
                "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea",
                "Eritrea", "Estonia", "Ethiopia", "Faeroe Islands", "Falkland Islands (Malvinas)", "Fiji", "Finland",
                "France", "France Metropolitan", "French Guiana", "French Polynesia", "French Southern Territories",
                "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada",
                "Guadeloupe", "Guam", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti",
                "Heard and Mc Donald Islands", "Holy See (Vatican City State)", "Honduras", "Hong Kong", "Hungary",
                "Iceland", "India", "Indonesia", "Iran (Islamic Republic of)", "Iraq", "Ireland", "Israel", "Italy",
                "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati",
                "Korea, Democratic People's Republic of", "Korea, Republic of", "Kuwait", "Kyrgyzstan",
                "Lao, People's Democratic Republic", "Latvia", "Lebanon", "Lesotho", "Liberia",
                "Libyan Arab Jamahiriya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau", "Madagascar",
                "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania",
                "Mauritius", "Mayotte", "Mexico", "Micronesia, Federated States of", "Moldova, Republic of",
                "Monaco", "Mongolia", "Montserrat", "Morocco", "Mozambique", "Myanmar", "Namibia",
                "Nauru", "Nepal", "Netherlands", "Netherlands Antilles", "New Caledonia", "New Zealand", "Nicaragua",
                "Niger", "Nigeria", "Niue", "Norfolk Island", "North Macedonia", "Northern Mariana Islands", "Norway",
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

        this.frame = ElementsFactory.gen_frame(title, 50, 50, 400, 400);

        this.panel = ElementsFactory.gen_panel(0, 0, 400, 400, 2);
        //this.frame.add(this.panel);


        JLabel title_label = ElementsFactory.gen_label("Title", 25, 31, 86, 14);
        this.frame.add(title_label);

        JLabel budget_label = ElementsFactory.gen_label("Budget", 25, 68, 86, 14);
        this.frame.add(budget_label);

        JLabel country_label = ElementsFactory.gen_label("Country", 25, 105, 86, 14);
        this.frame.add(country_label);

        JLabel year_label = ElementsFactory.gen_label("Year", 25, 142, 86, 14);
        this.frame.add(year_label);

        this.title_txt = ElementsFactory.gen_text_field(168, 28, 146, 20);
        this.frame.add(this.title_txt);
        this.title_txt.setColumns(10);

        this.budget_txt = ElementsFactory.gen_text_field(168, 65, 146, 20);
        this.frame.add(this.budget_txt);
        this.budget_txt.setColumns(10);

        this.country_box = ElementsFactory.gen_combo_box(countries, 168, 102, 170, 20);
        this.frame.add(this.country_box);

        this.year_txt = ElementsFactory.gen_text_field(168, 139, 170, 20);
        this.frame.add(this.year_txt);

        this.execute_button = ElementsFactory.gen_button("Create", 25, 215, 290, 30);
        this.frame.add(this.execute_button);
        this.execute_button.addActionListener(this);

    }
}



interface GetString {
    String get_value(JTextField txt);
}


interface GetInt {
    int get_value(JTextField txt);
}

interface GetBoxItem {
    String get_value(JComboBox<String> box);
}