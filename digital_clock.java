import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock {
    public static void main(String[] args) {
        while (true) {
            // Get the current time
            Date now = new Date();
            
            // Format the time in HH:mm:ss format
            SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
            String formattedTime = dateFormat.format(now);
            
            // Display the formatted time
            System.out.print("\r" + formattedTime); // \r is used to overwrite the previous output in the console
            
            try {
                // Pause for 1 second (1000 milliseconds)
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}