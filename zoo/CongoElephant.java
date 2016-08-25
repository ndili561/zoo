package zoo;

public class CongoElephant extends Elephant{
  

  public CongoElephant(String name, int value){
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