package ButtonTutorial;

// AnotherWindow.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnotherWindow extends JDialog {

    public AnotherWindow(JFrame parentFrame) {
        super(parentFrame, "別のウィンドウ", true); // 親フレームとモーダル設定
        setSize(300, 150);
        setLocationRelativeTo(parentFrame); // 親フレームの中央に配置

        // ボタンパネルのインスタンスを作成
        ButtonPanel buttonPanel = new ButtonPanel();

        // OKボタンのアクションリスナーを設定
        buttonPanel.setOkButtonActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(AnotherWindow.this, "別のウィンドウのOKボタンが押されました！");
                System.out.println("別のウィンドウのOKボタン処理を実行");
                // ダイアログを閉じる
                dispose();
            }
        });

        // 閉じるボタンのアクションリスナーを設定
        buttonPanel.setCloseButtonActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("別のウィンドウの閉じるボタン処理を実行");
                // ダイアログを閉じる
                dispose();
            }
        });

        // ボタンのサイズを小さめに設定（このウィンドウに合わせて）
        buttonPanel.setButtonPreferredSize(80, 30);
        buttonPanel.setButtonFontSize(14);


        // パネルをダイアログに追加
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        // テスト用にJFrameを作成してダイアログを呼び出す
        JFrame testFrame = new JFrame("テスト親フレーム");
        testFrame.setSize(600, 400);
        testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        testFrame.setVisible(true);

        SwingUtilities.invokeLater(() -> new AnotherWindow(testFrame));
    }
}