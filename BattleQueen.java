import java.util.Scanner;

class Monster
{
  private String name; //Monster's name
  private int strength; //Monster's strength should be betwin 0-10
  private int wrath; //Monster's wrath should be betwin 0-10
  String Opponent[] = new String[3];
  Boolean win[] = new Boolean[6];
  // contructor for Monster class
  private Scanner input = new Scanner(System.in);
  public void create()
  {
      System.out.println("please enter Monster charactristic:");
      System.out.println("Name:");
      this.name = input.nextLine();
      System.out.println("strength(0-10):");
      this.strength = input.nextInt();
      System.out.println("wrath(0-10):");
      this.wrath = input.nextInt();
  }
  public void showName()
  {
    System.out.println("name: " + this.name + "\n" +
                       "strength: " +this.strength+"\n" +
                       "wrath: " + this.wrath);
  }
}

class BattleQueen
{
/* for(int i=0;1<4;1++){
    Monster monster[i] = new Monster();
  }
*/
  public static void main(String[] args)
  {
    Monster monster = new Monster();
    monster.create();
    monster.showName();
  }


}
