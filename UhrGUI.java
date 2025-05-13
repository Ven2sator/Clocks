


import javax.swing.*; //swing
import java.awt.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class UhrGUI extends JFrame { //JFrame 
    private JLabel uhrLabel;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    public UhrGUI() {
        setTitle("Digitale Uhr");
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        uhrLabel = new JLabel(); //
        uhrLabel.setFont(new Font("Monospaced", Font.BOLD, 24));
        add(uhrLabel);

        Timer timer = new Timer(1000, e -> {
            LocalTime jetzt = LocalTime.now();
            uhrLabel.setText(jetzt.format(formatter));
        });
        timer.start();

        setVisible(true);
    }

    public static void main(String[] args) {
        new UhrGUI();
    }
}
