package edu.cnm.deepdive.fizzbuzz.service;

public class FizzBuzz {

  static final String FIZZ_RESULT = "fizz";
  static final String BUZZ_RESULT = "buzz";
  static final String FIZZ_BUZZ_RESULT = FIZZ_RESULT + BUZZ_RESULT;

  public static String evaluate(int number) {
    int remainder = Math.abs(number % 15);

    return switch (remainder) {
      case 0 -> FIZZ_BUZZ_RESULT;
      case 3, 6, 9, 12 -> FIZZ_RESULT;
      case 5, 10 -> BUZZ_RESULT;
      default -> String.valueOf(number);
    };

  }

}
