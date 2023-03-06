package dice;

import javax.swing.*;
import java.awt.*;


public class dielabel extends JLabel {

    int result = dice.savedResult;

    public dielabel(){
        this.setHorizontalAlignment(JLabel.CENTER);
    }

    
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D)g;

        g2d.setPaint(new Color(0, 0, 0));
        g2d.fillRect(0, 0, 200, 200);


        g2d.setPaint(new Color(225,225,225));
        if(result == 1){

            g2d.fillOval(80, 80, 25, 25);
        }

        if(result == 2){
            g2d.fillOval(10, 10, 25, 25);
            g2d.fillOval(160, 150, 25, 25);
        }

        if(result == 3){
            g2d.fillOval(10, 10, 25, 25);
            g2d.fillOval(160, 150, 25, 25);
            g2d.fillOval(80, 80, 25, 25);
        }

        if(result == 4){
            g2d.fillOval(10, 10, 25, 25);
            g2d.fillOval(160, 150, 25, 25);
            g2d.fillOval(160, 10, 25,25);
            g2d.fillOval(10,150,25,25);
        }


        if(result == 5){
            g2d.fillOval(10, 10, 25, 25);
            g2d.fillOval(160, 150, 25, 25);
            g2d.fillOval(160, 10, 25,25);
            g2d.fillOval(10,150,25,25);
            g2d.fillOval(80, 80, 25, 25);
        }

        if(result == 6){
            g2d.fillOval(10, 10, 25, 25);
            g2d.fillOval(160, 150, 25, 25);
            g2d.fillOval(160, 10, 25,25);
            g2d.fillOval(10,150,25,25);
            g2d.fillOval(10, 80, 25, 25);
            g2d.fillOval(160, 80, 25, 25);
        }


    }


}
