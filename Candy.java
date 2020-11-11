/**
This class holds accessor methods for the candy class
@author 
Nat Hauck, Owen Lottman, Sam Deckel, John Thomas
@version 10.31.2020
*/

//variables

class Candy{
  private String name;

//constructors
  Candy(){
    name = "";
  }
  Candy(String aName){
    name = aName;
  }

  //setterngettermethod
  void setName(String theName){
    name = theName;
  }
 // @reutrn return candy name
  String getName(){
    return name;
  }

  //print method
  void print(){
    System.out.println(name);
  }
}
