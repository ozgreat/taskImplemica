package tasks;

/**
 * The {@code tasks.VariableSwaper} class contains 2 {@code Integer} variables
 * and can swap them. Class is immutable. You can swap x and y , but you can't
 * set another x or y
 *
 * @author ozgreat
 */
public class VariableSwaper {
  /**
   * Value of first variable
   */
  private int x;

  /**
   * Value of second variable
   */
  private int y;

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  /**
   * Initializes a newly created {@code tasks.VariableSwaper} object
   * with two variables x and y. Class is immutable, remember that, when
   * you will use that constructor
   *
   * @param x first variable
   * @param y second variable
   */
  public VariableSwaper(int x, int y) {
    this.x = x;
    this.y = y;
  }


  /**
   * Swap x and y using xor operations, without third variable
   */
  public void swap() {
    x = x ^ y;
    y = y ^ x;
    x = x ^ y;
  }

}