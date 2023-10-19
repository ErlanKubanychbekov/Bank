package BankUI;

import java.util.Scanner;

public class Ui {
    Scanner sc = new Scanner(System.in);
    public void mainpage(){

        System.out.println("Вы находитесь на главной странице, выбираете следующий шаг");
        System.out.println("1->Просмотр баланса");
        System.out.println("2->Изменить пин код");
        System.out.println("3->Снять средства");
        System.out.println("4->Закрыть");
    }
    public int  amountForTake(){

        System.out.println("How much you want take ");
        int amountForTake = sc.nextInt();
        return amountForTake;
    }
    public void goodBay(){
        System.out.println("Good bay");
    }
}
