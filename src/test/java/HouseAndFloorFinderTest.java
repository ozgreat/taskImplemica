import org.junit.jupiter.api.Test;
import tasks.HouseAndFloorFinder;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Test class for {@code HouseAndFloorFinder} class
 */
class HouseAndFloorFinderTest {
  /**
   * Testing special rooms in house with special parameters
   */
  @Test
  void tests() {
    //house with 16 floors and 4 rooms at floor(one of most common)
    test(4, 16, 54, "Floor: 14 house: 1"); // my flat
    test(4, 16, 1, "Floor: 1 house: 1");
    test(4, 16, 64, "Floor: 16 house: 1");
    test(4, 16, 63, "Floor: 16 house: 1");
    test(4, 16, 65, "Floor: 1 house: 2");
    test(4, 16, 8, "Floor: 2 house: 1");
    test(4, 16, 7, "Floor: 2 house: 1");
    test(4, 16, 9, "Floor: 3 house: 1");
    test(4, 16, MAX_VALUE, "Floor: 16 house: 33554432");
    test(4, 16, MAX_VALUE - 1, "Floor: 16 house: 33554432");
    test(4, 16, 2, "Floor: 1 house: 1");
    test(4, 16, (MAX_VALUE / 2), "Floor: 16 house: 16777216");
    test(4, 16, ((MAX_VALUE / 2) + 1), "Floor: 16 house: 16777216");
    test(4, 16, ((MAX_VALUE / 2) - 1), "Floor: 16 house: 16777216");

    //check with 5 floors and 4 rooms at floor(one of most common)
    test(4, 5, 1, "Floor: 1 house: 1");
    test(4, 5, MAX_VALUE, "Floor: 2 house: 107374183");
    test(4, 5, MAX_VALUE - 1, "Floor: 2 house: 107374183");
    test(4, 5, 2, "Floor: 1 house: 1");
    test(4, 5, (MAX_VALUE / 2), "Floor: 1 house: 53687092");
    test(4, 5, ((MAX_VALUE / 2) + 1), "Floor: 1 house: 53687092");
    test(4, 5, ((MAX_VALUE / 2) - 1), "Floor: 1 house: 53687092");
    test(4, 5, 20, "Floor: 5 house: 1");
    test(4, 5, 19, "Floor: 5 house: 1");
    test(4, 5, 21, "Floor: 1 house: 2");
    test(4, 5, 8, "Floor: 2 house: 1");
    test(4, 5, 7, "Floor: 2 house: 1");
    test(4, 5, 9, "Floor: 3 house: 1");
    test(4, 5, 13, "Floor: 4 house: 1");


    //house with 9 floors and 4 rooms at floor(example from paper)
    test(4, 9, 1, "Floor: 1 house: 1");
    test(4, 9, 36, "Floor: 9 house: 1");
    test(4, 9, 42, "Floor: 2 house: 2");
    test(4, 9, 37, "Floor: 1 house: 2");
    test(4, 9, 72, "Floor: 9 house: 2");
    test(4, 9, 100, "Floor: 7 house: 3");
    test(4, 9, 10, "Floor: 3 house: 1");
    test(4, 9, 26, "Floor: 7 house: 1");
    test(4, 9, 101, "Floor: 8 house: 3");
    test(4, 9, 4, "Floor: 1 house: 1");
    test(4, 9, 5, "Floor: 2 house: 1");
    test(4, 9, MAX_VALUE, "Floor: 5 house: 59652324");
    test(4, 9, MAX_VALUE - 1, "Floor: 5 house: 59652324");
    test(4, 9, 2, "Floor: 1 house: 1");
    test(4, 9, (MAX_VALUE / 2), "Floor: 7 house: 29826162");
    test(4, 9, ((MAX_VALUE / 2) + 1), "Floor: 7 house: 29826162");
    test(4, 9, ((MAX_VALUE / 2) - 1), "Floor: 7 house: 29826162");


    //house with 16 floors and 10 rooms at floor
    test(10, 16, 10, "Floor: 1 house: 1");
    test(10, 16, 9, "Floor: 1 house: 1");
    test(10, 16, 11, "Floor: 2 house: 1");
    test(10, 16, 160, "Floor: 16 house: 1");
    test(10, 16, 159, "Floor: 16 house: 1");
    test(10, 16, 161, "Floor: 1 house: 2");
    test(10, 16, 1, "Floor: 1 house: 1");
    test(10, 16, 14, "Floor: 2 house: 1");
    test(10, 16, 167, "Floor: 1 house: 2");
    test(10, 16, MAX_VALUE, "Floor: 13 house: 13421773");
    test(10, 16, MAX_VALUE - 1, "Floor: 13 house: 13421773");
    test(10, 16, 2, "Floor: 1 house: 1");
    test(10, 16, (MAX_VALUE / 2), "Floor: 7 house: 6710887");
    test(10, 16, ((MAX_VALUE / 2) + 1), "Floor: 7 house: 6710887");
    test(10, 16, ((MAX_VALUE / 2) - 1), "Floor: 7 house: 6710887");

    //house with 12 floors and 12 rooms at floor
    test(12, 12, 1728, "Floor: 12 house: 12");
    test(12, 12, 1727, "Floor: 12 house: 12");
    test(12, 12, 1729, "Floor: 1 house: 13");
    test(12, 12, 24, "Floor: 2 house: 1");
    test(12, 12, 25, "Floor: 3 house: 1");
    test(12, 12, 23, "Floor: 2 house: 1");
    test(12, 12, 45, "Floor: 4 house: 1");
    test(12, 12, 1, "Floor: 1 house: 1");
    test(12, 12, MAX_VALUE, "Floor: 11 house: 14913081");
    test(12, 12, MAX_VALUE - 1, "Floor: 11 house: 14913081");
    test(12, 12, 2, "Floor: 1 house: 1");
    test(12, 12, (MAX_VALUE / 2), "Floor: 6 house: 7456541");
    test(12, 12, ((MAX_VALUE / 2) + 1), "Floor: 6 house: 7456541");
    test(12, 12, ((MAX_VALUE / 2) - 1), "Floor: 6 house: 7456541");

    //house with 17 floors and 7 rooms at floor
    test(7, 17, 35, "Floor: 5 house: 1");
    test(7, 17, 34, "Floor: 5 house: 1");
    test(7, 17, 36, "Floor: 6 house: 1");
    test(7, 17, 357, "Floor: 17 house: 3");
    test(7, 17, 356, "Floor: 17 house: 3");
    test(7, 17, 358, "Floor: 1 house: 4");
    test(7, 17, 721, "Floor: 1 house: 7");
    test(7, 17, 1, "Floor: 1 house: 1");
    test(7, 17, MAX_VALUE, "Floor: 2 house: 18046082");
    test(7, 17, MAX_VALUE - 1, "Floor: 1 house: 18046082");
    test(7, 17, 2, "Floor: 1 house: 1");
    test(7, 17, (MAX_VALUE / 2), "Floor: 9 house: 9023041");
    test(7, 17, ((MAX_VALUE / 2) + 1), "Floor: 10 house: 9023041");
    test(7, 17, ((MAX_VALUE / 2) - 1), "Floor: 9 house: 9023041");

    //house with 128 floors and 16 rooms at floor
    test(16, 128, 2048, "Floor: 128 house: 1");
    test(16, 128, 2047, "Floor: 128 house: 1");
    test(16, 128, 2049, "Floor: 1 house: 2");
    test(16, 128, 32, "Floor: 2 house: 1");
    test(16, 128, 31, "Floor: 2 house: 1");
    test(16, 128, 33, "Floor: 3 house: 1");
    test(16, 128, 3500, "Floor: 91 house: 2");
    test(16, 128, 1, "Floor: 1 house: 1");
    test(16, 128, MAX_VALUE, "Floor: 128 house: 1048576");
    test(16, 128, MAX_VALUE - 1, "Floor: 128 house: 1048576");
    test(16, 128, 2, "Floor: 1 house: 1");
    test(16, 128, (MAX_VALUE / 2), "Floor: 128 house: 524288");
    test(16, 128, ((MAX_VALUE / 2) + 1), "Floor: 128 house: 524288");
    test(16, 128, ((MAX_VALUE / 2) - 1), "Floor: 128 house: 524288");

    //house with 1 floor and 1 room at floor
    test(1, 1, 1, "Floor: 1 house: 1");
    test(1, 1, MAX_VALUE, "Floor: 1 house: 2147483647");
    test(1, 1, MAX_VALUE - 1, "Floor: 1 house: 2147483646");
    test(1, 1, 2, "Floor: 1 house: 2");
    test(1, 1, (MAX_VALUE / 2), "Floor: 1 house: 1073741823");
    test(1, 1, ((MAX_VALUE / 2) + 1), "Floor: 1 house: 1073741824");
    test(1, 1, ((MAX_VALUE / 2) - 1), "Floor: 1 house: 1073741822");

    //house with 2 floor and 2 room at floor
    test(2, 2, 1, "Floor: 1 house: 1");
    test(2, 2, MAX_VALUE, "Floor: 2 house: 536870912");
    test(2, 2, MAX_VALUE - 1, "Floor: 1 house: 536870912");
    test(2, 2, 2, "Floor: 1 house: 1");
    test(2, 2, (MAX_VALUE / 2), "Floor: 2 house: 268435456");
    test(2, 2, ((MAX_VALUE / 2) + 1), "Floor: 2 house: 268435456");
    test(2, 2, ((MAX_VALUE / 2) - 1), "Floor: 1 house: 268435456");

    //house with MAX floors and 1 room at floor
    test(1, MAX_VALUE, 1, "Floor: 1 house: 1");
    test(1, MAX_VALUE, MAX_VALUE, "Floor: 2147483647 house: 1");
    test(1, MAX_VALUE, MAX_VALUE - 1, "Floor: 2147483646 house: 1");
    test(1, MAX_VALUE, 2, "Floor: 2 house: 1");
    test(1, MAX_VALUE, (MAX_VALUE / 2), "Floor: 1073741823 house: 1");
    test(1, MAX_VALUE, ((MAX_VALUE / 2) + 1), "Floor: 1073741824 house: 1");
    test(1, MAX_VALUE, ((MAX_VALUE / 2) - 1), "Floor: 1073741822 house: 1");

    //house with 1 floor and max rooms at floor
    test(MAX_VALUE, 1, 1, "Floor: 1 house: 1");
    test(MAX_VALUE, 1, MAX_VALUE, "Floor: 1 house: 1");
    test(MAX_VALUE, 1, MAX_VALUE - 1, "Floor: 1 house: 1");
    test(MAX_VALUE, 1, 2, "Floor: 1 house: 1");
    test(MAX_VALUE, 1, (MAX_VALUE / 2), "Floor: 1 house: 1");
    test(MAX_VALUE, 1, ((MAX_VALUE / 2) + 1), "Floor: 1 house: 1");
    test(MAX_VALUE, 1, ((MAX_VALUE / 2) - 1), "Floor: 1 house: 1");

    //MAX_VALUE / 2 rooms and 2 floors
    test(MAX_VALUE / 2, 2, 1, "Floor: 1 house: 1");
    test(MAX_VALUE / 2, 2, MAX_VALUE, "Floor: 1 house: 2");
    test(MAX_VALUE / 2, 2, MAX_VALUE - 1, "Floor: 2 house: 1");
    test(MAX_VALUE / 2, 2, 2, "Floor: 1 house: 1");
    test(MAX_VALUE / 2, 2, (MAX_VALUE / 2), "Floor: 1 house: 1");
    test(MAX_VALUE / 2, 2, ((MAX_VALUE / 2) + 1), "Floor: 2 house: 1");
    test(MAX_VALUE / 2, 2, ((MAX_VALUE / 2) - 1), "Floor: 1 house: 1");
  }


