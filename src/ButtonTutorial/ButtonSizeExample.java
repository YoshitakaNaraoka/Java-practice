package ButtonTutorial;

import javax.swing.*;
import java.awt.*;

public class ButtonSizeExample extends JFrame {

    public ButtonSizeExample() {
        setTitle("ボタンのサイズの例");
        setSize(400, 200); // ウィンドウサイズを少し大きくする
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20)); // ボタン間のスペースを広げる

        // OKボタンの作成とサイズ設定
        JButton okButton = new JButton("OK");
        okButton.setPreferredSize(new Dimension(100, 40)); // 幅100ピクセル、高さ40ピクセルに設定
        okButton.addActionListener(e -> System.out.println("OKボタンがクリックされました！"));

        // 閉じるボタンの作成とサイズ設定
        JButton closeButton = new JButton("閉じる");
        closeButton.setPreferredSize(new Dimension(120, 40)); // OKボタンより少し幅を広くする
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
        SwingUtilities.invokeLater(ButtonSizeExample::new);
    }
}