package BankServise;

import BankUI.Ui;
import java.util.Scanner;

public class BankServise {
    Scanner sc = new Scanner(System.in);
    Ui ui = new Ui();
    public boolean isPinCodeValid(int pinToCheck, int pinFromDB) {

        if (pinFromDB == pinToCheck) {
            return true;
        } else {
            return false;
        }
    }

    int money = 40000;

    public String chekcMoney() {
        System.out.println("Введите валюту ");
        String currency = sc.next();

        if (currency.equals("som")) {
            System.out.println(money);
        } else if (currency.equals("dollar")) {
            System.out.println(money / 88);
        } else if (currency.equals("ruble")) {
            System.out.println(money / 0.92);
        }


        return currency;
    }
    int passFromBD = 1111;
    public int chengepin() {
        int newpass = 0;
        boolean isTrue = true;
        System.out.println("Input old password");
        int oldpass = sc.nextInt();
        if (passFromBD == oldpass) {
            while (isTrue) {
                System.out.println("Input new password");
                newpass = sc.nextInt();
                if (newpass != oldpass) {
                    passFromBD = newpass;
                    System.out.println("New password is " + passFromBD);
                    System.out.println("Old password is " + oldpass);
                    isTrue = false;
                } else {
                    System.out.println("Password is same ");
                    System.out.println("Input one more time ");
                }
            }


            

        }else{
            System.out.println("Error");
        }

        return newpass;
    }
    public int takemoney(){

        System.out.println("1-> 5000");
        System.out.println("2-> 1000");
        System.out.println("3-> 500");
        System.out.println("4-> 200");
        System.out.println("5-> Другое");

        int amount1 = sc.nextInt();

        if (amount1 <= money) {
            switch (amount1) {
                case 1:
                    money = money - 5000;
                    break;
                case 2:
                    money = money - 1000;
                    break;
                case 3:
                    money = money - 500;
                    break;
                case 4:
                    money = money - 200;
                    break;
                case 5:
                    int amount = ui.amountForTake();
                    if (amount > money) {
                        System.out.println("Не хватает средств ");
                    } else {
                        money = money - amount;

                    }


            }
        }
        System.out.println(money);

        return money;
        

    }
    public int validPass(){


        Scanner sc = new Scanner(System.in);
        System.out.println("Input password ");
        int passFromUser = sc.nextInt();

        return passFromUser;
    }
}
