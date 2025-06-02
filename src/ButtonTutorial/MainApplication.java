package ButtonTutorial;

// MainApplication.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainApplication extends JFrame {

    public MainApplication() {
        setTitle("メインアプリケーション");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // ボタンパネルのインスタンスを作成
        ButtonPanel buttonPanel = new ButtonPanel();

        // OKボタンのアクションリスナーを設定
        buttonPanel.setOkButtonActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MainApplication.this, "OKボタンが押されました！");
                System.out.println("メインアプリのOKボタン処理を実行");
                // ここにメインアプリケーションでのOKボタン処理を記述
            }
        });

        // 閉じるボタンのアクションリスナーを設定
        buttonPanel.setCloseButtonActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("メインアプリの閉じるボタン処理を実行");
                // ウィンドウを閉じる
                dispose();
            }
        });

        // オプション: ボタンのサイズを相対的に設定することも可能
        // 画面の解像度を取得
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        int buttonWidth = (int) (screenWidth * 0.1);  // 画面幅の10%
        int buttonHeight = (int) (screenHeight * 0.05); // 画面高さの5%
        buttonPanel.setButtonPreferredSize(buttonWidth, buttonHeight);
        buttonPanel.setButtonFontSize((int)(buttonHeight * 0.4)); // フォントサイズも調整

        // パネルをフレームに追加
        add(buttonPanel, BorderLayout.SOUTH); // パネルをウィンドウの下部に配置

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainApplication::new);
    }
}