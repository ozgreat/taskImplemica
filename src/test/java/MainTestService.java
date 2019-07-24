import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Service class for testing execution of main
 */
public class MainTestService {
  /**
   * Testing of output of main
   *
   * @param inStr  String that contains input, that we want to test
   * @param outStr expected output String
   */
  public static void testOutMain(String inStr, String outStr) {
    ByteArrayOutputStream outStream = new ByteArrayOutputStream();
    System.setIn(new ByteArrayInputStream(inStr.getBytes()));
    System.setOut(new PrintStream(outStream));

    Main.main(null);

    assertEquals(outStr, outStream.toString());
  }

  /**
   * Testing of errors and exceptions of main
   *
   * @param inStr  String that contains input, that we want to test
   * @param errStr expected error stream String
   */
  public static void testErrMain(String inStr, String errStr) {
    ByteArrayOutputStream errStream = new ByteArrayOutputStream();
    System.setIn(new ByteArrayInputStream(inStr.getBytes()));
    System.setOut(new PrintStream(new ByteArrayOutputStream()));
    System.setErr(new PrintStream(errStream));

    Main.main(null);

    assertEquals(errStr, errStream.toString());
  }
}
