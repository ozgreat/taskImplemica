package tasks;

import static java.lang.Integer.MAX_VALUE;

/**
 * The {@code tasks.HouseAndFloorFinder} class contains information about house - how many floors
 * at house and how many rooms at floor, and method for finding number of house and floor in house
 * by room number. Class is immutable.
 *
 * @author ozgreat
 */
public class HouseAndFloorFinder {

  /**
   * Amount of floor in the house
   */
  private int floorInHouse;

  /**
   * Amount of room at floor
   */
  private int roomAtFloor;

  /**
   * Initializes a newly created {@code tasks.HouseAndFloorFinder} object with setted amount
   * of floors in house and rooms at floor. Class is immutable, remember that, when
   * you will use that constructor
   *
   * @param floorInHouse quantity of floors in house
   * @param roomAtFloor  quantity of rooms at floor
   * @throws NumberFormatException if floors or rooms at floors < 0
   *                               or if floorInHouse * roomAtFloor > Integer.MAX_VALUE
   */
  public HouseAndFloorFinder(int floorInHouse, int roomAtFloor) throws IllegalArgumentException {
    if (floorInHouse <= 0 || roomAtFloor <= 0 || (MAX_VALUE / roomAtFloor) < floorInHouse) {
      throw new IllegalArgumentException("Expected: floorInHouse > 0, roomAtFloor > 0 ,floorInHouse*roomAtFloor <= MAX_VALUE. " +
              "Got: floorInHouse = " + floorInHouse + " roomAtFloor = " + roomAtFloor);
    }

    this.floorInHouse = floorInHouse;
    this.roomAtFloor = roomAtFloor;
  }

  /**
   * Calculate house and floor number by room number. And if room number is less that 1 throw exception
   *
   * @param roomNumber room number
   * @return house and floor number
   * @throws NumberFormatException roomNumber is less than 1
   */
  public String getHouseAndFloor(int roomNumber) throws IllegalArgumentException {
    if (roomNumber < 1) {
      throw new IllegalArgumentException("Expected: " + "0 < roomNumber" + ". Got: roomNumber = " + roomNumber);
    }

    int floor;
    floor = roomNumber / roomAtFloor;
    if (roomNumber % roomAtFloor != 0) {
      floor++;
    }

    if (floor >= floorInHouse) {
      if (floor % floorInHouse == 0) {
        floor = floorInHouse;
      } else {
        floor %= floorInHouse;
      }
    }

    int currentHouse = 1;
    currentHouse += (roomNumber / (floorInHouse * roomAtFloor));
    if (roomNumber % (floorInHouse * roomAtFloor) == 0) {
      currentHouse--;
    }

    return "Floor: " + floor + " house: " + currentHouse;
  }
}
