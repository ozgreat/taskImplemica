import org.junit.jupiter.api.Test;
import tasks.GcdOf4Numbers;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Test class for {@code GcdOf4Numbers} test
 */
class GcdOf4NumbersTest {
  /**
   * Middle value that will be tested
   */
  private static final int MID = MAX_VALUE / 2;
  /**
   * Min value that will be tested
   */
  private static final int MIN = MIN_VALUE + 1;

  /**
   * Overstep every combination of every special case
   */
  @Test
  void tests() {
    //0
    //0 0 0
    check(0, 0, 0, 0, 0);
    test(1, 0, 0, 0, 1);
    test(1, 0, 0, 0, -1);
    test(2147483647, 0, 0, 0, MAX_VALUE);
    test(2147483646, 0, 0, 0, MAX_VALUE - 1);
    test(1073741823, 0, 0, 0, MID);
    test(2147483647, 0, 0, 0, MIN);

    //0 0 1
    test(1, 0, 0, 1, 1);
    test(1, 0, 0, 1, -1);
    test(1, 0, 0, 1, MAX_VALUE);
    test(1, 0, 0, 1, MAX_VALUE - 1);
    test(1, 0, 0, 1, MID);
    test(1, 0, 0, 1, MIN);

    //0 0 -1
    test(1, 0, 0, -1, -1);
    test(1, 0, 0, -1, MAX_VALUE);
    test(1, 0, 0, -1, MAX_VALUE - 1);
    test(1, 0, 0, -1, MID);
    test(1, 0, 0, -1, MIN);

    //0 0 MAX_VALUE
    test(2147483647, 0, 0, MAX_VALUE, MAX_VALUE);
    test(1, 0, 0, MAX_VALUE, MAX_VALUE - 1);
    test(1, 0, 0, MAX_VALUE, MID);
    test(2147483647, 0, 0, MAX_VALUE, MIN);

    //0 0 MAX_VALUE-1
    test(2147483646, 0, 0, MAX_VALUE - 1, MAX_VALUE - 1);
    test(1073741823, 0, 0, MAX_VALUE - 1, MID);
    test(1, 0, 0, MAX_VALUE - 1, MIN);

    //0 0 MID
    test(1073741823, 0, 0, MID, MID);
    test(1, 0, 0, MID, MIN);

    //0 0 MIN
    test(2147483647, 0, 0, MIN, MIN);

    //0 1 1
    test(1, 0, 1, 1, 1);
    test(1, 0, 1, 1, -1);
    test(1, 0, 1, 1, MAX_VALUE);
    test(1, 0, 1, 1, MAX_VALUE - 1);
    test(1, 0, 1, 1, MID);
    test(1, 0, 1, 1, MIN);

    //0 1 -1
    test(1, 0, 1, -1, -1);
    test(1, 0, 1, -1, MAX_VALUE);
    test(1, 0, 1, -1, MAX_VALUE - 1);
    test(1, 0, 1, -1, MID);
    test(1, 0, 1, -1, MIN);

    //0 1 MAX_VALUE
    test(1, 0, 1, MAX_VALUE, MAX_VALUE);
    test(1, 0, 1, MAX_VALUE, MAX_VALUE - 1);
    test(1, 0, 1, MAX_VALUE, MID);
    test(1, 0, 1, MAX_VALUE, MIN);

    //0 1 MAX_VALUE-1
    test(1, 0, 1, MAX_VALUE - 1, MAX_VALUE - 1);
    test(1, 0, 1, MAX_VALUE - 1, MID);
    test(1, 0, 1, MAX_VALUE - 1, MIN);

    //0 1 MID
    test(1, 0, 1, MID, MID);
    test(1, 0, 1, MID, MIN);

    //0 1 MIN
    test(1, 0, 1, MIN, MIN);

    //0 -1 -1
    test(1, 0, -1, -1, -1);
    test(1, 0, -1, -1, MAX_VALUE);
    test(1, 0, -1, -1, MAX_VALUE - 1);
    test(1, 0, -1, -1, MID);
    test(1, 0, -1, -1, MIN);

    //0 -1 MAX_VALUE
    test(1, 0, -1, MAX_VALUE, MAX_VALUE);
    test(1, 0, -1, MAX_VALUE, MAX_VALUE - 1);
    test(1, 0, -1, MAX_VALUE, MID);
    test(1, 0, -1, MAX_VALUE, MIN);

    //0 -1 MAX_VALUE-1
    test(1, 0, -1, MAX_VALUE - 1, MAX_VALUE - 1);
    test(1, 0, -1, MAX_VALUE - 1, MID);
    test(1, 0, -1, MAX_VALUE - 1, MIN);

    //0 -1 MID
    test(1, 0, -1, MID, MID);
    test(1, 0, -1, MID, MIN);

    //0 -1 MIN
    test(1, 0, -1, MIN, MIN);

    //0 MAX_VALUE MAX_VALUE
    test(2147483647, 0, MAX_VALUE, MAX_VALUE, MAX_VALUE);
    test(1, 0, MAX_VALUE, MAX_VALUE, MAX_VALUE - 1);
    test(1, 0, MAX_VALUE, MAX_VALUE, MID);
    test(2147483647, 0, MAX_VALUE, MAX_VALUE, MIN);

    //0 MAX_VALUE MAX_VALUE-1
    test(1, 0, MAX_VALUE, MAX_VALUE - 1, MAX_VALUE - 1);
    test(1, 0, MAX_VALUE, MAX_VALUE - 1, MID);
    test(1, 0, MAX_VALUE, MAX_VALUE - 1, MIN);

    //0 MAX_VALUE MID
    test(1, 0, MAX_VALUE, MID, MID);
    test(1, 0, MAX_VALUE, MID, MIN);

    //0 MAX_VALUE MIN
    test(2147483647, 0, MAX_VALUE, MIN, MIN);

    //0 MAX_VALUE-1 MAX_VALUE-1
    test(2147483646, 0, MAX_VALUE - 1, MAX_VALUE - 1, MAX_VALUE - 1);
    test(1073741823, 0, MAX_VALUE - 1, MAX_VALUE - 1, MID);
    test(1, 0, MAX_VALUE - 1, MAX_VALUE - 1, MIN);

    //0 MAX_VALUE-1 MID
    test(1073741823, 0, MAX_VALUE - 1, MID, MID);
    test(1, 0, MAX_VALUE - 1, MID, MIN);

    //0 MAX_VALUE-1 MIN
    test(1, 0, MAX_VALUE - 1, MIN, MIN);

    //0 MID MID
    test(1073741823, 0, MID, MID, MID);
    test(1, 0, MID, MID, MIN);

    //0 MID MIN
    test(1, 0, MID, MIN, MIN);

    //0 MIN MIN
    test(2147483647, 0, MIN, MIN, MIN);


    //1
    //1 1 1
    check(1, 1, 1, 1, 1);
    test(1, 1, 1, 1, -1);
    test(1, 1, 1, 1, MAX_VALUE);
    test(1, 1, 1, 1, MAX_VALUE - 1);
    test(1, 1, 1, 1, MID);
    test(1, 1, 1, 1, MIN);

    //1 1 -1
    test(1, 1, 1, -1, -1);
    test(1, 1, 1, -1, MAX_VALUE);
    test(1, 1, 1, -1, MAX_VALUE - 1);
    test(1, 1, 1, -1, MID);
    test(1, 1, 1, -1, MIN);

    //1 1 MAX_VALUE
    test(1, 1, 1, MAX_VALUE, MAX_VALUE);
    test(1, 1, 1, MAX_VALUE, MAX_VALUE - 1);
    test(1, 1, 1, MAX_VALUE, MID);
    test(1, 1, 1, MAX_VALUE, MIN);

    //1 1 MAX_VALUE-1
    test(1, 1, 1, MAX_VALUE - 1, MAX_VALUE - 1);
    test(1, 1, 1, MAX_VALUE - 1, MID);
    test(1, 1, 1, MAX_VALUE - 1, MIN);

    //1 1 MID
    test(1, 1, 1, MID, MID);
    test(1, 1, 1, MID, MIN);

    //1 1 MIN
    test(1, 1, 1, MIN, MIN);

    //1 -1 -1
    test(1, 1, -1, -1, -1);
    test(1, 1, -1, -1, MAX_VALUE);
    test(1, 1, -1, -1, MAX_VALUE - 1);
    test(1, 1, -1, -1, MID);
    test(1, 1, -1, -1, MIN);

    //1 -1 MAX_VALUE
    test(1, 1, -1, MAX_VALUE, MAX_VALUE);
    test(1, 1, -1, MAX_VALUE, MAX_VALUE - 1);
    test(1, 1, -1, MAX_VALUE, MID);
    test(1, 1, -1, MAX_VALUE, MIN);

    //1 -1 MAX_VALUE-1
    test(1, 1, -1, MAX_VALUE - 1, MAX_VALUE - 1);
    test(1, 1, -1, MAX_VALUE - 1, MID);
    test(1, 1, -1, MAX_VALUE - 1, MIN);

    //1 -1 MID
    test(1, 1, -1, MID, MID);
    test(1, 1, -1, MID, MIN);

    //1 -1 MIN
    test(1, 1, -1, MIN, MIN);

    //1 MAX_VALUE MAX_VALUE
    test(1, 1, MAX_VALUE, MAX_VALUE, MAX_VALUE);
    test(1, 1, MAX_VALUE, MAX_VALUE, MAX_VALUE - 1);
    test(1, 1, MAX_VALUE, MAX_VALUE, MID);
    test(1, 1, MAX_VALUE, MAX_VALUE, MIN);

    //1 MAX_VALUE MAX_VALUE-1
    test(1, 1, MAX_VALUE, MAX_VALUE - 1, MAX_VALUE - 1);
    test(1, 1, MAX_VALUE, MAX_VALUE - 1, MID);
    test(1, 1, MAX_VALUE, MAX_VALUE - 1, MIN);

    //1 MAX_VALUE MID
    test(1, 1, MAX_VALUE, MID, MID);
    test(1, 1, MAX_VALUE, MID, MIN);

    //1 MAX_VALUE MIN
    test(1, 1, MAX_VALUE, MIN, MIN);

    //1 MAX_VALUE-1 MAX_VALUE-1
    test(1, 1, MAX_VALUE - 1, MAX_VALUE - 1, MAX_VALUE - 1);
    test(1, 1, MAX_VALUE - 1, MAX_VALUE - 1, MID);
    test(1, 1, MAX_VALUE - 1, MAX_VALUE - 1, MIN);

    //1 MAX_VALUE-1 MID
    test(1, 1, MAX_VALUE - 1, MID, MID);
    test(1, 1, MAX_VALUE - 1, MID, MIN);

    //1 MAX_VALUE-1 MIN
    test(1, 1, MAX_VALUE - 1, MIN, MIN);

    //1 MID MID
    test(1, 1, MID, MID, MID);
    test(1, 1, MID, MID, MIN);

    //1 MID MIN
    test(1, 1, MID, MIN, MIN);

    //1 MIN MIN
    test(1, 1, MIN, MIN, MIN);


    //-1
    //-1 -1 -1
    check(1, -1, -1, -1, -1);
    test(1, -1, -1, -1, MAX_VALUE);
    test(1, -1, -1, -1, MAX_VALUE - 1);
    test(1, -1, -1, -1, MID);
    test(1, -1, -1, -1, MIN);

    //-1 -1 MAX_VALUE
    test(1, -1, -1, MAX_VALUE, MAX_VALUE);
    test(1, -1, -1, MAX_VALUE, MAX_VALUE - 1);
    test(1, -1, -1, MAX_VALUE, MID);
    test(1, -1, -1, MAX_VALUE, MIN);

    //-1 -1 MAX_VALUE-1
    test(1, -1, -1, MAX_VALUE - 1, MAX_VALUE - 1);
    test(1, -1, -1, MAX_VALUE - 1, MID);
    test(1, -1, -1, MAX_VALUE - 1, MIN);

    //-1 -1 MID
    test(1, -1, -1, MID, MID);
    test(1, -1, -1, MID, MIN);

    //-1 -1 MIN
    test(1, -1, -1, MIN, MIN);

    //-1 MAX_VALUE MAX_VALUE
    test(1, -1, MAX_VALUE, MAX_VALUE, MAX_VALUE);
    test(1, -1, MAX_VALUE, MAX_VALUE, MAX_VALUE - 1);
    test(1, -1, MAX_VALUE, MAX_VALUE, MID);
    test(1, -1, MAX_VALUE, MAX_VALUE, MIN);

    //-1 MAX_VALUE MAX_VALUE-1
    test(1, -1, MAX_VALUE, MAX_VALUE - 1, MAX_VALUE - 1);
    test(1, -1, MAX_VALUE, MAX_VALUE - 1, MID);
    test(1, -1, MAX_VALUE, MAX_VALUE - 1, MIN);

    //-1 MAX_VALUE MID
    test(1, -1, MAX_VALUE, MID, MID);
    test(1, -1, MAX_VALUE, MID, MIN);

    //-1 MAX_VALUE MIN
    test(1, -1, MAX_VALUE, MIN, MIN);

    //-1 MAX_VALUE-1 MAX_VALUE-1
    test(1, -1, MAX_VALUE - 1, MAX_VALUE - 1, MAX_VALUE - 1);
    test(1, -1, MAX_VALUE - 1, MAX_VALUE - 1, MID);
    test(1, -1, MAX_VALUE - 1, MAX_VALUE - 1, MIN);

    //-1 MAX_VALUE-1 MID
    test(1, -1, MAX_VALUE - 1, MID, MID);
    test(1, -1, MAX_VALUE - 1, MID, MIN);

    //-1 MAX_VALUE-1 MIN
    test(1, -1, MAX_VALUE - 1, MIN, MIN);

    //-1 MID MID
    test(1, -1, MID, MID, MID);
    test(1, -1, MID, MID, MIN);

    //-1 MID MIN
    test(1, -1, MID, MIN, MIN);

    //-1 MIN MIN
    test(1, -1, MIN, MIN, MIN);


    //MAX_VALUE
    //MAX_VALUE MAX_VALUE MAX_VALUE
    check(2147483647, MAX_VALUE, MAX_VALUE, MAX_VALUE, MAX_VALUE);
    test(1, MAX_VALUE, MAX_VALUE, MAX_VALUE, MAX_VALUE - 1);
    test(1, MAX_VALUE, MAX_VALUE, MAX_VALUE, MID);
    test(2147483647, MAX_VALUE, MAX_VALUE, MAX_VALUE, MIN);

    //MAX_VALUE MAX_VALUE MAX_VALUE-1
    test(1, MAX_VALUE, MAX_VALUE, MAX_VALUE - 1, MAX_VALUE - 1);
    test(1, MAX_VALUE, MAX_VALUE, MAX_VALUE - 1, MID);
    test(1, MAX_VALUE, MAX_VALUE, MAX_VALUE - 1, MIN);

    //MAX_VALUE MAX_VALUE MID
    test(1, MAX_VALUE, MAX_VALUE, MID, MID);
    test(1, MAX_VALUE, MAX_VALUE, MID, MIN);

    //MAX_VALUE MAX_VALUE MIN
    test(2147483647, MAX_VALUE, MAX_VALUE, MIN, MIN);

    //MAX_VALUE MAX_VALUE-1 MAX_VALUE-1
    test(1, MAX_VALUE, MAX_VALUE - 1, MAX_VALUE - 1, MAX_VALUE - 1);
    test(1, MAX_VALUE, MAX_VALUE - 1, MAX_VALUE - 1, MID);
    test(1, MAX_VALUE, MAX_VALUE - 1, MAX_VALUE - 1, MIN);

    //MAX_VALUE MAX_VALUE-1 MID
    test(1, MAX_VALUE, MAX_VALUE - 1, MID, MID);
    test(1, MAX_VALUE, MAX_VALUE - 1, MID, MIN);

    //MAX_VALUE MAX_VALUE-1 MIN
    test(1, MAX_VALUE, MAX_VALUE - 1, MIN, MIN);

    //MAX_VALUE MID MID
    test(1, MAX_VALUE, MID, MID, MID);
    test(1, MAX_VALUE, MID, MID, MIN);

    //MAX_VALUE MID MIN
    test(1, MAX_VALUE, MID, MIN, MIN);

    //MAX_VALUE MIN MIN
    test(2147483647, MAX_VALUE, MIN, MIN, MIN);


    //MAX_VALUE-1
    //MAX_VALUE-1 MAX_VALUE-1 MAX_VALUE-1
    check(2147483646, MAX_VALUE - 1, MAX_VALUE - 1, MAX_VALUE - 1, MAX_VALUE - 1);
    test(1073741823, MAX_VALUE - 1, MAX_VALUE - 1, MAX_VALUE - 1, MID);
    test(1, MAX_VALUE - 1, MAX_VALUE - 1, MAX_VALUE - 1, MIN);

    //MAX_VALUE-1 MAX_VALUE-1 MID
    test(1073741823, MAX_VALUE - 1, MAX_VALUE - 1, MID, MID);
    test(1, MAX_VALUE - 1, MAX_VALUE - 1, MID, MIN);

    //MAX_VALUE-1 MAX_VALUE-1 MIN
    test(1, MAX_VALUE - 1, MAX_VALUE - 1, MIN, MIN);

    //MAX_VALUE-1 MID MID
    test(1073741823, MAX_VALUE - 1, MID, MID, MID);
    test(1, MAX_VALUE - 1, MID, MID, MIN);

    //MAX_VALUE-1 MID MIN
    test(1, MAX_VALUE - 1, MID, MIN, MIN);
    //MAX_VALUE-1 MIN MIN
    test(1, MAX_VALUE - 1, MIN, MIN, MIN);


    //MID
    //MID MID MID
    check(1073741823, MID, MID, MID, MID);
    test(1, MID, MID, MID, MIN);

    //MID MID MIN
    test(1, MID, MID, MIN, MIN);

    test(1, MID, MIN, MIN, MIN);


    //MIN MIN MIN
    check(2147483647, MIN, MIN, MIN, MIN);


    //co-prime numbers
    test(1, 3, 5, 7, 13);
    test(1, 8, 15, 49, 121);
    test(1, 4, 21, 35, 77);
    test(1, 6, 8, 12, 13);
    test(1, 3, 9, 18, 17);
    test(1, 9, 15, 27, 2);
    test(1, 7, 5, 14, 25);
    test(1, 12, 30, 49, 541);
    test(1, 499, 71, 229, 379);
    test(1, 99, 100, 89, 41);
    test(1, 81, 24, 70, 45);
    test(1, 19, 54, 173, 229);
    test(1, 1, 3, 2, 4);
    test(1, 20, 21, 22, 23);
    test(1, 32, 33, 34, 35);
    test(1, 74, 75, 76, 77);
  }

