import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class DungeonBattlerController {
    public void play() {
        ArrayList<Weapon> weaponList = Weapon.chooseWeapon();
        for (Weapon w : weaponList) {
            System.out.println(w.toString());
        }
        System.out.println("Choose your weapon.");
        Scanner scanner = new Scanner(System.in);
        int chosenWeapon = scanner.nextInt();

        System.out.println(chosenWeapon);
        //Homework: Wrap this in a try catch, and if the answer is incorrect, have it ask again.
        //

//        System.out.println("Welcome, brave adventurer. If you seek the riches that lie" +
//                " within this ancient dungeon, speak thy name and enter.");
//
//        Scanner scanner = new Scanner(System.in);
//        String playerName = scanner.next();
//
//        Player user = new Player(playerName);
//
//
//        // User is prompted to choose a weapon
//        System.out.println("You enter the dungeon and a hallway lined with three weapons appears before you.");
//
//        System.out.println("There is a sword, a staff, and a dagger.");
//
//        System.out.println("Below the weapons reads: 'You may take only one weapon.");
//
//
//        // Create three Weapon objects
//        Weapon myWeapon = new Weapon();
//
//        // User chooses a weapon
//        System.out.println("Please enter your Weapon Choice.");
//
//        String weaponName = scanner.next();
//
//        user.choose(Sword);
//
//        // Set Weapon to user
//
//        user.init();




        

    }
        
    }

