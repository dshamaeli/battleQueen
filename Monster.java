package monster;

import java.util.Scanner;

public class Monster
{
  private String name; //Monster's name
  private int strength; //Monster's strength should be betwin 0-10
  private int wrath; //Monster's wrath should be betwin 0-10
  private int number;//monster number
  private int battleNo = 0;//number of battle
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
  public void fightVs(Monster opponent)
  {
    battleNo++; 
    
    switch(battleNo)
    {
        
      case 1 : 
        this.opponent1 = opponent.name;
        break;

      case 2 :
        this.opponent2 = opponent.name;
        break;

      case 3 :
        this.opponent3 = opponent.name;
        break;//this is just for cleaner code
    }
  }

  public void setResult(String result)
  {
      switch(battleNo)
      {
          case 1 :
              this.result1 = result;
              break;
          case 2 :
              this.result2 = result;
              break;
          case 3 :
              this.result3 = result;
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
