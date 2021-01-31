package kata5P2.view;

import java.util.List;
import kata5P2.model.Histogram;
import kata5P2.model.Mail;

public class MailHistogramBuilder {
    public static Histogram<String> build(List<String> mailList){
        Histogram<String> histogram = new Histogram();
        for (String mail : mailList) {
            histogram.increment(mail);
        }
        return histogram;
    }
}
