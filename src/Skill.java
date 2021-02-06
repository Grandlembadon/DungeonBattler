public class Skill {
    int skillCost;
    int [] skillDamageRange;
    int numberOfUses;
    String skillName;

    public Skill(int skillCost, int[] skillDamageRange, int numberOfUses, String skillName) {
        this.skillCost = skillCost;
        this.skillDamageRange = skillDamageRange;
        this.numberOfUses = numberOfUses;
        this.skillName = skillName;
    }

    public Skill() {

    }

    public int getSkillCost() {
        return skillCost;
    }

    public void setSkillCost(int skillCost) {
        this.skillCost = skillCost;
    }

    public int[] getSkillDamageRange() {
        return skillDamageRange;
    }

    public void setSkillDamageRange(int[] skillDamageRange) {
        this.skillDamageRange = skillDamageRange;
    }

    public int getNumberOfUses() {
        return numberOfUses;
    }

    public void setNumberOfUses(int numberOfUses) {
        this.numberOfUses = numberOfUses;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }
}

