package zoo;

public class City{
  String name;
  Zoo zoo1;
  Zoo zoo2;


  public City(String name, Zoo zoo1, Zoo zoo2){
    this.name = name;
    this.zoo1 = zoo1;
    this.zoo2 = zoo2;
  }

  public String getName(){
    return this.name;
  }

  public void setName(String aName){
    this.name = aName;
  }
}