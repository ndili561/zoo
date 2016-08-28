import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;
import java.util.*;


public class ZooTest{

  Zoo zoo1;
  Zoo zoo2;



  @Before
  public void before(){
    zoo1 = new Zoo(45,90);
    zoo2 = new Zoo(50,90);
  }

  @Test
  public void testCash(){
    assertEquals(45, zoo1.getCash());
  }
 

  @Test
  public void testAddAnimalLion(){
    IndonesianLion lion = new IndonesianLion("Africa", 45);
    zoo1.addToEnclosure(lion);
    assertEquals(1, zoo1.getEnclosureLion().size());
  }
  @Test
  public void testAddAnimalElephant(){
    ZimbabweElephant lion = new ZimbabweElephant("Africa", 45);
    zoo1.addToEnclosure(lion);
    assertEquals(1, zoo1.getEnclosureElephant().size());
  }

  @Test
  public void testAddAnimalTiger(){
    AfricanTiger lion = new AfricanTiger("Africa", 45);
    zoo1.addToEnclosure(lion);
    assertEquals(1, zoo1.getEnclosureTiger().size());
  }

  @Test
  public void testRemoveAnimal(){
    IndonesianLion lion = new IndonesianLion("Africa", 45);
    zoo1.removeAnimalFromEnclosure(lion);
    assertEquals(0, zoo1.getEnclosureLion().size());
  }



  @Test
  public void testSell(){
    IndonesianLion lion = new IndonesianLion("Africa", 45);
    zoo1.sellAnimal(lion,zoo2);
    assertEquals(90, zoo1.getCash());
  }

  @Test
  public void testBuy(){
    IndonesianLion lion = new IndonesianLion("Africa", 45);
    zoo1.buyAnimal(lion,zoo2);
    assertEquals(0, zoo1.getCash());
  }


  @Test
  public void testTicket(){
    assertEquals(90, zoo1.getTicket());
  }

  @Test
  public void addVisitor(){
    Visitor visitor = new Visitor();
    zoo1.addVisitor(visitor);
    assertEquals(1, zoo1.getVisitor().size());
  }

  @Test
  public void testCreateEnclosure(){
    List<Animal>animal = zoo1.createEnclosure();
    assertEquals(0, animal.size());
  }

  @Test
  public void testExitVisitor(){
    Visitor visitor = new Visitor();
    zoo1.addVisitor(visitor);
    zoo1.exitVisitor(visitor);
    assertEquals(0, zoo1.getVisitor().size());
  }

}