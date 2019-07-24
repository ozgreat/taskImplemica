package executor;

import enums.DayOfTheWeek;
import enums.Month;
import tasks.DayOfTheWeekFinder;

import java.util.Scanner;

/**
 * Represents an operation that accepts {@code Scanner} argument and init parameters for {@code DayOfTheWeekFinder},
 * than execute them
 */
public class DayOfTheWeekFinderExecutor implements Executable {
  /**
   * Init parameters for {@code DayOfTheWeekFinder} and execute them
   *
   * @param in Scanner to input data by user
   */
  @Override
  public void execute(Scanner in) {
    Integer day = null;
    DayOfTheWeek newYearsDay = null;
    Month month = null;

    try {
      newYearsDay = DayOfTheWeek.values()[in.nextInt() - 1];
      day = in.nextInt();
      month = Month.values()[in.nextInt() - 1];
    } catch (ArrayIndexOutOfBoundsException e) {
      System.err.print(e.getMessage());
    }

    if (day != null && newYearsDay != null && month != null) {
      try {
        System.out.println(DayOfTheWeekFinder.getDayOfTheWeek(newYearsDay, day, month));
      } catch (IllegalArgumentException e) {
        System.err.print(e.getMessage());
      }
    }
  }
}
