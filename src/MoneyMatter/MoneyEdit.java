package MoneyMatter;        //what happens to money

import javax.swing.*;
import java.util.*;
abstract public class MoneyEdit {               //operations on acc money *** abstract class n parent class
    double acc_balance;                         //current balance
    Scanner sc = new Scanner(System.in);
    abstract void EditedBalance();              //balance editing in account
}

class Withdrawal extends MoneyEdit{
    double withdraw_money = 0;                  //initialize withdrawal money variable

    void setWithdraw_money(){                   //enter withdrawal money
        withdraw_money = sc.nextDouble();
    }
    double getWithdraw_money(){                 //return withdrawal money
        return withdraw_money;
    }

    @Override
    void EditedBalance() {
        if((acc_balance - withdraw_money)<0){                       //if withdraw money is more than acc balance
            System.out.println("You don't have enough balance...");
        }else {                                                     //if conditions are okay
            acc_balance = acc_balance - withdraw_money;
            System.out.println("Edited Balance after withdrawal: " + acc_balance);
        }
    }
}

class Deposit extends MoneyEdit{
    double deposit_money = 0;                   //initalize deposit money
    void setDeposit_money(){
        deposit_money = sc.nextDouble();
    }
    double getDeposit_money(){
        return deposit_money;
    }

    @Override
    void EditedBalance() {
        acc_balance = acc_balance + deposit_money;
        System.out.println("Edited balance after deposit: "+ acc_balance);
    }
}

class CurrentBalance extends MoneyEdit{
    CurrentBalance(){
        JButton cur_bal = new JButton("Current Balance");
    }
    @Override
    void EditedBalance() {
        System.out.println("Current Balance in account: "+acc_balance);
    }

}