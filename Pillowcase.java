/**
This class calculates the random number to decide which candy we get, plus it tracks the # of each candy and total
@author Nat Hauck
@version 10.31.2020
*/

import java.util.ArrayList;
import java.util.Random;

class Pillowcase{

//declare array list
private ArrayList<Candy> candyTracker;
//declare candy count variable
private int candyNum;

//new pillowcase object
Pillowcase(){
  candyTracker = new ArrayList<Candy>();
  candyNum = 0;
}

int getCandyNum(){
  return candyNum;
}
//random number between 1 and 100
void getCandy(){
  System.out.println("Trick or Treat!");
  Random r = new Random();
  int randomInt = r.nextInt(100)+1;

//adding candy to array list based on these ranges
  if (randomInt>=1 && randomInt<=10){
    candyTracker.add(new Candy("M&Ms"));
  }
  else if (randomInt>=11 && randomInt<=30){
    candyTracker.add(new Candy("Pink Starburst"));
  }
  else if (randomInt>=31 && randomInt<=47){
    candyTracker.add(new Candy("Hershey's Bar"));
  }
  else if (randomInt>=48 && randomInt<=55){
    candyTracker.add(new Candy("Milky Way"));
  }
  else if (randomInt>=56 && randomInt<=68){
    candyTracker.add(new Candy("Twix"));
  }
  else if (randomInt>=69 && randomInt<=93){
    candyTracker.add(new Candy("Reese's"));
  }
  else if (randomInt>=94 && randomInt<=100){
    candyTracker.add(new Candy("Kit Kat"));
  }

  candyNum ++;
}

void printNumCandies(){
  int[] numCandies = new int[7];

  for(int i=0; i<candyTracker.size(); i++){
    if (candyTracker.get(i).getName().equals("M&Ms")){
      numCandies[0] ++;
    }
    if (candyTracker.get(i).getName().equals("Pink Starburst")){
      numCandies[1] ++;
    }
    if (candyTracker.get(i).getName().equals("Hershey's Bar")){
      numCandies[2] ++;
    }
    if (candyTracker.get(i).getName().equals("Milky Way")){
      numCandies[3] ++;
    }
    if (candyTracker.get(i).getName().equals("Twix")){
      numCandies[4] ++;
    }
    if (candyTracker.get(i).getName().equals("Reese's")){
      numCandies[5] ++;
    }
    if (candyTracker.get(i).getName().equals("Kit Kat")){
      numCandies[6] ++;
    }
  }

  System.out.println("We've got...");

  if (numCandies[0]>0){
    System.out.println(numCandies[0] + " M&Ms");
  }
  if (numCandies[1]>0){
    System.out.println(numCandies[1] + " Pink Starburst");
  }
  if (numCandies[2]>0){
    System.out.println(numCandies[2] + " Hershey's Bar");
  }
  if (numCandies[3]>0){
    System.out.println(numCandies[3] + " Milky Way");
  }
  if (numCandies[4]>0){
    System.out.println(numCandies[4] + " Twix");
  }
  if (numCandies[5]>0){
    System.out.println(numCandies[5] + " Reese's");
  }
  if (numCandies[6]>0){
    System.out.println(numCandies[6] + " Kit Kat");
  }
}
}