@SuppressWarnings("serial")
public class App {
    public static void main(String[] args) {
        int number1 =3; // int型の変数numberを定義してください
        System.out.println(number1); // 変数numberを出力してください
        static name="Wanko"; // String型の変数nameを定義してください
        System.out.println(name); // 変数nameを出力してください
        static text = "プログラミングを勉強しよう"; // 変数textに「プログラミングを勉強しよう」を代入してください
        System.out.println("Progateで"+text); // 「Progateで」と変数textを連結して出力してください
        int number2 = 11;
        text = "Ruby";
        System.out.println(number2);
        System.out.println(text);
        number3 = 9; // 変数numberを9で上書きしてください
        System.out.println(number3); // 変数numberを出力してください
        text = "Java"; // 変数textを「Java」で上書きしてください
        System.out.println(text); // 変数textを出力してください
        int number4 = 3;
        System.out.println(number4);
        number4 = number4 + 7; // 変数numberの値に7を足して、変数numberを上書きしてください
        System.out.println(number4); // 変数numberを出力してください
        int number5 = 8;
        number5 *= 7; // 変数numberに7をかけて、変数numberを上書きしてください
        System.out.println(number5); // 変数numberを出力してください
        number5++; // 変数numberの値に1を足して、変数numberを上書きしてください
        System.out.println(number5); // 変数numberを出力してください
        int number6 = 3;
        int number7 = 7; // int型の変数number2を定義し、7を代入してください
        double number8 = 8.5; // double型の変数number1を定義し、8.5を代入してください。
        double number9 = 3.4; // double型の変数number2を定義し、3.4を代入してください。
        System.out.println(number6+number7); // number1にnumber2を足した値を出力してください
        System.out.println(number8-number9); // number1からnumber2を引いた値を出力してください
        System.out.println(number1*number2); // number1 * number2を出力してください
        int length = 6;
        int height = 8;
        int rectangleArea = length * height; // 変数rectangleAreaに、四角形の面積を代入してください
        int triangleArea =rectangleArea/2; // 変数triangleAreaに、三角形の面積を代入してください
        System.out.println("Hello, World!","こんにちは、Java",17,5+3,"5 + 3",12/3,3*6,8%3,"こんにちは"+"世界","38"+"19",38+19,rectangleArea,triangleArea); //真剣に動くコードはここだけ
    }
}