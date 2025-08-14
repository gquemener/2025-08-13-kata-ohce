package org.example.acceptance;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.example.ohce.App;
import org.example.ohce.AppExecutionStopped;
import org.example.ohce.Greeter;
import org.example.ohce.Printer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class GreetUserFeature {

  @Mock private Printer printer;
  @Mock private Greeter greeter;

  @Test
  void successfullyUseTheApp() {
    when(greeter.greet("Pedro")).thenReturn("¡Buenos días Pedro!");

    var app = new App(printer, greeter);
    app.greet("Pedro");
    app.ohce("hola");
    app.ohce("oto");
    app.ohce("stop");
    assertThatExceptionOfType(AppExecutionStopped.class).isThrownBy(() -> app.ohce("Stop!"));

    verify(printer).printLn("> ¡Buenos días Pedro!");
    verify(printer).printLn("> aloh");
    verify(printer).printLn("> oto");
    verify(printer).printLn("> ¡Bonita palabra!");
    verify(printer).printLn("> pots");
    verify(printer).printLn("> Adios Pedro");
  }

  // TODO: Fail to ohce without greeting first!
  // TODO: Fail to greet multiple times!
}
