package monster;

import java.util.Scanner;

public class Monster
{
  private String name; //Monster's name
  private int strength; //Monster's strength should be betwin 0-10
  private int wrath; //Monster's wrath should be betwin 0-10
  private int number;//monster number
  private String opponent1, opponent2, opponent3;
  private String result1,result2,result3;   

  private static Scanner input = new Scanner(System.in);//input scanner
  
  //creats a monster based on user input
  public static Monster create(int number)
  {
      Monster monster = new Monster();
      monster.number = number;

      System.out.print("Please inter monster No. " + number +"name: ");
      monster.name = input.nextLine();

      System.out.print("Please inter " + monster.name + " strength(0-10): ");
      monster.strength = input.nextInt();

      System.out.print("Please inter " + monster.name + " wrath(0-10): ");
      monster.wrath = input.nextInt();

      //rerunting the created monster
      return monster;  
  }   
  public void fightVs(String opponent, int number)
  {
    switch(number)
    {
        
      case 1 : 
        this.opponent1 = opponent;
        break;

      case 2 :
        this.opponent2 = opponent;
        break;

      case 3 :
        this.opponent3 = opponent;
        break;//this is just for cleaner code
    }
  }    
  public void showName()
  {
    System.out.println("name: " + name + "\n" +
                       "strength: " + strength+"\n" +
                       "wrath: " + wrath);
  }
}
