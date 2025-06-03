package FrameExtendTutorial;

import javax.swing.*;
import java.awt.*;

public abstract class BaseFrame extends JFrame { // abstract にして直接インスタンス化できないようにする

    public BaseFrame(String title, int width, int height) {
        setTitle(title);
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // デフォルトの閉じる動作
        setLocationRelativeTo(null); // 画面中央に表示

        // 必要に応じて、アイコンの設定などもここに追加できます
        // setIconImage(new ImageIcon("path/to/icon.png").getImage());
    }

    // ウィンドウのサイズを画面解像度に対して相対的に設定するヘルパーメソッド
    protected void setRelativeSize(double widthRatio, double heightRatio) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int frameWidth = (int) (screenSize.width * widthRatio);
        int frameHeight = (int) (screenSize.height * heightRatio);
        setSize(frameWidth, frameHeight);
        setLocationRelativeTo(null); // サイズ変更後に再度中央に配置
    }

    // 閉じるボタンの動作をオーバーライドするためのメソッド (必要であれば)
    // 例えば、JFrame.DISPOSE_ON_CLOSE などにしたい場合に利用
    protected void setCloseOperation(int operation) {
        setDefaultCloseOperation(operation);
    }
}