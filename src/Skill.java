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
    public static ArrayList<Skill> createSkillList() {

        BufferedReader inputStream = null;
        ArrayList<Skill> SkillList = new ArrayList<>();

        try {
            inputStream = new BufferedReader(new FileReader(Path.SKILLS.path));

            String skillLine;

            while ((skillLine = inputStream.readLine()) != null) {
                String [] skillInfo = skillLine.split(",");
                int damage = Integer.parseInt(weaponInfo[0]);
                int critDamage = Integer.parseInt(weaponInfo[1]);
                int critChance = Integer.parseInt(weaponInfo[2]);
                String name = weaponInfo[3];
                Weapon weapon = new Weapon(damage,critDamage,critChance,name);
                skillList.add(weapon);

            }

        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }


        return skillList;

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

