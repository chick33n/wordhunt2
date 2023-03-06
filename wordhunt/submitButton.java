package wordhunt;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
//import java.awt.*;
import java.util.List;
import javax.swing.JButton;

public class submitButton extends JButton implements ActionListener{

    static String word = "";
    static wordlist wordfile = new wordlist();
    static List<String> hi = wordfile.wordlist;
    static int score = 0;
    static int goodWord = 4;
    static List<String> usedWords = new ArrayList<String>();

     public submitButton(){
        System.out.println("running submit button"); 
        this.addActionListener(this);
        this.setText("Submit Guess");      
        this.setFocusPainted(false);
     }
  

    
     @Override
    public void actionPerformed(ActionEvent e) {

        word = Board.word.toUpperCase();
        System.out.println("submitted");

        if(usedWords.contains(word)){
            goodWord = 2;
            Board.word = "";
        }
        else if(hi.contains(word) && word.length() > 1 && usedWords.contains(word) == false){
            System.out.println("Word exists! caluclating points..."); 
            goodWord = 1;
            Board.word = "";
            int points = (word.length() * 100) + 100;
            score += points;
            usedWords.add(word);
        }

        else{
            System.out.println("word doesnt exist in out list of 230000+ words");
            Board.word = "";
            goodWord =  3;
        }
        

    }




    
}
