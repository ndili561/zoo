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

  @Test
  public void breedTestName(){
    BabyElephant baby = congo.breed();
    assertEquals("john", baby.getName());
  }

  @Test
  public void breedTestValue(){
    BabyElephant baby = congo.breed();
    assertEquals(234, baby.getValue());
  }

}