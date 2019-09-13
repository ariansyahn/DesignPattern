/*
 * Copyright (c) Ariansyah Nugroho
 */

package cor;

public class LimaPuluh implements Chain {
    private Chain nextChain;

    @Override
    public void setNext(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void process(Rupiah request) {
        if (request.getAmount()%50==0){
            System.out.println("Pecahan 50 ribu");
        }else {
            nextChain.process(request);
        }
    }
}
