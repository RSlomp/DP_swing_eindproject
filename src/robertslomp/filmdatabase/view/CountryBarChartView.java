package robertslomp.filmdatabase.view;

import robertslomp.filmdatabase.util.BarChart;

import javax.swing.*;
import java.awt.*;

public class CountryBarChartView extends View{
    private JFrame frame;
    private BarChart chart;

    public CountryBarChartView(String title){
        super(title);
        this.frame = new JFrame(title);
        this.chart = new BarChart();
        this.chart.addBar(Color.RED, 100);
        this.chart.addBar(Color.BLUE, 80);

        this.frame.getContentPane().add(this.chart);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.pack();
        this.frame.setVisible(true);
    }
}
