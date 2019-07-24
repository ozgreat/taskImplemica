package executor;

import tasks.FibonacciFinder;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciFinderExecutor implements Executable {
  /**
   * Init parameters for {@code FibonacciFinder} and execute them
   *
   * @param in Scanner to input data by user
   */
  @Override
  public void execute(Scanner in) {
    System.out.println("Enter n to find n-Fibonacci:");

    BigInteger fib = in.nextBigInteger();

    try {
      System.out.print(FibonacciFinder.getFibonacci(fib));
    } catch (IllegalArgumentException e) {
      System.err.println(e.getMessage());
    }
  }
}
