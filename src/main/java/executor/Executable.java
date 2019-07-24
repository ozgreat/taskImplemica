package executor;

import java.util.Scanner;

/**
 *  Represents an operation that accepts {@code Scanner} argument and returns
 *  no result
 *
 * @author ozgreat
 */
@FunctionalInterface
public interface Executable {
  /**
   * Perform this operation with user's {@code Scanner}
   *
   * @param in Scanner to input data by user
   */
  void execute(Scanner in);
}
