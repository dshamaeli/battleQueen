package monster;

import java.util.Scanner;

public class Monster
{
  private String name; //Monster's name
  private int strength; //Monster's strength should be betwin 0-10
  private int wrath; //Monster's wrath should be betwin 0-10
  private int number;//monster number
  private static Scanner input = new Scanner(System.in);//input scanner
  
  //creats a monster based on user input
  public static Monster create()
  {     
      Monster monster = new Monster();
      System.out.print("Please inter monster name: ");
      monster.name = input.nextLine();
      System.out.print("Please inter " + monster.name + " strength(0-10): ");
      monster.strength = input.nextInt();
      System.out.print("Please inter " + monster.name + " wrath(0-10): ");
      monster.wrath = input.nextInt();
      return monster;  
  }   
  public void showName()
  {
    System.out.println("name: " + name + "\n" +
                       "strength: " + strength+"\n" +
                       "wrath: " + wrath);
  }
}
