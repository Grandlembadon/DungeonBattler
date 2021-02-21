import java.io.BufferedReader;
import java.io.FileReader;
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
        ArrayList<Weapon> weaponList = new ArrayList<>();

        try {
            inputStream = new BufferedReader(new FileReader(Path.WEAPONS.path));

            String weapon;

            while ((weapon = inputStream.readLine()) != null) {
    }


}
