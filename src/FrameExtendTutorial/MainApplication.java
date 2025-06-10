package FrameExtendTutorial;

import javax.swing.*;
import java.awt.*;

public class MainApplication extends BaseFrame { // BaseFrame を継承

    public MainApplication() {
        // BaseFrame のコンストラクタを呼び出し、基本的なウィンドウ設定を行う
        super("メインアプリケーション", 600, 400); // デフォルトのサイズ

        // ウィンドウのサイズを画面に対して相対的に設定 (オプション)
        setRelativeSize(0.6, 0.5); // 画面の60%幅、50%高さ

        // メインコンテンツパネル（例: テキストエリアなど）
        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 0, 20)); // 余白を追加
        contentPanel.add(new JLabel("ここはメインコンテンツエリアです。", SwingConstants.CENTER), BorderLayout.CENTER);
        contentPanel.add(new JTextArea("何か入力してください...", 5, 20), BorderLayout.NORTH);

        // ButtonPanel のインスタンスを作成
        ButtonPanel buttonPanel = new ButtonPanel();

        // ボタンのサイズを画面に対して相対的に設定
        buttonPanel.setRelativeButtonSize(0.12, 0.06); // 画面の12%幅、6%高さ

        // OKボタンのアクションリスナーを設定
        buttonPanel.setOkButtonActionListener(e -> {
            JOptionPane.showMessageDialog(MainApplication.this, "メインアプリケーションのOKが押されました！");
            System.out.println("メインアプリケーションのOK処理");
        });

        // 閉じるボタンのアクションリスナーを設定
        buttonPanel.setCloseButtonActionListener(e -> {
            System.out.println("メインアプリケーションを終了します。");
            dispose(); // 閉じる
        });

        // フレームにコンテンツとボタンパネルを追加
        add(contentPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH); // ボタンパネルをウィンドウの下部に配置

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainApplication::new);
    }
}