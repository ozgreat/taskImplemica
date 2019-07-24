import executor.*;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Map<Integer, Executable> menu = new HashMap<>(); //Int - number of task, executor.Executable - lambda to launch task

    menu.put(1, new VariableSwaperExecutor());
    menu.put(2, new HouseAndFloorFinderExecutor());
    menu.put(3, new GcdOf4NumbersExecutor());
    menu.put(4, new FibonacciFinderExecutor());
    menu.put(5, new DayOfTheWeekFinderExecutor());

    System.out.println("Choose a task number(1-5) or another number to exit: ");

    Scanner in = new Scanner(System.in);

    int c = -1;
    try {
      c = in.nextInt();
    } catch (InputMismatchException e) { // if user enter not integer
      System.err.println("You enter some shit in the scanner!");
    }

    if (menu.get(c) != null) {
      menu.get(c).execute(in);
    }
  }

}