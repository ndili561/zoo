import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;


public class ZooTest{

  Zoo zoo1;
  Zoo zoo2;



  @Before
  public void before(){
    zoo1 = new Zoo(45);
    zoo2 = new Zoo(50);
  }

  @Test
  public void testCash(){
    assertEquals(45, zoo1.getCash());
  }
  @Test
  public void testEnclosure(){
    assertEquals(0, zoo2.getEnclosure().size());
  }

  @Test
  public void testAddAnimalLion(){
    IndonesianLion lion = new IndonesianLion("Africa", 45);
    zoo1.addToEnclosure(lion);
    assertEquals(1, zoo1.getEnclosure().size());
  }
  @Test
  public void testAddAnimalElephant(){
    ZimbabweElephant lion = new ZimbabweElephant("Africa", 45);
    zoo1.addToEnclosure(lion);
    assertEquals(1, zoo1.getEnclosure().size());
  }

  @Test
  public void testAddAnimalTiger(){
    AfricanTiger lion = new AfricanTiger("Africa", 45);
    zoo1.addToEnclosure(lion);
    assertEquals(1, zoo1.getEnclosure().size());
  }

  @Test
  public void testRemoveAnimal(){
    IndonesianLion lion = new IndonesianLion("Africa", 45);
    zoo1.removeAnimalFromEnclosure(lion);
    assertEquals(0, zoo1.getEnclosure().size());
  }



  @Test
  public void testSell(){
    IndonesianLion lion = new IndonesianLion("Africa", 45);
    zoo1.sellAnimal(lion);
    assertEquals(90, zoo1.getCash());
  }

  @Test
  public void testBuy(){
    IndonesianLion lion = new IndonesianLion("Africa", 45);
    zoo1.buyAnimal(lion);
    assertEquals(0, zoo1.getCash());
  }

  @Test
  public void checkIncome(){
   AfricanTiger lion = new AfricanTiger("Africa", 45);
   zoo1.addToEnclosure(lion);
   assertEquals(90, zoo1.totalAnimalValue());
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
  public void testVisitorIncome(){
    Visitor visitor = new Visitor();
    zoo1.addVisitor(visitor);
    assertEquals(225, zoo1.totalVisitorValue());
  }
}