package zoo;
import java.util.*;

public class Zoo{
  private int cash;
  private List<Animal>enclosureLion;
  private List<Animal>enclosureTiger;
  private List<Animal>enclosureElephant;
  private int ticketPrice;
  private List<Visitor>visitor;



  public Zoo(int cash, int ticketPrice){
    this.ticketPrice = ticketPrice;
    this.cash = cash;
    this.enclosureLion = new ArrayList<Animal>();
    this.enclosureTiger = new ArrayList<Animal>();
    this.enclosureElephant = new ArrayList<Animal>();
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

  public List<Animal> getEnclosureLion(){
    return enclosureLion;
  }

  public List<Animal> getEnclosureTiger(){
    return enclosureTiger;
  }
  public List<Animal> getEnclosureElephant(){
    return enclosureElephant;
  }

  public void addToEnclosure(Animal animal){
    if(animal instanceof Lion){
      enclosureLion.add(animal);
    }
    if (animal instanceof Elephant){
      enclosureElephant.add(animal);
    }
    if (animal instanceof Tiger){
      enclosureTiger.add(animal);
    }
  }

  public void removeAnimalFromEnclosure(Animal animal){
    if(animal instanceof Lion){
      enclosureLion.remove(animal);
    }
    if (animal instanceof Elephant){
      enclosureElephant.remove(animal);
    }
    if (animal instanceof Tiger){
      enclosureTiger.remove(animal);
    }
  }

  public void sellAnimal(Animal animal, Zoo zoo){
    if (zoo.getCash()>=animal.getValue())
    {
     this.cash+=animal.getValue();
    }
  }

  public void buyAnimal(Animal animal,Zoo zoo){
    if(this.getCash()>=animal.getValue()){
       this.cash-=animal.getValue();
    }
  }


  public void addVisitor(Visitor visitor){
     this.cash+=ticketPrice;
     this.visitor.add(visitor);
  }

  public List<Animal> createEnclosure(){
      List<Animal>enclosure = new ArrayList<Animal>();
      return enclosure;
  }

  public void exitVisitor(Visitor visitor){
    this.visitor.remove(visitor);
  }

}