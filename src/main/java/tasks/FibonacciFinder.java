package tasks;

import java.math.BigInteger;

/**
 * The class {@code tasks.FibonacciFinder} contains method to find Nth number in Fibonacci sequence
 *
 * @author ozgreat
 */
public class FibonacciFinder {
  /**
   * Find the Nth Fibonacci number
   *
   * @param n Number in Fibonacci sequence
   * @return Nth Fibonacci number
   * @throws NumberFormatException N is less than 0
   */

  public static BigInteger getFibonacci(BigInteger n) throws IllegalArgumentException {
    if (n.compareTo(BigInteger.ZERO) < 0) {
      throw new IllegalArgumentException("Expected n >= 0. Got: n = " + n);
    }

    if (n.equals(BigInteger.ZERO)) {
      return BigInteger.ZERO;
    }

    if (n.compareTo(BigInteger.TWO) <= 0) {
      return BigInteger.ONE;
    }

    BigInteger cur = BigInteger.ZERO;
    BigInteger next = BigInteger.ONE;

    for (int i = 0; n.compareTo(BigInteger.valueOf(i)) > 0; i++) {
      next = next.add(cur);
      cur = next.subtract(cur);
    }

    return cur;
  }
}
