import entities.Enemy;
import entities.Entity;
import entities.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        /*
        * I'm trying to create a new player using Scanner class.
        * */


        gameLoop();



    }

    public static void gameLoop(){
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
                    1 - Check name
                    2 - Check enemy
                    3 - Check your status
                    0 - Exit
                    """
            );
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println(player.getName());
                    break;
                case 2:
                    System.out.println(enemy.getName());
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

class gameLoop{



}