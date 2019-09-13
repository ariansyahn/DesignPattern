/*
 * Copyright (c) Ariansyah Nugroho
 */

package decorator;

public class GirlDecorator implements Girl {

    Girl girl;

    GirlDecorator(Girl girl) {
        this.girl= girl;
    }

    public String getDescription() {
        return girl.getDescription();
    }
}
