public class Player {
    private String [] inventory;
    private Weapon weapon;
    private Skill [] skills;
    private Class myClass;
    private int totalHP;
    private int totalSP;
    private int currentHP;
    private int currentSP;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void choose(Weapon sword) {

    }
    public void choose(Weapon) {
        System.out.println("Choosing Weapon...");

    }

    public void attack() {
        System.out.println("Attacking...");

    }
    public void defend() {
        System.out.println("Defending...");

    }
    public void useSkill() {

    }
    public void lastResort() {

    }
    public void init() {
        this.totalHP = 50;

    }
}

