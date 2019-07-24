import enums.DayOfTheWeek;
import enums.Month;
import org.junit.jupiter.api.Test;

import static java.lang.Integer.MAX_VALUE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import static tasks.DayOfTheWeekFinder.getDayOfTheWeek;

/**
 * Test class for {@code DayOfTheWeekFinder} class
 */
class DayOfTheWeekFinderTest {

  /**
   * Overstep of every special month case in every possible and month
   */
  @Test
  void tests() {
    // Special cases
    // New Year Monday
    //January
    test("Monday", DayOfTheWeek.MONDAY, 1, Month.JANUARY);
    test("Tuesday", DayOfTheWeek.MONDAY, 2, Month.JANUARY);
    test("Monday", DayOfTheWeek.MONDAY, 15, Month.JANUARY);
    test("Tuesday", DayOfTheWeek.MONDAY, 16, Month.JANUARY);
    test("Sunday", DayOfTheWeek.MONDAY, 14, Month.JANUARY);
    test("Wednesday", DayOfTheWeek.MONDAY, 31, Month.JANUARY);


    //February
    test("Thursday", DayOfTheWeek.MONDAY, 1, Month.FEBRUARY);
    test("Friday", DayOfTheWeek.MONDAY, 2, Month.FEBRUARY);
    test("Thursday", DayOfTheWeek.MONDAY, 15, Month.FEBRUARY);
    test("Friday", DayOfTheWeek.MONDAY, 16, Month.FEBRUARY);
    test("Wednesday", DayOfTheWeek.MONDAY, 14, Month.FEBRUARY);
    test("Wednesday", DayOfTheWeek.MONDAY, 28, Month.FEBRUARY);


    //Mars
    test("Thursday", DayOfTheWeek.MONDAY, 1, Month.MARS);
    test("Friday", DayOfTheWeek.MONDAY, 2, Month.MARS);
    test("Thursday", DayOfTheWeek.MONDAY, 15, Month.MARS);
    test("Friday", DayOfTheWeek.MONDAY, 16, Month.MARS);
    test("Wednesday", DayOfTheWeek.MONDAY, 14, Month.MARS);
    test("Saturday", DayOfTheWeek.MONDAY, 31, Month.MARS);


    //April
    test("Sunday", DayOfTheWeek.MONDAY, 1, Month.APRIL);
    test("Monday", DayOfTheWeek.MONDAY, 2, Month.APRIL);
    test("Sunday", DayOfTheWeek.MONDAY, 15, Month.APRIL);
    test("Monday", DayOfTheWeek.MONDAY, 16, Month.APRIL);
    test("Saturday", DayOfTheWeek.MONDAY, 14, Month.APRIL);
    test("Monday", DayOfTheWeek.MONDAY, 30, Month.APRIL);


    //May
    test("Tuesday", DayOfTheWeek.MONDAY, 1, Month.MAY);
    test("Wednesday", DayOfTheWeek.MONDAY, 2, Month.MAY);
    test("Tuesday", DayOfTheWeek.MONDAY, 15, Month.MAY);
    test("Wednesday", DayOfTheWeek.MONDAY, 16, Month.MAY);
    test("Monday", DayOfTheWeek.MONDAY, 14, Month.MAY);
    test("Thursday", DayOfTheWeek.MONDAY, 31, Month.MAY);


    //June
    test("Friday", DayOfTheWeek.MONDAY, 1, Month.JUNE);
    test("Saturday", DayOfTheWeek.MONDAY, 2, Month.JUNE);
    test("Friday", DayOfTheWeek.MONDAY, 15, Month.JUNE);
    test("Saturday", DayOfTheWeek.MONDAY, 16, Month.JUNE);
    test("Thursday", DayOfTheWeek.MONDAY, 14, Month.JUNE);
    test("Saturday", DayOfTheWeek.MONDAY, 30, Month.JUNE);


    //July
    test("Sunday", DayOfTheWeek.MONDAY, 1, Month.JULY);
    test("Monday", DayOfTheWeek.MONDAY, 2, Month.JULY);
    test("Sunday", DayOfTheWeek.MONDAY, 15, Month.JULY);
    test("Monday", DayOfTheWeek.MONDAY, 16, Month.JULY);
    test("Saturday", DayOfTheWeek.MONDAY, 14, Month.JULY);
    test("Tuesday", DayOfTheWeek.MONDAY, 31, Month.JULY);


    //August
    test("Wednesday", DayOfTheWeek.MONDAY, 1, Month.AUGUST);
    test("Thursday", DayOfTheWeek.MONDAY, 2, Month.AUGUST);
    test("Wednesday", DayOfTheWeek.MONDAY, 15, Month.AUGUST);
    test("Thursday", DayOfTheWeek.MONDAY, 16, Month.AUGUST);
    test("Tuesday", DayOfTheWeek.MONDAY, 14, Month.AUGUST);
    test("Friday", DayOfTheWeek.MONDAY, 31, Month.AUGUST);


    //September
    test("Saturday", DayOfTheWeek.MONDAY, 1, Month.SEPTEMBER);
    test("Sunday", DayOfTheWeek.MONDAY, 2, Month.SEPTEMBER);
    test("Saturday", DayOfTheWeek.MONDAY, 15, Month.SEPTEMBER);
    test("Sunday", DayOfTheWeek.MONDAY, 16, Month.SEPTEMBER);
    test("Friday", DayOfTheWeek.MONDAY, 14, Month.SEPTEMBER);
    test("Sunday", DayOfTheWeek.MONDAY, 30, Month.SEPTEMBER);


    //October
    test("Monday", DayOfTheWeek.MONDAY, 1, Month.OCTOBER);
    test("Tuesday", DayOfTheWeek.MONDAY, 2, Month.OCTOBER);
    test("Monday", DayOfTheWeek.MONDAY, 15, Month.OCTOBER);
    test("Tuesday", DayOfTheWeek.MONDAY, 16, Month.OCTOBER);
    test("Sunday", DayOfTheWeek.MONDAY, 14, Month.OCTOBER);
    test("Wednesday", DayOfTheWeek.MONDAY, 31, Month.OCTOBER);


    //November
    test("Thursday", DayOfTheWeek.MONDAY, 1, Month.NOVEMBER);
    test("Friday", DayOfTheWeek.MONDAY, 2, Month.NOVEMBER);
    test("Thursday", DayOfTheWeek.MONDAY, 15, Month.NOVEMBER);
    test("Friday", DayOfTheWeek.MONDAY, 16, Month.NOVEMBER);
    test("Wednesday", DayOfTheWeek.MONDAY, 14, Month.NOVEMBER);
    test("Friday", DayOfTheWeek.MONDAY, 30, Month.NOVEMBER);


    //December
    test("Saturday", DayOfTheWeek.MONDAY, 1, Month.DECEMBER);
    test("Sunday", DayOfTheWeek.MONDAY, 2, Month.DECEMBER);
    test("Saturday", DayOfTheWeek.MONDAY, 15, Month.DECEMBER);
    test("Sunday", DayOfTheWeek.MONDAY, 16, Month.DECEMBER);
    test("Friday", DayOfTheWeek.MONDAY, 14, Month.DECEMBER);
    test("Monday", DayOfTheWeek.MONDAY, 31, Month.DECEMBER);

    // New Year Tuesday
    //January
    test("Tuesday", DayOfTheWeek.TUESDAY, 1, Month.JANUARY);
    test("Wednesday", DayOfTheWeek.TUESDAY, 2, Month.JANUARY);
    test("Tuesday", DayOfTheWeek.TUESDAY, 15, Month.JANUARY);
    test("Wednesday", DayOfTheWeek.TUESDAY, 16, Month.JANUARY);
    test("Monday", DayOfTheWeek.TUESDAY, 14, Month.JANUARY);
    test("Thursday", DayOfTheWeek.TUESDAY, 31, Month.JANUARY);


    //February
    test("Friday", DayOfTheWeek.TUESDAY, 1, Month.FEBRUARY);
    test("Saturday", DayOfTheWeek.TUESDAY, 2, Month.FEBRUARY);
    test("Friday", DayOfTheWeek.TUESDAY, 15, Month.FEBRUARY);
    test("Saturday", DayOfTheWeek.TUESDAY, 16, Month.FEBRUARY);
    test("Thursday", DayOfTheWeek.TUESDAY, 14, Month.FEBRUARY);
    test("Thursday", DayOfTheWeek.TUESDAY, 28, Month.FEBRUARY);


    //Mars
    test("Friday", DayOfTheWeek.TUESDAY, 1, Month.MARS);
    test("Saturday", DayOfTheWeek.TUESDAY, 2, Month.MARS);
    test("Friday", DayOfTheWeek.TUESDAY, 15, Month.MARS);
    test("Saturday", DayOfTheWeek.TUESDAY, 16, Month.MARS);
    test("Thursday", DayOfTheWeek.TUESDAY, 14, Month.MARS);
    test("Sunday", DayOfTheWeek.TUESDAY, 31, Month.MARS);


    //April
    test("Monday", DayOfTheWeek.TUESDAY, 1, Month.APRIL);
    test("Tuesday", DayOfTheWeek.TUESDAY, 2, Month.APRIL);
    test("Monday", DayOfTheWeek.TUESDAY, 15, Month.APRIL);
    test("Tuesday", DayOfTheWeek.TUESDAY, 16, Month.APRIL);
    test("Sunday", DayOfTheWeek.TUESDAY, 14, Month.APRIL);
    test("Tuesday", DayOfTheWeek.TUESDAY, 30, Month.APRIL);


    //May
    test("Wednesday", DayOfTheWeek.TUESDAY, 1, Month.MAY);
    test("Thursday", DayOfTheWeek.TUESDAY, 2, Month.MAY);
    test("Wednesday", DayOfTheWeek.TUESDAY, 15, Month.MAY);
    test("Thursday", DayOfTheWeek.TUESDAY, 16, Month.MAY);
    test("Tuesday", DayOfTheWeek.TUESDAY, 14, Month.MAY);
    test("Friday", DayOfTheWeek.TUESDAY, 31, Month.MAY);


    //June
    test("Saturday", DayOfTheWeek.TUESDAY, 1, Month.JUNE);
    test("Sunday", DayOfTheWeek.TUESDAY, 2, Month.JUNE);
    test("Saturday", DayOfTheWeek.TUESDAY, 15, Month.JUNE);
    test("Sunday", DayOfTheWeek.TUESDAY, 16, Month.JUNE);
    test("Friday", DayOfTheWeek.TUESDAY, 14, Month.JUNE);
    test("Sunday", DayOfTheWeek.TUESDAY, 30, Month.JUNE);


    //July
    test("Monday", DayOfTheWeek.TUESDAY, 1, Month.JULY);
    test("Tuesday", DayOfTheWeek.TUESDAY, 2, Month.JULY);
    test("Monday", DayOfTheWeek.TUESDAY, 15, Month.JULY);
    test("Tuesday", DayOfTheWeek.TUESDAY, 16, Month.JULY);
    test("Sunday", DayOfTheWeek.TUESDAY, 14, Month.JULY);
    test("Wednesday", DayOfTheWeek.TUESDAY, 31, Month.JULY);


    //August
    test("Thursday", DayOfTheWeek.TUESDAY, 1, Month.AUGUST);
    test("Friday", DayOfTheWeek.TUESDAY, 2, Month.AUGUST);
    test("Thursday", DayOfTheWeek.TUESDAY, 15, Month.AUGUST);
    test("Friday", DayOfTheWeek.TUESDAY, 16, Month.AUGUST);
    test("Wednesday", DayOfTheWeek.TUESDAY, 14, Month.AUGUST);
    test("Saturday", DayOfTheWeek.TUESDAY, 31, Month.AUGUST);


    //September
    test("Sunday", DayOfTheWeek.TUESDAY, 1, Month.SEPTEMBER);
    test("Monday", DayOfTheWeek.TUESDAY, 2, Month.SEPTEMBER);
    test("Sunday", DayOfTheWeek.TUESDAY, 15, Month.SEPTEMBER);
    test("Monday", DayOfTheWeek.TUESDAY, 16, Month.SEPTEMBER);
    test("Saturday", DayOfTheWeek.TUESDAY, 14, Month.SEPTEMBER);
    test("Monday", DayOfTheWeek.TUESDAY, 30, Month.SEPTEMBER);


    //October
    test("Tuesday", DayOfTheWeek.TUESDAY, 1, Month.OCTOBER);
    test("Wednesday", DayOfTheWeek.TUESDAY, 2, Month.OCTOBER);
    test("Tuesday", DayOfTheWeek.TUESDAY, 15, Month.OCTOBER);
    test("Wednesday", DayOfTheWeek.TUESDAY, 16, Month.OCTOBER);
    test("Monday", DayOfTheWeek.TUESDAY, 14, Month.OCTOBER);
    test("Thursday", DayOfTheWeek.TUESDAY, 31, Month.OCTOBER);


    //November
    test("Friday", DayOfTheWeek.TUESDAY, 1, Month.NOVEMBER);
    test("Saturday", DayOfTheWeek.TUESDAY, 2, Month.NOVEMBER);
    test("Friday", DayOfTheWeek.TUESDAY, 15, Month.NOVEMBER);
    test("Saturday", DayOfTheWeek.TUESDAY, 16, Month.NOVEMBER);
    test("Thursday", DayOfTheWeek.TUESDAY, 14, Month.NOVEMBER);
    test("Saturday", DayOfTheWeek.TUESDAY, 30, Month.NOVEMBER);


    //December
    test("Sunday", DayOfTheWeek.TUESDAY, 1, Month.DECEMBER);
    test("Monday", DayOfTheWeek.TUESDAY, 2, Month.DECEMBER);
    test("Sunday", DayOfTheWeek.TUESDAY, 15, Month.DECEMBER);
    test("Monday", DayOfTheWeek.TUESDAY, 16, Month.DECEMBER);
    test("Saturday", DayOfTheWeek.TUESDAY, 14, Month.DECEMBER);
    test("Tuesday", DayOfTheWeek.TUESDAY, 31, Month.DECEMBER);

    // New Year Wednesday
    //January
    test("Wednesday", DayOfTheWeek.WEDNESDAY, 1, Month.JANUARY);
    test("Thursday", DayOfTheWeek.WEDNESDAY, 2, Month.JANUARY);
    test("Wednesday", DayOfTheWeek.WEDNESDAY, 15, Month.JANUARY);
    test("Thursday", DayOfTheWeek.WEDNESDAY, 16, Month.JANUARY);
    test("Tuesday", DayOfTheWeek.WEDNESDAY, 14, Month.JANUARY);
    test("Friday", DayOfTheWeek.WEDNESDAY, 31, Month.JANUARY);


    //February
    test("Saturday", DayOfTheWeek.WEDNESDAY, 1, Month.FEBRUARY);
    test("Sunday", DayOfTheWeek.WEDNESDAY, 2, Month.FEBRUARY);
    test("Saturday", DayOfTheWeek.WEDNESDAY, 15, Month.FEBRUARY);
    test("Sunday", DayOfTheWeek.WEDNESDAY, 16, Month.FEBRUARY);
    test("Friday", DayOfTheWeek.WEDNESDAY, 14, Month.FEBRUARY);
    test("Friday", DayOfTheWeek.WEDNESDAY, 28, Month.FEBRUARY);


    //Mars
    test("Saturday", DayOfTheWeek.WEDNESDAY, 1, Month.MARS);
    test("Sunday", DayOfTheWeek.WEDNESDAY, 2, Month.MARS);
    test("Saturday", DayOfTheWeek.WEDNESDAY, 15, Month.MARS);
    test("Sunday", DayOfTheWeek.WEDNESDAY, 16, Month.MARS);
    test("Friday", DayOfTheWeek.WEDNESDAY, 14, Month.MARS);
    test("Monday", DayOfTheWeek.WEDNESDAY, 31, Month.MARS);


    //April
    test("Tuesday", DayOfTheWeek.WEDNESDAY, 1, Month.APRIL);
    test("Wednesday", DayOfTheWeek.WEDNESDAY, 2, Month.APRIL);
    test("Tuesday", DayOfTheWeek.WEDNESDAY, 15, Month.APRIL);
    test("Wednesday", DayOfTheWeek.WEDNESDAY, 16, Month.APRIL);
    test("Monday", DayOfTheWeek.WEDNESDAY, 14, Month.APRIL);
    test("Wednesday", DayOfTheWeek.WEDNESDAY, 30, Month.APRIL);


    //May
    test("Thursday", DayOfTheWeek.WEDNESDAY, 1, Month.MAY);
    test("Friday", DayOfTheWeek.WEDNESDAY, 2, Month.MAY);
    test("Thursday", DayOfTheWeek.WEDNESDAY, 15, Month.MAY);
    test("Friday", DayOfTheWeek.WEDNESDAY, 16, Month.MAY);
    test("Wednesday", DayOfTheWeek.WEDNESDAY, 14, Month.MAY);
    test("Saturday", DayOfTheWeek.WEDNESDAY, 31, Month.MAY);


    //June
    test("Sunday", DayOfTheWeek.WEDNESDAY, 1, Month.JUNE);
    test("Monday", DayOfTheWeek.WEDNESDAY, 2, Month.JUNE);
    test("Sunday", DayOfTheWeek.WEDNESDAY, 15, Month.JUNE);
    test("Monday", DayOfTheWeek.WEDNESDAY, 16, Month.JUNE);
    test("Saturday", DayOfTheWeek.WEDNESDAY, 14, Month.JUNE);
    test("Monday", DayOfTheWeek.WEDNESDAY, 30, Month.JUNE);


    //July
    test("Tuesday", DayOfTheWeek.WEDNESDAY, 1, Month.JULY);
    test("Wednesday", DayOfTheWeek.WEDNESDAY, 2, Month.JULY);
    test("Tuesday", DayOfTheWeek.WEDNESDAY, 15, Month.JULY);
    test("Wednesday", DayOfTheWeek.WEDNESDAY, 16, Month.JULY);
    test("Monday", DayOfTheWeek.WEDNESDAY, 14, Month.JULY);
    test("Thursday", DayOfTheWeek.WEDNESDAY, 31, Month.JULY);


    //August
    test("Friday", DayOfTheWeek.WEDNESDAY, 1, Month.AUGUST);
    test("Saturday", DayOfTheWeek.WEDNESDAY, 2, Month.AUGUST);
    test("Friday", DayOfTheWeek.WEDNESDAY, 15, Month.AUGUST);
    test("Saturday", DayOfTheWeek.WEDNESDAY, 16, Month.AUGUST);
    test("Thursday", DayOfTheWeek.WEDNESDAY, 14, Month.AUGUST);
    test("Sunday", DayOfTheWeek.WEDNESDAY, 31, Month.AUGUST);


    //September
    test("Monday", DayOfTheWeek.WEDNESDAY, 1, Month.SEPTEMBER);
    test("Tuesday", DayOfTheWeek.WEDNESDAY, 2, Month.SEPTEMBER);
    test("Monday", DayOfTheWeek.WEDNESDAY, 15, Month.SEPTEMBER);
    test("Tuesday", DayOfTheWeek.WEDNESDAY, 16, Month.SEPTEMBER);
    test("Sunday", DayOfTheWeek.WEDNESDAY, 14, Month.SEPTEMBER);
    test("Tuesday", DayOfTheWeek.WEDNESDAY, 30, Month.SEPTEMBER);


    //October
    test("Wednesday", DayOfTheWeek.WEDNESDAY, 1, Month.OCTOBER);
    test("Thursday", DayOfTheWeek.WEDNESDAY, 2, Month.OCTOBER);
    test("Wednesday", DayOfTheWeek.WEDNESDAY, 15, Month.OCTOBER);
    test("Thursday", DayOfTheWeek.WEDNESDAY, 16, Month.OCTOBER);
    test("Tuesday", DayOfTheWeek.WEDNESDAY, 14, Month.OCTOBER);
    test("Friday", DayOfTheWeek.WEDNESDAY, 31, Month.OCTOBER);


    //November
    test("Saturday", DayOfTheWeek.WEDNESDAY, 1, Month.NOVEMBER);
    test("Sunday", DayOfTheWeek.WEDNESDAY, 2, Month.NOVEMBER);
    test("Saturday", DayOfTheWeek.WEDNESDAY, 15, Month.NOVEMBER);
    test("Sunday", DayOfTheWeek.WEDNESDAY, 16, Month.NOVEMBER);
    test("Friday", DayOfTheWeek.WEDNESDAY, 14, Month.NOVEMBER);
    test("Sunday", DayOfTheWeek.WEDNESDAY, 30, Month.NOVEMBER);


    //December
    test("Monday", DayOfTheWeek.WEDNESDAY, 1, Month.DECEMBER);
    test("Tuesday", DayOfTheWeek.WEDNESDAY, 2, Month.DECEMBER);
    test("Monday", DayOfTheWeek.WEDNESDAY, 15, Month.DECEMBER);
    test("Tuesday", DayOfTheWeek.WEDNESDAY, 16, Month.DECEMBER);
    test("Sunday", DayOfTheWeek.WEDNESDAY, 14, Month.DECEMBER);
    test("Wednesday", DayOfTheWeek.WEDNESDAY, 31, Month.DECEMBER);

    // New Year Thursday
    //January
    test("Thursday", DayOfTheWeek.THURSDAY, 1, Month.JANUARY);
    test("Friday", DayOfTheWeek.THURSDAY, 2, Month.JANUARY);
    test("Thursday", DayOfTheWeek.THURSDAY, 15, Month.JANUARY);
    test("Friday", DayOfTheWeek.THURSDAY, 16, Month.JANUARY);
    test("Wednesday", DayOfTheWeek.THURSDAY, 14, Month.JANUARY);
    test("Saturday", DayOfTheWeek.THURSDAY, 31, Month.JANUARY);


    //February
    test("Sunday", DayOfTheWeek.THURSDAY, 1, Month.FEBRUARY);
    test("Monday", DayOfTheWeek.THURSDAY, 2, Month.FEBRUARY);
    test("Sunday", DayOfTheWeek.THURSDAY, 15, Month.FEBRUARY);
    test("Monday", DayOfTheWeek.THURSDAY, 16, Month.FEBRUARY);
    test("Saturday", DayOfTheWeek.THURSDAY, 14, Month.FEBRUARY);
    test("Saturday", DayOfTheWeek.THURSDAY, 28, Month.FEBRUARY);


    //Mars
    test("Sunday", DayOfTheWeek.THURSDAY, 1, Month.MARS);
    test("Monday", DayOfTheWeek.THURSDAY, 2, Month.MARS);
    test("Sunday", DayOfTheWeek.THURSDAY, 15, Month.MARS);
    test("Monday", DayOfTheWeek.THURSDAY, 16, Month.MARS);
    test("Saturday", DayOfTheWeek.THURSDAY, 14, Month.MARS);
    test("Tuesday", DayOfTheWeek.THURSDAY, 31, Month.MARS);


    //April
    test("Wednesday", DayOfTheWeek.THURSDAY, 1, Month.APRIL);
    test("Thursday", DayOfTheWeek.THURSDAY, 2, Month.APRIL);
    test("Wednesday", DayOfTheWeek.THURSDAY, 15, Month.APRIL);
    test("Thursday", DayOfTheWeek.THURSDAY, 16, Month.APRIL);
    test("Tuesday", DayOfTheWeek.THURSDAY, 14, Month.APRIL);
    test("Thursday", DayOfTheWeek.THURSDAY, 30, Month.APRIL);


    //May
    test("Friday", DayOfTheWeek.THURSDAY, 1, Month.MAY);
    test("Saturday", DayOfTheWeek.THURSDAY, 2, Month.MAY);
    test("Friday", DayOfTheWeek.THURSDAY, 15, Month.MAY);
    test("Saturday", DayOfTheWeek.THURSDAY, 16, Month.MAY);
    test("Thursday", DayOfTheWeek.THURSDAY, 14, Month.MAY);
    test("Sunday", DayOfTheWeek.THURSDAY, 31, Month.MAY);


    //June
    test("Monday", DayOfTheWeek.THURSDAY, 1, Month.JUNE);
    test("Tuesday", DayOfTheWeek.THURSDAY, 2, Month.JUNE);
    test("Monday", DayOfTheWeek.THURSDAY, 15, Month.JUNE);
    test("Tuesday", DayOfTheWeek.THURSDAY, 16, Month.JUNE);
    test("Sunday", DayOfTheWeek.THURSDAY, 14, Month.JUNE);
    test("Tuesday", DayOfTheWeek.THURSDAY, 30, Month.JUNE);


    //July
    test("Wednesday", DayOfTheWeek.THURSDAY, 1, Month.JULY);
    test("Thursday", DayOfTheWeek.THURSDAY, 2, Month.JULY);
    test("Wednesday", DayOfTheWeek.THURSDAY, 15, Month.JULY);
    test("Thursday", DayOfTheWeek.THURSDAY, 16, Month.JULY);
    test("Tuesday", DayOfTheWeek.THURSDAY, 14, Month.JULY);
    test("Friday", DayOfTheWeek.THURSDAY, 31, Month.JULY);


    //August
    test("Saturday", DayOfTheWeek.THURSDAY, 1, Month.AUGUST);
    test("Sunday", DayOfTheWeek.THURSDAY, 2, Month.AUGUST);
    test("Saturday", DayOfTheWeek.THURSDAY, 15, Month.AUGUST);
    test("Sunday", DayOfTheWeek.THURSDAY, 16, Month.AUGUST);
    test("Friday", DayOfTheWeek.THURSDAY, 14, Month.AUGUST);
    test("Monday", DayOfTheWeek.THURSDAY, 31, Month.AUGUST);


    //September
    test("Tuesday", DayOfTheWeek.THURSDAY, 1, Month.SEPTEMBER);
    test("Wednesday", DayOfTheWeek.THURSDAY, 2, Month.SEPTEMBER);
    test("Tuesday", DayOfTheWeek.THURSDAY, 15, Month.SEPTEMBER);
    test("Wednesday", DayOfTheWeek.THURSDAY, 16, Month.SEPTEMBER);
    test("Monday", DayOfTheWeek.THURSDAY, 14, Month.SEPTEMBER);
    test("Wednesday", DayOfTheWeek.THURSDAY, 30, Month.SEPTEMBER);


    //October
    test("Thursday", DayOfTheWeek.THURSDAY, 1, Month.OCTOBER);
    test("Friday", DayOfTheWeek.THURSDAY, 2, Month.OCTOBER);
    test("Thursday", DayOfTheWeek.THURSDAY, 15, Month.OCTOBER);
    test("Friday", DayOfTheWeek.THURSDAY, 16, Month.OCTOBER);
    test("Wednesday", DayOfTheWeek.THURSDAY, 14, Month.OCTOBER);
    test("Saturday", DayOfTheWeek.THURSDAY, 31, Month.OCTOBER);


    //November
    test("Sunday", DayOfTheWeek.THURSDAY, 1, Month.NOVEMBER);
    test("Monday", DayOfTheWeek.THURSDAY, 2, Month.NOVEMBER);
    test("Sunday", DayOfTheWeek.THURSDAY, 15, Month.NOVEMBER);
    test("Monday", DayOfTheWeek.THURSDAY, 16, Month.NOVEMBER);
    test("Saturday", DayOfTheWeek.THURSDAY, 14, Month.NOVEMBER);
    test("Monday", DayOfTheWeek.THURSDAY, 30, Month.NOVEMBER);


    //December
    test("Tuesday", DayOfTheWeek.THURSDAY, 1, Month.DECEMBER);
    test("Wednesday", DayOfTheWeek.THURSDAY, 2, Month.DECEMBER);
    test("Tuesday", DayOfTheWeek.THURSDAY, 15, Month.DECEMBER);
    test("Wednesday", DayOfTheWeek.THURSDAY, 16, Month.DECEMBER);
    test("Monday", DayOfTheWeek.THURSDAY, 14, Month.DECEMBER);
    test("Thursday", DayOfTheWeek.THURSDAY, 31, Month.DECEMBER);

    // New Year Friday
    //January
    test("Friday", DayOfTheWeek.FRIDAY, 1, Month.JANUARY);
    test("Saturday", DayOfTheWeek.FRIDAY, 2, Month.JANUARY);
    test("Friday", DayOfTheWeek.FRIDAY, 15, Month.JANUARY);
    test("Saturday", DayOfTheWeek.FRIDAY, 16, Month.JANUARY);
    test("Thursday", DayOfTheWeek.FRIDAY, 14, Month.JANUARY);
    test("Sunday", DayOfTheWeek.FRIDAY, 31, Month.JANUARY);


    //February
    test("Monday", DayOfTheWeek.FRIDAY, 1, Month.FEBRUARY);
    test("Tuesday", DayOfTheWeek.FRIDAY, 2, Month.FEBRUARY);
    test("Monday", DayOfTheWeek.FRIDAY, 15, Month.FEBRUARY);
    test("Tuesday", DayOfTheWeek.FRIDAY, 16, Month.FEBRUARY);
    test("Sunday", DayOfTheWeek.FRIDAY, 14, Month.FEBRUARY);
    test("Sunday", DayOfTheWeek.FRIDAY, 28, Month.FEBRUARY);


    //Mars
    test("Monday", DayOfTheWeek.FRIDAY, 1, Month.MARS);
    test("Tuesday", DayOfTheWeek.FRIDAY, 2, Month.MARS);
    test("Monday", DayOfTheWeek.FRIDAY, 15, Month.MARS);
    test("Tuesday", DayOfTheWeek.FRIDAY, 16, Month.MARS);
    test("Sunday", DayOfTheWeek.FRIDAY, 14, Month.MARS);
    test("Wednesday", DayOfTheWeek.FRIDAY, 31, Month.MARS);


    //April
    test("Thursday", DayOfTheWeek.FRIDAY, 1, Month.APRIL);
    test("Friday", DayOfTheWeek.FRIDAY, 2, Month.APRIL);
    test("Thursday", DayOfTheWeek.FRIDAY, 15, Month.APRIL);
    test("Friday", DayOfTheWeek.FRIDAY, 16, Month.APRIL);
    test("Wednesday", DayOfTheWeek.FRIDAY, 14, Month.APRIL);
    test("Friday", DayOfTheWeek.FRIDAY, 30, Month.APRIL);


    //May
    test("Saturday", DayOfTheWeek.FRIDAY, 1, Month.MAY);
    test("Sunday", DayOfTheWeek.FRIDAY, 2, Month.MAY);
    test("Saturday", DayOfTheWeek.FRIDAY, 15, Month.MAY);
    test("Sunday", DayOfTheWeek.FRIDAY, 16, Month.MAY);
    test("Friday", DayOfTheWeek.FRIDAY, 14, Month.MAY);
    test("Monday", DayOfTheWeek.FRIDAY, 31, Month.MAY);


    //June
    test("Tuesday", DayOfTheWeek.FRIDAY, 1, Month.JUNE);
    test("Wednesday", DayOfTheWeek.FRIDAY, 2, Month.JUNE);
    test("Tuesday", DayOfTheWeek.FRIDAY, 15, Month.JUNE);
    test("Wednesday", DayOfTheWeek.FRIDAY, 16, Month.JUNE);
    test("Monday", DayOfTheWeek.FRIDAY, 14, Month.JUNE);
    test("Wednesday", DayOfTheWeek.FRIDAY, 30, Month.JUNE);


    //July
    test("Thursday", DayOfTheWeek.FRIDAY, 1, Month.JULY);
    test("Friday", DayOfTheWeek.FRIDAY, 2, Month.JULY);
    test("Thursday", DayOfTheWeek.FRIDAY, 15, Month.JULY);
    test("Friday", DayOfTheWeek.FRIDAY, 16, Month.JULY);
    test("Wednesday", DayOfTheWeek.FRIDAY, 14, Month.JULY);
    test("Saturday", DayOfTheWeek.FRIDAY, 31, Month.JULY);


    //August
    test("Sunday", DayOfTheWeek.FRIDAY, 1, Month.AUGUST);
    test("Monday", DayOfTheWeek.FRIDAY, 2, Month.AUGUST);
    test("Sunday", DayOfTheWeek.FRIDAY, 15, Month.AUGUST);
    test("Monday", DayOfTheWeek.FRIDAY, 16, Month.AUGUST);
    test("Saturday", DayOfTheWeek.FRIDAY, 14, Month.AUGUST);
    test("Tuesday", DayOfTheWeek.FRIDAY, 31, Month.AUGUST);


    //September
    test("Wednesday", DayOfTheWeek.FRIDAY, 1, Month.SEPTEMBER);
    test("Thursday", DayOfTheWeek.FRIDAY, 2, Month.SEPTEMBER);
    test("Wednesday", DayOfTheWeek.FRIDAY, 15, Month.SEPTEMBER);
    test("Thursday", DayOfTheWeek.FRIDAY, 16, Month.SEPTEMBER);
    test("Tuesday", DayOfTheWeek.FRIDAY, 14, Month.SEPTEMBER);
    test("Thursday", DayOfTheWeek.FRIDAY, 30, Month.SEPTEMBER);


    //October
    test("Friday", DayOfTheWeek.FRIDAY, 1, Month.OCTOBER);
    test("Saturday", DayOfTheWeek.FRIDAY, 2, Month.OCTOBER);
    test("Friday", DayOfTheWeek.FRIDAY, 15, Month.OCTOBER);
    test("Saturday", DayOfTheWeek.FRIDAY, 16, Month.OCTOBER);
    test("Thursday", DayOfTheWeek.FRIDAY, 14, Month.OCTOBER);
    test("Sunday", DayOfTheWeek.FRIDAY, 31, Month.OCTOBER);


    //November
    test("Monday", DayOfTheWeek.FRIDAY, 1, Month.NOVEMBER);
    test("Tuesday", DayOfTheWeek.FRIDAY, 2, Month.NOVEMBER);
    test("Monday", DayOfTheWeek.FRIDAY, 15, Month.NOVEMBER);
    test("Tuesday", DayOfTheWeek.FRIDAY, 16, Month.NOVEMBER);
    test("Sunday", DayOfTheWeek.FRIDAY, 14, Month.NOVEMBER);
    test("Tuesday", DayOfTheWeek.FRIDAY, 30, Month.NOVEMBER);


    //December
    test("Wednesday", DayOfTheWeek.FRIDAY, 1, Month.DECEMBER);
    test("Thursday", DayOfTheWeek.FRIDAY, 2, Month.DECEMBER);
    test("Wednesday", DayOfTheWeek.FRIDAY, 15, Month.DECEMBER);
    test("Thursday", DayOfTheWeek.FRIDAY, 16, Month.DECEMBER);
    test("Tuesday", DayOfTheWeek.FRIDAY, 14, Month.DECEMBER);
    test("Friday", DayOfTheWeek.FRIDAY, 31, Month.DECEMBER);

    // New Year Saturday
    //January
    test("Saturday", DayOfTheWeek.SATURDAY, 1, Month.JANUARY);
    test("Sunday", DayOfTheWeek.SATURDAY, 2, Month.JANUARY);
    test("Saturday", DayOfTheWeek.SATURDAY, 15, Month.JANUARY);
    test("Sunday", DayOfTheWeek.SATURDAY, 16, Month.JANUARY);
    test("Friday", DayOfTheWeek.SATURDAY, 14, Month.JANUARY);
    test("Monday", DayOfTheWeek.SATURDAY, 31, Month.JANUARY);


    //February
    test("Tuesday", DayOfTheWeek.SATURDAY, 1, Month.FEBRUARY);
    test("Wednesday", DayOfTheWeek.SATURDAY, 2, Month.FEBRUARY);
    test("Tuesday", DayOfTheWeek.SATURDAY, 15, Month.FEBRUARY);
    test("Wednesday", DayOfTheWeek.SATURDAY, 16, Month.FEBRUARY);
    test("Monday", DayOfTheWeek.SATURDAY, 14, Month.FEBRUARY);
    test("Monday", DayOfTheWeek.SATURDAY, 28, Month.FEBRUARY);


    //Mars
    test("Tuesday", DayOfTheWeek.SATURDAY, 1, Month.MARS);
    test("Wednesday", DayOfTheWeek.SATURDAY, 2, Month.MARS);
    test("Tuesday", DayOfTheWeek.SATURDAY, 15, Month.MARS);
    test("Wednesday", DayOfTheWeek.SATURDAY, 16, Month.MARS);
    test("Monday", DayOfTheWeek.SATURDAY, 14, Month.MARS);
    test("Thursday", DayOfTheWeek.SATURDAY, 31, Month.MARS);


    //April
    test("Friday", DayOfTheWeek.SATURDAY, 1, Month.APRIL);
    test("Saturday", DayOfTheWeek.SATURDAY, 2, Month.APRIL);
    test("Friday", DayOfTheWeek.SATURDAY, 15, Month.APRIL);
    test("Saturday", DayOfTheWeek.SATURDAY, 16, Month.APRIL);
    test("Thursday", DayOfTheWeek.SATURDAY, 14, Month.APRIL);
    test("Saturday", DayOfTheWeek.SATURDAY, 30, Month.APRIL);


    //May
    test("Sunday", DayOfTheWeek.SATURDAY, 1, Month.MAY);
    test("Monday", DayOfTheWeek.SATURDAY, 2, Month.MAY);
    test("Sunday", DayOfTheWeek.SATURDAY, 15, Month.MAY);
    test("Monday", DayOfTheWeek.SATURDAY, 16, Month.MAY);
    test("Saturday", DayOfTheWeek.SATURDAY, 14, Month.MAY);
    test("Tuesday", DayOfTheWeek.SATURDAY, 31, Month.MAY);


    //June
    test("Wednesday", DayOfTheWeek.SATURDAY, 1, Month.JUNE);
    test("Thursday", DayOfTheWeek.SATURDAY, 2, Month.JUNE);
    test("Wednesday", DayOfTheWeek.SATURDAY, 15, Month.JUNE);
    test("Thursday", DayOfTheWeek.SATURDAY, 16, Month.JUNE);
    test("Tuesday", DayOfTheWeek.SATURDAY, 14, Month.JUNE);
    test("Thursday", DayOfTheWeek.SATURDAY, 30, Month.JUNE);


    //July
    test("Friday", DayOfTheWeek.SATURDAY, 1, Month.JULY);
    test("Saturday", DayOfTheWeek.SATURDAY, 2, Month.JULY);
    test("Friday", DayOfTheWeek.SATURDAY, 15, Month.JULY);
    test("Saturday", DayOfTheWeek.SATURDAY, 16, Month.JULY);
    test("Thursday", DayOfTheWeek.SATURDAY, 14, Month.JULY);
    test("Sunday", DayOfTheWeek.SATURDAY, 31, Month.JULY);


    //August
    test("Monday", DayOfTheWeek.SATURDAY, 1, Month.AUGUST);
    test("Tuesday", DayOfTheWeek.SATURDAY, 2, Month.AUGUST);
    test("Monday", DayOfTheWeek.SATURDAY, 15, Month.AUGUST);
    test("Tuesday", DayOfTheWeek.SATURDAY, 16, Month.AUGUST);
    test("Sunday", DayOfTheWeek.SATURDAY, 14, Month.AUGUST);
    test("Wednesday", DayOfTheWeek.SATURDAY, 31, Month.AUGUST);


    //September
    test("Thursday", DayOfTheWeek.SATURDAY, 1, Month.SEPTEMBER);
    test("Friday", DayOfTheWeek.SATURDAY, 2, Month.SEPTEMBER);
    test("Thursday", DayOfTheWeek.SATURDAY, 15, Month.SEPTEMBER);
    test("Friday", DayOfTheWeek.SATURDAY, 16, Month.SEPTEMBER);
    test("Wednesday", DayOfTheWeek.SATURDAY, 14, Month.SEPTEMBER);
    test("Friday", DayOfTheWeek.SATURDAY, 30, Month.SEPTEMBER);


    //October
    test("Saturday", DayOfTheWeek.SATURDAY, 1, Month.OCTOBER);
    test("Sunday", DayOfTheWeek.SATURDAY, 2, Month.OCTOBER);
    test("Saturday", DayOfTheWeek.SATURDAY, 15, Month.OCTOBER);
    test("Sunday", DayOfTheWeek.SATURDAY, 16, Month.OCTOBER);
    test("Friday", DayOfTheWeek.SATURDAY, 14, Month.OCTOBER);
    test("Monday", DayOfTheWeek.SATURDAY, 31, Month.OCTOBER);


    //November
    test("Tuesday", DayOfTheWeek.SATURDAY, 1, Month.NOVEMBER);
    test("Wednesday", DayOfTheWeek.SATURDAY, 2, Month.NOVEMBER);
    test("Tuesday", DayOfTheWeek.SATURDAY, 15, Month.NOVEMBER);
    test("Wednesday", DayOfTheWeek.SATURDAY, 16, Month.NOVEMBER);
    test("Monday", DayOfTheWeek.SATURDAY, 14, Month.NOVEMBER);
    test("Wednesday", DayOfTheWeek.SATURDAY, 30, Month.NOVEMBER);


    //December
    test("Thursday", DayOfTheWeek.SATURDAY, 1, Month.DECEMBER);
    test("Friday", DayOfTheWeek.SATURDAY, 2, Month.DECEMBER);
    test("Thursday", DayOfTheWeek.SATURDAY, 15, Month.DECEMBER);
    test("Friday", DayOfTheWeek.SATURDAY, 16, Month.DECEMBER);
    test("Wednesday", DayOfTheWeek.SATURDAY, 14, Month.DECEMBER);
    test("Saturday", DayOfTheWeek.SATURDAY, 31, Month.DECEMBER);

    // New Year Sunday
    //January
    test("Sunday", DayOfTheWeek.SUNDAY, 1, Month.JANUARY);
    test("Monday", DayOfTheWeek.SUNDAY, 2, Month.JANUARY);
    test("Sunday", DayOfTheWeek.SUNDAY, 15, Month.JANUARY);
    test("Monday", DayOfTheWeek.SUNDAY, 16, Month.JANUARY);
    test("Saturday", DayOfTheWeek.SUNDAY, 14, Month.JANUARY);
    test("Tuesday", DayOfTheWeek.SUNDAY, 31, Month.JANUARY);


    //February
    test("Wednesday", DayOfTheWeek.SUNDAY, 1, Month.FEBRUARY);
    test("Thursday", DayOfTheWeek.SUNDAY, 2, Month.FEBRUARY);
    test("Wednesday", DayOfTheWeek.SUNDAY, 15, Month.FEBRUARY);
    test("Thursday", DayOfTheWeek.SUNDAY, 16, Month.FEBRUARY);
    test("Tuesday", DayOfTheWeek.SUNDAY, 14, Month.FEBRUARY);
    test("Tuesday", DayOfTheWeek.SUNDAY, 28, Month.FEBRUARY);


    //Mars
    test("Wednesday", DayOfTheWeek.SUNDAY, 1, Month.MARS);
    test("Thursday", DayOfTheWeek.SUNDAY, 2, Month.MARS);
    test("Wednesday", DayOfTheWeek.SUNDAY, 15, Month.MARS);
    test("Thursday", DayOfTheWeek.SUNDAY, 16, Month.MARS);
    test("Tuesday", DayOfTheWeek.SUNDAY, 14, Month.MARS);
    test("Friday", DayOfTheWeek.SUNDAY, 31, Month.MARS);


    //April
    test("Saturday", DayOfTheWeek.SUNDAY, 1, Month.APRIL);
    test("Sunday", DayOfTheWeek.SUNDAY, 2, Month.APRIL);
    test("Saturday", DayOfTheWeek.SUNDAY, 15, Month.APRIL);
    test("Sunday", DayOfTheWeek.SUNDAY, 16, Month.APRIL);
    test("Friday", DayOfTheWeek.SUNDAY, 14, Month.APRIL);
    test("Sunday", DayOfTheWeek.SUNDAY, 30, Month.APRIL);


    //May
    test("Monday", DayOfTheWeek.SUNDAY, 1, Month.MAY);
    test("Tuesday", DayOfTheWeek.SUNDAY, 2, Month.MAY);
    test("Monday", DayOfTheWeek.SUNDAY, 15, Month.MAY);
    test("Tuesday", DayOfTheWeek.SUNDAY, 16, Month.MAY);
    test("Sunday", DayOfTheWeek.SUNDAY, 14, Month.MAY);
    test("Wednesday", DayOfTheWeek.SUNDAY, 31, Month.MAY);


    //June
    test("Thursday", DayOfTheWeek.SUNDAY, 1, Month.JUNE);
    test("Friday", DayOfTheWeek.SUNDAY, 2, Month.JUNE);
    test("Thursday", DayOfTheWeek.SUNDAY, 15, Month.JUNE);
    test("Friday", DayOfTheWeek.SUNDAY, 16, Month.JUNE);
    test("Wednesday", DayOfTheWeek.SUNDAY, 14, Month.JUNE);
    test("Friday", DayOfTheWeek.SUNDAY, 30, Month.JUNE);


    //July
    test("Saturday", DayOfTheWeek.SUNDAY, 1, Month.JULY);
    test("Sunday", DayOfTheWeek.SUNDAY, 2, Month.JULY);
    test("Saturday", DayOfTheWeek.SUNDAY, 15, Month.JULY);
    test("Sunday", DayOfTheWeek.SUNDAY, 16, Month.JULY);
    test("Friday", DayOfTheWeek.SUNDAY, 14, Month.JULY);
    test("Monday", DayOfTheWeek.SUNDAY, 31, Month.JULY);


    //August
    test("Tuesday", DayOfTheWeek.SUNDAY, 1, Month.AUGUST);
    test("Wednesday", DayOfTheWeek.SUNDAY, 2, Month.AUGUST);
    test("Tuesday", DayOfTheWeek.SUNDAY, 15, Month.AUGUST);
    test("Wednesday", DayOfTheWeek.SUNDAY, 16, Month.AUGUST);
    test("Monday", DayOfTheWeek.SUNDAY, 14, Month.AUGUST);
    test("Thursday", DayOfTheWeek.SUNDAY, 31, Month.AUGUST);


    //September
    test("Friday", DayOfTheWeek.SUNDAY, 1, Month.SEPTEMBER);
    test("Saturday", DayOfTheWeek.SUNDAY, 2, Month.SEPTEMBER);
    test("Friday", DayOfTheWeek.SUNDAY, 15, Month.SEPTEMBER);
    test("Saturday", DayOfTheWeek.SUNDAY, 16, Month.SEPTEMBER);
    test("Thursday", DayOfTheWeek.SUNDAY, 14, Month.SEPTEMBER);
    test("Saturday", DayOfTheWeek.SUNDAY, 30, Month.SEPTEMBER);


    //October
    test("Sunday", DayOfTheWeek.SUNDAY, 1, Month.OCTOBER);
    test("Monday", DayOfTheWeek.SUNDAY, 2, Month.OCTOBER);
    test("Sunday", DayOfTheWeek.SUNDAY, 15, Month.OCTOBER);
    test("Monday", DayOfTheWeek.SUNDAY, 16, Month.OCTOBER);
    test("Saturday", DayOfTheWeek.SUNDAY, 14, Month.OCTOBER);
    test("Tuesday", DayOfTheWeek.SUNDAY, 31, Month.OCTOBER);


    //November
    test("Wednesday", DayOfTheWeek.SUNDAY, 1, Month.NOVEMBER);
    test("Thursday", DayOfTheWeek.SUNDAY, 2, Month.NOVEMBER);
    test("Wednesday", DayOfTheWeek.SUNDAY, 15, Month.NOVEMBER);
    test("Thursday", DayOfTheWeek.SUNDAY, 16, Month.NOVEMBER);
    test("Tuesday", DayOfTheWeek.SUNDAY, 14, Month.NOVEMBER);
    test("Thursday", DayOfTheWeek.SUNDAY, 30, Month.NOVEMBER);


    //December
    test("Friday", DayOfTheWeek.SUNDAY, 1, Month.DECEMBER);
    test("Saturday", DayOfTheWeek.SUNDAY, 2, Month.DECEMBER);
    test("Friday", DayOfTheWeek.SUNDAY, 15, Month.DECEMBER);
    test("Saturday", DayOfTheWeek.SUNDAY, 16, Month.DECEMBER);
    test("Thursday", DayOfTheWeek.SUNDAY, 14, Month.DECEMBER);
    test("Sunday", DayOfTheWeek.SUNDAY, 31, Month.DECEMBER);


    //Random
    //New Year Tuesday
    //June
    test("Saturday", DayOfTheWeek.TUESDAY, 1, Month.JUNE);
    test("Monday", DayOfTheWeek.TUESDAY, 24, Month.JUNE);
    test("Tuesday", DayOfTheWeek.TUESDAY, 25, Month.JUNE);
    test("Wednesday", DayOfTheWeek.TUESDAY, 26, Month.JUNE);
    test("Thursday", DayOfTheWeek.TUESDAY, 27, Month.JUNE);
    test("Friday", DayOfTheWeek.TUESDAY, 28, Month.JUNE);
    test("Saturday", DayOfTheWeek.TUESDAY, 29, Month.JUNE);
    test("Sunday", DayOfTheWeek.TUESDAY, 30, Month.JUNE);

    //New Year Monday
    test("Monday", DayOfTheWeek.MONDAY, 5, Month.FEBRUARY);
    test("Tuesday", DayOfTheWeek.MONDAY, 6, Month.FEBRUARY);
    test("Wednesday", DayOfTheWeek.MONDAY, 7, Month.FEBRUARY);
    test("Thursday", DayOfTheWeek.MONDAY, 8, Month.FEBRUARY);
    test("Friday", DayOfTheWeek.MONDAY, 9, Month.FEBRUARY);
    test("Saturday", DayOfTheWeek.MONDAY, 10, Month.FEBRUARY);
    test("Sunday", DayOfTheWeek.MONDAY, 11, Month.FEBRUARY);

    //New Year Wednesday
    test("Monday", DayOfTheWeek.WEDNESDAY, 10, Month.NOVEMBER);
    test("Tuesday", DayOfTheWeek.WEDNESDAY, 11, Month.NOVEMBER);
    test("Thursday", DayOfTheWeek.WEDNESDAY, 13, Month.NOVEMBER);
    test("Friday", DayOfTheWeek.WEDNESDAY, 14, Month.NOVEMBER);
    test("Wednesday", DayOfTheWeek.WEDNESDAY, 12, Month.NOVEMBER);
    test("Sunday", DayOfTheWeek.WEDNESDAY, 16, Month.NOVEMBER);
    test("Saturday", DayOfTheWeek.WEDNESDAY, 15, Month.NOVEMBER);

    //New Year Thursday
    test("Monday", DayOfTheWeek.THURSDAY, 13, Month.JULY);
    test("Tuesday", DayOfTheWeek.THURSDAY, 21, Month.JULY);
    test("Wednesday", DayOfTheWeek.THURSDAY, 8, Month.JULY);
    test("Thursday", DayOfTheWeek.THURSDAY, 30, Month.JULY);
    test("Friday", DayOfTheWeek.THURSDAY, 3, Month.JULY);
    test("Saturday", DayOfTheWeek.THURSDAY, 11, Month.JULY);
    test("Sunday", DayOfTheWeek.THURSDAY, 26, Month.JULY);

    //New Year Friday
    test("Monday", DayOfTheWeek.FRIDAY, 6, Month.DECEMBER);
    test("Tuesday", DayOfTheWeek.FRIDAY, 5, Month.OCTOBER);
    test("Wednesday", DayOfTheWeek.FRIDAY, 15, Month.SEPTEMBER);
    test("Thursday", DayOfTheWeek.FRIDAY, 29, Month.JULY);
    test("Friday", DayOfTheWeek.FRIDAY, 18, Month.JUNE);
    test("Saturday", DayOfTheWeek.FRIDAY, 17, Month.APRIL);
    test("Sunday", DayOfTheWeek.FRIDAY, 28, Month.MARS);

    //New Year Saturday
    test("Monday", DayOfTheWeek.SATURDAY, 5, Month.SEPTEMBER);
    test("Tuesday", DayOfTheWeek.SATURDAY, 2, Month.AUGUST);
    test("Wednesday", DayOfTheWeek.SATURDAY, 15, Month.JUNE);
    test("Thursday", DayOfTheWeek.SATURDAY, 12, Month.MAY);
    test("Friday", DayOfTheWeek.SATURDAY, 8, Month.APRIL);
    test("Saturday", DayOfTheWeek.SATURDAY, 1, Month.JANUARY);
    test("Sunday", DayOfTheWeek.SATURDAY, 27, Month.FEBRUARY);

    //New Year Sunday
    test("Monday", DayOfTheWeek.SUNDAY, 6, Month.NOVEMBER);
    test("Tuesday", DayOfTheWeek.SUNDAY, 3, Month.OCTOBER);
    test("Wednesday", DayOfTheWeek.SUNDAY, 13, Month.SEPTEMBER);
    test("Thursday", DayOfTheWeek.SUNDAY, 13, Month.APRIL);
    test("Friday", DayOfTheWeek.SUNDAY, 26, Month.MAY);
    test("Saturday", DayOfTheWeek.SUNDAY, 18, Month.MARS);
    test("Sunday", DayOfTheWeek.SUNDAY, 29, Month.JANUARY);
  }

