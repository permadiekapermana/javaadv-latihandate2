import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {
    public static Date createDate() {
        Date date = new Date();
		return date;		
	}

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
        System.out.println(dateFormat.format(createDate()));
        // 24 hours format
        SimpleDateFormat fullHours = new SimpleDateFormat("HH:mm:ss");
        System.out.println(fullHours.format(createDate()) + " (format 24 jam)");
        // 12 hours format
        SimpleDateFormat halfHours = new SimpleDateFormat("hh:mm:ss");
        System.out.println(halfHours.format(createDate()) + " (format 12 jam)");
        // 12 hours format AM/PM
        SimpleDateFormat halfHoursAMPM = new SimpleDateFormat("hh:mm a");
        System.out.println(halfHoursAMPM.format(createDate()) + " (format 12 jam AM/PM)");
    }
}