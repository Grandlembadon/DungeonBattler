import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Class {

    public Class() {
    }

    public static ArrayList<Class> classList() {

        BufferedReader inputStream = null;
        ArrayList<Weapon> classList = new ArrayList<>();

        try {
            inputStream = new BufferedReader(new FileReader(Path.CLASSES.path));

            String classline;

            while ((classline = inputStream.readLine()) != null) {
                String [] classInfo = classline.split(",");
                Skill classSkill = Skill.parseInt(weaponInfo[0]);
                int durability = Integer.parseInt(weaponInfo[1]);
                int critChance = Integer.parseInt(weaponInfo[2]);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
