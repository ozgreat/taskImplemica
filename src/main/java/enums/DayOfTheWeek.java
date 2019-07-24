package enums;

/**
 * Enum that contains values of day of the week
 *
 * @author ozgreat
 */
public enum DayOfTheWeek {
  /**
   * Value of Monday
   */
  MONDAY("Monday"),
  /**
   * Value of Tuesday
   */
  TUESDAY("Tuesday"),
  /**
   * Value of Wednesday
   */
  WEDNESDAY("Wednesday"),
  /**
   * Value of Thursday
   */
  THURSDAY("Thursday"),
  /**
   * Value of Friday
   */
  FRIDAY("Friday"),
  /**
   * Value of Saturday
   */
  SATURDAY("Saturday"),
  /**
   * Value of Sunday
   */
  SUNDAY("Sunday");

  /**
   * Name of the day of week
   */
  private String title;

  /**
   * Constructor of enums.DayOfTheWeek
   */
  DayOfTheWeek(String title) {
    this.title = title;
  }

  /**
   * To string, returned title of object
   *
   * @return String of enums.DayOfTheWeek
   */
  @Override
  public String toString() {
    return this.title;
  }
}
