import org.junit.jupiter.api.Test;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

/**
 * Test class for {@code Main} class
 */
class MainTest {
  /**
   * Not integer input in scanner
   */
  @Test
  void notValidTaskNumberTest() {
    testCatch("abcd");
    testCatch("@#$%^&*()_+-!/.?");
    testCatch("hello");
    testCatch("12.6");
  }

  /**
   * Not valid input for task 5 in main
   */
  @Test
  void notValidDayOfNewYearOrMonthTest() {
    testTask5(MAX_VALUE, 10, (MAX_VALUE / 2) + 1);
    testTask5(MAX_VALUE, 10, (MAX_VALUE / 2) - 1);
    testTask5(MAX_VALUE, 10, MIN_VALUE);
    testTask5(MAX_VALUE, 10, MIN_VALUE + 1);
    testTask5(MAX_VALUE, 10, 0);
    testTask5(MAX_VALUE, 10, -1);
    testTask5(MAX_VALUE, 10, 13);
    testTask5(MAX_VALUE, 10, 14);

    testTask5(MAX_VALUE - 1, 10, MAX_VALUE);
    testTask5(MAX_VALUE - 1, 10, MAX_VALUE - 1);
    testTask5(MAX_VALUE - 1, 10, MAX_VALUE / 2);
    testTask5(MAX_VALUE - 1, 10, (MAX_VALUE / 2) + 1);
    testTask5(MAX_VALUE - 1, 10, (MAX_VALUE / 2) - 1);
    testTask5(MAX_VALUE - 1, 10, MIN_VALUE);
    testTask5(MAX_VALUE - 1, 10, MIN_VALUE + 1);
    testTask5(MAX_VALUE - 1, 10, 0);
    testTask5(MAX_VALUE - 1, 10, -1);
    testTask5(MAX_VALUE - 1, 10, 13);
    testTask5(MAX_VALUE - 1, 10, 14);

    testTask5(MAX_VALUE / 2, 10, MAX_VALUE);
    testTask5(MAX_VALUE / 2, 10, MAX_VALUE - 1);
    testTask5(MAX_VALUE / 2, 10, MAX_VALUE / 2);
    testTask5(MAX_VALUE / 2, 10, (MAX_VALUE / 2) + 1);
    testTask5(MAX_VALUE / 2, 10, (MAX_VALUE / 2) - 1);
    testTask5(MAX_VALUE / 2, 10, MIN_VALUE);
    testTask5(MAX_VALUE / 2, 10, MIN_VALUE + 1);
    testTask5(MAX_VALUE / 2, 10, 0);
    testTask5(MAX_VALUE / 2, 10, -1);
    testTask5(MAX_VALUE / 2, 10, 13);
    testTask5(MAX_VALUE / 2, 10, 14);

    testTask5((MAX_VALUE / 2) + 1, 10, MAX_VALUE);
    testTask5((MAX_VALUE / 2) + 1, 10, MAX_VALUE - 1);
    testTask5((MAX_VALUE / 2) + 1, 10, MAX_VALUE / 2);
    testTask5((MAX_VALUE / 2) + 1, 10, (MAX_VALUE / 2) + 1);
    testTask5((MAX_VALUE / 2) + 1, 10, (MAX_VALUE / 2) - 1);
    testTask5((MAX_VALUE / 2) + 1, 10, MIN_VALUE);
    testTask5((MAX_VALUE / 2) + 1, 10, MIN_VALUE + 1);
    testTask5((MAX_VALUE / 2) + 1, 10, 0);
    testTask5((MAX_VALUE / 2) + 1, 10, -1);
    testTask5((MAX_VALUE / 2) + 1, 10, 13);
    testTask5((MAX_VALUE / 2) + 1, 10, 14);

    testTask5((MAX_VALUE / 2) - 1, 10, MAX_VALUE);
    testTask5((MAX_VALUE / 2) - 1, 10, MAX_VALUE - 1);
    testTask5((MAX_VALUE / 2) - 1, 10, MAX_VALUE / 2);
    testTask5((MAX_VALUE / 2) - 1, 10, (MAX_VALUE / 2) + 1);
    testTask5((MAX_VALUE / 2) - 1, 10, (MAX_VALUE / 2) - 1);
    testTask5((MAX_VALUE / 2) - 1, 10, MIN_VALUE);
    testTask5((MAX_VALUE / 2) - 1, 10, MIN_VALUE + 1);
    testTask5((MAX_VALUE / 2) - 1, 10, 0);
    testTask5((MAX_VALUE / 2) - 1, 10, -1);
    testTask5((MAX_VALUE / 2) - 1, 10, 13);
    testTask5((MAX_VALUE / 2) - 1, 10, 14);

    testTask5(MIN_VALUE, 10, MAX_VALUE);
    testTask5(MIN_VALUE, 10, MAX_VALUE - 1);
    testTask5(MIN_VALUE, 10, MAX_VALUE / 2);
    testTask5(MIN_VALUE, 10, (MAX_VALUE / 2) + 1);
    testTask5(MIN_VALUE, 10, (MAX_VALUE / 2) - 1);
    testTask5(MIN_VALUE, 10, MIN_VALUE);
    testTask5(MIN_VALUE, 10, MIN_VALUE + 1);
    testTask5(MIN_VALUE, 10, 0);
    testTask5(MIN_VALUE, 10, -1);
    testTask5(MIN_VALUE, 10, 13);
    testTask5(MIN_VALUE, 10, 14);

    testTask5(MIN_VALUE + 1, 10, MAX_VALUE);
    testTask5(MIN_VALUE + 1, 10, MAX_VALUE - 1);
    testTask5(MIN_VALUE + 1, 10, MAX_VALUE / 2);
    testTask5(MIN_VALUE + 1, 10, (MAX_VALUE / 2) + 1);
    testTask5(MIN_VALUE + 1, 10, (MAX_VALUE / 2) - 1);
    testTask5(MIN_VALUE + 1, 10, MIN_VALUE);
    testTask5(MIN_VALUE + 1, 10, MIN_VALUE + 1);
    testTask5(MIN_VALUE + 1, 10, 0);
    testTask5(MIN_VALUE + 1, 10, -1);
    testTask5(MIN_VALUE + 1, 10, 13);
    testTask5(MIN_VALUE + 1, 10, 14);

    testTask5(0, 10, MAX_VALUE);
    testTask5(0, 10, MAX_VALUE - 1);
    testTask5(0, 10, MAX_VALUE / 2);
    testTask5(0, 10, (MAX_VALUE / 2) + 1);
    testTask5(0, 10, (MAX_VALUE / 2) - 1);
    testTask5(0, 10, MIN_VALUE);
    testTask5(0, 10, MIN_VALUE + 1);
    testTask5(0, 10, 0);
    testTask5(0, 10, -1);
    testTask5(0, 10, 13);
    testTask5(0, 10, 14);

    testTask5(-1, 10, MAX_VALUE);
    testTask5(-1, 10, MAX_VALUE - 1);
    testTask5(-1, 10, MAX_VALUE / 2);
    testTask5(-1, 10, (MAX_VALUE / 2) + 1);
    testTask5(-1, 10, (MAX_VALUE / 2) - 1);
    testTask5(-1, 10, MIN_VALUE);
    testTask5(-1, 10, MIN_VALUE + 1);
    testTask5(-1, 10, 0);
    testTask5(-1, 10, -1);
    testTask5(-1, 10, 13);
    testTask5(-1, 10, 14);

    testTask5(8, 10, MAX_VALUE);
    testTask5(8, 10, MAX_VALUE - 1);
    testTask5(8, 10, MAX_VALUE / 2);
    testTask5(8, 10, (MAX_VALUE / 2) + 1);
    testTask5(8, 10, (MAX_VALUE / 2) - 1);
    testTask5(8, 10, MIN_VALUE);
    testTask5(8, 10, MIN_VALUE + 1);
    testTask5(8, 10, 0);
    testTask5(8, 10, -1);
    testTask5(8, 10, 13);
    testTask5(8, 10, 14);

    testTask5(9, 10, MAX_VALUE);
    testTask5(9, 10, MAX_VALUE - 1);
    testTask5(9, 10, MAX_VALUE / 2);
    testTask5(9, 10, (MAX_VALUE / 2) + 1);
    testTask5(9, 10, (MAX_VALUE / 2) - 1);
    testTask5(9, 10, MIN_VALUE);
    testTask5(9, 10, MIN_VALUE + 1);
    testTask5(9, 10, 0);
    testTask5(9, 10, -1);
    testTask5(9, 10, 13);
    testTask5(9, 10, 14);
  }

  private void check(String inStr) {
    MainTestService.testErrMain(inStr, "You enter some shit in the scanner!" + System.lineSeparator());
  }

  private void testCatch(String str) {
    String inStr = str + System.lineSeparator();
    check(inStr);
  }

  private void testTask5(int ng, int day, int month) {
    String inStr = "5 " + ng + " " + day + " " + month + System.lineSeparator();

    MainTestService.testErrMain(inStr, "Index " + (ng - 1) + " out of bounds for length " + 7);
  }
}
