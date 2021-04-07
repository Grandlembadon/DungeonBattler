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

    public Skill(String skillName, int skillCost, int skillDamage) {
        this.skillName = skillName;
        this.skillCost = skillCost;
        this.skillDamage = skillDamage;
    }

    public static ArrayList<Skill> createSkillList() {

        BufferedReader inputStream = null;
        ArrayList<Skill> skillList = new ArrayList<>();

        try {
            inputStream = new BufferedReader(new FileReader(Path.SKILLS.path));

            String skillLine;

            while ((skillLine = inputStream.readLine()) != null) {
                String [] skillInfo = skillLine.split(",");
                String skillName = skillInfo[0];
                int skillCost = Integer.parseInt(skillInfo[1]);
                int skillDamage = Integer.parseInt(skillInfo[2]);
                Skill skill = new Skill(skillName,skillCost,skillDamage);
                skillList.add(skill);

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

    public void castAttackSkill(Player user,Enemy enemy) {
//          int newHP = (enemy.getCurrentHP() - user.getSkill().skillDamage);
//          enemy.setCurrentHP(newHP);
//        System.out.println(enemy.getEnemyName() + " has taken " + user.getSkill().skillDamage + " damage!" );


    }
    public void castFirstAid(Player user){
        int newHP = (user.getCurrentHP() + user.getPlayerSkills().get(0).skillDamage);
        user.setCurrentHP(newHP);
        user.getNarrator().playBattleTextSleep("You were healed for " + newHP + " health points!",3000)

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

    public int getSkillDamage() {
        return skillDamage;
    }

    public void setSkillDamage(int skillDamage) {
        this.skillDamage = skillDamage;
    }
}

