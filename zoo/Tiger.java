package zoo;

public abstract class Tiger implements Animal{

 String name;
 int value;

 public String feed(){
  return "feedTiger";
 }


 public BabyTiger breed(){
   return new BabyTiger("john" , 234);
 }

}