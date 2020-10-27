import java.util.ArrayList;
import java.util.Random;


class Pillowcase{

//declare ArrayList
private ArrayList<Candy> candies = new ArrayList<Candy>();

//declare candy storage variable
private int count;

//pillowcase constructor
Pillowcase(){
count = 0;


candies.add( new Candy("M&Ms") );
candies.add( new Candy("Pink Starburst") );
candies.add( new Candy("Hershey's bar") );
candies.add( new Candy("Milky Way") );
candies.add( new Candy("Twix") );
candies.add( new Candy("Reese's") );
candies.add( new Candy("Kit Kat") );




}

//accessor for count variable
public void setCount(int count){
  this.count = count;
}
public int getCount(){
  return this.count;
}



//random number between 1-100
public void getCandy(){

Candy c = new Candy();
System.out.println("Trick or Treat!");


   int i = 0;
   Random r = new Random();
   int randomInt = r.nextInt(100) + 1;

   while (i <= houseNum){
        if (randomInt <= 10) {
          c.setName("M&Ms");
        } else if (randomInt <= 30) {
          c.setName("Pink Starburst");
        } else if (randomInt <= 47){
          c.setName("Hershey's Bar");
        } else if (randomInt <= 55){
          c.setName("Milky Way");
        } else if (randomInt <= 68){
          c.setName("Twix");
        } else if (randomInt <= 93){
          c.setName("Reese's");
        } else if (randomInt > 93){
          c.setName("Kit Kat");
        }
        i = i + 1;
   }
}

public void printNumCandies(){


}


}