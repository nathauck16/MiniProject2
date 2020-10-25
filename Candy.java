public class Candy{

//variables
public String name;

//constructors
Candy(){

  name = "";

}
Candy(String aName){
  name = aName;
}

//setterngetter
public void setName(String name){
  this.name = name;
}
public String getName(){
  return this.name;
}

//print method
public void printName(){
  System.out.println("Candy 1 is " + this.name);
}
}