import java.util.ArrayList;

public class Player {
    private Item[] inventory;
    private Weapon weapon;
    private ArrayList<Skill> playerSkills;
    private Class myClass;
    private int totalHP;
    private int totalSP;
    private int currentHP;
    private int currentSP;
    private String name;
    private Narrator narrator;

    public Player(String name) {
        this.name = name;
    }

    public Item[] getInventory() {
        return inventory;
    }

    public void setInventory(Item[] inventory) {
        this.inventory = inventory;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setWeapon(int wepNum) {
        this.weapon = weapon;

    }

    public ArrayList<Skill> getPlayerSkills() {
        return playerSkills;
    }

    public void setPlayerSkills(ArrayList<Skill> playerSkills) {
        this.playerSkills = playerSkills;
    }

    public Class getMyClass() {
        return myClass;
    }

    public void setMyClass(Class myClass) {
        this.myClass = myClass;
    }

    public int getTotalHP() {
        return totalHP;
    }

    public void setTotalHP(int totalHP) {
        this.totalHP = totalHP;
    }

    public int getTotalSP() {
        return totalSP;
    }

    public void setTotalSP(int totalSP) {
        this.totalSP = totalSP;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    public int getCurrentSP() {
        return currentSP;
    }

    public void setCurrentSP(int currentSP) {
        this.currentSP = currentSP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player() {


    }

    public Narrator getNarrator() {
        return narrator;
    }

    public void setNarrator(Narrator narrator) {
        this.narrator = narrator;
    }
}

