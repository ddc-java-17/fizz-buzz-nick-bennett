package edu.cnm.deepdive.fizzbuzz.service;

public class FizzBuzz {

  public static String evaluate(int number) {
    String result = "";

    int remainder = Math.abs(number % 15);

    switch (remainder) {
      case 0:
        result = "fizzbuzz";
        break;
      case 3:
      case 6:
      case 9:
      case 12:
        result = "fizz";
        break;
      case 5:
      case 10:
        result = "buzz";
        break;
      default:
        result = String.valueOf(number);
    }

    return result;
  }

}
