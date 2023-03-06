package wordhunt;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.util.*;


public class wordhunt extends JFrame{
    static JLabel pointsBox = new JLabel();
    static JPanel top = new Board();
    static JLabel textbox = new textBox();
    static JPanel middle = new JPanel();
    static JButton resetButton = new resetButton();
    static String word = Board.word;
    static JButton submit = new submitButton();
    static JPanel bottomLeft = new JPanel();
    static JPanel bottomRight = new JPanel();
    static JPanel bottomThrid = new JPanel();
    static JLabel wordConditon = new JLabel();
    static JPanel bottom = new JPanel();

    ActionListener refresh = new ActionListener(){
        public void actionPerformed(ActionEvent evt){
            //System.out.println("Timer Works");
            word = Board.word;
            textbox.setText(word);
            //System.out.println(word);
        }
    };


    ActionListener scoreUpdater = new ActionListener(){
        public void actionPerformed(ActionEvent evt){
            int score = submitButton.score;
            pointsBox.setText("Your Current Score is:  " + score);
        }
    };

    ActionListener goodWordCheck = new ActionListener(){
        public void actionPerformed(ActionEvent evt){
            int goodWord = submitButton.goodWord;

            if(goodWord == 1){
                wordConditon.setText("Good Word!");
            }
            else if(goodWord == 2){
                wordConditon.setText("Word already Used. ");
            }
            else if(goodWord == 3){
                wordConditon.setText("Word doesnt exist in our list of 230000 words.  X_X");
            }
        }
    };


    

    public wordhunt(){
        new wordlist();

        Timer goodWordChecker = new Timer(0, goodWordCheck);
        goodWordChecker.setRepeats(true);
        goodWordChecker.start();


        Timer scoreUpdate = new Timer(0, scoreUpdater);
        scoreUpdate.setRepeats(true);
        scoreUpdate.start();
        

        Timer timer = new Timer(0, refresh);
        timer.setRepeats(true);
        timer.start();

        this.setLayout(new GridLayout(4,0));
        //System.out.println("running");
        this.add(top);
        this.add(middle);
        this.add(bottom);

        this.setSize(500,600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setTitle("Wordhunt v 2.19");;


        middle.setLayout(new GridLayout(0,2));
        middle.add(bottomLeft);
        middle.add(bottomRight);

        bottomLeft.setLayout(new GridLayout(2,1));
        bottomLeft.add(submit);
        bottomLeft.add(resetButton);


        textbox.setAlignmentX(JLabel.CENTER);
        bottomRight.add(textbox);



        bottom.setLayout(new GridLayout(2,0));
        pointsBox.setHorizontalAlignment(JLabel.CENTER);
        wordConditon.setHorizontalAlignment(JLabel.CENTER);
        
        bottom.add(pointsBox);
        bottom.add(wordConditon);
  
    }



}
