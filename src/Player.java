import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private boolean isBerserking = false;
    private Weapon weapon;
    private ArrayList<Skill> playerSkills;
    private ArrayList<Item> inventory;
    private Class myClass;
    private int totalHP;
    private int totalSP;
    private int currentHP;
    private int currentSP;
    private String name;
    private Narrator narrator;
    private boolean alive = true;
    private boolean isDefending = false;

    public Player(String name) {
        this.name = name;

    }

    public boolean isBerserking() {
        return isBerserking;
    }

    public void setBerserking(boolean berserking) {
        isBerserking = berserking;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean isDefending() {
        return isDefending;
    }

    public void setDefending(boolean defending) {
        isDefending = defending;
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
        if (this.weapon.name.equalsIgnoreCase("Dagger")){
            int newHP = (enemy.getCurrentHP() - (this.getWeapon().damage * 2));
            enemy.setCurrentHP(newHP);
        } else {
            int newHP = enemy.getCurrentHP() - this.getWeapon().damage;
            enemy.setCurrentHP(newHP);
        }
        if (this.weapon.name.equalsIgnoreCase("Staff")) {
            narrator.playDialogueSleep(24, 3000);
            narrator.playTextSleep("The enemy is hit for " + this.getWeapon().damage + " damage!",3000);

        } else if (this.weapon.name.equalsIgnoreCase("Sword")) {
            narrator.playDialogueSleep(25, 3000);
            narrator.playTextSleep("The enemy is hit for " + this.getWeapon().damage + " damage!",3000);

        } else if (this.weapon.name.equalsIgnoreCase("Dagger")) {
            narrator.playDialogueSleep(26, 3000);
            narrator.playTextSleep("The enemy is hit for " + (this.getWeapon().damage * 2) + " damage!",3000);

        }
    }
    public void defend(Narrator narrator, boolean isDefending){
        isDefending = true;
        narrator.playTextSleep(this.getName() + "takes a defensive stance!", 3000);
    }
    public void useItem(Narrator narrator, ArrayList<Item> inventory){
        //create a useItem method later

    }
    public void checkStatus(Narrator narrator){
        narrator.playTextSleep((this.getName() + " currently has " + this.getCurrentHP() + " Health Points " +
                " and " + this.getCurrentSP() + " Skill Points."), 3000);
    }


    public void castFirstAid(Narrator narrator){
        int newHP = (this.getCurrentHP() + this.getPlayerSkills().get(1).getSkillDamage());
        this.setCurrentHP(newHP);
        narrator.playTextSleep("You were healed for " + newHP + " health points!",3000);

    }
    public void castSkill1(Enemy enemy, Narrator narrator){
        if (this.getWeapon().name.contains("Staff")){
            narrator.playDialogueSleep(41,3000);
            narrator.playDialogueSleep(42,3000);
        }else if (this.getWeapon().name.contains("Sword")){
            narrator.playDialogueSleep(43,3000);
            narrator.playDialogueSleep(44,3000);
        }else if (this.getWeapon().name.contains("Dagger")){
            narrator.playDialogueSleep(45,3000);
            narrator.playDialogueSleep(46,3000);
        }
        int newHP = (enemy.getCurrentHP() - this.getPlayerSkills().get(0).getSkillDamage());
        enemy.setCurrentHP(newHP);
       narrator.playTextSleep(enemy.getEnemyName() + " was damaged for "
               + this.getPlayerSkills().get(0).getSkillDamage()
               + " health points!",3000);


    }

    public void turnPrompt(Enemy enemy, Narrator narrator, Scanner scanner, Scanner scanner2){
        boolean validCommand = true;
        while (!validCommand) {
            String response = scanner.next();
            if (response.equalsIgnoreCase("strike")) {
                this.strike(enemy, narrator);
                validCommand = true;
            } else if (response.equalsIgnoreCase("skill")) {
                narrator.playTextSleep("Which Skill?",3000);
                this.getPlayerSkills();

                String response2 = scanner2.next();

                if (response2.equalsIgnoreCase(this.getPlayerSkills().get(0).getSkillName())){
                    this.castSkill1(enemy,narrator);
                    validCommand = true;

                } else if (response2.equalsIgnoreCase(this.getPlayerSkills().get(1).getSkillName())){
                    this.castFirstAid(narrator);
                    validCommand = true;
                }
            } else if (response.equalsIgnoreCase("defend")){
                this.defend(narrator,isDefending);
                validCommand = true;

            } else if (response.equalsIgnoreCase("item")){
                this.useItem(narrator,inventory);
                validCommand = true;
            } else if (response.equalsIgnoreCase("status")){
                this.checkStatus(narrator);
                validCommand = true;

            }else {
                narrator.playTextSleep("Please enter a valid Action.", 3000);
            }
        }


    }
}

