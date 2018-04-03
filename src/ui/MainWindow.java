package ui;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class MainWindow {

    public static void main(String[] args) {

        SplashScreen splashScreen = new SplashScreen();
        splashScreen.setVisible(true);

        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(20);
                SplashScreen.statusText.setText(Integer.toString(i) + " %");
                SplashScreen.jProgressBar.setValue(i);

            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        splashScreen.setVisible(false);

        Login login = new Login();
        login.setExtendedState(login.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setVisible(true);

    }

}
