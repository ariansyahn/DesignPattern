/*
 * Copyright (c) Ariansyah Nugroho
 */

package cor;

public class Seratus implements Chain {
    private Chain nextChain;

    @Override
    public void setNext(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void process(Rupiah request) {
        if (request.getAmount()%100==0){
            System.out.println("Pecahan 100 ribu");
        }else {
            nextChain.process(request);
        }
    }
}
