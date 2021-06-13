package lecture04;

public class Exercise4_2 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        while (true) {
            boolean atms = atm.existsAccount("大友一樹", "12345");
            if (atms) {
                break;
            }
            else {
                atm.registerAccount("大友一樹","12345");
            }
        }
        atm.deposit("12345",1000);
        atm.withdraw("12345",2000);
        atm.withdraw("12345",500);
    }
}
