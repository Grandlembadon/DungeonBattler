import java.util.ArrayList;

public class Enemy extends Player {
    private String enemyName;
    private int enemyHealth;
    Narrator narrator;
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
    public Enemy(String enemyName, Weapon enemyWeapon, ArrayList<Skill> enemySkills){
        this.enemyName = enemyName;
        this.enemyWeapon = enemyWeapon;
        this.enemySkills = enemySkills;
    }


    public Weapon getEnemyWeapon() {
        return enemyWeapon;
    }

    public void enemyStrike(Player user, Enemy enemy) {
        int newHP = (user.getCurrentHP() - enemy.getEnemyWeapon().damage);
        user.setCurrentHP(newHP);


    }

    public void castEnemySkill1(Player user, Enemy enemy, Narrator narrator) {
        int newHP = (user.getCurrentHP() - enemy.getEnemySkills().get(0).getSkillDamage());
        user.setCurrentHP(newHP);
        if (enemy.enemyName.equalsIgnoreCase("SkeletonSoldier")) {
            narrator.playDialogueSleep(18, 3000);
        } else if (enemy.enemyName.equalsIgnoreCase("TheOldShadowKing")) {
            //add Shadow King dialogue
        } else if (enemy.enemyName.equalsIgnoreCase("VeteranDungeoneer")) {
            //add Veteran dialogue
        }

    }

    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public int getEnemyHealth() {
        return enemyHealth;
    }

    public void setEnemyHealth(int enemyHealth) {
        this.enemyHealth = enemyHealth;
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
}
