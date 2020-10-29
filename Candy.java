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
 Candy(){

  name = "";

}
 Candy(String aName){
  name = aName;
}

//setterngetter
 void setName(String name){
  this.name = name;
}
 String getName(){
  return this.name;
}

//print method

public void printName(){
  System.out.println(this.name);
}
}