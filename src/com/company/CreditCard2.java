package com.company;

public class CreditCard2 {
    int AccNumber2;
    double CurAccBalance2;


    public CreditCard2(int AccNumber2,
                      double CurAccBalance2) {
        this.AccNumber2 = AccNumber2;
        this.CurAccBalance2 = CurAccBalance2;

    }

    public CreditCard2() {

    }

    public void addMonay2(double balance2) {
        CurAccBalance2 += balance2;
        System.out.println("Счет пополнен:  " + CurAccBalance2);

    }

    public void cashOut2(double balance2) {

        CurAccBalance2 -= balance2;
        System.out.println("Остаток на счете:  " + CurAccBalance2);

    }

    public void showMoney2() {
        System.out.println("Номер карты: " + AccNumber2);
        System.out.println("Баланс:  " + CurAccBalance2);

    }
}
