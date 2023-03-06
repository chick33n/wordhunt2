package wordhunt;
import java.util.*;
import java.util.List;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Board extends JPanel implements ActionListener{

    static String[] alphabets = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    static List<String> usedLetters = new ArrayList<String>();
    static String Letter;
    static String word = "";
    static JLabel wordbox = new textBox();

    public Board(){
        System.out.println("running board.java");
        Random rand = new Random();
        
        this.setLayout(new GridLayout(4,4));

        for(int i = 0; i < 16; i++){
            do{
                int letter = rand.nextInt(25);
                Letter = alphabets[letter];
            }while(usedLetters.contains(Letter));
             usedLetters.add(Letter);
            
            JButton button = new JButton();
                  button.setText(Letter.toUpperCase());
                  this.add(button);
                  button.setFocusPainted(false);
                  button.addActionListener(this);
                
        }

    }

    @Override
    public void actionPerformed (ActionEvent e) {
        String clickedLetters = ((JButton)e.getSource()).getText();
        String clickedLetter = clickedLetters.toUpperCase();
        word = word + clickedLetter;
        //System.out.println(clickedLetter);
        //System.out.println("click registered");        
    }


}
