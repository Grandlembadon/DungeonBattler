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

        ArrayList<Weapon> weaponList = Weapon.createWeaponList();
        ArrayList<Weapon> enemyWeaponList = Weapon.createEnemyWeaponList();
        ArrayList<Class> classList = Class.classList();
        ArrayList<Skill> skillList = Skill.createSkillList();
        ArrayList<Skill> playerSkills = new ArrayList();
        ArrayList<Enemy> enemyList = Enemy.createEnemyList();


        narrator.playDialogueSleep(0, 3000);
        narrator.playDialogue(1);

        Player user = new Player();
        user.setName(scanner.next());
        narrator.welcomePlayer(user.getName());

        narrator.playDialogueSleep(2, 3000);

        narrator.playDialogue(3);
        narrator.promptEnter();
        narrator.playDialogueSleep(6, 3000);
        narrator.playDialogueSleep(7, 3000);
        narrator.playDialogueSleepSpace(8, 3000);


        for (Weapon w : weaponList) {
            narrator.playTextSleep(w.toString() + System.lineSeparator(), 1000);
        }
        narrator.playDialogueSleep(9, 3000);

        boolean isValid = false;

        while (!isValid) {
            String chosenWeapon = scanner.next();
            if (chosenWeapon.equalsIgnoreCase("Staff")) {
                user.setWeapon(weaponList.get(0));
                narrator.weaponChoice(user);
                user.setMyClass(classList.get(0));
                user.setTotalHP(user.getMyClass().getClassHP());
                user.setCurrentHP(user.getMyClass().getClassHP());
                user.setPlayerSkills(playerSkills);
                user.getPlayerSkills().add(skillList.get(0));
                user.getPlayerSkills().add(skillList.get(9));
                isValid = true;

            } else if (chosenWeapon.equalsIgnoreCase("Sword")) {
                user.setWeapon(weaponList.get(1));
                narrator.weaponChoice(user);
                user.setMyClass(classList.get(1));
                user.setTotalHP(user.getMyClass().getClassHP());
                user.setCurrentHP(user.getMyClass().getClassHP());
                user.setPlayerSkills(playerSkills);
                user.getPlayerSkills().add(skillList.get(1));
                user.getPlayerSkills().add(skillList.get(9));
                isValid = true;


            } else if (chosenWeapon.equalsIgnoreCase("Dagger")) {
                user.setWeapon(weaponList.get(2));
                narrator.weaponChoice(user);
                user.setMyClass(classList.get(2));
                user.setTotalHP(user.getMyClass().getClassHP());
                user.setCurrentHP(user.getMyClass().getClassHP());
                user.setPlayerSkills(playerSkills);
                user.getPlayerSkills().add(skillList.get(2));
                user.getPlayerSkills().add(skillList.get(9));
                isValid = true;
            } else {
                narrator.playTextSleep("Please Enter a Valid Weapon!", 3000);

            }
        }

        narrator.playDialogueSleep(13,3000);
        narrator.playDialogueSleep(14,3000);
        narrator.playDialogueSleep(15,2500);
        narrator.playDialogueSleep(16,3000);


    boolean battleOver = true;
    boolean validCommand = false;


    Enemy SkeletonSoldier = new Enemy(enemyList.get(0).getEnemyHP(), enemyList.get(0).getEnemySP(),
            enemyList.get(0).getEnemyName(), enemyWeaponList.get(0));
    ArrayList<Skill> EnemySkills = new ArrayList();
        SkeletonSoldier.setEnemySkills(EnemySkills);
        SkeletonSoldier.getEnemySkills().

    add(skillList.get(3));
        SkeletonSoldier.getEnemySkills().

    add(skillList.get(4));


        SkeletonSoldier.enemyStrike(user,narrator);
        narrator.playDialogueSleep(21,3000);
        narrator.playDialogueSleep(22,3000);
        narrator.playDialogueSleep(23,3000);
        while(!validCommand)

    {
        String response = scanner.next();
        if (response.equalsIgnoreCase("strike")) {
            user.strike(SkeletonSoldier, narrator);
            validCommand = true;
        } else {
            System.out.println("Please enter [Strike]");
            return;

        }
    }
        narrator.playDialogueSleep(27,3000);
        narrator.playDialogueSleep(28,3000);
        SkeletonSoldier.castEnemySkill1(user,narrator);
        narrator.playDialogueSleep(29,3000);
        narrator.playDialogueSleep(30,3000);
        narrator.playDialogueSleep(31,3000);
        narrator.playDialogueSleep(32,3000);
    validCommand =false;
        while(!validCommand)

    {
        String firstAidResponse = scanner.next();
        firstAidResponse += scanner.nextLine();
        if (firstAidResponse.equalsIgnoreCase("Cast First Aid")) {
            user.castFirstAid(narrator);
            validCommand = true;
        } else {
            System.out.println("Please enter [Cast First Aid]");
        }
    }
        SkeletonSoldier.enemyStrike(user,narrator);
        narrator.playDialogueSleep(33,3000);
        narrator.playDialogueSleep(34,3000);
        narrator.playDialogueSleep(35,3000);
    validCommand =false;
        while(!validCommand)

    {
        String skillResponse = scanner.next();
        skillResponse += scanner.nextLine();
        if (skillResponse.equalsIgnoreCase("Cast Skill 1")) {
            user.castSkill1(SkeletonSoldier, narrator);
            validCommand = true;
        } else {
            System.out.println("Please enter [Cast Skill 1]");
        }
    }
        narrator.playDialogueSleep(38,3000);
        SkeletonSoldier.castEnemySkill2(user);
        narrator.playDialogueSleep(39,3000);
    }
}













