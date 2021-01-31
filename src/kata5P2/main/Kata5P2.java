
package kata5P2.main;

import java.sql.*;
import java.util.List;
import kata5P2.model.Histogram;
import kata5P2.view.HistogramDisplay;
import kata5P2.view.MailHistogramBuilder;
import kata5P2.view.MailListReaderBD;


public class Kata5P2 {
    
    private static List<String> mailList;
    private static Histogram<String> mailHistogram;

    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        execute();
    }

    private static void execute() throws SQLException, ClassNotFoundException {
        input();
        process();
        output();
    }

    private static void input() throws SQLException, ClassNotFoundException {
        mailList = MailListReaderBD.read();
    }

    private static void process() {
        mailHistogram = MailHistogramBuilder.build(mailList);
    }

    private static void output() {
        new HistogramDisplay(mailHistogram).execute();
    }
    
}
