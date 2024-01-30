package edu.cnm.deepdive.fizzbuzz;

import edu.cnm.deepdive.fizzbuzz.service.FizzBuzz;
import edu.cnm.deepdive.fizzbuzz.service.FizzBuzz.Value;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

public class Main {

  private static final Map<Set<Value>, String> DISPLAY_TABLE = Map.of(
      Set.of(Value.FIZZ), "Fizz",
      Set.of(Value.BUZZ), "Buzz",
      EnumSet.allOf(Value.class), "Fizz-Buzz"
  );

  public static void main(String[] args) {
    for (int counter = 1; counter <= 100; counter++) {
      Set<Value> value = FizzBuzz.evaluate(counter);
      String representation = DISPLAY_TABLE.getOrDefault(value, String.valueOf(counter));
      System.out.println(representation);
    }
  }

}
