package world;

import entities.Enemy;
import entities.Player;

import java.util.Scanner;

public class GameLoop {
    public static void start() {
        Scanner scanner = new Scanner(System.in);


        Player player = new Player(
                "unknown",
                100,
                100,
                10
        );
        Enemy enemy = new Enemy(
                "Orc",
                80,
                50,
                7
        );

        System.out.print("Welcome to my terminal game.\nChoose your name: ");
        player.setName(scanner.nextLine());
        System.out.println("Greetings, " + player.getName());

        boolean inLoop = true;
        while (inLoop){
            System.out.println("Choose an option: ");
            System.out.println(
                    """
                    1 - Greetings
                    2 - Check your enemy
                    3 - Check your status
                    0 - Exit
                    """
            );
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println(player.greeting());
                    break;
                case 2:
                    System.out.println("Your enemy is: " + enemy.getName());
                    break;
                case 3:
                    System.out.println("health: " + player.getHealth()+"\nStamina: "+player.getStamina());
                    break;
                case 0:
                    System.out.println("Closing game...bye");
                    inLoop = false;
                    break;
                default:
                    System.out.println("Wrong choice bro...");
            }
        }
        scanner.close();
    }
}
