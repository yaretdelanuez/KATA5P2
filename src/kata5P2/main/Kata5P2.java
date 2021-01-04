
package kata5P2.main;


import java.util.List;
import kata5P2.model.Histogram;
import kata5P2.model.Mail;
import kata5P2.view.HistogramDisplay;
import kata5P2.view.MailHistogramBuilder;
import kata5P2.view.MailListReader;


public class Kata5P2 {
    
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
