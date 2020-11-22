package kata4.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata4.model.Mail;
import kata4.view.MailParser;

public class MailListReader {
    
    public static List<Mail> read(String fileName){
        List<Mail> list = new ArrayList<>();
        
        try {    
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            while(true){
                String line = reader.readLine();
                if(line == null) break;
                if(MailParser.isMail(line)){
                    list.add(new Mail(line));
                }
                
            }
        } catch (FileNotFoundException exception) {
            System.out.println("Error MailListReader::read (file not found)" + exception.getMessage());
        } catch (IOException exception){
            System.out.println("Error MailListReader:: read (IO)" + exception.getMessage());
        }
        return list;
    }
}
