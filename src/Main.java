import entities.Enemy;
import entities.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Player player = new Player(
                "Jon",
                100,
                100,
                10
        );
        Enemy enemy = new Enemy(
                "Orc",
                100,
                100,
                10
        );

        System.out.println(player.greeting());
        System.out.println(enemy.greeting());
        System.out.println(player.toPunch(enemy));

        boolean inLoop = true;
        /*
        * I'm trying to create a new player using Scanner class.
        * */
        while (inLoop){
            Player player2 = new Player();
            System.out.print("Welcome to my terminal game.\nChoose your name: ");
            player2.setName(scanner.nextLine());
            System.out.println(player2.getName());

            inLoop = false;
        }


    }
}

class gameLoop{
    boolean inLoop = false;


}