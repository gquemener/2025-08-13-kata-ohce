package org.example;

import static org.example.Moment.AFTERNOON;
import static org.example.Moment.EVENING;

class Ohce {

  private Console console;
  private Clock clock;

  // TODO: remove constructor
  public Ohce(Console console) {
  }

  public Ohce(Console console, Clock clock) {
    this.console = console;
    this.clock = clock;
  }


  // TODO: rename parameter
  public void start(String pedro) {
    // TODO: extract message into a variable
    if (AFTERNOON.equals(clock.moment())) {
      console.printLn("> ¡Buenas tardes Pedro!");
    } else if (EVENING.equals(clock.moment())) {
      console.printLn("> ¡Buenas noches Pedro!");
    } else {
      console.printLn("> ¡Buenos días Pedro!");
    }

    // TODO: call console.printLn with message
  }
}
