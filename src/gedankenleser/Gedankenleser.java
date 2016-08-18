package gedankenleser;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Gedankenleser extends JFrame implements ActionListener {
    JLabel lbl;
    JButton buttonWeiter;
    JTextField text;
    int schritt = 0;
    char[] split = new char[2];

    public Gedankenleser() {
        lbl = new JLabel("Bitte denke dir eine Zahl zwischen 1-6 aus aus...klicke anschließend auf weiter!");

        buttonWeiter = new JButton("Weiter");

        setLayout(new FlowLayout());
        add(lbl);
        add(buttonWeiter);

        buttonWeiter.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Gedankenleser gl = new Gedankenleser();
        gl.setSize(400, 100);
        gl.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        schritt++;

        switch (schritt) {
            case 1:
                lbl.setText("Nun multipliziere die Zahl mit 2.");
                break;
            case 2:
                lbl.setText("Addiere zu dieser Zahl 5 hinzu.");
                break;
            case 3:
                lbl.setText("Multipliziere diese Zahl nun mit 5");
                break;
            case 4:
                lbl.setText("Behalte diese Zahl im Kopf und denke dir eine zweite Zahl aus!");
                break;
            case 5:
                lbl.setText("Addiere die zweite Zahl nun zu deiner ersten Zahl hinzu!");
                break;
            case 6:
                lbl.setText("Nun schreibe dieses Ergebnis in das Feld hinein: ");
                addNumber();
                break;
            case 7:
                if (text.getText().length() > 0) {
                    calcErgebnis(text.getText());
                    lbl.setText("Deine erste Zahl war die: " + split[0] + " und die zweite Zahl "
                            + split[1]);
                } else {
                    schritt--;
                }
                break;
        }
    }

    private void addNumber() {
        text = new JTextField(3);
        getContentPane().add(text);

    }

    private char[] calcErgebnis(String trim) {
        int ergebnis = 0;
        ergebnis = Integer.parseInt(trim) - 25;
        split[0] = String.valueOf(ergebnis).charAt(0);
        split[1] = String.valueOf(ergebnis).charAt(1);
        return split;

    }

}
