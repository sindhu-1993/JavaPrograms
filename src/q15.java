import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class q15 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("h:mm a");

        System.out.println("Current Date and Time :");
        System.out.println(now.format(dateFormatter));
        System.out.println(now.format(timeFormatter).toLowerCase());
    }
}
