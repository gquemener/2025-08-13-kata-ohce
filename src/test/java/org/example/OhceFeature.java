package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class OhceFeature {

  @Mock private Console console;

  @Test
  void example() {
    var app = new Ohce(console);
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
    assertThat(true).isEqualTo(false);
  }

}
