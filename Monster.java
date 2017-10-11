package monster;

import java.util.Scanner;

public class Monster
{
  private String name; //Monster's name
  private int strength; //Monster's strength should be betwin 0-10
  private int wrath; //Monster's wrath should be betwin 0-10
  private int number;//monster's number
  private static int counter = 0;//to count monsters
  private static int battleNo;
  private String opponent1, opponent2, opponent3;
  private String result1,result2,result3;   

  private static Scanner input = new Scanner(System.in);//input scanner
  
  //creats a monster based on user input
  public static Monster create()
  {
      Monster monster = new Monster();
      monster.number = ++counter;

      System.out.print("Please inter name for monster No." + monster.number +" :");
      monster.name = input.nextLine();

      System.out.print("Please inter " + monster.name + " strength(0-10): ");
      monster.strength = input.nextInt();

      System.out.print("Please inter " + monster.name + " wrath(0-10): ");
      monster.wrath = input.nextInt();
     // input.next();

      //rerunting the created monster
      return monster;  
  }
  public int getAttribute(String attribute)
  {
      switch (attribute)
      {
          case "strength":
              return strength;

          case "wrath" :
              return wrath; 
          default :
              System.out.println(attribute+" is not a valid attribute!!");
              return 0;  
      } 
  }          


  public void fightVs(Monster opponent,int battle)
  {
    battleNo = battle;  
    switch(battle)
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
          default :
                System.out.println("something is wrong");    
      }
  } 

      
  public String showName()
  {
    return name;

  }
}
