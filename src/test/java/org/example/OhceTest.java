package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class OhceTest {

  @Mock private Console console;
  @Mock private Clock clock;

  @Test
  void ddd() {
    // given
    Mockito.when(clock.moment()).thenReturn(Moment.MORNING);
    var ohce = new Ohce(console, clock);
    // when
    ohce.start("Pedro");
    // then
    Mockito.verify(console).printLn("> ¡Buenos días Pedro!");
  }

}
