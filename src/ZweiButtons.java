import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ZweiButtons extends JFrame implements ActionListener {
    private JButton buttonRot;
    private JButton buttonGruen;
    private JButton buttonBlau;
    private JButton buttonGrau;

    public ZweiButtons(String title) {
        super(title);

        buttonRot = new JButton("Rot");
        buttonGruen = new JButton("Grün");
        buttonBlau = new JButton("Blau");
        buttonGrau = new JButton("Grau");

        setLayout(new FlowLayout());
        add(buttonRot);
        add(buttonGruen);
        add(buttonBlau);
        add(buttonGrau);

        buttonRot.addActionListener(this);
        buttonRot.setActionCommand("rot");

        buttonGruen.addActionListener(this);
        buttonGruen.setActionCommand("gruen");

        buttonBlau.addActionListener(this);
        buttonBlau.setActionCommand("blau");

        buttonGrau.addActionListener(this);
        buttonGrau.setActionCommand("grau");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "rot":
                getContentPane().setBackground(Color.red);
                break;
            case "gruen":
                getContentPane().setBackground(Color.green);
                break;
            case "blau":
                getContentPane().setBackground(Color.blue);
                break;
            case "grau":
                getContentPane().setBackground(Color.gray);
                break;
        }

        repaint();

    }

    public static void main(String[] args) {
        ZweiButtons demo = new ZweiButtons("Klicken Sie auf einen Button");
        demo.setSize(200, 150);
        demo.setVisible(true);
    }

}
