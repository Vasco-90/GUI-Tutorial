import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Zahlenschloss extends JFrame implements ActionListener {
    private JButton[] buttons = new JButton[10];
    private String ls = "735";
    private String eingabe = "";

    public Zahlenschloss(String title) {
        super(title);

        setLayout(new FlowLayout());
        for (int i = 0; i < 10; i++) {
            buttons[i] = new JButton(String.valueOf(i));
            add(buttons[i]);
            buttons[i].addActionListener(this);
            buttons[i].setActionCommand(String.valueOf(i));
        }

    }

    public static void main(String[] args) {
        Zahlenschloss zs = new Zahlenschloss("Zahlenschloss");
        zs.setSize(300, 300);
        zs.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        eingabe += e.getActionCommand();
        if (eingabe.length() == ls.length()) {
            if (eingabe.equals(ls)) {
                getContentPane().setBackground(Color.green);
            } else {
                getContentPane().setBackground(Color.red);
            }
        }
    }

}
