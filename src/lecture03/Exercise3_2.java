package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        System.out.println("何行分入力しますか？");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();      //32bit整数値の入力受付
        String voids = scanner.nextLine();  //改行コードの空読み

        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < input; i++){
            System.out.println( (i+1) + "行目");
            String line = scanner.nextLine();
            strings.add(line);
        }

        System.out.println("入力した文字列：");
        int i = 0;
        for(String string : strings){
            System.out.println("[" + i + "] " + string);
            i++;
        }

    }
}
