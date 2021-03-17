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
    public Enemy(String enemyName, Weapon enemyWeapon){
        this.enemyName = enemyName;
        this.enemyWeapon = enemyWeapon;

    }

    public Weapon getEnemyWeapon() {
        return enemyWeapon;
    }
}