  /**
   * Test every combination of not valid special cases
   */
  @Test
  void notValidDataTests() {
    //zero with all
    testThrowHouse(0, 0, 0);
    testThrowHouse(0, 0, -1);
    testThrowHouse(0, 0, MIN_VALUE / 2);
    testThrowHouse(0, 0, (MIN_VALUE / 2) + 1);
    testThrowHouse(0, 0, (MIN_VALUE / 2) - 1);
    testThrowHouse(0, 0, MIN_VALUE);
    testThrowHouse(0, 0, MIN_VALUE + 1);

    //-1 with others
    testThrowHouse(0, -1, -1);
    testThrowHouse(0, -1, MIN_VALUE / 2);
    testThrowHouse(0, -1, (MIN_VALUE / 2) + 1);
    testThrowHouse(0, -1, (MIN_VALUE / 2) - 1);
    testThrowHouse(0, -1, MIN_VALUE);
    testThrowHouse(0, -1, MIN_VALUE + 1);

    // MIN_VALUE / 2 with others
    testThrowHouse(0, MIN_VALUE / 2, MIN_VALUE / 2);
    testThrowHouse(0, MIN_VALUE / 2, (MIN_VALUE / 2) + 1);
    testThrowHouse(0, MIN_VALUE / 2, (MIN_VALUE / 2) - 1);
    testThrowHouse(0, MIN_VALUE / 2, MIN_VALUE);
    testThrowHouse(0, MIN_VALUE / 2, MIN_VALUE + 1);

    //(MIN_VALUE / 2) + 1 with others
    testThrowHouse(0, (MIN_VALUE / 2) + 1, (MIN_VALUE / 2) + 1);
    testThrowHouse(0, (MIN_VALUE / 2) + 1, (MIN_VALUE / 2) - 1);
    testThrowHouse(0, (MIN_VALUE / 2) + 1, MIN_VALUE);
    testThrowHouse(0, (MIN_VALUE / 2) + 1, MIN_VALUE + 1);

    //(MIN_VALUE / 2) - 1 with others
    testThrowHouse(0, (MIN_VALUE / 2) - 1, (MIN_VALUE / 2) - 1);
    testThrowHouse(0, (MIN_VALUE / 2) - 1, MIN_VALUE);
    testThrowHouse(0, (MIN_VALUE / 2) - 1, MIN_VALUE + 1);

    //MIN_VALUE with others
    testThrowHouse(0, MIN_VALUE, MIN_VALUE);
    testThrowHouse(0, MIN_VALUE, MIN_VALUE + 1);

    //MIN_VALUE + 1 with others
    testThrowHouse(0, MIN_VALUE + 1, MIN_VALUE + 1);

    //-1 with all
    testThrowHouse(-1, -1, -1);
    testThrowHouse(-1, -1, MIN_VALUE / 2);
    testThrowHouse(-1, -1, (MIN_VALUE / 2) + 1);
    testThrowHouse(-1, -1, (MIN_VALUE / 2) - 1);
    testThrowHouse(-1, -1, MIN_VALUE);
    testThrowHouse(-1, -1, MIN_VALUE + 1);

    // MIN_VALUE / 2 with others
    testThrowHouse(-1, MIN_VALUE / 2, MIN_VALUE / 2);
    testThrowHouse(-1, MIN_VALUE / 2, (MIN_VALUE / 2) + 1);
    testThrowHouse(-1, MIN_VALUE / 2, (MIN_VALUE / 2) - 1);
    testThrowHouse(-1, MIN_VALUE / 2, MIN_VALUE);
    testThrowHouse(-1, MIN_VALUE / 2, MIN_VALUE + 1);

    //(MIN_VALUE / 2) + 1 with others
    testThrowHouse(-1, (MIN_VALUE / 2) + 1, (MIN_VALUE / 2) + 1);
    testThrowHouse(-1, (MIN_VALUE / 2) + 1, (MIN_VALUE / 2) - 1);
    testThrowHouse(-1, (MIN_VALUE / 2) + 1, MIN_VALUE);
    testThrowHouse(-1, (MIN_VALUE / 2) + 1, MIN_VALUE + 1);

    //(MIN_VALUE / 2) - 1 with others
    testThrowHouse(-1, (MIN_VALUE / 2) - 1, (MIN_VALUE / 2) - 1);
    testThrowHouse(-1, (MIN_VALUE / 2) - 1, MIN_VALUE);
    testThrowHouse(-1, (MIN_VALUE / 2) - 1, MIN_VALUE + 1);

    //MIN_VALUE with others
    testThrowHouse(-1, MIN_VALUE, MIN_VALUE);
    testThrowHouse(-1, MIN_VALUE, MIN_VALUE + 1);

    //MIN_VALUE + 1 with others
    testThrowHouse(-1, MIN_VALUE + 1, MIN_VALUE + 1);

    //MIN_VALUE / 2 with all
    testThrowHouse(MIN_VALUE / 2, MIN_VALUE / 2, MIN_VALUE / 2);
    testThrowHouse(MIN_VALUE / 2, MIN_VALUE / 2, (MIN_VALUE / 2) + 1);
    testThrowHouse(MIN_VALUE / 2, MIN_VALUE / 2, (MIN_VALUE / 2) - 1);
    testThrowHouse(MIN_VALUE / 2, MIN_VALUE / 2, MIN_VALUE);
    testThrowHouse(MIN_VALUE / 2, MIN_VALUE / 2, MIN_VALUE + 1);

    //(MIN_VALUE / 2) + 1 with others
    testThrowHouse(MIN_VALUE / 2, (MIN_VALUE / 2) + 1, (MIN_VALUE / 2) + 1);
    testThrowHouse(MIN_VALUE / 2, (MIN_VALUE / 2) + 1, (MIN_VALUE / 2) - 1);
    testThrowHouse(MIN_VALUE / 2, (MIN_VALUE / 2) + 1, MIN_VALUE);
    testThrowHouse(MIN_VALUE / 2, (MIN_VALUE / 2) + 1, MIN_VALUE + 1);

    //(MIN_VALUE / 2) - 1 with others
    testThrowHouse(MIN_VALUE / 2, (MIN_VALUE / 2) - 1, (MIN_VALUE / 2) - 1);
    testThrowHouse(MIN_VALUE / 2, (MIN_VALUE / 2) - 1, MIN_VALUE);
    testThrowHouse(MIN_VALUE / 2, (MIN_VALUE / 2) - 1, MIN_VALUE + 1);

    // MIN_VALUE with others
    testThrowHouse(MIN_VALUE / 2, MIN_VALUE, MIN_VALUE);
    testThrowHouse(MIN_VALUE / 2, MIN_VALUE, MIN_VALUE + 1);

    // MIN_VALUE+1 with others
    testThrowHouse(MIN_VALUE / 2, MIN_VALUE + 1, MIN_VALUE + 1);

    //(MIN_VALUE / 2) + 1 with all
    testThrowHouse((MIN_VALUE / 2) + 1, (MIN_VALUE / 2) + 1, (MIN_VALUE / 2) + 1);
    testThrowHouse((MIN_VALUE / 2) + 1, (MIN_VALUE / 2) + 1, (MIN_VALUE / 2) - 1);
    testThrowHouse((MIN_VALUE / 2) + 1, (MIN_VALUE / 2) + 1, MIN_VALUE);
    testThrowHouse((MIN_VALUE / 2) + 1, (MIN_VALUE / 2) + 1, MIN_VALUE + 1);

    //(MIN_VALUE / 2) - 1 with others
    testThrowHouse((MIN_VALUE / 2) + 1, (MIN_VALUE / 2) - 1, (MIN_VALUE / 2) - 1);
    testThrowHouse((MIN_VALUE / 2) + 1, (MIN_VALUE / 2) - 1, MIN_VALUE);
    testThrowHouse((MIN_VALUE / 2) + 1, (MIN_VALUE / 2) - 1, MIN_VALUE + 1);

    //MIN_VALUE with others
    testThrowHouse((MIN_VALUE / 2) + 1, MIN_VALUE, MIN_VALUE);
    testThrowHouse((MIN_VALUE / 2) + 1, MIN_VALUE, MIN_VALUE + 1);

    //MIN_VALUE + 1 with others
    testThrowHouse((MIN_VALUE / 2) + 1, MIN_VALUE + 1, MIN_VALUE + 1);

    //(MIN_VALUE / 2) - 1 with all
    testThrowHouse((MIN_VALUE / 2) - 1, (MIN_VALUE / 2) - 1, (MIN_VALUE / 2) - 1);
    testThrowHouse((MIN_VALUE / 2) - 1, (MIN_VALUE / 2) - 1, MIN_VALUE);
    testThrowHouse((MIN_VALUE / 2) - 1, (MIN_VALUE / 2) - 1, MIN_VALUE + 1);

    //MIN_VALUE with others
    testThrowHouse((MIN_VALUE / 2) - 1, MIN_VALUE, MIN_VALUE);
    testThrowHouse((MIN_VALUE / 2) - 1, MIN_VALUE, MIN_VALUE + 1);

    //MIN_VALUE + 1 with others
    testThrowHouse((MIN_VALUE / 2) - 1, MIN_VALUE + 1, MIN_VALUE + 1);

    //MIN_VALUE with all
    testThrowHouse(MIN_VALUE, MIN_VALUE, MIN_VALUE);
    testThrowHouse(MIN_VALUE, MIN_VALUE, MIN_VALUE + 1);
    testThrowHouse(MIN_VALUE, MIN_VALUE + 1, MIN_VALUE + 1);

    testThrowHouse(MIN_VALUE + 1, MIN_VALUE + 1, MIN_VALUE + 1);


    testThrowHouse(10, 0, 10);
    testThrowHouse(0, 10, 10);

    testThrowHouse(10, -1, 10);
    testThrowHouse(-1, 10, 10);

    testThrowHouse(10, MIN_VALUE / 2, 10);
    testThrowHouse(MIN_VALUE / 2, 10, 10);

    testThrowHouse(10, (MIN_VALUE / 2) + 1, 10);
    testThrowHouse((MIN_VALUE / 2) + 1, 10, 10);

    testThrowHouse(10, (MIN_VALUE / 2) - 1, 10);
    testThrowHouse((MIN_VALUE / 2) - 1, 10, 10);

    testThrowHouse(10, MIN_VALUE, 10);
    testThrowHouse(MIN_VALUE, 10, 10);

    testThrowHouse(10, MIN_VALUE + 1, 10);
    testThrowHouse(MIN_VALUE + 1, 10, 10);

    testThrowHouse(MIN_VALUE / 2, 3, 1);
    testThrowHouse(3, MIN_VALUE / 2, 1);

    testThrowHouse(MIN_VALUE / 3, 4, 1);
    testThrowHouse(4, MIN_VALUE / 3, 1);

    testThrowHouse(MIN_VALUE / 4, 5, 1);
    testThrowHouse(5, MIN_VALUE / 4, 1);

    testThrowHouse(MIN_VALUE / 5, 6, 1);
    testThrowHouse(6, MIN_VALUE / 5, 1);

    testThrowHouse(MIN_VALUE / 6, 7, 1);
    testThrowHouse(7, MIN_VALUE / 6, 1);

    testThrowHouse(MIN_VALUE / 7, 8, 1);
    testThrowHouse(8, MIN_VALUE / 7, 1);

    testThrowHouse(MIN_VALUE / 8, 9, 1);
    testThrowHouse(9, MIN_VALUE / 8, 1);

    testThrowHouse(MIN_VALUE / 9, 10, 1);
    testThrowHouse(10, MIN_VALUE / 9, 1);

    testThrowHouse(MIN_VALUE / 10, 11, 1);
    testThrowHouse(11, MIN_VALUE / 10, 1);

    testThrowHouse(MIN_VALUE / 11, 12, 1);
    testThrowHouse(12, MIN_VALUE / 11, 1);

    testThrowHouse(MIN_VALUE / 12, 13, 1);
    testThrowHouse(13, MIN_VALUE / 12, 1);

    testThrowHouse(MIN_VALUE / 13, 14, 1);
    testThrowHouse(14, MIN_VALUE / 13, 1);

    testThrowHouse(MIN_VALUE / 14, 15, 1);
    testThrowHouse(15, MIN_VALUE / 14, 1);

    testThrowHouse(MIN_VALUE / 15, 16, 1);
    testThrowHouse(16, MIN_VALUE / 15, 1);

    testThrowRoom(10, 10, 0);
    testThrowRoom(10, 10, -1);
    testThrowRoom(10, 10, MIN_VALUE / 2);
    testThrowRoom(10, 10, (MIN_VALUE / 2) + 1);
    testThrowRoom(10, 10, (MIN_VALUE / 2) - 1);
    testThrowRoom(10, 10, MIN_VALUE);
    testThrowRoom(10, 10, MIN_VALUE + 1);
  }


