import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TimePrinter implements ActionListener {
    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();
        Timer timer = new Timer(2000, listener);
        timer.start();

        JOptionPane.showMessageDialog(null, "Close program?");
        System.exit(0);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Date now = new Date();
        System.out.println(("When you hear a beep, it will be " + now));
        Toolkit.getDefaultToolkit().beep();
    }
}