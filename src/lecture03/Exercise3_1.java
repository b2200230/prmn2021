package lecture03;

import java.util.Scanner;

public class Exercise3_1 {
    public static void main(String[] args) {
        System.out.println("任意の文字列を入力してください：");
        Scanner scanner = new Scanner(System.in);   //コンソールからの入力を受け付ける
        String input = scanner.nextLine();          //入力された1行分の文字列を読み取って返す
        System.out.println("\"" + input + "\"と入力されました");        //「"」を表示させるには前に「\」をつける
    }
}
