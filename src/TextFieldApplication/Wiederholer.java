package TextFieldApplication;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Wiederholer extends JFrame implements ActionListener{
    JLabel inLabel = new JLabel("Geben Sie Ihren Namen ein:");
    JLabel outLabel = new JLabel("Hier kommt dann Ihr Name:");
    JTextField inText = new JTextField(15);
    JTextField outText = new JTextField(15);
    
    
    public Wiederholer(String title) {
        setLayout(new FlowLayout());
        outText.setEditable(false);
        
        add(inLabel);
        add(inText);
        add(outLabel);
        add(outText);
        
        inText.addActionListener(this);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

    public static void main(String[] args) {
        Wiederholer wdh = new Wiederholer("Wiederholer");
        wdh.setSize(400, 100);
        wdh.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        copyText(); 
        repaint();
        
    }

    private void copyText() {
        outText.setText(inText.getText());
        
    }
}