  /**
   * Test every combination of not valid value
   */
  @Test
  void notValidDataTest() {
    testThrow(10, 10, 10, Integer.MIN_VALUE);
    testThrow(10, 10, Integer.MIN_VALUE, 10);
    testThrow(10, 10, Integer.MIN_VALUE, Integer.MIN_VALUE);
    testThrow(10, Integer.MIN_VALUE, 10, 10);
    testThrow(10, Integer.MIN_VALUE, 10, Integer.MIN_VALUE);
    testThrow(10, Integer.MIN_VALUE, Integer.MIN_VALUE, 10);
    testThrow(10, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    testThrow(Integer.MIN_VALUE, 10, 10, 10);
    testThrow(Integer.MIN_VALUE, 10, 10, Integer.MIN_VALUE);
    testThrow(Integer.MIN_VALUE, 10, Integer.MIN_VALUE, 10);
    testThrow(Integer.MIN_VALUE, 10, Integer.MIN_VALUE, Integer.MIN_VALUE);
    testThrow(Integer.MIN_VALUE, Integer.MIN_VALUE, 10, 10);
    testThrow(Integer.MIN_VALUE, Integer.MIN_VALUE, 10, Integer.MIN_VALUE);
    testThrow(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, 10);
    testThrow(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
  }

  private void testThrow(Integer a, Integer b, Integer c, Integer d) {
    String inStr = "3" + System.lineSeparator() + a + System.lineSeparator() +
            b + System.lineSeparator() + c + System.lineSeparator() + d + System.lineSeparator();

    MainTestService.testErrMain(inStr, "Expected: x1,x2,x3,x4 is not MIN_VALUE. Got: x1= " + a + " x2= " + b +
            " x3= " + c + " x4= " + d + System.lineSeparator());

    try {
      GcdOf4Numbers.getGcdOf4Numbers(a, b, c, d);
      fail();
    } catch (IllegalArgumentException e) {
      // Here nothing have to be
    }
  }

  private void test(Integer answer, Integer a, Integer b, Integer c, Integer d) {
    check(answer, a, b, c, d);
    check(answer, a, b, d, c);
    check(answer, a, c, b, d);
    check(answer, a, c, d, b);
    check(answer, a, d, b, c);
    check(answer, a, d, c, b);
    check(answer, b, a, c, d);
    check(answer, b, a, d, c);
    check(answer, b, c, a, d);
    check(answer, b, c, d, a);
    check(answer, b, d, a, c);
    check(answer, b, d, c, a);
    check(answer, c, a, b, d);
    check(answer, c, a, d, b);
    check(answer, c, b, a, d);
    check(answer, c, b, d, a);
    check(answer, c, d, a, b);
    check(answer, c, d, b, a);
    check(answer, d, a, b, c);
    check(answer, d, a, c, b);
    check(answer, d, b, a, c);
    check(answer, d, b, c, a);
    check(answer, d, c, a, b);
    check(answer, d, c, b, a);
  }

  private void check(Integer answer, Integer a, Integer b, Integer c, Integer d) {
    String inStr = "3" + System.lineSeparator() + a + System.lineSeparator() +
            b + System.lineSeparator() + c + System.lineSeparator() + d + System.lineSeparator();
    String answerMain = "Choose a task number(1-5) or another number to exit: " + System.lineSeparator() +
            answer + System.lineSeparator();

    MainTestService.testOutMain(inStr, answerMain);

    assertEquals(answer, GcdOf4Numbers.getGcdOf4Numbers(a, b, c, d)); //old test
  }

}
