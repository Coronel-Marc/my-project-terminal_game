package world;

import entities.Enemy;
import entities.Player;

import java.util.Scanner;

public class GameLoop {
    public static void start() {
        Scanner scanner = new Scanner(System.in);


        Player player = new Player();
        Enemy enemy = new Enemy();

        System.out.print("Welcome to my terminal game.\nChoose your name: ");
        player.setName(scanner.nextLine());
        System.out.println("Greetings, " + player.getName());

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
