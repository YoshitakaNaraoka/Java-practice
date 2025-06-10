package FrameExtendTutorial;

import javax.swing.*;
import java.awt.*;

public class SecondaryDialog extends JDialog { // JDialog は JFrame を継承しないので注意

    public SecondaryDialog(JFrame parentFrame) {
        super(parentFrame, "設定ダイアログ", true); // 親フレームとモーダル設定
        setSize(400, 250);
        setLocationRelativeTo(parentFrame); // 親フレームの中央に表示
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE); // ダイアログを閉じる動作

        // ダイアログのコンテンツ
        JPanel contentPanel = new JPanel(new GridLayout(2, 1, 10, 10));
        contentPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 0, 20));
        contentPanel.add(new JLabel("設定項目1:"));
        contentPanel.add(new JTextField("デフォルト値"));

        // ButtonPanel のインスタンスを作成
        ButtonPanel buttonPanel = new ButtonPanel();

        // ボタンのサイズを固定値で設定（このダイアログに合わせて）
        buttonPanel.setButtonPreferredSize(100, 35);
        buttonPanel.setButtonFontSize(15);

        // OKボタンのアクションリスナーを設定
        buttonPanel.setOkButtonActionListener(e -> {
            JOptionPane.showMessageDialog(SecondaryDialog.this, "設定を保存しました！");
            System.out.println("設定ダイアログのOK処理");
            dispose(); // ダイアログを閉じる
        });

        // 閉じるボタンのアクションリスナーを設定
        buttonPanel.setCloseButtonActionListener(e -> {
            System.out.println("設定ダイアログをキャンセルしました。");
            dispose();
        });

        // ダイアログにコンテンツとボタンパネルを追加
        add(contentPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        // テスト用の親フレーム (MainApplication などを起動する)
        JFrame testParent = new JFrame("テスト親フレーム");
        testParent.setSize(300, 200);
        testParent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        testParent.setVisible(true);

        SwingUtilities.invokeLater(() -> new SecondaryDialog(testParent));
    }
}