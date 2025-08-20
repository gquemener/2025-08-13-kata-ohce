package org.example.feature;

import static org.mockito.Mockito.verify;

import org.example.Console;
import org.example.Ohce;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class OhceFeature {

  @Mock private Console console;

  @Test
  void successfully_use_it() {
    var app = new Ohce(console);
    app.start("Pedro");
    verify(console).printLn("> ¡Buenos días Pedro!");

    app.prompt("hola");
    verify(console).printLn("> aloh");

    app.prompt("oto");
    verify(console).printLn("> oto");
    verify(console).printLn("> ¡Bonita palabra!");

    app.prompt("stop");
    verify(console).printLn("> pots");

    app.prompt("Stop!");
    verify(console).printLn("> Adios Pedro");
  }
}
