package ButtonApplication;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Farbkreis extends JFrame implements ActionListener {
    private JButton button;

    public Farbkreis(String title) {
        super(title);

        button = new JButton("Farbe Ändern");

        setLayout(new FlowLayout());
        add(button);

        button.addActionListener(this);

    }

    public static void main(String[] args) {
        Farbkreis fk = new Farbkreis("Farbkreis");
        fk.setSize(200, 150);
        fk.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Color c = getContentPane().getBackground();
        if (c.equals(Color.gray)) {
            getContentPane().setBackground(Color.red);
        } else if (c.equals(Color.red)) {
            getContentPane().setBackground(Color.green);
        } else if (c.equals(Color.green)) {
            getContentPane().setBackground(Color.blue);
        } else if (c.equals(Color.blue)) {
            getContentPane().setBackground(Color.gray);
        } else {
            getContentPane().setBackground(Color.red);
        }
    }

}
