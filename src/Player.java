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

    public void strike(Enemy enemy, Narrator narrator) {
        int newHP = (enemy.getCurrentHP() - this.getWeapon().damage);
        enemy.setCurrentHP(newHP);
        if (this.weapon.name.equalsIgnoreCase("Staff")) {
            narrator.playDialogueSleep(24, 3000);
            narrator.playBattleTextSleep("The enemy is hit for " + this.getWeapon().damage + " damage!",3000);

        } else if (this.weapon.name.equalsIgnoreCase("Sword")) {
            narrator.playDialogueSleep(25, 3000);
            narrator.playBattleTextSleep("The enemy is hit for " + this.getWeapon().damage + " damage!",3000);

        } else if (this.weapon.name.equalsIgnoreCase("Dagger")) {
            narrator.playDialogueSleep(26, 3000);
            narrator.playBattleTextSleep("The enemy is hit for " + this.getWeapon().damage + " damage!",3000);

        }
    }
    public void castFirstAid(){
        int newHP = (this.getCurrentHP() + this.getPlayerSkills().get(0).getSkillDamage());
        this.setCurrentHP(newHP);
        this.getNarrator().playBattleTextSleep("You were healed for " + newHP + " health points!",3000);

    }
    public void castSkill1(Enemy enemy, ArrayList<Skill> skillList){
        if (this.getPlayerSkills().get(1).getSkillName() == skillList.get(0).getSkillName()) {
            this.getNarrator().playDialogueSleep(38,3000);
            this.getNarrator().playDialogueSleep(39,3000);
        }else if (this.getPlayerSkills().get(1).getSkillName() == skillList.get(1).getSkillName()){
            this.getNarrator().playDialogueSleep(40,3000);
            this.getNarrator().playDialogueSleep(41,3000);
        }else if (this.getPlayerSkills().get(1).getSkillName() == skillList.get(2).getSkillName()){
            this.getNarrator().playDialogueSleep(42,3000);
            this.getNarrator().playDialogueSleep(43,3000);
        }
        int newHP = (enemy.getCurrentHP() - this.getPlayerSkills().get(1).getSkillDamage());
        enemy.setCurrentHP(newHP);
        this.getNarrator().playBattleTextSleep(enemy.getEnemyName() + " was damaged for " + newHP + " health points!",3000);


    }
}

