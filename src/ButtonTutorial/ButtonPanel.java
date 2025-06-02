package ButtonTutorial;

// ButtonPanel.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener; // ActionListener インターフェースをインポート

public class ButtonPanel extends JPanel {

    private JButton okButton;
    private JButton closeButton;

    public ButtonPanel() {
        // パネルのレイアウトを設定
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20)); // 中央寄せ、ボタン間にスペース

        // OKボタンの作成
        okButton = new JButton("OK");
        // フォントサイズを少し大きくする（必要に応じて調整）
        okButton.setFont(new Font("SansSerif", Font.BOLD, 16));
        add(okButton); // パネルにボタンを追加

        // 閉じるボタンの作成
        closeButton = new JButton("閉じる");
        // フォントサイズを少し大きくする
        closeButton.setFont(new Font("SansSerif", Font.PLAIN, 16));
        add(closeButton); // パネルにボタンを追加

        // 初期設定として、OKボタンと閉じるボタンにダミーのアクションリスナーを追加しておくこともできます
        // okButton.addActionListener(e -> System.out.println("OK (Default)"));
        // closeButton.addActionListener(e -> System.out.println("閉じる (Default)"));
    }

    /**
     * OKボタンにアクションリスナーを設定します。
     * @param listener OKボタンが押されたときに実行されるリスナー
     */
    public void setOkButtonActionListener(ActionListener listener) {
        // 既存のリスナーがあれば全て削除し、新しいリスナーを追加
        // これにより、複数回呼び出してもリスナーが重複して追加されるのを防ぎます
        for (ActionListener l : okButton.getActionListeners()) {
            okButton.removeActionListener(l);
        }
        okButton.addActionListener(listener);
    }

    /**
     * 閉じるボタンにアクションリスナーを設定します。
     * @param listener 閉じるボタンが押されたときに実行されるリスナー
     */
    public void setCloseButtonActionListener(ActionListener listener) {
        // 既存のリスナーがあれば全て削除し、新しいリスナーを追加
        for (ActionListener l : closeButton.getActionListeners()) {
            closeButton.removeActionListener(l);
        }
        closeButton.addActionListener(listener);
    }

    /**
     * ボタンの推奨サイズを設定します。
     * （オプション：必要に応じて呼び出し元で指定）
     * @param width ボタンの幅
     * @param height ボタンの高さ
     */
    public void setButtonPreferredSize(int width, int height) {
        Dimension size = new Dimension(width, height);
        okButton.setPreferredSize(size);
        closeButton.setPreferredSize(size);
    }

    /**
     * ボタンのフォントサイズを設定します。
     * @param fontSize フォントサイズ
     */
    public void setButtonFontSize(int fontSize) {
        okButton.setFont(new Font(okButton.getFont().getName(), okButton.getFont().getStyle(), fontSize));
        closeButton.setFont(new Font(closeButton.getFont().getName(), closeButton.getFont().getStyle(), fontSize));
    }
}