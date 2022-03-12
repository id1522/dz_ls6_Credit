package com.company;

public class CreditCard3 {
    int AccNumber3;
    double CurAccBalance3;


    public CreditCard3(int AccNumber3,
                      double CurAccBalance3) {
        this.AccNumber3 = AccNumber3;
        this.CurAccBalance3 = CurAccBalance3;

    }

    public CreditCard3() {

    }

    public void addMonay3(double balance3) {
        CurAccBalance3 += balance3;
        System.out.println("Счет пополнен:  " + CurAccBalance3);

    }

    public void cashOut3(double balance3) {

        CurAccBalance3 -= balance3;
        System.out.println("Остаток на счете:  " + CurAccBalance3);

    }

    public void showMoney3() {
        System.out.println("Номер карты: " + AccNumber3);
        System.out.println("Баланс:  " + CurAccBalance3);

    }
}
