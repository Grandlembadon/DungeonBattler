import java.util.ArrayList;

public class Enemy extends Player {
    private String enemyName;
    private int enemyHealth;
    Narrator narrator;
    ArrayList<Skill> enemySkills;

    public Enemy(Narrator narrator) {
        this.narrator = narrator;
    }
    public Enemy() {

    }
    public Enemy(String enemyName){
        this.enemyName = enemyName;

    }
}
