import static org.junit.Assert.*;

import edu.cnm.deepdive.Hello;
import org.junit.Test;

public class HelloTest {

  @Test
  public void sayHello() {
    assertEquals("edu.cnm.deepdive.Hello", new Hello().sayHello());
  }
}