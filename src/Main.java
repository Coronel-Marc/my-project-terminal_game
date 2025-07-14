import entities.Enemy;
import entities.Entity;
import entities.Player;
import entities.classes.Warrior;

public class Main {
    public static void main(String[] args) {

        Player player = new Player(new Warrior());
        player.setName("João das Neve");
        player.setHealth(100.00);
        player.setShield(100.00);
        player.setAttack(10.0);
        player.setDefense(10.0);

        Enemy enemy = new Enemy();
        enemy.setName("Orc");
        enemy.setHealth(100.0);
        enemy.setShield(100.0);
        enemy.setAttack(10.0);
        enemy.setDefense(10.0);



    }
}