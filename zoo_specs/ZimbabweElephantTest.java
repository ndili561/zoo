import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;

public class ZimbabweElephantTest{

  ZimbabweElephant congo;

  @Before
  public void before(){
    congo = new ZimbabweElephant("Johnny", 45);
  }

  @Test
  public void TestName(){
    assertEquals("Johnny", congo.getName());
  }

  @Test
  public void TestValue(){
    assertEquals(45, congo.getValue());
  }

}