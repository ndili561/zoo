package zoo;

public class IndonesianLion extends Lion{
 

  public IndonesianLion(String name, int value){
    this.name =  name;
    this.value = value;
  }

  public String getName(){
    return this.name;
  }

  public int getValue(){
    return this.value;
  }
}