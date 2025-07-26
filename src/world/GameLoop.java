package world;

import entities.Enemy;
import entities.Player;
import entities.classes.Archer;
import entities.classes.Mage;
import entities.classes.SkillClass;
import entities.classes.Warrior;

import java.util.Scanner;

public class GameLoop {
    public static void start() {
        Scanner scanner = new Scanner(System.in);


        Player player = new Player();
        Enemy enemy = new Enemy();

        System.out.print("Welcome to my terminal game.\n");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        System.out.print("What is your name?: ");
        player.setName(scanner.next());
        System.out.println("It's a good name... for a hollow... Hahaha\n");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Anyway, what do you want here...? What are you?");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        System.out.println("I'm a...");
        System.out.println("""
                1 - Warrior 
                2 - Archer
                3 - Mage
                """);
        int optionSKillClass = scanner.nextInt();
        switch (optionSKillClass){
            case 1:
                System.out.println("...Warrior!");
                SkillClass warrior = new Warrior();
                warrior.applyBonuses(player);
                break;
            case 2:
                System.out.println("...an Archer!");
                SkillClass Archer = new Archer();
                Archer.applyBonuses(player);
                break;
            case 3:
                System.out.println("...Mage!");
                SkillClass Mage = new Mage();
                Mage.applyBonuses(player);
                break;
            default:
                System.out.println("Do you even know what are you doing here?...");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }
                break;
        }

        boolean inLoop = true;
        while (inLoop){
            System.out.println("Choose an option: ");
            System.out.println(
                    """
                    1 - Present your self
                    2 - Check status enemy
                    3 - Hit target
                    4 - Start combat (soon)
                    0 - Exit
                    """
            );
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println(player.presentYourSelf());
                    break;
                case 2:
                    System.out.println("Your enemy is: \n" + enemy.presentYourSelf());
                    break;
                case 3:
                    double damage = player.getBaseDamage();
                    System.out.println(player.toPunch(damage,enemy));
                    break;
                case 4:

                    break;
                case 0:
                    System.out.println("Closing game...bye");
                    inLoop = false;
                    break;
                default:
                    System.out.println("Wrong choice...");
            }
        }
        scanner.close();
    }
}
