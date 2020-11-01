/**
This class holds accessor methods for the candy class
@author Nat Hauck
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
  String getName(){
    return name;
  }

  //print method
  void print(){
    System.out.println(name);
  }
}
