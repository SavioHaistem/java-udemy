import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Calendario {
    public static void main(String[] args) {
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date date = Date.from(Instant.parse("2002-04-15T10:42:07Z"));

        System.out.println(format1.format(date));

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR_OF_DAY, 5);

        date = cal.getTime();
        System.out.println(format1.format(date));
    }
}
