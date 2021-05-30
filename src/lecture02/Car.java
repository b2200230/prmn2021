package lecture02;

public class Car {
    //Exercise2_3
    Tire[] tires;
    Engine engine = new Engine(4000);

    int fuel;
    Car(Tire[] tires , Engine engine){
        fuel = 0;
    }

    public Car() {      //?...課題3のために↑のCarに(Tire[]～)の引数を追加したら
                        //    課題2がエラーになって、赤いアイコンをクリックしたらなぜか自動でできた
                        //    これがあるとどちらも実行できるようになるけど理由がわからない
    }

    void run(){
        if(fuel <= 0){
            System.out.println("燃料が足りないため走れませんでした。");
        }
        else{
            System.out.println("燃料を1消費して走りました。");
        }
    }

    //Exercise2_3
    void startEngine(){
        engine.start();
    }
}
