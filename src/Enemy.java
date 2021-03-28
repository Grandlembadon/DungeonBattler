import java.util.ArrayList;

public class Enemy extends Player {
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
    public Enemy(String enemyName, Weapon enemyWeapon){
        this.enemyName = enemyName;
        this.enemyWeapon = enemyWeapon;

    }


    public Weapon getEnemyWeapon() {
        return enemyWeapon;
    }

    public void enemyStrike(Player user, Enemy enemy) {
        int newHP = (user.getCurrentHP() - enemy.getEnemyWeapon().damage);
        user.setCurrentHP(newHP);


    }
    public void castEnemySkill1(Player user,Enemy enemy) {
        int newHP = (user.getCurrentHP() - enemy.getEnemySkills().get(0).getSkillDamage());
        enemy.setCurrentHP(newHP);

    }
}
