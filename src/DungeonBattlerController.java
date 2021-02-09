import java.util.Scanner;

public class DungeonBattlerController {
    public void play() {
        System.out.println("Welcome, brave adventurer. If you seek the riches that lie" +
                " within this ancient dungeon, speak thy name and enter.");

        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.next();

        Player user = new Player(playerName);


        // User is prompted to choose a weapon
        System.out.println("You enter the dungeon and a hallway lined with three weapons appears before you.");

        System.out.println("There is a sword, a staff, and a dagger.");

        System.out.println("Below the weapons reads: 'You may take only one weapon.");


        // Create three Weapon objects
        Weapon Sword = new Weapon();
        Weapon Staff = new Weapon();
        Weapon Dagger = new Weapon();



        // User chooses a weapon
        System.out.println("Please enter your Weapon Choice.");

        user.choose(Sword);

        // Set Weapon to user

        user.init();




        

    }
        
    }

