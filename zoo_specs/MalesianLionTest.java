import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;

public class MalesianLionTest{

  MalesianLion africa;

  @Before
  public void before(){
    africa = new MalesianLion("Johnny", 45);
  }

  @Test
  public void TestName(){
    assertEquals("Johnny", africa.getName());
  }

  @Test
  public void TestValue(){
    assertEquals(45, africa.getValue());
  }

  @Test
  public void feedTest(){
    assertEquals("feedLion", africa.feed());
  }

  @Test
  public void breedTestName(){
    BabyLion baby = africa.breed();
    assertEquals("john", baby.getName());
  }

  @Test
  public void breedTestValue(){
    BabyLion baby = africa.breed();
    assertEquals(234, baby.getValue());
  }

}