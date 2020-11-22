
package kata4.main;


import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;


public class Kata4 {
    
    private static String fileName;
    private static List<Mail> mailList;
    private static Histogram<String> mailHistogram;

    public static void main(String[] args) {
        
        fileName = "email.txt";
        execute();        
    }
    
    private static void execute(){
        input();
        process();
        output();
    }

    private static void input() {
        mailList = MailListReader.read(fileName);
    }

    private static void process() {
        mailHistogram = MailHistogramBuilder.build(mailList);
    }

    private static void output() {
        new HistogramDisplay(mailHistogram).execute();
    }
    
}
