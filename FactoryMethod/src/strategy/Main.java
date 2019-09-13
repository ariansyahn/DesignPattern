/*
 * Copyright (c) Ariansyah Nugroho
 */

package strategy;

public class Main {
    public static void main(String[] args) {
        double money=100.0;
        System.out.println("Price before Charged : "+money);
        System.out.println("Price after Charged : "+new BankTransfer().pay(money));
    }
}
