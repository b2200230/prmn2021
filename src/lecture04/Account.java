package lecture04;

public class Account {
    private String name;
    private String number;
    public long balance;       //残高

    public Account(String name,String number){
        this.name = name;
        this.number = number;
        this.balance = 0;
    }

    public String getName(){
        return name;
    }

    public String getNumber(){
        return number;
    }

    public long getBalance() {
        return balance;
    }

    public long setBalance(long balance){
        this.balance = balance;
        return balance;
    }

}
