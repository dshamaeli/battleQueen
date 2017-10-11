/** Author:Daniel Shamaeli, Student ID:201230464
    this is the second assigment for COMP517
    https://github.com/dshamaeli/battleQueen
 */

import monster.Monster;
import battleQueen.BattleQueen;

class MysthicalLand
{
    
    public static void main(String args[])
    {
        Monster monster1 = Monster.create();
        Monster monster2 = Monster.create();
        Monster monster3 = Monster.create();
        Monster monster4 = Monster.create();
       // System.out.println(monster1.showName());
        BattleQueen queen = new BattleQueen();
        queen.tournament(monster1,monster2,monster3,monster4);
    }
}
