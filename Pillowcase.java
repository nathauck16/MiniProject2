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

Candy candyNew = new Candy();
System.out.println("Trick or Treat!");

    Random r = new Random();
    int randomInt = r.nextInt(100) + 1;

if (randomInt <= 10) {
  candyNew.setName();
} else if (rand < .1 + .3) {
  return 2;
} else {
  return 3;
}
}



}