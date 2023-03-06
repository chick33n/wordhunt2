import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class game implements ActionListener {

    static JFrame window = new JFrame();
    static JPanel panel = new JPanel();

    static JButton[] buttons = new JButton[9];

    
    public game(){


        for(int i = 0; i < buttons.length; i++ ){
            String text = Integer.toString(i);
            buttons[i] = new JButton(text);
            buttons[i].setFocusPainted(false);
            buttons[i].addActionListener(this);
            panel.add(buttons[i]);
        };

    
        
        panel.setLayout(new GridLayout(0,3));
        panel.setSize(400,500);

       
        window.add(panel);
        window.setSize(400,500);
        window.pack();
        window.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }
    
}
