import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Enemy extends Player {
    private int enemyHP;
    private int enemySP;
    private String enemyName;
    private Narrator narrator;
    ArrayList<Skill> enemySkills;
    private Weapon enemyWeapon;

    public Enemy(Narrator narrator) {
        this.narrator = narrator;
    }

    public Enemy() {

    }

    public Enemy(String enemyName, Weapon enemyWeapon) {
        this.enemyName = enemyName;
        this.enemyWeapon = enemyWeapon;

    }

    public Weapon createEnemyList() {
        return enemyWeapon;
    }

    public static ArrayList<Skill> createSkillList() {

        BufferedReader inputStream = null;
        ArrayList<Skill> skillList = new ArrayList<>();

        try {
            inputStream = new BufferedReader(new FileReader(Path.SKILLS.path));

            String skillLine;

            while ((skillLine = inputStream.readLine()) != null) {
                String [] skillInfo = skillLine.split(",");
                String skillName = skillInfo[0];
                int skillCost = Integer.parseInt(skillInfo[1]);
                int skillDamage = Integer.parseInt(skillInfo[2]);
                Skill skill = new Skill(skillName,skillCost,skillDamage);
                skillList.add(skill);

            }

        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }


        return skillList;

    }

    public void enemyStrike(Player user, Narrator narrator) {
        int newHP = (user.getCurrentHP() - this.getEnemyWeapon().damage);
        user.setCurrentHP(newHP);
        narrator.playBattleTextSleep(user.getName() + " takes "
                + this.getEnemyWeapon().damage
                + " damage!", 3000);
    }

    public void castEnemySkill1(Player user, Narrator narrator) {
        int newHP = (user.getCurrentHP() - this.getEnemySkills().get(0).getSkillDamage());
        user.setCurrentHP(newHP);
        if (this.enemyName.equalsIgnoreCase("SkeletonSoldier")) {
            narrator.playDialogueSleep(18, 3000);
            narrator.playBattleTextSleep(user.getName() + " takes " + this.getEnemySkills().get(0).getSkillDamage()
        + " damage! ", 3000);
        } else if (this.enemyName.equalsIgnoreCase("TheOldShadowKing")) {
            //add Shadow King dialogue
        } else if (this.enemyName.equalsIgnoreCase("VeteranDungeoneer")) {
            //add Veteran dialogue
        }

    }

    public void castEnemySkill2(Player user) {
        int newHP = (user.getCurrentHP() - this.getEnemySkills().get(1).getSkillDamage());
        user.setCurrentHP(newHP);
        if (this.enemyName.equalsIgnoreCase("SkeletonSoldier")) {
            narrator.playDialogueSleep(19, 3000);
            narrator.playDialogueSleep(20, 3000);
        } else if (this.enemyName.equalsIgnoreCase("TheOldShadowKing")) {
            // add Shadow King dialogue
        } else if (this.enemyName.equalsIgnoreCase("VeteranDungeoneer")) {
            // add Veteran dialogue
        }
    }

    public void setSkeletonSkills(ArrayList<Skill> skillList) {
        this.getEnemySkills().add(skillList.get(3));
        this.getEnemySkills().add(skillList.get(4));
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
        return enemyHP;
    }

    public void setEnemyHP(int enemyHP) {
        this.enemyHP = enemyHP;
    }

    public int getEnemySP() {
        return enemySP;
    }

    public void setEnemySP(int enemySP) {
        this.enemySP = enemySP;
    }
}
