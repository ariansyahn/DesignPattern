/*
 * Copyright (c) Ariansyah Nugroho
 */

package decorator;

public class Main {
    public static void main(String[] args) {
//        Girl g = new HobbyDecorator(new IndonesianGirl());
        System.out.println(new HobbyDecorator(new IndonesianGirl()).getDescription());
//        System.out.println(g.getDescription());
    }
}
