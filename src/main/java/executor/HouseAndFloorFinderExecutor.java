package executor;

import tasks.HouseAndFloorFinder;

import java.util.Scanner;

/**
 * Represents an operation that accepts {@code Scanner} argument and init parameters for {@code HouseAndFloorFinder},
 * than execute them
 */
public class HouseAndFloorFinderExecutor implements Executable {
  /**
   * Init parameters for {@code HouseAndFloorFinder} and execute them
   *
   * @param in Scanner to input data by user
   */
  @Override
  public void execute(Scanner in) {
    try {
      HouseAndFloorFinder houseAndFloorFinder = new HouseAndFloorFinder(in.nextInt(), in.nextInt());

      int n = in.nextInt();

      System.out.println(houseAndFloorFinder.getHouseAndFloor(n));
    } catch (IllegalArgumentException e) {
      System.err.println(e.getMessage());
    }
  }
}
