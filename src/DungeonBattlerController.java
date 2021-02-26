import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class DungeonBattlerController {
    public void play() {
        Narrator narrator = new Narrator();
        Scanner scanner = new Scanner(System.in);
        narrator.init();
        narrator.playDialogue(0);
        narrator.playDialogue(1);
        Player user = new Player();



        ArrayList<Weapon> weaponList = Weapon.getAll();
        for (Weapon w : weaponList) {
            System.out.println(w.toString());
        }

        System.out.println("Choose your weapon.");



        boolean isValid = false;
        int chosenWeapon;
        while (!isValid){
            try {
                chosenWeapon = scanner.nextInt();
                if (chosenWeapon > weaponList.size()){
                    System.out.println("Please enter valid choice.");

                } else {
                    isValid = true;
                }

            } catch (Exception e) {
                System.out.println("Enter a valid input.");
                chosenWeapon = scanner.nextInt();

            }
        }


    }
        
    }

