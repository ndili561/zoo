package zoo;

public abstract class Lion implements Animal{

  String name;
  int value;

  public String feed(){
    return "feedLion";
  }

  public BabyLion breed(){
    return new BabyLion("john" , 234);
  }


}