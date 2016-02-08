import java.util.ArrayList;
import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Let's play ping pong, enter an integer");
    String userStringNumber = myConsole.readLine();
    Integer userIntNumber = Integer.parseInt(userStringNumber);
    App.isANewArray(userIntNumber);
    System.out.println(App.isANewArray(userIntNumber));
  }

  public static Boolean isDivisibleByThree(Integer number) {
    return number % 3 == 0;
    }

  public static Boolean isDivisibleByFive(Integer number) {
    return number % 5 == 0;
    }

  public static Boolean isDivisibleByFifteen(Integer number) {
    return number % 15 == 0;
    }


    public static ArrayList isANewArray(Integer number) {
      ArrayList<Object> arrayPing = new ArrayList<Object>();
      for (Integer i=1; i <= number; i++) {
        if (isDivisibleByFifteen(i)) {
          arrayPing.add("pingpong");
        } else if (isDivisibleByFive(i)) {
          arrayPing.add("pong");
        } else if (isDivisibleByThree(i)) {
          arrayPing.add("ping");
        } else
        arrayPing.add(i);
      } return arrayPing;


  }
}
