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

        boolean GameOver = false;

        while (!GameOver) {

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
            narrator.playDialogueSleep(8, 3000);


            ArrayList<Weapon> weaponList = Weapon.createWeaponList();
            ArrayList<Class> classList = Class.classList();
            ArrayList<Skill> skillList = Skill.createSkillList();
            ArrayList<Skill> playerSkills = new ArrayList();

            for (Weapon w : weaponList) {
                System.out.println(w.toString());
            }
            narrator.playDialogueSleep(9, 3000);

            boolean isValid = false;

            while (!isValid) {
                int chosenWeapon = scanner.nextInt();
                int chosenClass = chosenWeapon;
                if (chosenWeapon > weaponList.size()) {
                    System.out.println("Please enter valid choice.");
                    return;

                } else {
                    isValid = true;
                    user.setWeapon(weaponList.get(chosenWeapon));
                    user.setMyClass(classList.get(chosenClass));
                    user.setTotalHP(user.getMyClass().classHP);
                    user.setCurrentHP(user.getMyClass().classHP);
                    narrator.weaponChoice(weaponList, user);
                    user.setPlayerSkills(playerSkills);
                    user.getPlayerSkills().add(skillList.get(5));
                    if (user.getMyClass().classSkillName == skillList.get(0).getSkillName()){
                        user.getPlayerSkills().add(skillList.get(0));

                    }else if(user.getMyClass().classSkillName ==
                            skillList.get(1).getSkillName()){
                        user.getPlayerSkills().add(skillList.get(1));
                    }else if(user.getMyClass().classSkillName ==
                            skillList.get(2).getSkillName()){
                }
            }
            narrator.playDialogueSleep(13, 3000);
            narrator.playDialogueSleep(14, 3000);
            narrator.playDialogueSleep(15, 2500);
            narrator.playDialogueSleep(16, 3000);


            boolean battleOver = true;
            boolean validCommand = false;


            Enemy SkeletonSoldier = new Enemy("SkeletonSoldier",weaponList.get(3));
            ArrayList <Skill> EnemySkills = new ArrayList();
            SkeletonSoldier.setEnemySkills(EnemySkills);
            SkeletonSoldier.getEnemySkills().add(skillList.get(3));
            SkeletonSoldier.getEnemySkills().add(skillList.get(4));


                narrator.playDialogueSleep(17,3000);
                SkeletonSoldier.enemyStrike(user, SkeletonSoldier);
                narrator.playDialogueSleep(21,3000);
                narrator.playDialogueSleep(22,3000);
                narrator.playDialogueSleep(23,3000);
                while(!validCommand) {
                    String response = scanner.next();
                    if (response.equalsIgnoreCase("strike")) {
                        user.getWeapon().strike(user, SkeletonSoldier, narrator);
                        validCommand = true;
                    } else {
                        System.out.println("Please enter [Strike]");
                        return;


                    }
                }
                narrator.playDialogueSleep(27,3000);
                SkeletonSoldier.castEnemySkill1(user,SkeletonSoldier,narrator);
                narrator.playDialogueSleep(28,3000);
                narrator.playDialogueSleep(29,3000);
                narrator.playDialogueSleep(30,3000);
                narrator.playDialogueSleep(31,3000);
                narrator.playDialogueSleep(32,3000);
                 while(!validCommand) {
                     String response = scanner.next();
                     if (response.equalsIgnoreCase("Cast First Aid")) {
                         user.getPlayerSkills().get(0).;
                            validCommand = true;
                        } else {
                            System.out.println("Please enter [Cast First Aid]");
                            return;


                }
            }

                GameOver = true;



            }

         




        }
    }







