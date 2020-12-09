package robertslomp.filmdatabase.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


//Template Pattern
public abstract class View extends Frame implements WindowListener, ActionListener {
    public View(String title) {
        super(title);
    }

    public void refresh_frame(){
        //this.removeAll();
        this.revalidate();
        this.repaint();
        this.revalidate();
        SwingUtilities.updateComponentTreeUI(this);
    }

    public void actionPerformed(ActionEvent e) {
    }

    public void windowClosing(WindowEvent e) {
        dispose();
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
