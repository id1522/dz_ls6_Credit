package com.company;

public class CreditCard {
    int AccNumber;
    double CurAccBalance;


    public CreditCard(int AccNumber,
                      double CurAccBalance) {
        this.AccNumber = AccNumber;
        this.CurAccBalance = CurAccBalance;

    }

    public CreditCard() {

    }

    public void addMonay(double balance) {
        CurAccBalance += balance;
        System.out.println("Счет пополнен:  " + CurAccBalance);

    }

    public void cashOut(double balance) {

        CurAccBalance -= balance;
        System.out.println("Остаток на счете:  " + CurAccBalance);

    }

    public void showMoney() {
        System.out.println("Номер карты: " + AccNumber);
        System.out.println("Баланс:  " + CurAccBalance);

    }
}
