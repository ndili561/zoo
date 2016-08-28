import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;

public class AfricanTigerTest{

  AfricanTiger africa;

  @Before
  public void before(){
    africa = new AfricanTiger("Johnny", 45);
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
  public void breedTestName(){
    BabyTiger baby = africa.breed();
    assertEquals("john", baby.getName());
  }

  @Test
  public void breedTestValue(){
    BabyTiger baby = africa.breed();
    assertEquals(234, baby.getValue());
  }
}