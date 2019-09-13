/*
 * Copyright (c) Ariansyah Nugroho
 */

package command;

public class Main {
    public static void main(String[] args) {
        People people = new People(); // instantiate receiver
        Command peopleCommand = new PeopleCommand(people); // command

        Invoker invoker = new Invoker(peopleCommand); // invoker
        invoker.invoke();
    }
}
