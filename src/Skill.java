import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Skill {
    private String skillName;
    private int skillCost;
    private int skillDamage;


    public Skill() {

    }
    public static ArrayList<Skill> createWeaponList() {

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

    public int getSkillCost() {
        return skillCost;
    }

    public void setSkillCost(int skillCost) {
        this.skillCost = skillCost;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }
}

