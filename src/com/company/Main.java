package com.company;

import java.util.Scanner;

import static com.company.CreditCard.*;

public class Main {

    public static void main(String[] args) {

        while (true) {

            System.out.println("Ввести номер карты 1,2.3 - 0 exit:    ");
            Scanner scan = new Scanner(System.in);
            int numbers = scan.nextInt();
            switch (numbers) {
                case 0:
                    return;
                case 1:
                    System.out.println("Пополни счет 1:    ");
                    double Balance1 = scan.nextDouble();
                    CreditCard creditCard = new CreditCard(numbers, Balance1);
                    creditCard.showMoney();

                    System.out.println("1- Пополнить  2- Снять  ");

                    int choice1 = scan.nextInt();
                    switch (choice1) {

                        case 1:
                            System.out.println("Ввести сумму:   ");
                            double Balance = scan.nextDouble();
                            creditCard.addMonay(Balance);
                            break;

                        case 2:
                            System.out.println("Состояние счета :  " + Balance1);
                            System.out.println("Сколько желаете снять? :   ");
                            Balance = scan.nextDouble();
                            if (Balance > Balance1) {
                                System.out.println("На карте не достаточно средств!");
                            } else {
                                creditCard.cashOut(Balance);
                                break;
                            }
                    }

                    break;

                case 2:
                    System.out.println("Пополни счет 2:    ");

                    double Balance2 = scan.nextDouble();
                    CreditCard2 creditCard2 = new CreditCard2(numbers, Balance2);
                    creditCard2.showMoney2();

                    System.out.println("1- Пополнить  2- Снять  ");

                    int choice2 = scan.nextInt();
                    switch (choice2) {

                        case 1:
                            System.out.println("Ввести сумму:   ");
                            double Balance = scan.nextDouble();
                            creditCard2.addMonay2(Balance);
                            break;

                        case 2:
                            System.out.println("Состояние счета :  " + Balance2);
                            System.out.println("Сколько желаете снять? :   ");
                            Balance = scan.nextDouble();
                            if (Balance > Balance2) {
                                System.out.println("На карте не достаточно средств!");
                            } else {
                                creditCard2.cashOut2(Balance);
                                break;
                            }
                    }

                    break;

                case 3:
                    System.out.println("Пополни счет 3:    ");

                    double Balance3 = scan.nextDouble();
                    CreditCard3 creditCard3 = new CreditCard3(numbers, Balance3);
                    creditCard3.showMoney3();

                    System.out.println("1- Пополнить  2- Снять  ");

                    int choice3 = scan.nextInt();

                    switch (choice3) {

                        case 1:
                            System.out.println("Ввести сумму:   ");
                            double Balance = scan.nextDouble();
                            creditCard3.addMonay3(Balance);
                            break;

                        case 2:
                            System.out.println("Состояние счета :  " + Balance3);
                            System.out.println("Сколько желаете снять? :   ");
                            Balance = scan.nextDouble();
                            if (Balance > Balance3) {
                                System.out.println("На карте не достаточно средств!");
                            } else {
                                creditCard3.cashOut3(Balance);
                                break;
                            }


                    }


            }
        }
    }
}
