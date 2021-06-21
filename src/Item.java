import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Item {
    private String itemName;
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Item(String itemName, int itemQuantity) {
        this.itemName = itemName;
    }
    public Item() {

    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void useItem(Narrator narrator){
        int newQuantity = this.getQuantity() - 1;
        this.setQuantity(newQuantity);


    }
    public void discardItem(){

    }
    public void sellItem(){

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



}

