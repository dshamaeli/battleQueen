
import monster.Monster;

class MysthicalLand
{
    
    public static void main(String args[])
    {
        Monster monster = Monster.create();
        System.out.println("name: " + monster.showName() + "strengt: " + 
                monster.getAttribute("strength"));
    }

}
