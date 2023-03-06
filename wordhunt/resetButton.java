package wordhunt;
import java.awt.event.*;
import javax.swing.JButton;

public class resetButton extends JButton implements ActionListener{

    public resetButton(){
        this.setText("Reset guess");
        this.addActionListener(this);
        this.setFocusPainted(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Board.word = "";
        
    }
    
}
