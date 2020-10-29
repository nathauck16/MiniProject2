import java.util.ArrayList;
import java.util.Random;
import java.util.*;
import java.io.File;

class Pillowcase{

//declare ArrayList
private ArrayList<Candy> candies = new ArrayList<Candy>();
//declare candy count variable
private int candyCounter;

//pillowcase object
Pillowcase(){

  candyCounter = 0;
  candies = new ArrayList<Candy>();

}

int getCounter(){
    return candyCounter;
  }

//accessor for count variable
public void setCount(int count){
  this.count = count;
}
public int getCount(){
  return this.count;
}

//random number between 1-100
 void getCandy(){

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
   candyCounter++;

}

void printNumCandies(){

    int[] candyTypeCount = new int[7];

    String[] candyList = {"M&Ms", "Pink Starburst", "Hershey's Bar", "Milky Way", "Twix", "Reese's", "Kit Kat" };
    
    for(int i = 0;i<candyTracker.size();i++ )
        {
        if(candies.get(i).getName().equals("M&Ms"));
        {
          candyTypeCount[0] = 1;
        }else if(candies.get(i).getName().equals("Pink Starburst"));
        {
          candyTypeCount[1]++;
        }else if(candies.get(i).getName().equals("Hershey's Bar"));
        {
          candyTypeCount[2]++;
        }else if(candies.get(i).getName().equals("Milky Way"));
        {
          candyTypeCount[3]++;
        }else if(candies.get(i).getName().equals("Twix"));
        {
          candyTypeCount[4]++;
        }else if(candies.get(i).getName().equals("Reese's"));
        {
          candyTypeCount[5]++;
        }else if(candies.get(i).getName().equals("Kit Kat"));
        {
          candyTypeCount[6]++;
        }
    }
  for(int i=0;i<candyTypeCount.length;i++)
  {
    if(candyTypeCount[i]!=0)
    {
      System.out.println("We got " + candyTypeCount[i] + candyList[i]);
    }
  }



}
}