package lecture05;

//Insectクラスから派生
public class Butterfly extends Insect{
    @Override
    public void move(){
        System.out.println("飛んだよ");
    }
}
