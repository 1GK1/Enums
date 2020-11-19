import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Action implements ActionListener {
    static int numberToShow;

    public static void main(String[] args) {

        ActionListener listener = new Action();
        ActionListener endOfLoop = new Action();

        JFrame frame = new JFrame();
        frame.setBounds(100, 100, 600, 200);
        JButton button = new JButton("press me");
        frame.add(button);
        button.addActionListener(listener);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        numberToShow++;
        System.out.printf("%d ACTION PERFORMED", numberToShow);
        System.out.println();
        Toolkit.getDefaultToolkit().beep();
        // dasdfasdfas
    }
}