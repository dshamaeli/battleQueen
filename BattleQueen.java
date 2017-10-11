package battleQueen;

import monster.Monster;

public class BattleQueen
{   
    private static final String tie = "DRAW";
    private static final String win = "WON";
    private static final String lost= "LOST";
    private int battleNo = 0;

    private void fight(Monster monster1, Monster monster2)
    {   
        int opponent1_strength = monster1.getAttribute("strength");
        int opponent1_wrath = monster1.getAttribute("wrath");
        int opponent2_strength = monster2.getAttribute("strength");
        int opponent2_wrath = monster2.getAttribute("wrath");   
        battleNo++;
        System.out.println("\n*********************\n");
        System.out.println("battle No."+ battleNo +" starts\n\n"+
                monster1.showName() + "(" + opponent1_strength +"," +
                opponent1_wrath +") VS " + monster2.showName() +"("+
                opponent2_strength + "," + opponent2_wrath + ")");
    
        monster1.fightVs(monster2);
        monster2.fightVs(monster1);

        if (opponent1_strength > opponent2_strength)
        {
            
            monster1.setResult(win);
            monster2.setResult(lost);
        }
        else
        { 
            if (opponent1_strength < opponent2_strength)
            {
                monster1.setResult(lost);
                monster2.setResult(win);
            }
            else
            { 
                if (opponent1_wrath > opponent2_wrath)
               {
                   monster1.setResult(win);
                   monster2.setResult(lost);
               }
               else
               {
                   if (opponent1_wrath < opponent2_wrath)
                   {
                       monster1.setResult(lost);
                       monster2.setResult(win);
                   }
                   else
                   {
                       monster1.setResult(tie);
                       monster2.setResult(tie);
                   }
               }
            }
        }
    }

    public void tournament(Monster monster1, Monster monster2, Monster monster3, Monster monster4)
    {
        System.out.println("The Tournament begins...participants are:\n"+
                                                        monster1.showName()+",\n"+
                                                        monster2.showName()+",\n"+
                                                        monster3.showName()+"and\n"+
                                                        monster4.showName());
        fight( monster1 , monster2 );
        fight( monster1 , monster3 );
        fight( monster1 , monster4 );
        fight( monster2 , monster3 );
        fight( monster2 , monster4 );
        fight( monster3 , monster4 );

        System.out.println("\n\nThe tournament if finished and the results are:");
        monster1.showResults();
        monster2.showResults();
        monster3.showResults();
        monster4.showResults();
    } 
}
