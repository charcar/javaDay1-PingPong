import java.util.ArrayList;

public class App {
  public static void main(String[] args) {}

    public static ArrayList isANewArray(Integer number) {
      ArrayList<Object> arrayPing = new ArrayList<Object>();
      for (Integer i=1; i <= number; i++) {
        arrayPing.add(i);
      } return arrayPing;


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
  }
