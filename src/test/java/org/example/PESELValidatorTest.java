package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PESELValidatorTest {

  @Test
  void shouldReturnTrueWhenPeselNumberIsCorrect() {
    //when
    boolean isValid = PESELValidator.isValid("12345678923");
    //then
    Assertions.assertTrue(isValid);
  }

  @Test
  void shouldReturnFalseWhenPeselNumberIsTooLong() {
    //when
    boolean isValid = PESELValidator.isValid("12345678923563");
    //then
    Assertions.assertFalse(isValid);
  }

  @Test
  void shouldReturnFalseWhenPeselNumberIsTooShort() {
    //when
    boolean isValid = PESELValidator.isValid("123456789233");
    //then
    Assertions.assertFalse(isValid);
  }

  @Test
  void shouldReturnTrueWhenPeselNumberContainsLetters() {
    //when
    boolean isValid = PESELValidator.isValid("12345g7892a");
    //then
    Assertions.assertFalse(isValid);
  }

}