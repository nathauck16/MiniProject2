class Candy{
/*
This class creates candy variables
@author Nat Hauck
@
*/
//variables
//change to private
private String name;

//constructors
public Candy(){

  name = "";

}
public Candy(String aName){
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