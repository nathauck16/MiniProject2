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

//test adding to new array
/*candies.add( new Candy("M&Ms") );
candies.add( new Candy("Pink Starburst") );
candies.add( new Candy("Hershey's bar") );
candies.add( new Candy("Milky Way") );
candies.add( new Candy("Twix") );
candies.add( new Candy("Reese's") );
candies.add( new Candy("Kit Kat") );
*/

}

//accessor for count variable
public void setCount(int count){
  this.count = count;
}
public int getCount(){
  return this.count;
}

//candyCounter


//random number between 1-100
public void getCandy(){

System.out.println("Trick or Treat!");

   Random r = new Random();
   int randomInt = r.nextInt(100) + 1;

    //adding candy to array list based on these ranges
   if(randomInt >= 1 &&randomInt <= 10){
     candies.add(new Candy("M&Ms"));
   }else if(randomInt >=11 &&randomInt <= 30){
     candies.add(new Candy("Pink Starburst"));
   }else if(randomInt >= 31 &&randomInt <= 47){
     candies.add(new Candy("Hershey's Bar"));
   }else if(randomInt >= 48 &&randomInt <= 55){
     candies.add(new Candy("Milky Way"));
   }else if(randomInt >= 56 &&randomInt <= 68){
     candies.add(new Candy("Twix"));
   }else if(randomInt >= 69 &&randomInt <= 93){
     candies.add(new Candy("Reese's"));
   }else if(randomInt >= 94 &&randomInt <= 100){candies.add(new Candy("Kit Kat"));
   }

   canyCounter++;

}

public void printNumCandies(){

return this.count;

}


}