package lecture02;

public class GasStation {
    void refuel(Car car){
        car.fuel += 20;         // fuel = fuel + 20;  と同じ意味
        System.out.println("給油したことによりfuelが20増えました。");
    }
}
