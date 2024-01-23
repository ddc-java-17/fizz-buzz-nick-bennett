package edu.cnm.deepdive.fizzbuzz;

import edu.cnm.deepdive.fizzbuzz.service.FizzBuzz;

public class Main {

  public static void main(String[] args) {
    for (int counter = 1; counter <= 100; counter++) {
      String value = FizzBuzz.evaluate(counter);
      System.out.println(value);
    }
  }

}
