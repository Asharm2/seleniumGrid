import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class hjjh {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println( calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.MONTH));
        Date date = new Date();

        // Formatting the time
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        String time = formatter.format(date);

        System.out.println("Current Time: " + time);
    }
}
