package lecture03;

import java.util.ArrayList;

public class Exercise3_4 {
    public static void main(String[] args) {
        Vegetable vegetable1 = new Vegetable("にんじん",117);
        Vegetable vegetable2 = new Vegetable("たまねぎ",120);
        Vegetable vegetable3 = new Vegetable("じゃがいも",154);

        ArrayList<Vegetable> vegetables = new ArrayList<>();
        vegetables.add(vegetable1);
        vegetables.add(vegetable2);
        vegetables.add(vegetable3);

        for(Vegetable vegetable : vegetables){
            vegetable.print();
        }

    }
}
