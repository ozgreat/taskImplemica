package tasks;

import static java.lang.Math.abs;
import static java.lang.Integer.MIN_VALUE;

/**
 * The {@code tasks.GcdOf4Numbers} class that contains method for finding GCD of 4 numbers
 *
 * @author ozgreat
 */
public class GcdOf4Numbers {
  /**
   * Find GCD of 2 numbers by Evklid's algo
   *
   * @param first  first number
   * @param second second number
   * @return gcd of first and second
   */
  private static Integer evklid(int first, int second) {
    if (first < 0 || second < 0) {
      first = abs(first);
      second = abs(second);
    }

    if (first == 1 || second == 1) {
      return 1;
    }

    if (first > second) {
      first += second;
      second = first - second;
      first -= second;
    }

    if (first == 0) {
      return second;
    }

    int t;
    while (second != 0) {
      t = second;
      second = first % second;
      first = t;
    }

    return first;
  }

  /**
   * Find GCD of 4 numbers,
   *
   * @param x1 1st number
   * @param x2 2nd number
   * @param x3 3d number
   * @param x4 4th number
   * @return gcd of x1, x2, x3, x4
   * @throws NumberFormatException One of numbers is Integer.MIN_VALUE
   */
  public static Integer getGcdOf4Numbers(int x1, int x2, int x3, int x4) throws IllegalArgumentException {
    if (x1 == MIN_VALUE || x2 == MIN_VALUE || x3 == MIN_VALUE || x4 == MIN_VALUE) {
      throw new IllegalArgumentException("Expected: x1,x2,x3,x4 is not MIN_VALUE. Got: x1= " + x1 + " x2= " + x2 +
          " x3= " + x3 + " x4= " + x4);
    }

    int gcd2;
    gcd2 = evklid(x1, x2);

    int gcd3;
    gcd3 = evklid(x3, gcd2);

    return evklid(x4, gcd3);
  }
}
