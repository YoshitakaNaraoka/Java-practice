import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonExample extends JFrame {

    public ButtonExample() {
        // JFrame の設定
        setTitle("ボタンの例"); // ウィンドウのタイトル
        setSize(300, 150);     // ウィンドウのサイズ
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 閉じるボタンがクリックされたときの動作
        setLocationRelativeTo(null); // ウィンドウを画面中央に配置

        // JPanel の作成 (ボタンを配置するため)
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout()); // ボタンを横に並べるためのレイアウト

        // OKボタンの作成
        JButton okButton = new JButton("OK");
        // OKボタンがクリックされたときの処理
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("OKボタンがクリックされました！");
                // ここにOKボタンが押されたときの具体的な処理を記述
                // 例: データの保存、次の画面への遷移など
            }
        });

        // 閉じるボタンの作成
        JButton closeButton = new JButton("閉じる");
        // 閉じるボタンがクリックされたときの処理
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("閉じるボタンがクリックされました。アプリケーションを終了します。");
                // アプリケーションを終了する
                dispose(); // このフレームを閉じ、関連リソースを解放する
                // System.exit(0); // アプリケーション全体を終了する場合 (推奨されないこともあります)
            }
        });

        // ボタンをパネルに追加
        panel.add(okButton);
        panel.add(closeButton);

        // パネルをフレームに追加
        add(panel, BorderLayout.CENTER); // パネルをフレームの中央に配置

        // フレームを可視化
        setVisible(true);
    }

    public static void main(String[] args) {
        // イベントディスパッチスレッドでGUIを構築する
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonExample();
            }
        });
    }
}