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

    public Player(String[] inventory, Weapon weapon, Skill[] skills, Class myClass, int totalHP, int totalSP, int currentHP, int currentSP, String name) {
        this.inventory = inventory;
        this.weapon = weapon;
        this.skills = skills;
        this.myClass = myClass;
        this.totalHP = totalHP;
        this.totalSP = totalSP;
        this.currentHP = currentHP;
        this.currentSP = currentSP;
        this.name = name;
    }
    public Player(){

    }

    public Player(String name) {
        this.name = name;
    }

    public void choose(Weapon sword) {

    }
    public void choose() {
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

