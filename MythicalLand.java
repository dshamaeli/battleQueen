
import monster.Monster;

class MysthicalLand
{
    
    public static void main(String args[])
    {
        Monster monster = Monster.create(1);
        monster.showName();
        System.out.println("strengt: "+monster.getAttribute("strength"));
    }

}
