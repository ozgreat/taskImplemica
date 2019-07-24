package enums;

/**
 * Enum that contains values of months
 */
public enum Month {
  /**
   * Value of January
   */
  JANUARY(31),
  /**
   * Value of February
   */
  FEBRUARY(28),
  /**
   * Value of Mars
   */
  MARS(31),
  /**
   * Value of April
   */
  APRIL(30),
  /**
   * Value of May
   */
  MAY(31),
  /**
   * Value of June
   */
  JUNE(30),
  /**
   * Value of July
   */
  JULY(31),
  /**
   * Value of August
   */
  AUGUST(31),
  /**
   * Value of September
   */
  SEPTEMBER(30),
  /**
   * Value of October
   */
  OCTOBER(31),
  /**
   * Value of November
   */
  NOVEMBER(30),
  /**
   * Value of December
   */
  DECEMBER(31);

  /**
   * Amount of days in the month
   */
  private int days;

  public int getDays() {
    return days;
  }

  Month(int days) {
    this.days = days;
  }
}
