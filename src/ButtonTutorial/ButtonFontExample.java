package ButtonTutorial;

import javax.swing.*;
import java.awt.*;

public class ButtonFontExample extends JFrame {

    public ButtonFontExample() {
        setTitle("ボタンのフォントサイズの例");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        // OKボタンの作成とフォントサイズ設定
        JButton okButton = new JButton("OK");
        okButton.setFont(new Font("SansSerif", Font.BOLD, 20)); // フォントサイズを20ptに設定
        okButton.addActionListener(e -> System.out.println("OKボタンがクリックされました！"));

        // 閉じるボタンの作成とフォントサイズ設定
        JButton closeButton = new JButton("閉じる");
        closeButton.setFont(new Font("Serif", Font.PLAIN, 18)); // フォントサイズを18ptに設定
        closeButton.addActionListener(e -> {
            System.out.println("閉じるボタンがクリックされました。");
            dispose();
        });

        panel.add(okButton);
        panel.add(closeButton);

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ButtonFontExample::new);
    }
}