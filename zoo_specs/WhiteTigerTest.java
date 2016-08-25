import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;

public class WhiteTigerTest{

  WhiteTiger africa;

  @Before
  public void before(){
    africa = new WhiteTiger("Johnny", 45);
  }

  @Test
  public void TestName(){
    assertEquals("Johnny", africa.getName());
  }

  @Test
  public void TestValue(){
    assertEquals(45, africa.getValue());
  }
}