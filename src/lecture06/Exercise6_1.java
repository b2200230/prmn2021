package lecture06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise6_1 {
    public static void main(String[] args) {
        try{
            System.out.println("小数値を入力してください：");
            Scanner scanner = new Scanner(System.in);
            double input = scanner.nextDouble();
            System.out.println("入力した値：　" + input);
        }catch (InputMismatchException e){
            System.out.println("エラー.");
        }
    }
}
