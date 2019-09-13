/*
 * Copyright (c) Ariansyah Nugroho
 */

package cor;

public class Demo {
    public static void main(String[] args) {
        Chain c1 = new Seratus();
        Chain c2 = new LimaPuluh();
        Chain c3 = new DuaPuluh();
        c1.setNext(c2);
        c2.setNext(c3);

        //calling cor
        c1.process(new Rupiah(40));
        c1.process(new Rupiah(100));
        c1.process(new Rupiah(50));
        c1.process(new Rupiah(20));
    }
}
