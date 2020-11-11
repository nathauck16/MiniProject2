/**
This class holds the main method to run all of our other methods. it holds the scanner to take input from user. It is a simple model to calculate the probability of drawing each candy when going trick or treating.
@author
Nat Hauck, Owen Lottman, Sam Deckel, John Thomas
Halloween Project 
10/31/20

@version 10.31.2020
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Pillowcase p = new Pillowcase();

    Scanner s = new Scanner(System.in);

    System.out.println("Happy Halloween! How many houses should we trick or treat at?");
    int houses = s.nextInt();

    for (int i=0;i<houses; i++){
      p.getCandy();
    }

    System.out.println("We have " + p.getCandyNum() + " candies.");

    p.printNumCandies();
  }
}