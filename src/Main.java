import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        LocalDate dataOne = LocalDate.now();
        LocalTime hourOne = LocalTime.now();
        LocalDateTime currentDate = LocalDateTime.now();
        Instant current = Instant.now();

        LocalDate newDate = LocalDate.parse("2002/04/15", fmt1);

        LocalDateTime newDateTime = LocalDateTime.parse("2002-04-15T01:30:26");
        Instant newInstant = Instant.parse("2002-04-15T01:30:26Z");
        Instant newNewInstant = Instant.parse("2002-04-15T01:30:26-03:00");


        System.out.println(newDateTime);
        System.out.println(newDate);
        System.out.println(newNewInstant);
    }
}