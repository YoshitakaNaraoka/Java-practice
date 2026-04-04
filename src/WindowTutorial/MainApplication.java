package WindowTutorial;

import javax.swing.*;

public class MainApplication extends JFrame {
    
    public MainApplication() {
        setTitle("main app");
        setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setVisible(true); // important
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainApplication::new);
    }
}
