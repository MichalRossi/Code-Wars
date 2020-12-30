import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {

        int hour = seconds/3600;
        int minute = (seconds%3600)/60;
        int second = (seconds%3600)%60;

        String hourResult, minuteResult, secondResult = "";

        hourResult =  (hour<10) ? "0" + hour : String.valueOf(hour);
        minuteResult =  (minute<10) ? "0" + minute : String.valueOf(minute);
        secondResult =  (second<10) ? "0" + second : String.valueOf(second);


        return hourResult + ":" + minuteResult + ":" + secondResult ;
    }
}