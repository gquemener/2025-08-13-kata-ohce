package org.example;

class Ohce {

  final private Console console;
  final private Clock clock;

  public Ohce(Console console, Clock clock) {
    this.console = console;
    this.clock = clock;
  }

  public void start(String name) {
    final String template = switch (clock.moment()) {
      case AFTERNOON -> "> ¡Buenas tardes %s!";
      case MORNING -> "> ¡Buenos días %s!";
      case EVENING -> "> ¡Buenas noches %s!";
    };
    console.printLn(template.formatted(name));
  }
}
