package edu.cnm.deepdive.fizzbuzz;

import edu.cnm.deepdive.fizzbuzz.service.FizzBuzz;

public class Main {

  public static void main(String[] args) {
    for (int counter = 1; counter <= 100; counter++) {
      System.out.println(FizzBuzz.evaluate(counter));
    }
  }

}
