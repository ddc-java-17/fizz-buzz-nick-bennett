package edu.cnm.deepdive.fizzbuzz.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FizzBuzzTest {

  @ParameterizedTest
  @ValueSource(ints = {1, 101, -1})
  void evaluate_neither(int number) {
    assertEquals(String.valueOf(number), FizzBuzz.evaluate(number));
  }

  @ParameterizedTest
  @ValueSource(ints = {3, 102, -3})
  void evaluate_fizz(int number) {
    assertEquals("fizz", FizzBuzz.evaluate(number));
  }

  @ParameterizedTest
  @ValueSource(ints = {5, 100, -5})
  void evaluate_buzz(int number) {
    assertEquals("buzz", FizzBuzz.evaluate(number));
  }

  @ParameterizedTest
  @ValueSource(ints = {0, 15, 105, -15})
  void evaluate_fizzBuzz(int number) {
    assertEquals("fizzbuzz", FizzBuzz.evaluate(number));
  }

}