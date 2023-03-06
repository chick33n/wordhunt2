package dice;
import java.awt.*;
//import java.util.Random;
import javax.swing.*;
import java.awt.event.*;


public class dice implements ActionListener{

   static JFrame window = new JFrame();
   static JPanel dice = new JPanel();
   static JButton button = new JButton();
   static JLabel[] labels = new JLabel[9];
   //static int result; 
   public static int savedResult = 0;
   static JLabel die = new dielabel();
   static JLabel text = new JLabel();




public dice(){


    button.setText("Click to roll die :D");
    button.setFocusPainted(false);
    button.addActionListener(this);
    dice.add(button);

    dice.add(die);

    text.setText("Dice Rolled a ");
    text.setHorizontalAlignment(JLabel.CENTER);
    dice.add(text);


    

    dice.setLayout(new GridLayout(3,0));

    dice.setBackground(new Color(120,60,120));
    window.setResizable(false);
    window.setLocationRelativeTo(null);
    window.add(dice);
    window.setSize(200,600);
    //window.pack();
    window.setVisible(true);
   
}



@Override
public void actionPerformed(ActionEvent e) {
    randomNum num = new randomNum();
    int result = num.result;
    savedResult = result;
    text.setText("Dice rolled a  " + result);

            dice.remove(die);
            die = new dielabel();
            dice.add(die);
    }

}


