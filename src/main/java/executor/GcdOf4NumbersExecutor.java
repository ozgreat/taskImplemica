package executor;

import tasks.GcdOf4Numbers;

import java.util.Scanner;

public class GcdOf4NumbersExecutor implements Executable {
  /**
   * Init parameters for {@code GcdOf4Numbers} and execute them
   *
   * @param in Scanner to input data by user
   */
  @Override
  public void execute(Scanner in) {
    int x1 = in.nextInt();
    int x2 = in.nextInt();
    int x3 = in.nextInt();
    int x4 = in.nextInt();

    try {
      System.out.println(GcdOf4Numbers.getGcdOf4Numbers(x1, x2, x3, x4));
    } catch (IllegalArgumentException e) {
      System.err.println(e.getMessage());
    }
  }
}
