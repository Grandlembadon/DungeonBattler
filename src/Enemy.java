import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Enemy extends Player {
    private int enemyMaxHP;
    private int enemyCurrentHP;
    private int enemySP;
    private String enemyName;
    private Narrator narrator;
    ArrayList<Skill> enemySkills;
    private Weapon enemyWeapon;
    private boolean coolDown1 = false;
    private boolean coolDown2 = false;


    public int getEnemyMaxHP() {
        return enemyMaxHP;
    }

    public void setEnemyMaxHP(int enemyMaxHP) {
        this.enemyMaxHP = enemyMaxHP;
    }

    public int getEnemyCurrentHP() {
        return enemyCurrentHP;
    }

    public void setEnemyCurrentHP(int enemyCurrentHP) {
        this.enemyCurrentHP = enemyCurrentHP;
    }

    public boolean isCoolDown1() {
        return coolDown1;
    }

    public void setCoolDown1(boolean coolDown) {
        this.coolDown1 = coolDown;
    }


    public boolean isCoolDown2() {
        return coolDown2;
    }

    public void setCoolDown2(boolean coolDown2) {
        this.coolDown2 = coolDown2;
    }

    public Enemy(Narrator narrator) {
        this.narrator = narrator;
    }

    public Enemy() {

    }

    public Enemy(String enemyName, Weapon enemyWeapon) {
        this.enemyName = enemyName;
        this.enemyWeapon = enemyWeapon;

    }

    public Enemy(int enemyHP, int enemySP, String enemyName, Weapon enemyWeapon) {
        this.enemyMaxHP = enemyHP;
        this.enemySP = enemySP;
        this.enemyName = enemyName;
        this.enemyWeapon = enemyWeapon;
    }

    public Enemy(int enemyHP, int enemySP, String enemyName) {
        this.enemyMaxHP = enemyHP;
        this.enemySP = enemySP;
        this.enemyName = enemyName;
    }

    public Weapon getEnemyWeapon() {
        return enemyWeapon;
    }

    public static ArrayList<Enemy> createEnemyList() {

        BufferedReader inputStream = null;
        ArrayList<Enemy> enemyList = new ArrayList<>();

        try {
            inputStream = new BufferedReader(new FileReader(Path.ENEMYINFO.path));

            String enemyType;

            while ((enemyType = inputStream.readLine()) != null) {
                String [] enemyInfo = enemyType.split(",");
                int enemyHP = Integer.parseInt(enemyInfo[0]);
                int enemySP = Integer.parseInt(enemyInfo[1]);
                String enemyName = enemyInfo[2];
                Enemy enemy = new Enemy(enemyHP,enemySP,enemyName);
                enemyList.add(enemy);

            }

        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }


        return enemyList;

    }

    public void enemyStrike(Player user, Narrator narrator) {
        int newHP = (user.getCurrentHP() - this.getEnemyWeapon().damage);
        user.setCurrentHP(newHP);
        if (this.enemyName.equalsIgnoreCase("Skeleton Soldier")) {
            narrator.playDialogueSleep(17, 3000);
            narrator.playTextSleep(user.getName() + " takes " + this.getEnemyWeapon().damage
                    + " damage! ", 3000);
        } else if (this.enemyName.equalsIgnoreCase("TheOldShadowKing")) {
            //add Shadow King dialogue
        } else if (this.enemyName.equalsIgnoreCase("VeteranDungeoneer")) {
            //add Veteran dialogue
        }
    }

    public void castEnemySkill1(Player user, Narrator narrator) {
        int newHP = (user.getCurrentHP() - this.getEnemySkills().get(0).getSkillDamage());
        user.setCurrentHP(newHP);
        if (this.enemyName.equalsIgnoreCase("Skeleton Soldier")) {
            narrator.playDialogueSleep(18, 3000);
            narrator.playTextSleep(user.getName() + " takes " + this.getEnemySkills().get(0).getSkillDamage()
        + " damage! ", 3000);
        } else if (this.enemyName.equalsIgnoreCase("TheOldShadowKing")) {
            //add Shadow King dialogue
        } else if (this.enemyName.equalsIgnoreCase("VeteranDungeoneer")) {
            //add Veteran dialogue
        }
        this.setCoolDown1(true);

    }

    public void castEnemySkill2(Player user, Narrator narrator) {
        if (this.enemyName.equalsIgnoreCase("Skeleton Soldier")) {
            narrator.playDialogueSleep(19, 3000);
            narrator.playDialogueSleep(20, 3000);
        } else if (this.enemyName.equalsIgnoreCase("TheOldShadowKing")) {
            // add Shadow King dialogue
        } else if (this.enemyName.equalsIgnoreCase("VeteranDungeoneer")) {
            // add Veteran dialogue
        }
        int newHP = (user.getCurrentHP() - this.getEnemySkills().get(1).getSkillDamage());
        user.setCurrentHP(newHP);
        narrator.playTextSleep((user.getName() + " takes " +
                this.getEnemySkills().get(1).getSkillDamage()
                + " damage!"), 3000);
    }

    public void setSkeletonSkills(ArrayList<Skill> skillList) {
        this.getEnemySkills().add(skillList.get(3));
        this.getEnemySkills().add(skillList.get(4));
    }
    public void enemyAI(Player user) {
        if (user.getCurrentHP() > 0) {
            if (this.isCoolDown1() == false) {
                this.castEnemySkill1(user,narrator);

            }else if(this.isCoolDown2() == false){
                this.castEnemySkill2(user,narrator);
            } else {
                this.enemyStrike(user,narrator);
            }

        }
    }

    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public Narrator getNarrator() {
        return narrator;
    }

    public void setNarrator(Narrator narrator) {
        this.narrator = narrator;
    }

    public ArrayList<Skill> getEnemySkills() {
        return enemySkills;
    }

    public void setEnemySkills(ArrayList<Skill> enemySkills) {
        this.enemySkills = enemySkills;
    }

    public void setEnemyWeapon(Weapon enemyWeapon) {
        this.enemyWeapon = enemyWeapon;
    }

    public int getEnemyHP() {
        return enemyMaxHP;
    }

    public void setEnemyHP(int enemyHP) {
        this.enemyMaxHP = enemyHP;
    }

    public int getEnemySP() {
        return enemySP;
    }

    public void setEnemySP(int enemySP) {
        this.enemySP = enemySP;
    }
}
