import BankServise.BankServise;
import BankUI.Ui;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        BankServise bankServise = new BankServise();
        Ui ui = new Ui();

        Scanner sc = new Scanner(System.in);

        int passFromBD = 1111;
        boolean isTrue = true;
        for(int i = 0; i<=2;i++){

        if(bankServise.isPinCodeValid(bankServise.validPass(),passFromBD)) {
            while (isTrue) {
                ui.mainpage();
                int choos = sc.nextInt();
                switch (choos) {

                    case 1:
                        bankServise.chekcMoney();
                        break;

                    case 2:
                        bankServise.chengepin();
                        break;

                    case 3:
                        bankServise.takemoney();
                        break;
                    case 4:
                        ui.goodBay();
                        isTrue= false;
                        break;
                }
            }
        }
        }
        System.out.println("Карта заблокираванна");




    }
}