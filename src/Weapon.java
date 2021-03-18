import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Weapon {
    int damage; //To DO: Create an int Array for damage range
    int critDamage;
    int critChance;
    String name;

    public Weapon(int damage, int critDamage, int critChance, String name) {
        this.damage = damage;
        this.critDamage = critDamage;
        this.critChance = critChance;
        this.name = name;
    }


    public static ArrayList<Weapon> createWeaponList() {

        BufferedReader inputStream = null;
        ArrayList<Weapon> weaponList = new ArrayList<>();

            try {
            inputStream = new BufferedReader(new FileReader(Path.WEAPONS.path));

            String weaponline;

            while ((weaponline = inputStream.readLine()) != null) {
                String [] weaponInfo = weaponline.split(",");
                int damage = Integer.parseInt(weaponInfo[0]);
                int critDamage = Integer.parseInt(weaponInfo[1]);
                int critChance = Integer.parseInt(weaponInfo[2]);
                String name = weaponInfo[3];
                Weapon weapon = new Weapon(damage,critDamage,critChance,name);
                weaponList.add(weapon);

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


    @Override
    public String toString() {
        return "The " + name + " has " + damage + " damage, " + critChance +
                " and critical chance.";
    }
}