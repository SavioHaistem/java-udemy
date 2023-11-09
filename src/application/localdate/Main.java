package application.localdate;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter dateAndHour = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        DateTimeFormatter formatLocal = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm").withZone(ZoneId.systemDefault());

        Instant dateInstant = Instant.parse("2002-04-15T01:30:36Z"); // Z -> fuse honoraries
        LocalDate dateLocal = LocalDate.parse("2018/04/15",formatDate);
        LocalDateTime dateTime = LocalDateTime.now();

        LocalDate pastDate = LocalDate.parse("2023/10/26",formatDate);
        LocalDate currentDate = LocalDate.parse("2034/10/20",formatDate);

        LocalDate timeZone = currentDate.minusDays(8);
        //System.out.println(timeZone);

        Duration pastWeekDuration = Duration.between(pastDate.atStartOfDay(), currentDate.atTime(0,0));

        System.out.printf("defaulDate: %s,%nformated: %s days %n%n", currentDate, pastWeekDuration.toDays());
        System.out.printf("defaulDate: %s,%nformated: %s %n%n", dateInstant, formatLocal.format(dateInstant));
        System.out.printf("defaulDate: %s,%nformated: %s %n%n", dateLocal, dateLocal.format(formatDate));
        System.out.printf("defaulDate: %s,%nformated: %s %n%n", dateTime, dateTime.format(dateAndHour));
    }
}
