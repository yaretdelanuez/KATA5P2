
package kata4.main;


import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;


public class Kata4 {


    public static void main(String[] args) {
        
        String fileName = new String("email.txt");
        List<Mail> mailList = MailListReader.read(fileName);
        Histogram<String> mailHistogram = MailHistogramBuilder.build(mailList);
        
        HistogramDisplay histo = new HistogramDisplay(mailHistogram);
        histo.execute();
        
    }
    
}
