package zoo;

public class MalesianLion extends Lion{
 

  public MalesianLion(String name, int value){
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