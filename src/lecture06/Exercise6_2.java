package lecture06;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_2 {
    public static void main(String[] args) {
        //Randomクラス...int nextInt(int max) で0以上max未満の値をランダムに返す
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0;i<5;i++) {
            numbers.add(random.nextInt(6) + 1);
        }
        System.out.println("さいころを５つ振りました。");
        System.out.println("何番目のさいころの値を確認しますか？");
        try{
            Scanner scanner = new Scanner(System.in);
            int index = scanner.nextInt();
            System.out.println(index + "番目のさいころの値：　" + numbers.get(index));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("ArrayListの範囲外アクセスを確認しました。");
            System.out.println("プログラムを終了します。");
        }
        catch (InputMismatchException e){
            System.out.println("整数以外の値が入力されました。");
            System.out.println("プログラムを終了します。");
        }


    }
}
