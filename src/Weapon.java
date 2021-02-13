import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Weapon {
    int damage; //To DO: Create an int Array for damage range
    int durability;
    int critChance;
    String name;

    public Weapon(int damage, int durability, int critChance, String name) {
        this.damage = damage;
        this.durability = durability;
        this.critChance = critChance;
        this.name = name;
    }




    public static ArrayList<Weapon> chooseWeapon() {

        BufferedReader inputStream = null;
        ArrayList<Weapon> weaponList = new ArrayList<>();

            try {
            inputStream = new BufferedReader(new FileReader(Path.WEAPONS.path));

            String weapon;

            while ((weapon = inputStream.readLine()) != null) {
                String [] weaponInfo = weapon.split(",");
                int damage = Integer.parseInt(weaponInfo[0]);
                int durability = Integer.parseInt(weaponInfo[1]);
                int critChance = Integer.parseInt(weaponInfo[2]);
                String name = weaponInfo[3];

                Weapon weapon1 = new Weapon(damage,durability,critChance,name);
                weaponList.add(weapon1);

            }

        } catch (
        FileNotFoundException e) {
            e.printStackTrace();
        } catch (
        IOException e) {
            e.printStackTrace();
        }


            return weaponList;

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

    @Override
    public String toString() {
        return "Weapon{" +
                "damage=" + damage +
                ", durability=" + durability +
                ", critChance=" + critChance +
                ", name='" + name + '\'' +
                '}';
    }
}