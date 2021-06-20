package lecture05;

import java.util.ArrayList;
import java.util.List;

public class Exercise5_7 {
    public static void main(String[] args) {
        //Insect,Butterfly,Locust,SwallowButterflyクラスのインスタンスをListに格納がよくわからない
        List<Insect> insects = new ArrayList<>();
        insects.add(new Insect());
        insects.add(new Butterfly());
        insects.add(new Locust());
        insects.add(new SwallowtailButterfly());

        for(Insect insect : insects){
            insect.move();
        }

    }
}
