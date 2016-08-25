package zoo;
import java.util.*;

public class Zoo{
  private int cash;
  private List<Animal>enclosure;
  private static final int ticketPrice = 90;
  private List<Visitor>visitor;



  public Zoo(int cash){
    this.cash = cash;
    this.enclosure = new ArrayList<Animal>();
    this.visitor = new ArrayList<Visitor>();
  }

  public int getTicket(){
    return ticketPrice;
  }

  public List<Visitor> getVisitor(){
    return visitor;
  }

  public int getCash(){
    return cash;
  }

  public void setCash(int cash){
    this.cash = cash;
  }

  public List<Animal> getEnclosure(){
    return enclosure;
  }

  public void addToEnclosure(Animal animal){
    if(animal instanceof Lion){
      enclosure.add(animal);
    }
    if (animal instanceof Elephant){
      enclosure.add(animal);
    }
    if (animal instanceof Tiger){
      enclosure.add(animal);
    }
  }

  public void removeAnimalFromEnclosure(Animal animal){
    if(animal instanceof Lion){
      enclosure.remove(animal);
    }
  }

  public void sellAnimal(Animal animal){
    this.cash+=animal.getValue();
  }

  public void buyAnimal(Animal animal){
    this.cash-=animal.getValue();
  }

  public int totalAnimalValue(){
    int result = this.getCash();
    for (Animal animal : enclosure){
      result+=animal.getValue();
    }
    return result;
  }

  public void addVisitor(Visitor visitor){
    this.cash+=ticketPrice;
     this.visitor.add(visitor);
  }

  public int totalVisitorValue(){
    int result = this.getCash();
    for (Visitor visiotor : visitor){
      result+=ticketPrice;
    }
    return result;
  }
}