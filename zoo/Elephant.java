package zoo;

public abstract class Elephant implements Animal{

  String name;
  int value;

  public String feed(){
    return "feedElephant";
  }

  public BabyElephant breed(){
    return new BabyElephant("john" , 234);
  }

 

}