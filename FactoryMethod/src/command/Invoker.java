/*
 * Copyright (c) Ariansyah Nugroho
 */

package command;

class Invoker {
    private Command command;

    Invoker(Command command) {
        this.command = command;
    }

    void invoke() {
        command.execute();
    }
}
