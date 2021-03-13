import java.util.ArrayList;

public class Enemy extends Player {
    Narrator narrator;
    ArrayList<Skill> skillArraylist;

    public Enemy(Narrator narrator) {
        this.narrator = narrator;
    }
    public Enemy() {

    }
}
