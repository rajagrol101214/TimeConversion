package TimeConvert;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversionAss {
   public static void main(String [] args) throws Exception {
       SimpleDateFormat befCovTime = new SimpleDateFormat("HH:mm");
       SimpleDateFormat convTime = new SimpleDateFormat("hh:mm a");
       Date date = convTime.parse("10:30 PM");
       System.out.println(convTime.format(date) + " = " + befCovTime.format(date));
   }
}