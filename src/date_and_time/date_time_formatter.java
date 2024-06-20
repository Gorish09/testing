package date_and_time;



import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class date_time_formatter {
    public static void main(String[] args) {
        LocalDateTime clock = LocalDateTime.now();
        System.out.println(clock);
        DateTimeFormatter time = DateTimeFormatter.ofPattern("dd-MM-yyyy ");

        String date = clock.format(time);
        System.out.println(date);

        DateTimeFormatter mydate = DateTimeFormatter.ofPattern("dd-MM-yyyy-E ss:mm:HH:ms");
        String mytime = clock.format(mydate);
        System.out.println(mytime);
    }
}
