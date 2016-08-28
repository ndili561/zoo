package zoo;

public class BabyElephant extends Elephant{

  public BabyElephant(String name, int value){
    this.name = name;
    this.value = value;
  }

  public String getName(){
    return this.name;
  }

  public int getValue(){
    return this.value;
  }

}