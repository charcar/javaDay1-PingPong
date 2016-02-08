import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class AppTest {

// CREATE AN ARRAY
  @Test
  public void isANewArray_countUpByOne_2() {
    ArrayList<Object> arrayPing = new ArrayList<Object>();
    App pingPong = new App();
    arrayPing.add(1);
    arrayPing.add(2);
    assertEquals(arrayPing, App.isANewArray(2));
  }
// If number is divisible by 3, print ping
  @Test
  public void isDivisibleByThree_ChecksIfNumberIsDivisibleByThree_true() {
    App pingPong = new App();
    assertEquals(true, App.isDivisibleByThree(3));
  }
  @Test
  public void isDivisibleByFive_ChecksIfNumberIsDivisibleByFive_true() {
    App pingPong = new App();
    assertEquals(true, App.isDivisibleByFive(5));
  }
  @Test
  public void isDivisibleByFifteen_ChecksIfNumberIsDivisibleByFifteen_true() {
    App pingPong = new App();
    assertEquals(true, App.isDivisibleByFifteen(15));
  }
}





// If number is divisible by 5, print pong.



// If number is divisible by 15, print pingPong
