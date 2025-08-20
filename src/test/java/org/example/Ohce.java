package org.example;

import static org.example.Moment.AFTERNOON;
import static org.example.Moment.EVENING;

class Ohce {

  private Console console;
  private Clock clock;

  public Ohce(Console console) {
  }

  public Ohce(Console console, Clock clock) {
    this.console = console;
    this.clock = clock;
  }

  public void start(String pedro) {
    if (AFTERNOON.equals(clock.moment())) {
      console.printLn("> ¡Buenas tardes Pedro!");
    } else if (EVENING.equals(clock.moment())) {
      console.printLn("> ¡Buenas noches Pedro!");
    } else {
      console.printLn("> ¡Buenos días Pedro!");
    }
  }
}
