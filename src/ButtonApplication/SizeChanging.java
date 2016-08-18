package ButtonApplication;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SizeChanging extends JFrame implements ActionListener{
    private JButton buttonInc;
    private JButton buttonDec;
    private int sizeX;
    private int sizeY;
    
    public SizeChanging() {
        buttonInc = new JButton("Vergrößern");
        buttonDec = new JButton("Verkleinern");
        
        setLayout(new FlowLayout());
        
        add(buttonInc);
        add(buttonDec);
        
        buttonInc.addActionListener(this);
        buttonDec.addActionListener(this);
        
        buttonInc.setActionCommand("inc");
        buttonDec.setActionCommand("dec");
    }

    public static void main(String[] args) {
        SizeChanging sz = new SizeChanging();
        sz.setSize(300, 300);
        sz.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       int newY;
       int newX;
       sizeX = getWidth();
       sizeY = getHeight();
       
       newX = 10 * sizeX / 100;
       newY = 10 * sizeY / 100;
       
       if (e.getActionCommand().equals("inc")) {
           setSize(sizeX +newX , sizeY + newY);
       }else {
           setSize(sizeX - newX , sizeY - newY);
       }
        
    }

}
