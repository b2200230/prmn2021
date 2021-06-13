package lecture04;

import java.util.ArrayList;
import java.util.Arrays;

public class ATM {
    private ArrayList<Account> accountList;

    public ATM(){
        //?...accountListの初期化がよくわからない
        this.accountList = new ArrayList<>();
    }

    public void registerAccount(String name,String number){
        accountList.add(new Account(name,number));
        System.out.println( name + " さんのアカウントを口座番号:" + number + " で登録しました。");
    }

    public boolean existsAccount(String name,String number){
        for(Account account : accountList){
            if(account.getName() == name && account.getNumber() == number){
                System.out.println("名前:" + name + " 口座番号:" + number + " は存在します。");
                return true;
            }
        }
        System.out.println("名前:" + name + " 口座番号:" + number + " は存在しません。");
        return false;
    }

    //long型...64bitの整数型（int型は32bit）
    public void deposit(String number,long money){      //入金
        for(Account account : accountList){
            if(account.getNumber() == number){
                account.balance = account.getBalance() + money;
                System.out.println("口座番号:" + number + " に " + money + " 円入金しました。");
            }
        }
    }

    public  long withdraw(String number,long money) {    //引出
        for(Account account : accountList) {
            if(account.getNumber() == number) {
                if (account.getBalance() < money) {
                    System.out.println("口座番号:" + number + " から " + money + " 円引き出せませんでした。残高:" + account.getBalance() + " 円です。");
                }
                else {
                    account.balance -= money;
                    System.out.println("口座番号:" + number + " から " + money + " 円引き出しました。残高:" + account.getBalance() + " 円です。");
                }
            }
        }
        return 0;   //戻り値がわからない
    }
}
