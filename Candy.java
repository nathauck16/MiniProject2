import java.util.*;
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