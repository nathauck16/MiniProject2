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