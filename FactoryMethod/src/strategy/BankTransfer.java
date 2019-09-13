/*
 * Copyright (c) Ariansyah Nugroho
 */

package strategy;

public class BankTransfer implements Payment {
    @Override
    public double pay(double amount) {
        double charge = 5.0;
        return amount-charge;
    }
}
