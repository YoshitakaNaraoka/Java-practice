package ButtonTutorial;

import javax.swing.*;
import java.awt.*;

public class RelativeButtonSizeExample extends JFrame {

    public RelativeButtonSizeExample() {
        // 画面の解像度を取得
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        // ウィンドウのサイズを画面の70%に設定
        int frameWidth = (int) (screenWidth * 0.7);
        int frameHeight = (int) (screenHeight * 0.4); // 高さも少し小さめに
        setTitle("相対的なボタンサイズの例");
        setSize(frameWidth, frameHeight);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // 画面中央に配置

        // ボタンの相対的なサイズを計算
        // 例: ボタンの幅を画面幅の15%、高さを画面高さの7%に設定
        int buttonWidth = (int) (screenWidth * 0.15);
        int buttonHeight = (int) (screenHeight * 0.07);

        // ボタンを配置するためのパネル
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20)); // ボタン間のスペース

        // OKボタンの作成とサイズ設定
        JButton okButton = new JButton("OK");
        okButton.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        // フォントサイズも相対的に調整すると、より見栄えが良くなります
        // 例: フォントサイズをボタンの高さの約半分に設定
        okButton.setFont(new Font("SansSerif", Font.BOLD, (int)(buttonHeight * 0.4)));
        okButton.addActionListener(e -> {
            System.out.println("OKボタンがクリックされました！");
            // OKボタンが押されたときの具体的な処理
        });

        // 閉じるボタンの作成とサイズ設定
        JButton closeButton = new JButton("閉じる");
        // 閉じるボタンの幅をOKボタンより少し広くする（必要であれば）
        closeButton.setPreferredSize(new Dimension((int)(buttonWidth * 1.1), buttonHeight));
        closeButton.setFont(new Font("SansSerif", Font.PLAIN, (int)(buttonHeight * 0.4)));
        closeButton.addActionListener(e -> {
            System.out.println("閉じるボタンがクリックされました。");
            dispose();
        });

        // パネルにボタンを追加
        panel.add(okButton);
        panel.add(closeButton);

        // フレームにパネルを追加
        add(panel, BorderLayout.CENTER);

        // フレームを表示
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RelativeButtonSizeExample::new);
    }
}