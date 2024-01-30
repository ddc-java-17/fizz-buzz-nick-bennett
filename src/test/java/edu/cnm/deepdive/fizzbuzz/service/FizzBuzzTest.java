package edu.cnm.deepdive.fizzbuzz.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.cnm.deepdive.fizzbuzz.service.FizzBuzz.Value;
import java.util.EnumSet;
import java.util.Set;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FizzBuzzTest {

  @ParameterizedTest
  @ValueSource(ints = {1, 101, -1})
  void evaluate_neither(int number) {
    assertEquals(Set.of(), FizzBuzz.evaluate(number));
  }

  @ParameterizedTest
  @ValueSource(ints = {3, 102, -3})
  void evaluate_fizz(int number) {
    assertEquals(Set.of(Value.FIZZ), FizzBuzz.evaluate(number));
  }

  @ParameterizedTest
  @ValueSource(ints = {5, 100, -5})
  void evaluate_buzz(int number) {
    assertEquals(Set.of(Value.BUZZ), FizzBuzz.evaluate(number));
  }

  @ParameterizedTest
  @ValueSource(ints = {0, 15, 105, -15})
  void evaluate_fizzBuzz(int number) {
    assertEquals(EnumSet.allOf(Value.class), FizzBuzz.evaluate(number));
  }

}