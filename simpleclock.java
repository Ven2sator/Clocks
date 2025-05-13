


import java.time.LocalTime
import java.time.format.Formatter

public class Uhr { //Objekt hinzugefügt
    public static void main (String [] args) {
        DateTimeFormatter formatter = DateTimeFormatter.OfPattern ("HH:mm:ss");

    while (true) {
        LocalTime jetzt = LocalTime.now();
        System.out.print("\r" + jetzt.format(formatter));
            try {
                Thread.sleep(1000); //ms
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}