package robertslomp.filmdatabase.view;

import robertslomp.filmdatabase.util.ElementsFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


//Template Pattern
public abstract class View implements WindowListener, ActionListener {
    protected JFrame frame;

    public View(String title) {
        this.frame = ElementsFactory.gen_frame(title, 0, 0, 400, 500);
    }

    public void refresh_frame(){
        //this.frame.removeAll();
        this.frame.revalidate();
        this.frame.repaint();
        this.frame.revalidate();
        SwingUtilities.updateComponentTreeUI(this.frame);
    }

    public void actionPerformed(ActionEvent e) {
    }

    public void windowClosing(WindowEvent e) {
        this.frame.dispose();
        System.exit(0);
    }

    public void windowOpened(WindowEvent e) {
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public void windowDeactivated(WindowEvent e) {
    }

    public void windowClosed(WindowEvent e) {
    }

    protected void initialize(String title) {
    }
}
