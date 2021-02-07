public class Weapon {
    int[] damageRange;
    int durability;
    int critChance;
    String name;

    public Weapon(int[] damageRange, int durability, int critChance, String name) {
        this.damageRange = damageRange;
        this.durability = durability;
        this.critChance = critChance;
        this.name = name;
    }




    public Weapon() {

    }

    public void strike() {

    }
    public void description() {

    }

    public void parry() {
        System.out.println("You have Parried the enemy attack!");

    }

    public void extraAttack() {
        System.out.println("Double Strike!");

    }

}