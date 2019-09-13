/*
 * Copyright (c) Ariansyah Nugroho
 */

package command;

class PeopleCommand implements Command {

    private People people;

    PeopleCommand(People people) {
        this.people = people;
    }

    @Override
    public void execute() {
        people.run();
    }
}