  private void test(Integer roomAtFloor, Integer floorsAtHouse, Integer n, String answer) {
    String inStr = "2" + System.lineSeparator() + floorsAtHouse + System.lineSeparator() + roomAtFloor +
            System.lineSeparator() + n + System.lineSeparator();
    String answerStr = "Choose a task number(1-5) or another number to exit: " + System.lineSeparator() + answer + System.lineSeparator();

    MainTestService.testOutMain(inStr, answerStr);

    HouseAndFloorFinder houseAndFloorFinder = new HouseAndFloorFinder(floorsAtHouse, roomAtFloor);
    assertEquals(answer, houseAndFloorFinder.getHouseAndFloor(n));
  }

  private void testThrowHouse(Integer roomAtFloor, Integer floorInHouse, Integer roomNumber) {
    String inStr = "2" + System.lineSeparator() + floorInHouse + System.lineSeparator() + roomAtFloor +
            System.lineSeparator() + roomNumber + System.lineSeparator();

    MainTestService.testErrMain(inStr, "Expected: floorInHouse > 0, roomAtFloor > 0 ,floorInHouse*roomAtFloor <= MAX_VALUE." +
            " Got: floorInHouse = " + floorInHouse + " roomAtFloor = " + roomAtFloor + System.lineSeparator());

    try {
      HouseAndFloorFinder houseAndFloorFinder = new HouseAndFloorFinder(floorInHouse, roomAtFloor);
      houseAndFloorFinder.getHouseAndFloor(roomNumber);
      fail();
    } catch (IllegalArgumentException e) {
      //There should be nothing here
    }
  }

  private void testThrowRoom(Integer roomAtFloor, Integer floorInHouse, Integer roomNumber) {
    String inStr = "2" + System.lineSeparator() + floorInHouse + System.lineSeparator() + roomAtFloor + System.lineSeparator()
            + roomNumber + System.lineSeparator();


    MainTestService.testErrMain(inStr, "Expected: " + "0 < roomNumber" + ". Got: roomNumber = " + roomNumber + System.lineSeparator());

    try {
      HouseAndFloorFinder houseAndFloorFinder = new HouseAndFloorFinder(floorInHouse, roomAtFloor);
      houseAndFloorFinder.getHouseAndFloor(roomNumber);
      fail();
    } catch (IllegalArgumentException e) {
      //There should be nothing here
    }
  }
}