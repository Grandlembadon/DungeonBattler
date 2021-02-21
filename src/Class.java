import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Class {
    String classAbility;
    int classHP;
    String className;

    public Class(String classAbility, int classHP, String className) {
        this.classAbility = classAbility;
        this.classHP = classHP;
        this.className = className;
    }

    public static ArrayList<Class> classList() {

        BufferedReader inputStream = null;
        ArrayList<Weapon> classList = new ArrayList<>();

        try {
            inputStream = new BufferedReader(new FileReader(Path.CLASSES.path));

            String weapon;

            while ((weapon = inputStream.readLine()) != null) {
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
