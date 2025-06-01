import javax.swing.*;
import java.awt.*;

public class FrameTest {
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        JFrame frame = new JFrame();
        frame.setSize(1024, 768);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // タイトル (多分ChromeOS Flexではタイトル非表示になる)
        frame.setTitle( "Hello, Swing!" );

        frame.setVisible(true);
      }
    });
  }
}