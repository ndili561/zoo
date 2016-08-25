import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;

public class CongoElephantTest{

  CongoElephant congo;

  @Before
  public void before(){
    congo = new CongoElephant("Johnny", 45);
  }

  @Test
  public void TestName(){
    assertEquals("Johnny", congo.getName());
  }

  @Test
  public void TestValue(){
    assertEquals(45, congo.getValue());
  }

  @Test
  public void feedTest(){
    assertEquals("feedElephant", congo.feed());
  }

}