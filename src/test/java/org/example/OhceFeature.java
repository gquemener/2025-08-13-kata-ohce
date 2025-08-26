package org.example;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class OhceFeature {

  @Mock
  private Console console;
  @Mock
  private Clock clock;

  @Test
  void example() {
    when(clock.moment()).thenReturn(Moment.MORNING);
    final var app = new Ohce(console, clock);
    app.start("Pedro");
    verify(console).printLn("> ¡Buenos días Pedro!");

    /*
    $ hola
    > aloh
    $ oto
    > oto
    > ¡Bonita palabra!
    $ stop
    > pots
    $ Stop!
    > Adios Pedro
     */
  }

}
