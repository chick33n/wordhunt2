package wordhunt;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class wordlist {


    static Scanner file;
   
    List<String> wordlist;
       public wordlist(){
        System.out.println("running wordlist");
        try {
           file = new Scanner(new File("wordlist.txt"));
            
        } catch (IOException e) {
            System.out.println("error getting file");
            System.exit(0);
        }
        
    
        wordlist = new ArrayList<>();
        String token = "";

        while(file.hasNextLine()){
            token = file.nextLine().toUpperCase();
                wordlist.add(token);
                token = "";
   
        }

        
        System.out.println("compiling worlist.txt done");

        //System.out.println(wordlist);
        
    }

}
