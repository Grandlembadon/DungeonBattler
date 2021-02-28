import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

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

        narrator.playDialogueSleep(0, 3000);
        narrator.playDialogue(1);

        Player user = new Player();
        user.setName(scanner.next());
        narrator.welcomePlayer(user.getName());

        narrator.playDialogueSleep(2,3000);

        narrator.playDialogue(3);
        narrator.promptEnter();
        narrator.playDialogueSleep(6,3000);
        narrator.playDialogueSleep(7,3000);
        narrator.playDialogueSleep(8,3000);
        narrator.playDialogueSleep(9,3000);




        //        ArrayList<Weapon> weaponList = Weapon.getAll();
//        for (Weapon w : weaponList) {
//            System.out.println(w.toString());
//        }
//

//        boolean isValid = false;
//        while (!isValid){
//            try {
//                 int chosenWeapon = scanner.nextInt();
//                if (chosenWeapon > weaponList.size()){
//                    System.out.println("Please enter valid choice.");
//
//                } else {
//                    isValid = true;
//                }
//
//            } catch (Exception e) {
//                System.out.println("Enter a valid input.");
//
//
//            }
//        }


    }
        
    }

