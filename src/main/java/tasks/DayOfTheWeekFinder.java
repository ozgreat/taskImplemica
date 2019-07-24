package tasks;

import enums.DayOfTheWeek;
import enums.Month;

/**
 * The {@code tasks.DayOfTheWeekFinder} class contains method, that find day of the week by date
 * and week day of New Year
 *
 * @author ozgreat
 */
public class DayOfTheWeekFinder {

  /**
   * Amount of days in one week
   */
  private final static int DAYS_IN_THE_WEEK = 7;

  /**
   * Find day of the week from date and day of the week of New Year's day
   *
   * @param dayOfNewYear 1st January day of the week
   * @param day          current day of month
   * @param month        current month
   * @return current day of the week
   * @throws NumberFormatException day less than 1 or bigger than day in current month
   */
  public static DayOfTheWeek getDayOfTheWeek(DayOfTheWeek dayOfNewYear, int day, Month month) throws IllegalArgumentException {
    if (day > month.getDays() || day < 1) {
      throw new IllegalArgumentException("Expected day > 0 and day < " + month.getDays() + ". Got: day = " + day);
    }

    int dayOfTheYear = 0;
    for (int i = 0; i < month.ordinal(); i++) {
      dayOfTheYear += Month.values()[i].getDays();
    }

    dayOfTheYear += day;
    int res = (dayOfTheYear + dayOfNewYear.ordinal() - 1) % DAYS_IN_THE_WEEK;

    return DayOfTheWeek.values()[res];
  }
}
