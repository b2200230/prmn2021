package lecture03;

import com.sun.source.util.SourcePositions;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        System.out.println("何行分入力しますか？");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();      //32bit整数値の入力受付
        scanner.nextLine();  //改行コードの空読み

        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < input; i++){
            System.out.println( (i+1) + "行目");
            String line = scanner.nextLine();
            strings.add(line);
        }

        System.out.println("入力した文字列：");
        for(String string : strings){
            System.out.println("[" + strings.indexOf(string) + "] " + string);
            //strings.indexOf(string)...要素の順番
            //strings...配列      indexOf(string)...stringが何番目か検索

            //System.out.println();...表示した後、自動で改行する
            //System.out.print();.....表示した後、改行しない
        }
    }
}
