import java.util.Formatter;
import java.util.Calendar;
import java.util.Date;


public class DateTimeFormattingDemo {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        Calendar cal = Calendar.getInstance();
        Date now = new Date();

        // 1. %tH – час в 24-часовом формате (00-23)
        formatter.format("1. Час (24h): %tH%n", now);

        // 2. %tM – минуты (00-59)
        formatter.format("2. Минуты: %tM%n", now);

        // 3. %tS – секунды (00-59)
        formatter.format("3. Секунды: %tS%n", now);

        // 4. %tY – год из 4 цифр
        formatter.format("4. Год: %tY%n", now);

        // 5. %tB – полное название месяца
        formatter.format("5. Месяц: %tB%n", now);

        // Дополнительный пример: комбинирование
        formatter.format("Текущее время: %tH:%tM:%tS, %tB %tY%n", now, now, now, now, now);

        System.out.println(formatter);
        formatter.close();
    }
}