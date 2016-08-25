package zoo;

public class ZimbabweElephant extends Elephant{
 

  public ZimbabweElephant(String name, int value){
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