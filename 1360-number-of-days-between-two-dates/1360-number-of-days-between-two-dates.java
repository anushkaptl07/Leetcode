import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
class Solution {
    public int daysBetweenDates(String d1, String d2) {
        LocalDate date1 = LocalDate.parse(d1);
        LocalDate date2 = LocalDate.parse(d2);
        int daysBetween = (int)ChronoUnit.DAYS.between(date1, date2);
        return Math.abs(daysBetween);
    }
}