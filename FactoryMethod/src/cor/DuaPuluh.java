/*
 * Copyright (c) Ariansyah Nugroho
 */

package cor;

public class DuaPuluh implements Chain {
    private Chain nextChain;

    @Override
    public void setNext(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void process(Rupiah request) {
        if (request.getAmount()%20==0){
            System.out.println("Pecahan 20 ribu");
        }else {
            nextChain.process(request);
        }
    }
}
