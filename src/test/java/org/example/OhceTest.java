package org.example;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class OhceTest {

  @Mock
  private Console console;
  @Mock
  private Clock clock;

  @ParameterizedTest
  @CsvSource({
      "MORNING, Buenos días",
      "AFTERNOON, Buenas tardes",
      "EVENING, Buenas noches",
  })
  void morning(Moment moment, String greeting) {
    // given
    Mockito.when(clock.moment()).thenReturn(moment);
    var ohce = new Ohce(console, clock);
    // when
    ohce.start("Pedro");
    // then
    Mockito.verify(console).printLn("> ¡" + greeting + " Pedro!");
  }
}
