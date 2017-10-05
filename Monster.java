import java.util.Scanner;

class Monster
{
  String name; //Monster's name
  int strength; //Monster's strength should be betwin 0-10
  int wrath; //Monster's wrath should be betwin 0-10
  // contructor for Monster class

  public static void main(String[] args)
  {
    Monster[] monster = new Monster[4];
    //Monster monster = new Monster();
    Scanner input = new Scanner(System.in);
    for(int i=0 ; i<4 ; i++)
    {
      monster[i] = new Monster();
      System.out.println("please enter Monster charactristic:");
      System.out.println("Name:");
      monster[i].name = input.nextLine();
      System.out.println("strength(0-10):");
      monster[i].strength = input.nextInt();
      System.out.println("wrath(0-10):");
      monster[i].wrath = input.nextInt();
      input.nextLine();
    }
    for(int i=0 ; i<4 ; i++)
    {
      System.out.println("please enter Monster charactristic:" + "\n"
      + "name:" + monster[i].name + "\n" +"stren:gth:" +
      monster[i].strength + "\n" +"wrath:" + monster[i].wrath );
    }
  }
}
