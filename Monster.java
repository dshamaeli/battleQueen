/** Author:Daniel Shamaeli, Student ID:201230464
    this is the second assigment for COMP517
    https://github.com/dshamaeli/battleQueen
 */

package monster;

import java.util.Scanner;

public class Monster
{
  private String name; //Monster's name
  private int strength; //Monster's strength should be betwin 0-10
  private int wrath; //Monster's wrath should be betwin 0-10
  private int number;//monster's number
  private static int counter = 0;//to count monsters
  private int battleNo = 0;//count's monster battles
  private String opponent1, opponent2, opponent3;//store opponents
  private String result1,result2,result3;//store battles result   

  private static Scanner input = new Scanner(System.in);//input scanner
  
  //creats a monster based on user input
  public static Monster create()
  {
      Monster monster = new Monster();
      monster.number = ++counter;
        
      
      System.out.print("Please inter name for monster No." + monster.number +": ");
      monster.name = input.nextLine();

      System.out.print("Please inter " + monster.name + " strength(0-10): ");
      monster.strength = input.nextInt();

      System.out.print("Please inter " + monster.name + " wrath(0-10): ");
      monster.wrath = input.nextInt();
      
      input.nextLine();// skip unwanted return
      
      //rerunting the created monster
      return monster;  
  }
      
  public String showName()
  {
    return name;

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
      System.out.println("this is " + name +" battleNo:" + battleNo);
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
  public void showResults()
  {     
      System.out.println("\n##################\n");
      System.out.println("I am " + name + ", I:");
      System.out.println(result1 + " My first battle No.1 VS " + opponent1);
      System.out.println(result2 + " the Second VS " + opponent2);
      System.out.println(result3 + " the third VS " + opponent3);
  } 
}
