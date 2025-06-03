package FrameExtendTutorial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {

    private JButton okButton;
    private JButton closeButton;

    public ButtonPanel() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20)); // 中央寄せ、ボタン間にスペース

        okButton = new JButton("OK");
        closeButton = new JButton("閉じる");

        add(okButton);
        add(closeButton);

        // デフォルトのフォントサイズを設定
        setButtonFontSize(16);
    }

    /**
     * OKボタンにアクションリスナーを設定します。
     * 複数回呼び出してもリスナーが重複して追加されるのを防ぎます。
     */
    public void setOkButtonActionListener(ActionListener listener) {
        for (ActionListener l : okButton.getActionListeners()) {
            okButton.removeActionListener(l);
        }
        okButton.addActionListener(listener);
    }

    /**
     * 閉じるボタンにアクションリスナーを設定します。
     * 複数回呼び出してもリスナーが重複して追加されるのを防ぎます。
     */
    public void setCloseButtonActionListener(ActionListener listener) {
        for (ActionListener l : closeButton.getActionListeners()) {
            closeButton.removeActionListener(l);
        }
        closeButton.addActionListener(listener);
    }

    /**
     * ボタンの推奨サイズを設定します。
     * （呼び出し元で特定のサイズを指定したい場合）
     */
    public void setButtonPreferredSize(int width, int height) {
        Dimension size = new Dimension(width, height);
        okButton.setPreferredSize(size);
        closeButton.setPreferredSize(size);
    }

    /**
     * ボタンのフォントサイズを設定します。
     */
    public void setButtonFontSize(int fontSize) {
        Font currentFont = okButton.getFont();
        okButton.setFont(new Font(currentFont.getName(), Font.BOLD, fontSize));
        closeButton.setFont(new Font(currentFont.getName(), Font.PLAIN, fontSize));
    }

    /**
     * ボタンのサイズとフォントサイズを画面解像度に対して相対的に設定します。
     */
    public void setRelativeButtonSize(double widthRatio, double heightRatio) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int buttonWidth = (int) (screenSize.width * widthRatio);
        int buttonHeight = (int) (screenSize.height * heightRatio);

        setButtonPreferredSize(buttonWidth, buttonHeight);
        setButtonFontSize((int)(buttonHeight * 0.4)); // フォントサイズもボタン高さに合わせる
    }
}