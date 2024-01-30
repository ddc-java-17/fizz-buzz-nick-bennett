package edu.cnm.deepdive.fizzbuzz.service;

import java.util.EnumSet;
import java.util.Set;

public class FizzBuzz {

  public static Set<Value> evaluate(int number) {
    Set<Value> result = EnumSet.noneOf(Value.class);
    if (number % 3 == 0) {
      result.add(Value.FIZZ);
    }
    if (number % 5 == 0) {
      result.add(Value.BUZZ);
    }
    return result;
  }

  public enum Value {
    FIZZ, BUZZ
  }

}