  /**
   * Overstep of every not valid special month case in every possible and month
   */
  @Test
  void incorrectDateThrowException() {
    //First Year
    //1 month
    testThrow(DayOfTheWeek.MONDAY, 32, Month.JANUARY);
    testThrow(DayOfTheWeek.MONDAY, 33, Month.JANUARY);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE, Month.JANUARY);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE - 1, Month.JANUARY);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE / 2, Month.JANUARY);
    testThrow(DayOfTheWeek.MONDAY, (MAX_VALUE / 2) + 1, Month.JANUARY);
    testThrow(DayOfTheWeek.MONDAY, (MAX_VALUE / 2) - 1, Month.JANUARY);

    //2 month
    testThrow(DayOfTheWeek.MONDAY, 29, Month.FEBRUARY);
    testThrow(DayOfTheWeek.MONDAY, 30, Month.FEBRUARY);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE, Month.FEBRUARY);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE - 1, Month.FEBRUARY);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE / 2, Month.FEBRUARY);
    testThrow(DayOfTheWeek.MONDAY, (MAX_VALUE / 2) + 1, Month.FEBRUARY);
    testThrow(DayOfTheWeek.MONDAY, (MAX_VALUE / 2) - 1, Month.FEBRUARY);

    //3 month
    testThrow(DayOfTheWeek.MONDAY, 32, Month.MARS);
    testThrow(DayOfTheWeek.MONDAY, 33, Month.MARS);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE, Month.MARS);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE - 1, Month.MARS);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE / 2, Month.MARS);
    testThrow(DayOfTheWeek.MONDAY, (MAX_VALUE / 2) + 1, Month.MARS);
    testThrow(DayOfTheWeek.MONDAY, (MAX_VALUE / 2) - 1, Month.MARS);

    //4 month
    testThrow(DayOfTheWeek.MONDAY, 31, Month.APRIL);
    testThrow(DayOfTheWeek.MONDAY, 32, Month.APRIL);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE, Month.APRIL);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE - 1, Month.APRIL);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE / 2, Month.APRIL);
    testThrow(DayOfTheWeek.MONDAY, (MAX_VALUE / 2) + 1, Month.APRIL);
    testThrow(DayOfTheWeek.MONDAY, (MAX_VALUE / 2) - 1, Month.APRIL);

    //5 month
    testThrow(DayOfTheWeek.MONDAY, 32, Month.MAY);
    testThrow(DayOfTheWeek.MONDAY, 33, Month.MAY);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE, Month.MAY);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE - 1, Month.MAY);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE / 2, Month.MAY);
    testThrow(DayOfTheWeek.MONDAY, (MAX_VALUE / 2) + 1, Month.MAY);
    testThrow(DayOfTheWeek.MONDAY, (MAX_VALUE / 2) - 1, Month.MAY);

    //6 month
    testThrow(DayOfTheWeek.MONDAY, 31, Month.JUNE);
    testThrow(DayOfTheWeek.MONDAY, 32, Month.JUNE);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE, Month.JUNE);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE - 1, Month.JUNE);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE / 2, Month.JUNE);
    testThrow(DayOfTheWeek.MONDAY, (MAX_VALUE / 2) + 1, Month.JUNE);
    testThrow(DayOfTheWeek.MONDAY, (MAX_VALUE / 2) - 1, Month.JUNE);

    //7 month
    testThrow(DayOfTheWeek.MONDAY, 32, Month.JULY);
    testThrow(DayOfTheWeek.MONDAY, 33, Month.JULY);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE, Month.JULY);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE - 1, Month.JULY);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE / 2, Month.JULY);
    testThrow(DayOfTheWeek.MONDAY, (MAX_VALUE / 2) + 1, Month.JULY);
    testThrow(DayOfTheWeek.MONDAY, (MAX_VALUE / 2) - 1, Month.JULY);

    //8 month
    testThrow(DayOfTheWeek.MONDAY, 32, Month.AUGUST);
    testThrow(DayOfTheWeek.MONDAY, 33, Month.AUGUST);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE, Month.AUGUST);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE - 1, Month.AUGUST);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE / 2, Month.AUGUST);
    testThrow(DayOfTheWeek.MONDAY, (MAX_VALUE / 2) + 1, Month.AUGUST);
    testThrow(DayOfTheWeek.MONDAY, (MAX_VALUE / 2) - 1, Month.AUGUST);

    //9 month
    testThrow(DayOfTheWeek.MONDAY, 31, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.MONDAY, 32, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE - 1, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE / 2, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.MONDAY, (MAX_VALUE / 2) + 1, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.MONDAY, (MAX_VALUE / 2) - 1, Month.SEPTEMBER);

    //10 month
    testThrow(DayOfTheWeek.MONDAY, 32, Month.OCTOBER);
    testThrow(DayOfTheWeek.MONDAY, 33, Month.OCTOBER);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE, Month.OCTOBER);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE - 1, Month.OCTOBER);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE / 2, Month.OCTOBER);
    testThrow(DayOfTheWeek.MONDAY, (MAX_VALUE / 2) + 1, Month.OCTOBER);
    testThrow(DayOfTheWeek.MONDAY, (MAX_VALUE / 2) - 1, Month.OCTOBER);

    //11 month
    testThrow(DayOfTheWeek.MONDAY, 31, Month.NOVEMBER);
    testThrow(DayOfTheWeek.MONDAY, 32, Month.NOVEMBER);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE, Month.NOVEMBER);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE - 1, Month.NOVEMBER);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE / 2, Month.NOVEMBER);
    testThrow(DayOfTheWeek.MONDAY, (MAX_VALUE / 2) + 1, Month.NOVEMBER);
    testThrow(DayOfTheWeek.MONDAY, (MAX_VALUE / 2) - 1, Month.NOVEMBER);

    //12 month
    testThrow(DayOfTheWeek.MONDAY, 32, Month.DECEMBER);
    testThrow(DayOfTheWeek.MONDAY, 33, Month.DECEMBER);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE, Month.DECEMBER);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE - 1, Month.DECEMBER);
    testThrow(DayOfTheWeek.MONDAY, MAX_VALUE / 2, Month.DECEMBER);
    testThrow(DayOfTheWeek.MONDAY, (MAX_VALUE / 2) + 1, Month.DECEMBER);
    testThrow(DayOfTheWeek.MONDAY, (MAX_VALUE / 2) - 1, Month.DECEMBER);

    //Second Year
    //1 month
    testThrow(DayOfTheWeek.TUESDAY, 32, Month.JANUARY);
    testThrow(DayOfTheWeek.TUESDAY, 33, Month.JANUARY);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE, Month.JANUARY);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE - 1, Month.JANUARY);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE / 2, Month.JANUARY);
    testThrow(DayOfTheWeek.TUESDAY, (MAX_VALUE / 2) + 1, Month.JANUARY);
    testThrow(DayOfTheWeek.TUESDAY, (MAX_VALUE / 2) - 1, Month.JANUARY);

    //2 month
    testThrow(DayOfTheWeek.TUESDAY, 29, Month.FEBRUARY);
    testThrow(DayOfTheWeek.TUESDAY, 30, Month.FEBRUARY);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE, Month.FEBRUARY);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE - 1, Month.FEBRUARY);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE / 2, Month.FEBRUARY);
    testThrow(DayOfTheWeek.TUESDAY, (MAX_VALUE / 2) + 1, Month.FEBRUARY);
    testThrow(DayOfTheWeek.TUESDAY, (MAX_VALUE / 2) - 1, Month.FEBRUARY);

    //3 month
    testThrow(DayOfTheWeek.TUESDAY, 32, Month.MARS);
    testThrow(DayOfTheWeek.TUESDAY, 33, Month.MARS);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE, Month.MARS);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE - 1, Month.MARS);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE / 2, Month.MARS);
    testThrow(DayOfTheWeek.TUESDAY, (MAX_VALUE / 2) + 1, Month.MARS);
    testThrow(DayOfTheWeek.TUESDAY, (MAX_VALUE / 2) - 1, Month.MARS);

    //4 month
    testThrow(DayOfTheWeek.TUESDAY, 31, Month.APRIL);
    testThrow(DayOfTheWeek.TUESDAY, 32, Month.APRIL);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE, Month.APRIL);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE - 1, Month.APRIL);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE / 2, Month.APRIL);
    testThrow(DayOfTheWeek.TUESDAY, (MAX_VALUE / 2) + 1, Month.APRIL);
    testThrow(DayOfTheWeek.TUESDAY, (MAX_VALUE / 2) - 1, Month.APRIL);

    //5 month
    testThrow(DayOfTheWeek.TUESDAY, 32, Month.MAY);
    testThrow(DayOfTheWeek.TUESDAY, 33, Month.MAY);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE, Month.MAY);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE - 1, Month.MAY);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE / 2, Month.MAY);
    testThrow(DayOfTheWeek.TUESDAY, (MAX_VALUE / 2) + 1, Month.MAY);
    testThrow(DayOfTheWeek.TUESDAY, (MAX_VALUE / 2) - 1, Month.MAY);

    //6 month
    testThrow(DayOfTheWeek.TUESDAY, 31, Month.JUNE);
    testThrow(DayOfTheWeek.TUESDAY, 32, Month.JUNE);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE, Month.JUNE);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE - 1, Month.JUNE);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE / 2, Month.JUNE);
    testThrow(DayOfTheWeek.TUESDAY, (MAX_VALUE / 2) + 1, Month.JUNE);
    testThrow(DayOfTheWeek.TUESDAY, (MAX_VALUE / 2) - 1, Month.JUNE);

    //7 month
    testThrow(DayOfTheWeek.TUESDAY, 32, Month.JULY);
    testThrow(DayOfTheWeek.TUESDAY, 33, Month.JULY);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE, Month.JULY);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE - 1, Month.JULY);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE / 2, Month.JULY);
    testThrow(DayOfTheWeek.TUESDAY, (MAX_VALUE / 2) + 1, Month.JULY);
    testThrow(DayOfTheWeek.TUESDAY, (MAX_VALUE / 2) - 1, Month.JULY);

    //8 month
    testThrow(DayOfTheWeek.TUESDAY, 32, Month.AUGUST);
    testThrow(DayOfTheWeek.TUESDAY, 33, Month.AUGUST);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE, Month.AUGUST);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE - 1, Month.AUGUST);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE / 2, Month.AUGUST);
    testThrow(DayOfTheWeek.TUESDAY, (MAX_VALUE / 2) + 1, Month.AUGUST);
    testThrow(DayOfTheWeek.TUESDAY, (MAX_VALUE / 2) - 1, Month.AUGUST);

    //9 month
    testThrow(DayOfTheWeek.TUESDAY, 31, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.TUESDAY, 32, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE - 1, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE / 2, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.TUESDAY, (MAX_VALUE / 2) + 1, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.TUESDAY, (MAX_VALUE / 2) - 1, Month.SEPTEMBER);

    //10 month
    testThrow(DayOfTheWeek.TUESDAY, 32, Month.OCTOBER);
    testThrow(DayOfTheWeek.TUESDAY, 33, Month.OCTOBER);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE, Month.OCTOBER);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE - 1, Month.OCTOBER);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE / 2, Month.OCTOBER);
    testThrow(DayOfTheWeek.TUESDAY, (MAX_VALUE / 2) + 1, Month.OCTOBER);
    testThrow(DayOfTheWeek.TUESDAY, (MAX_VALUE / 2) - 1, Month.OCTOBER);

    //11 month
    testThrow(DayOfTheWeek.TUESDAY, 31, Month.NOVEMBER);
    testThrow(DayOfTheWeek.TUESDAY, 32, Month.NOVEMBER);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE, Month.NOVEMBER);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE - 1, Month.NOVEMBER);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE / 2, Month.NOVEMBER);
    testThrow(DayOfTheWeek.TUESDAY, (MAX_VALUE / 2) + 1, Month.NOVEMBER);
    testThrow(DayOfTheWeek.TUESDAY, (MAX_VALUE / 2) - 1, Month.NOVEMBER);

    //12 month
    testThrow(DayOfTheWeek.TUESDAY, 32, Month.DECEMBER);
    testThrow(DayOfTheWeek.TUESDAY, 33, Month.DECEMBER);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE, Month.DECEMBER);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE - 1, Month.DECEMBER);
    testThrow(DayOfTheWeek.TUESDAY, MAX_VALUE / 2, Month.DECEMBER);
    testThrow(DayOfTheWeek.TUESDAY, (MAX_VALUE / 2) + 1, Month.DECEMBER);
    testThrow(DayOfTheWeek.TUESDAY, (MAX_VALUE / 2) - 1, Month.DECEMBER);


    //Third year
    //1 month
    testThrow(DayOfTheWeek.WEDNESDAY, 32, Month.JANUARY);
    testThrow(DayOfTheWeek.WEDNESDAY, 33, Month.JANUARY);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE, Month.JANUARY);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE - 1, Month.JANUARY);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE / 2, Month.JANUARY);
    testThrow(DayOfTheWeek.WEDNESDAY, (MAX_VALUE / 2) + 1, Month.JANUARY);
    testThrow(DayOfTheWeek.WEDNESDAY, (MAX_VALUE / 2) - 1, Month.JANUARY);

    //2 month
    testThrow(DayOfTheWeek.WEDNESDAY, 29, Month.FEBRUARY);
    testThrow(DayOfTheWeek.WEDNESDAY, 30, Month.FEBRUARY);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE, Month.FEBRUARY);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE - 1, Month.FEBRUARY);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE / 2, Month.FEBRUARY);
    testThrow(DayOfTheWeek.WEDNESDAY, (MAX_VALUE / 2) + 1, Month.FEBRUARY);
    testThrow(DayOfTheWeek.WEDNESDAY, (MAX_VALUE / 2) - 1, Month.FEBRUARY);

    //3 month
    testThrow(DayOfTheWeek.WEDNESDAY, 32, Month.MARS);
    testThrow(DayOfTheWeek.WEDNESDAY, 33, Month.MARS);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE, Month.MARS);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE - 1, Month.MARS);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE / 2, Month.MARS);
    testThrow(DayOfTheWeek.WEDNESDAY, (MAX_VALUE / 2) + 1, Month.MARS);
    testThrow(DayOfTheWeek.WEDNESDAY, (MAX_VALUE / 2) - 1, Month.MARS);

    //4 month
    testThrow(DayOfTheWeek.WEDNESDAY, 31, Month.APRIL);
    testThrow(DayOfTheWeek.WEDNESDAY, 32, Month.APRIL);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE, Month.APRIL);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE - 1, Month.APRIL);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE / 2, Month.APRIL);
    testThrow(DayOfTheWeek.WEDNESDAY, (MAX_VALUE / 2) + 1, Month.APRIL);
    testThrow(DayOfTheWeek.WEDNESDAY, (MAX_VALUE / 2) - 1, Month.APRIL);

    //5 month
    testThrow(DayOfTheWeek.WEDNESDAY, 32, Month.MAY);
    testThrow(DayOfTheWeek.WEDNESDAY, 33, Month.MAY);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE, Month.MAY);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE - 1, Month.MAY);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE / 2, Month.MAY);
    testThrow(DayOfTheWeek.WEDNESDAY, (MAX_VALUE / 2) + 1, Month.MAY);
    testThrow(DayOfTheWeek.WEDNESDAY, (MAX_VALUE / 2) - 1, Month.MAY);

    //6 month
    testThrow(DayOfTheWeek.WEDNESDAY, 31, Month.JUNE);
    testThrow(DayOfTheWeek.WEDNESDAY, 32, Month.JUNE);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE, Month.JUNE);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE - 1, Month.JUNE);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE / 2, Month.JUNE);
    testThrow(DayOfTheWeek.WEDNESDAY, (MAX_VALUE / 2) + 1, Month.JUNE);
    testThrow(DayOfTheWeek.WEDNESDAY, (MAX_VALUE / 2) - 1, Month.JUNE);

    //7 month
    testThrow(DayOfTheWeek.WEDNESDAY, 32, Month.JULY);
    testThrow(DayOfTheWeek.WEDNESDAY, 33, Month.JULY);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE, Month.JULY);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE - 1, Month.JULY);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE / 2, Month.JULY);
    testThrow(DayOfTheWeek.WEDNESDAY, (MAX_VALUE / 2) + 1, Month.JULY);
    testThrow(DayOfTheWeek.WEDNESDAY, (MAX_VALUE / 2) - 1, Month.JULY);

    //8 month
    testThrow(DayOfTheWeek.WEDNESDAY, 32, Month.AUGUST);
    testThrow(DayOfTheWeek.WEDNESDAY, 33, Month.AUGUST);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE, Month.AUGUST);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE - 1, Month.AUGUST);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE / 2, Month.AUGUST);
    testThrow(DayOfTheWeek.WEDNESDAY, (MAX_VALUE / 2) + 1, Month.AUGUST);
    testThrow(DayOfTheWeek.WEDNESDAY, (MAX_VALUE / 2) - 1, Month.AUGUST);

    //9 month
    testThrow(DayOfTheWeek.WEDNESDAY, 31, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.WEDNESDAY, 32, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE - 1, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE / 2, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.WEDNESDAY, (MAX_VALUE / 2) + 1, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.WEDNESDAY, (MAX_VALUE / 2) - 1, Month.SEPTEMBER);

    //10 month
    testThrow(DayOfTheWeek.WEDNESDAY, 32, Month.OCTOBER);
    testThrow(DayOfTheWeek.WEDNESDAY, 33, Month.OCTOBER);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE, Month.OCTOBER);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE - 1, Month.OCTOBER);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE / 2, Month.OCTOBER);
    testThrow(DayOfTheWeek.WEDNESDAY, (MAX_VALUE / 2) + 1, Month.OCTOBER);
    testThrow(DayOfTheWeek.WEDNESDAY, (MAX_VALUE / 2) - 1, Month.OCTOBER);

    //11 month
    testThrow(DayOfTheWeek.WEDNESDAY, 31, Month.NOVEMBER);
    testThrow(DayOfTheWeek.WEDNESDAY, 32, Month.NOVEMBER);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE, Month.NOVEMBER);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE - 1, Month.NOVEMBER);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE / 2, Month.NOVEMBER);
    testThrow(DayOfTheWeek.WEDNESDAY, (MAX_VALUE / 2) + 1, Month.NOVEMBER);
    testThrow(DayOfTheWeek.WEDNESDAY, (MAX_VALUE / 2) - 1, Month.NOVEMBER);

    //12 month
    testThrow(DayOfTheWeek.WEDNESDAY, 32, Month.DECEMBER);
    testThrow(DayOfTheWeek.WEDNESDAY, 33, Month.DECEMBER);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE, Month.DECEMBER);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE - 1, Month.DECEMBER);
    testThrow(DayOfTheWeek.WEDNESDAY, MAX_VALUE / 2, Month.DECEMBER);
    testThrow(DayOfTheWeek.WEDNESDAY, (MAX_VALUE / 2) + 1, Month.DECEMBER);
    testThrow(DayOfTheWeek.WEDNESDAY, (MAX_VALUE / 2) - 1, Month.DECEMBER);

    //4st year
    //1 month
    testThrow(DayOfTheWeek.THURSDAY, 32, Month.JANUARY);
    testThrow(DayOfTheWeek.THURSDAY, 33, Month.JANUARY);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE, Month.JANUARY);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE - 1, Month.JANUARY);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE / 2, Month.JANUARY);
    testThrow(DayOfTheWeek.THURSDAY, (MAX_VALUE / 2) + 1, Month.JANUARY);
    testThrow(DayOfTheWeek.THURSDAY, (MAX_VALUE / 2) - 1, Month.JANUARY);

    //2 month
    testThrow(DayOfTheWeek.THURSDAY, 29, Month.FEBRUARY);
    testThrow(DayOfTheWeek.THURSDAY, 30, Month.FEBRUARY);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE, Month.FEBRUARY);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE - 1, Month.FEBRUARY);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE / 2, Month.FEBRUARY);
    testThrow(DayOfTheWeek.THURSDAY, (MAX_VALUE / 2) + 1, Month.FEBRUARY);
    testThrow(DayOfTheWeek.THURSDAY, (MAX_VALUE / 2) - 1, Month.FEBRUARY);

    //3 month
    testThrow(DayOfTheWeek.THURSDAY, 32, Month.MARS);
    testThrow(DayOfTheWeek.THURSDAY, 33, Month.MARS);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE, Month.MARS);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE - 1, Month.MARS);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE / 2, Month.MARS);
    testThrow(DayOfTheWeek.THURSDAY, (MAX_VALUE / 2) + 1, Month.MARS);
    testThrow(DayOfTheWeek.THURSDAY, (MAX_VALUE / 2) - 1, Month.MARS);

    //4 month
    testThrow(DayOfTheWeek.THURSDAY, 31, Month.APRIL);
    testThrow(DayOfTheWeek.THURSDAY, 32, Month.APRIL);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE, Month.APRIL);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE - 1, Month.APRIL);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE / 2, Month.APRIL);
    testThrow(DayOfTheWeek.THURSDAY, (MAX_VALUE / 2) + 1, Month.APRIL);
    testThrow(DayOfTheWeek.THURSDAY, (MAX_VALUE / 2) - 1, Month.APRIL);

    //5 month
    testThrow(DayOfTheWeek.THURSDAY, 32, Month.MAY);
    testThrow(DayOfTheWeek.THURSDAY, 33, Month.MAY);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE, Month.MAY);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE - 1, Month.MAY);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE / 2, Month.MAY);
    testThrow(DayOfTheWeek.THURSDAY, (MAX_VALUE / 2) + 1, Month.MAY);
    testThrow(DayOfTheWeek.THURSDAY, (MAX_VALUE / 2) - 1, Month.MAY);

    //6 month
    testThrow(DayOfTheWeek.THURSDAY, 31, Month.JUNE);
    testThrow(DayOfTheWeek.THURSDAY, 32, Month.JUNE);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE, Month.JUNE);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE - 1, Month.JUNE);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE / 2, Month.JUNE);
    testThrow(DayOfTheWeek.THURSDAY, (MAX_VALUE / 2) + 1, Month.JUNE);
    testThrow(DayOfTheWeek.THURSDAY, (MAX_VALUE / 2) - 1, Month.JUNE);

    //7 month
    testThrow(DayOfTheWeek.THURSDAY, 32, Month.JULY);
    testThrow(DayOfTheWeek.THURSDAY, 33, Month.JULY);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE, Month.JULY);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE - 1, Month.JULY);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE / 2, Month.JULY);
    testThrow(DayOfTheWeek.THURSDAY, (MAX_VALUE / 2) + 1, Month.JULY);
    testThrow(DayOfTheWeek.THURSDAY, (MAX_VALUE / 2) - 1, Month.JULY);

    //8 month
    testThrow(DayOfTheWeek.THURSDAY, 32, Month.AUGUST);
    testThrow(DayOfTheWeek.THURSDAY, 33, Month.AUGUST);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE, Month.AUGUST);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE - 1, Month.AUGUST);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE / 2, Month.AUGUST);
    testThrow(DayOfTheWeek.THURSDAY, (MAX_VALUE / 2) + 1, Month.AUGUST);
    testThrow(DayOfTheWeek.THURSDAY, (MAX_VALUE / 2) - 1, Month.AUGUST);

    //9 month
    testThrow(DayOfTheWeek.THURSDAY, 31, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.THURSDAY, 32, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE - 1, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE / 2, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.THURSDAY, (MAX_VALUE / 2) + 1, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.THURSDAY, (MAX_VALUE / 2) - 1, Month.SEPTEMBER);

    //10 month
    testThrow(DayOfTheWeek.THURSDAY, 32, Month.OCTOBER);
    testThrow(DayOfTheWeek.THURSDAY, 33, Month.OCTOBER);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE, Month.OCTOBER);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE - 1, Month.OCTOBER);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE / 2, Month.OCTOBER);
    testThrow(DayOfTheWeek.THURSDAY, (MAX_VALUE / 2) + 1, Month.OCTOBER);
    testThrow(DayOfTheWeek.THURSDAY, (MAX_VALUE / 2) - 1, Month.OCTOBER);

    //11 month
    testThrow(DayOfTheWeek.THURSDAY, 31, Month.NOVEMBER);
    testThrow(DayOfTheWeek.THURSDAY, 32, Month.NOVEMBER);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE, Month.NOVEMBER);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE - 1, Month.NOVEMBER);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE / 2, Month.NOVEMBER);
    testThrow(DayOfTheWeek.THURSDAY, (MAX_VALUE / 2) + 1, Month.NOVEMBER);
    testThrow(DayOfTheWeek.THURSDAY, (MAX_VALUE / 2) - 1, Month.NOVEMBER);

    //12 month
    testThrow(DayOfTheWeek.THURSDAY, 32, Month.DECEMBER);
    testThrow(DayOfTheWeek.THURSDAY, 33, Month.DECEMBER);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE, Month.DECEMBER);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE - 1, Month.DECEMBER);
    testThrow(DayOfTheWeek.THURSDAY, MAX_VALUE / 2, Month.DECEMBER);
    testThrow(DayOfTheWeek.THURSDAY, (MAX_VALUE / 2) + 1, Month.DECEMBER);
    testThrow(DayOfTheWeek.THURSDAY, (MAX_VALUE / 2) - 1, Month.DECEMBER);


    //5st year
    //1 month
    testThrow(DayOfTheWeek.FRIDAY, 32, Month.JANUARY);
    testThrow(DayOfTheWeek.FRIDAY, 33, Month.JANUARY);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE, Month.JANUARY);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE - 1, Month.JANUARY);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE / 2, Month.JANUARY);
    testThrow(DayOfTheWeek.FRIDAY, (MAX_VALUE / 2) + 1, Month.JANUARY);
    testThrow(DayOfTheWeek.FRIDAY, (MAX_VALUE / 2) - 1, Month.JANUARY);

    //2 month
    testThrow(DayOfTheWeek.FRIDAY, 29, Month.FEBRUARY);
    testThrow(DayOfTheWeek.FRIDAY, 30, Month.FEBRUARY);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE, Month.FEBRUARY);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE - 1, Month.FEBRUARY);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE / 2, Month.FEBRUARY);
    testThrow(DayOfTheWeek.FRIDAY, (MAX_VALUE / 2) + 1, Month.FEBRUARY);
    testThrow(DayOfTheWeek.FRIDAY, (MAX_VALUE / 2) - 1, Month.FEBRUARY);

    //3 month
    testThrow(DayOfTheWeek.FRIDAY, 32, Month.MARS);
    testThrow(DayOfTheWeek.FRIDAY, 33, Month.MARS);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE, Month.MARS);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE - 1, Month.MARS);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE / 2, Month.MARS);
    testThrow(DayOfTheWeek.FRIDAY, (MAX_VALUE / 2) + 1, Month.MARS);
    testThrow(DayOfTheWeek.FRIDAY, (MAX_VALUE / 2) - 1, Month.MARS);

    //4 month
    testThrow(DayOfTheWeek.FRIDAY, 31, Month.APRIL);
    testThrow(DayOfTheWeek.FRIDAY, 32, Month.APRIL);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE, Month.APRIL);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE - 1, Month.APRIL);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE / 2, Month.APRIL);
    testThrow(DayOfTheWeek.FRIDAY, (MAX_VALUE / 2) + 1, Month.APRIL);
    testThrow(DayOfTheWeek.FRIDAY, (MAX_VALUE / 2) - 1, Month.APRIL);

    //5 month
    testThrow(DayOfTheWeek.FRIDAY, 32, Month.MAY);
    testThrow(DayOfTheWeek.FRIDAY, 33, Month.MAY);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE, Month.MAY);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE - 1, Month.MAY);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE / 2, Month.MAY);
    testThrow(DayOfTheWeek.FRIDAY, (MAX_VALUE / 2) + 1, Month.MAY);
    testThrow(DayOfTheWeek.FRIDAY, (MAX_VALUE / 2) - 1, Month.MAY);

    //6 month
    testThrow(DayOfTheWeek.FRIDAY, 31, Month.JUNE);
    testThrow(DayOfTheWeek.FRIDAY, 32, Month.JUNE);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE, Month.JUNE);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE - 1, Month.JUNE);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE / 2, Month.JUNE);
    testThrow(DayOfTheWeek.FRIDAY, (MAX_VALUE / 2) + 1, Month.JUNE);
    testThrow(DayOfTheWeek.FRIDAY, (MAX_VALUE / 2) - 1, Month.JUNE);

    //7 month
    testThrow(DayOfTheWeek.FRIDAY, 32, Month.JULY);
    testThrow(DayOfTheWeek.FRIDAY, 33, Month.JULY);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE, Month.JULY);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE - 1, Month.JULY);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE / 2, Month.JULY);
    testThrow(DayOfTheWeek.FRIDAY, (MAX_VALUE / 2) + 1, Month.JULY);
    testThrow(DayOfTheWeek.FRIDAY, (MAX_VALUE / 2) - 1, Month.JULY);

    //8 month
    testThrow(DayOfTheWeek.FRIDAY, 32, Month.AUGUST);
    testThrow(DayOfTheWeek.FRIDAY, 33, Month.AUGUST);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE, Month.AUGUST);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE - 1, Month.AUGUST);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE / 2, Month.AUGUST);
    testThrow(DayOfTheWeek.FRIDAY, (MAX_VALUE / 2) + 1, Month.AUGUST);
    testThrow(DayOfTheWeek.FRIDAY, (MAX_VALUE / 2) - 1, Month.AUGUST);

    //9 month
    testThrow(DayOfTheWeek.FRIDAY, 31, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.FRIDAY, 32, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE - 1, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE / 2, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.FRIDAY, (MAX_VALUE / 2) + 1, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.FRIDAY, (MAX_VALUE / 2) - 1, Month.SEPTEMBER);

    //10 month
    testThrow(DayOfTheWeek.FRIDAY, 32, Month.OCTOBER);
    testThrow(DayOfTheWeek.FRIDAY, 33, Month.OCTOBER);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE, Month.OCTOBER);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE - 1, Month.OCTOBER);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE / 2, Month.OCTOBER);
    testThrow(DayOfTheWeek.FRIDAY, (MAX_VALUE / 2) + 1, Month.OCTOBER);
    testThrow(DayOfTheWeek.FRIDAY, (MAX_VALUE / 2) - 1, Month.OCTOBER);

    //11 month
    testThrow(DayOfTheWeek.FRIDAY, 31, Month.NOVEMBER);
    testThrow(DayOfTheWeek.FRIDAY, 32, Month.NOVEMBER);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE, Month.NOVEMBER);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE - 1, Month.NOVEMBER);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE / 2, Month.NOVEMBER);
    testThrow(DayOfTheWeek.FRIDAY, (MAX_VALUE / 2) + 1, Month.NOVEMBER);
    testThrow(DayOfTheWeek.FRIDAY, (MAX_VALUE / 2) - 1, Month.NOVEMBER);

    //12 month
    testThrow(DayOfTheWeek.FRIDAY, 32, Month.DECEMBER);
    testThrow(DayOfTheWeek.FRIDAY, 33, Month.DECEMBER);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE, Month.DECEMBER);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE - 1, Month.DECEMBER);
    testThrow(DayOfTheWeek.FRIDAY, MAX_VALUE / 2, Month.DECEMBER);
    testThrow(DayOfTheWeek.FRIDAY, (MAX_VALUE / 2) + 1, Month.DECEMBER);
    testThrow(DayOfTheWeek.FRIDAY, (MAX_VALUE / 2) - 1, Month.DECEMBER);

    //6st year
    //1 month
    testThrow(DayOfTheWeek.SATURDAY, 32, Month.JANUARY);
    testThrow(DayOfTheWeek.SATURDAY, 33, Month.JANUARY);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE, Month.JANUARY);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE - 1, Month.JANUARY);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE / 2, Month.JANUARY);
    testThrow(DayOfTheWeek.SATURDAY, (MAX_VALUE / 2) + 1, Month.JANUARY);
    testThrow(DayOfTheWeek.SATURDAY, (MAX_VALUE / 2) - 1, Month.JANUARY);

    //2 month
    testThrow(DayOfTheWeek.SATURDAY, 29, Month.FEBRUARY);
    testThrow(DayOfTheWeek.SATURDAY, 30, Month.FEBRUARY);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE, Month.FEBRUARY);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE - 1, Month.FEBRUARY);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE / 2, Month.FEBRUARY);
    testThrow(DayOfTheWeek.SATURDAY, (MAX_VALUE / 2) + 1, Month.FEBRUARY);
    testThrow(DayOfTheWeek.SATURDAY, (MAX_VALUE / 2) - 1, Month.FEBRUARY);

    //3 month
    testThrow(DayOfTheWeek.SATURDAY, 32, Month.MARS);
    testThrow(DayOfTheWeek.SATURDAY, 33, Month.MARS);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE, Month.MARS);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE - 1, Month.MARS);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE / 2, Month.MARS);
    testThrow(DayOfTheWeek.SATURDAY, (MAX_VALUE / 2) + 1, Month.MARS);
    testThrow(DayOfTheWeek.SATURDAY, (MAX_VALUE / 2) - 1, Month.MARS);

    //4 month
    testThrow(DayOfTheWeek.SATURDAY, 31, Month.APRIL);
    testThrow(DayOfTheWeek.SATURDAY, 32, Month.APRIL);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE, Month.APRIL);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE - 1, Month.APRIL);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE / 2, Month.APRIL);
    testThrow(DayOfTheWeek.SATURDAY, (MAX_VALUE / 2) + 1, Month.APRIL);
    testThrow(DayOfTheWeek.SATURDAY, (MAX_VALUE / 2) - 1, Month.APRIL);

    //5 month
    testThrow(DayOfTheWeek.SATURDAY, 32, Month.MAY);
    testThrow(DayOfTheWeek.SATURDAY, 33, Month.MAY);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE, Month.MAY);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE - 1, Month.MAY);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE / 2, Month.MAY);
    testThrow(DayOfTheWeek.SATURDAY, (MAX_VALUE / 2) + 1, Month.MAY);
    testThrow(DayOfTheWeek.SATURDAY, (MAX_VALUE / 2) - 1, Month.MAY);

    //6 month
    testThrow(DayOfTheWeek.SATURDAY, 31, Month.JUNE);
    testThrow(DayOfTheWeek.SATURDAY, 32, Month.JUNE);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE, Month.JUNE);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE - 1, Month.JUNE);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE / 2, Month.JUNE);
    testThrow(DayOfTheWeek.SATURDAY, (MAX_VALUE / 2) + 1, Month.JUNE);
    testThrow(DayOfTheWeek.SATURDAY, (MAX_VALUE / 2) - 1, Month.JUNE);

    //7 month
    testThrow(DayOfTheWeek.SATURDAY, 32, Month.JULY);
    testThrow(DayOfTheWeek.SATURDAY, 33, Month.JULY);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE, Month.JULY);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE - 1, Month.JULY);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE / 2, Month.JULY);
    testThrow(DayOfTheWeek.SATURDAY, (MAX_VALUE / 2) + 1, Month.JULY);
    testThrow(DayOfTheWeek.SATURDAY, (MAX_VALUE / 2) - 1, Month.JULY);

    //8 month
    testThrow(DayOfTheWeek.SATURDAY, 32, Month.AUGUST);
    testThrow(DayOfTheWeek.SATURDAY, 33, Month.AUGUST);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE, Month.AUGUST);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE - 1, Month.AUGUST);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE / 2, Month.AUGUST);
    testThrow(DayOfTheWeek.SATURDAY, (MAX_VALUE / 2) + 1, Month.AUGUST);
    testThrow(DayOfTheWeek.SATURDAY, (MAX_VALUE / 2) - 1, Month.AUGUST);

    //9 month
    testThrow(DayOfTheWeek.SATURDAY, 31, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.SATURDAY, 32, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE - 1, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE / 2, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.SATURDAY, (MAX_VALUE / 2) + 1, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.SATURDAY, (MAX_VALUE / 2) - 1, Month.SEPTEMBER);

    //10 month
    testThrow(DayOfTheWeek.SATURDAY, 32, Month.OCTOBER);
    testThrow(DayOfTheWeek.SATURDAY, 33, Month.OCTOBER);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE, Month.OCTOBER);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE - 1, Month.OCTOBER);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE / 2, Month.OCTOBER);
    testThrow(DayOfTheWeek.SATURDAY, (MAX_VALUE / 2) + 1, Month.OCTOBER);
    testThrow(DayOfTheWeek.SATURDAY, (MAX_VALUE / 2) - 1, Month.OCTOBER);

    //11 month
    testThrow(DayOfTheWeek.SATURDAY, 31, Month.NOVEMBER);
    testThrow(DayOfTheWeek.SATURDAY, 32, Month.NOVEMBER);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE, Month.NOVEMBER);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE - 1, Month.NOVEMBER);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE / 2, Month.NOVEMBER);
    testThrow(DayOfTheWeek.SATURDAY, (MAX_VALUE / 2) + 1, Month.NOVEMBER);
    testThrow(DayOfTheWeek.SATURDAY, (MAX_VALUE / 2) - 1, Month.NOVEMBER);

    //12 month
    testThrow(DayOfTheWeek.SATURDAY, 32, Month.DECEMBER);
    testThrow(DayOfTheWeek.SATURDAY, 33, Month.DECEMBER);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE, Month.DECEMBER);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE - 1, Month.DECEMBER);
    testThrow(DayOfTheWeek.SATURDAY, MAX_VALUE / 2, Month.DECEMBER);
    testThrow(DayOfTheWeek.SATURDAY, (MAX_VALUE / 2) + 1, Month.DECEMBER);
    testThrow(DayOfTheWeek.SATURDAY, (MAX_VALUE / 2) - 1, Month.DECEMBER);

    //7st years
    //1 month
    testThrow(DayOfTheWeek.SUNDAY, 32, Month.JANUARY);
    testThrow(DayOfTheWeek.SUNDAY, 33, Month.JANUARY);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE, Month.JANUARY);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE - 1, Month.JANUARY);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE / 2, Month.JANUARY);
    testThrow(DayOfTheWeek.SUNDAY, (MAX_VALUE / 2) + 1, Month.JANUARY);
    testThrow(DayOfTheWeek.SUNDAY, (MAX_VALUE / 2) - 1, Month.JANUARY);

    //2 month
    testThrow(DayOfTheWeek.SUNDAY, 29, Month.FEBRUARY);
    testThrow(DayOfTheWeek.SUNDAY, 30, Month.FEBRUARY);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE, Month.FEBRUARY);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE - 1, Month.FEBRUARY);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE / 2, Month.FEBRUARY);
    testThrow(DayOfTheWeek.SUNDAY, (MAX_VALUE / 2) + 1, Month.FEBRUARY);
    testThrow(DayOfTheWeek.SUNDAY, (MAX_VALUE / 2) - 1, Month.FEBRUARY);

    //3 month
    testThrow(DayOfTheWeek.SUNDAY, 32, Month.MARS);
    testThrow(DayOfTheWeek.SUNDAY, 33, Month.MARS);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE, Month.MARS);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE - 1, Month.MARS);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE / 2, Month.MARS);
    testThrow(DayOfTheWeek.SUNDAY, (MAX_VALUE / 2) + 1, Month.MARS);
    testThrow(DayOfTheWeek.SUNDAY, (MAX_VALUE / 2) - 1, Month.MARS);

    //4 month
    testThrow(DayOfTheWeek.SUNDAY, 31, Month.APRIL);
    testThrow(DayOfTheWeek.SUNDAY, 32, Month.APRIL);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE, Month.APRIL);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE - 1, Month.APRIL);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE / 2, Month.APRIL);
    testThrow(DayOfTheWeek.SUNDAY, (MAX_VALUE / 2) + 1, Month.APRIL);
    testThrow(DayOfTheWeek.SUNDAY, (MAX_VALUE / 2) - 1, Month.APRIL);

    //5 month
    testThrow(DayOfTheWeek.SUNDAY, 32, Month.MAY);
    testThrow(DayOfTheWeek.SUNDAY, 33, Month.MAY);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE, Month.MAY);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE - 1, Month.MAY);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE / 2, Month.MAY);
    testThrow(DayOfTheWeek.SUNDAY, (MAX_VALUE / 2) + 1, Month.MAY);
    testThrow(DayOfTheWeek.SUNDAY, (MAX_VALUE / 2) - 1, Month.MAY);

    //6 month
    testThrow(DayOfTheWeek.SUNDAY, 31, Month.JUNE);
    testThrow(DayOfTheWeek.SUNDAY, 32, Month.JUNE);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE, Month.JUNE);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE - 1, Month.JUNE);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE / 2, Month.JUNE);
    testThrow(DayOfTheWeek.SUNDAY, (MAX_VALUE / 2) + 1, Month.JUNE);
    testThrow(DayOfTheWeek.SUNDAY, (MAX_VALUE / 2) - 1, Month.JUNE);

    //7 month
    testThrow(DayOfTheWeek.SUNDAY, 32, Month.JULY);
    testThrow(DayOfTheWeek.SUNDAY, 33, Month.JULY);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE, Month.JULY);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE - 1, Month.JULY);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE / 2, Month.JULY);
    testThrow(DayOfTheWeek.SUNDAY, (MAX_VALUE / 2) + 1, Month.JULY);
    testThrow(DayOfTheWeek.SUNDAY, (MAX_VALUE / 2) - 1, Month.JULY);

    //8 month
    testThrow(DayOfTheWeek.SUNDAY, 32, Month.AUGUST);
    testThrow(DayOfTheWeek.SUNDAY, 33, Month.AUGUST);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE, Month.AUGUST);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE - 1, Month.AUGUST);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE / 2, Month.AUGUST);
    testThrow(DayOfTheWeek.SUNDAY, (MAX_VALUE / 2) + 1, Month.AUGUST);
    testThrow(DayOfTheWeek.SUNDAY, (MAX_VALUE / 2) - 1, Month.AUGUST);

    //9 month
    testThrow(DayOfTheWeek.SUNDAY, 31, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.SUNDAY, 32, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE - 1, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE / 2, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.SUNDAY, (MAX_VALUE / 2) + 1, Month.SEPTEMBER);
    testThrow(DayOfTheWeek.SUNDAY, (MAX_VALUE / 2) - 1, Month.SEPTEMBER);

    //10 month
    testThrow(DayOfTheWeek.SUNDAY, 32, Month.OCTOBER);
    testThrow(DayOfTheWeek.SUNDAY, 33, Month.OCTOBER);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE, Month.OCTOBER);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE - 1, Month.OCTOBER);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE / 2, Month.OCTOBER);
    testThrow(DayOfTheWeek.SUNDAY, (MAX_VALUE / 2) + 1, Month.OCTOBER);
    testThrow(DayOfTheWeek.SUNDAY, (MAX_VALUE / 2) - 1, Month.OCTOBER);

    //11 month
    testThrow(DayOfTheWeek.SUNDAY, 31, Month.NOVEMBER);
    testThrow(DayOfTheWeek.SUNDAY, 32, Month.NOVEMBER);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE, Month.NOVEMBER);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE - 1, Month.NOVEMBER);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE / 2, Month.NOVEMBER);
    testThrow(DayOfTheWeek.SUNDAY, (MAX_VALUE / 2) + 1, Month.NOVEMBER);
    testThrow(DayOfTheWeek.SUNDAY, (MAX_VALUE / 2) - 1, Month.NOVEMBER);

    //12 month
    testThrow(DayOfTheWeek.SUNDAY, 32, Month.DECEMBER);
    testThrow(DayOfTheWeek.SUNDAY, 33, Month.DECEMBER);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE, Month.DECEMBER);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE - 1, Month.DECEMBER);
    testThrow(DayOfTheWeek.SUNDAY, MAX_VALUE / 2, Month.DECEMBER);
    testThrow(DayOfTheWeek.SUNDAY, (MAX_VALUE / 2) + 1, Month.DECEMBER);
    testThrow(DayOfTheWeek.SUNDAY, (MAX_VALUE / 2) - 1, Month.DECEMBER);


  }

  private void test(String answer, DayOfTheWeek ng, int day, Month month) {
    String inStr = "5 " + (ng.ordinal() + 1) + " " + day + " " + (month.ordinal() + 1) + System.lineSeparator();
    String answerMain = "Choose a task number(1-5) or another number to exit: " + System.lineSeparator()
        + answer + System.lineSeparator();

    MainTestService.testOutMain(inStr, answerMain);

    assertEquals(answer, getDayOfTheWeek(ng, day, month).toString()); //old check
  }


  private void testThrow(DayOfTheWeek ng, int day, Month month) {
    String inStr = "5 " + (ng.ordinal() + 1) + " " + day + " " + (month.ordinal() + 1) + System.lineSeparator();

    MainTestService.testErrMain(inStr, "Expected day > 0 and day < " + month.getDays() + ". Got: day = " + day);

    //old testThrowHouse
    try {
      getDayOfTheWeek(ng, day, month);
      fail();
    } catch (IllegalArgumentException e) {
      // Here nothing have to be
    }
  }

}
