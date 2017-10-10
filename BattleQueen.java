package battleQueen;

import monster.Monster;

public class BattleQueen
{   
    static final String tie = "DRAW";
    static final String win = "WON";
    static final String lost= "LOST";

    private void fight(Monster monster1, Monster monster2)
    {   
        
        int opponent1_strength = monster1.getAttribute("strength");
        int opponent1_wrath = monster1.getAttribute("wrath");
        int opponent2_strength = monster2.getAttribute("strength");
        int opponent2_wrath = monster2.getAttribute("wrath");   
            
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
        fight( monster1 , monster2 );
        fight( monster1 , monster3 );
        fight( monster1 , monster4 );
        fight( monster2 , monster3 );
        fight( monster2 , monster4 );
        fight( monster3 , monster4 );
    } 
}
