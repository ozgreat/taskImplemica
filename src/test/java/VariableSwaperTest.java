import org.junit.jupiter.api.Test;
import tasks.VariableSwaper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

/**
 * Test class for {@code VariableSwaper}
 */
class VariableSwaperTest {
  /**
   * Max value that will be tested
   */
  private final static int MAX = MAX_VALUE;
  /**
   * Min value that will be tested
   */
  private final static int MIN = MIN_VALUE;
  /**
   * Middle value that will be tested, half of max
   */
  private final static int HALF_OF_MAX = MAX / 2;
  /**
   * Zero constant
   */
  private final static int ZERO = 0;

  /**
   * Test all combinations of valid special cases
   */
  @Test
  void tests() {
    //MAX with all
    test(MAX, MAX - 1);
    test(MAX, HALF_OF_MAX);
    test(MAX, HALF_OF_MAX - 1);
    test(MAX, HALF_OF_MAX + 1);
    test(MAX, MIN);
    test(MAX, MIN + 1);
    test(MAX, ZERO);
    test(MAX, 1);
    test(MAX, -1);

    //MAX-1 with all
    test(MAX - 1, HALF_OF_MAX);
    test(MAX - 1, HALF_OF_MAX - 1);
    test(MAX - 1, HALF_OF_MAX + 1);
    test(MAX - 1, MIN);
    test(MAX - 1, MIN + 1);
    test(MAX - 1, ZERO);
    test(MAX - 1, 1);
    test(MAX - 1, ZERO - 1);


    //MAX/2 with all
    test(HALF_OF_MAX, HALF_OF_MAX - 1);
    test(HALF_OF_MAX, HALF_OF_MAX + 1);
    test(HALF_OF_MAX, MIN);
    test(HALF_OF_MAX, MIN + 1);
    test(HALF_OF_MAX, ZERO);
    test(HALF_OF_MAX, 1);
    test(HALF_OF_MAX, -1);

    test(HALF_OF_MAX - 1, HALF_OF_MAX + 1);
    test(HALF_OF_MAX - 1, MIN);
    test(HALF_OF_MAX - 1, MIN + 1);
    test(HALF_OF_MAX - 1, ZERO);
    test(HALF_OF_MAX - 1, 1);
    test(HALF_OF_MAX - 1, -1);

    //(MAX/2)+1 with all
    test(HALF_OF_MAX + 1, MIN);
    test(HALF_OF_MAX + 1, MIN + 1);
    test(HALF_OF_MAX + 1, ZERO);
    test(HALF_OF_MAX + 1, 1);
    test(HALF_OF_MAX + 1, -1);

    //MIN with all
    test(MIN, MIN + 1);
    test(MIN, ZERO);
    test(MIN, 1);
    test(MIN, -1);

    //MIN+1 with all
    test(MIN + 1, ZERO);
    test(MIN + 1, 1);
    test(MIN + 1, -1);

    // 0 with all
    test(ZERO, 1);
    test(ZERO, -1);

    test(1, -1);
  }

  private void oldCheck(int a, int b) {
    VariableSwaper taskAfter = new VariableSwaper(a, b);
    taskAfter.swap();
    assertEquals(a, taskAfter.getY());
    assertEquals(b, taskAfter.getX());
  }

  private void check(int a, int b) {
    String inStr = "1" + System.lineSeparator() + a + System.lineSeparator() + b + System.lineSeparator();
    String answerMain = "Choose a task number(1-5) or another number to exit: " + System.lineSeparator()
            + "x: " + b + " y: " + a + System.lineSeparator();

    MainTestService.testOutMain(inStr, answerMain);
  }

  private void test(int a, int b) {
    oldCheck(a, b);
    oldCheck(b, a);

    check(a, b);
    check(b, a);
  }


}
