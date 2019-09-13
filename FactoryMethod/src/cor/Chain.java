/*
 * Copyright (c) Ariansyah Nugroho
 */

package cor;

public interface Chain {
    void setNext(Chain nextChain);
    void process(Rupiah request);
}
