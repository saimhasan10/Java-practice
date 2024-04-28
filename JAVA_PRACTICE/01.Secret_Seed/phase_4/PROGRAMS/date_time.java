import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class date_time {
    public static void main(String[] args) {

        // date
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String current_date = dateFormat.format(date);

        System.out.println("current date is: " + current_date);

        // time
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String time = localTime.format(formatter);
        System.out.println("local time: " + time);

    }
}
