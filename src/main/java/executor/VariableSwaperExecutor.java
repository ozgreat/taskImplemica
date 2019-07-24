package executor;

import tasks.VariableSwaper;

import java.util.Scanner;

public class VariableSwaperExecutor implements Executable {
  /**
   * Init parameters for {@code VariableSwaper} and execute them
   *
   * @param in Scanner to input data by user
   */
  @Override
  public void execute(Scanner in) {
    int x = in.nextInt();
    int y = in.nextInt();

    VariableSwaper swaper = new VariableSwaper(x, y);
    swaper.swap();

    System.out.println("x: " + swaper.getX() + " y: " + swaper.getY());
  }
}
