/*
 * Copyright (c) Ariansyah Nugroho
 */

package decorator;

public class HobbyDecorator extends GirlDecorator{

    HobbyDecorator(Girl girl) {
        super(girl);
    }

    public String getDescription() {
        return girl.getDescription() + addHobby();
    }

    private String addHobby() {
        return " likes gossipping";
    }
}
