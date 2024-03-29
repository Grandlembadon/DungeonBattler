
import java.util.ArrayList;
import java.util.Scanner;

public class DungeonBattlerController {
    public void play() {
        boolean gameOver = false;

        while (!gameOver) {


            Narrator narrator = new Narrator();
            Scanner scanner = new Scanner(System.in);
            narrator.init();

            ArrayList<Weapon> weaponList = Weapon.createWeaponList();
            ArrayList<Weapon> enemyWeaponList = Weapon.createEnemyWeaponList();
            ArrayList<Class> classList = Class.classList();
            ArrayList<Skill> skillList = Skill.createSkillList();
            ArrayList<Skill> playerSkills = new ArrayList();
            ArrayList<Enemy> enemyList = Enemy.createEnemyList();
            ArrayList<Item> itemList = Item.createItemList();


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

            narrator.playDialogueSleep(13, 3000);
            narrator.playDialogueSleep(14, 3000);
            narrator.playDialogueSleep(15, 2500);
            narrator.playDialogueSleep(16, 3000); //Battle Start


            boolean validCommand = false;


            Enemy SkeletonSoldier = new Enemy(enemyList.get(0).getEnemyHP(), enemyList.get(0).getEnemySP(),
                    enemyList.get(0).getEnemyName(), enemyWeaponList.get(0));
            ArrayList<Skill> EnemySkills = new ArrayList();
            SkeletonSoldier.setEnemySkills(EnemySkills);
            SkeletonSoldier.getEnemySkills().add(skillList.get(3));
            SkeletonSoldier.getEnemySkills().add(skillList.get(4));

            SkeletonSoldier.enemyStrike(user, narrator);
            narrator.playDialogueSleep(21, 3000);
            narrator.playDialogueSleep(22, 3000);
            narrator.playDialogueSleep(23, 3000);
            while (!validCommand) {
                String response = scanner.next();
                if (response.equalsIgnoreCase("strike")) {
                    user.strike(SkeletonSoldier, narrator);
                    validCommand = true;
                } else {
                    System.out.println("Please enter [Strike]");

                }
            }
            narrator.playDialogueSleep(27, 3000);
            narrator.playDialogueSleep(28, 3000);
            SkeletonSoldier.castEnemySkill1(user, narrator);
            SkeletonSoldier.setCoolDown1(true);
            narrator.playDialogueSleep(29, 3000);
            narrator.playDialogueSleep(30, 3000);
            narrator.playDialogueSleep(31, 3000);
            validCommand = false;

            while (!validCommand) {

                Scanner scanner2 = new Scanner(System.in);
                Scanner scanner3 = new Scanner(System.in);
                narrator.playDialogueSleep(32, 3000);
                String firstAidResponse = scanner2.nextLine();

                if (firstAidResponse.equalsIgnoreCase("skill")) {
                    narrator.playTextSleep("Which Skill?", 3000);
                    String firstAidResponse2 = scanner3.nextLine();
                    if (firstAidResponse2.equalsIgnoreCase("first aid")) {
                        user.castFirstAid(narrator);
                        validCommand = true;
                    }

                } else {
                    System.out.println("Please enter a valid command");
                }
            }
            SkeletonSoldier.enemyStrike(user, narrator);
            narrator.playDialogueSleep(33, 3000);
            narrator.playDialogueSleep(34, 3000);
            narrator.playDialogueSleep(35, 3000);
            validCommand = true;
            while (!validCommand) {
                Scanner scanner3 = new Scanner(System.in);
                String skillResponse = scanner3.nextLine();
                if (skillResponse.equalsIgnoreCase("Cast Skill 1")) {
                    user.castSkill1(SkeletonSoldier, narrator);
                    validCommand = true;
                } else {
                    System.out.println("Please enter [Cast Skill 1]");
                }
            }
            narrator.playDialogueSleep(36, 3000);
            SkeletonSoldier.castEnemySkill2(user, narrator);
            SkeletonSoldier.setCoolDown2(true);
            boolean battleOver = false;
            narrator.playDialogueSleep(37, 3000);
            narrator.playDialogueSleep(37, 3000);
            narrator.playDialogueSleep(37, 3000);
            narrator.playDialogueSleep(37, 3000);
            narrator.playDialogueSleep(37, 3000);
            narrator.playDialogueSleep(37, 3000);




            while (user.getCurrentHP() > 0 || SkeletonSoldier.getEnemyCurrentHP() > 0) {
                user.turnPrompt(SkeletonSoldier, narrator, scanner, scanner);
                SkeletonSoldier.enemyAI(user);

            }

        }


    }

}
















