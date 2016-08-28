import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;

public class CityTest{


  City city;
  Zoo zoo1;
  Zoo zoo2;

  @Before
  public void before(){
  zoo1 = new Zoo(45,90);
  zoo2 = new Zoo(50,90);  
  city = new City("Edinburgh", zoo1, zoo2);
  }

  @Test
  public void hasNme(){
    assertEquals("Edinburgh", city.getName());
  }


}