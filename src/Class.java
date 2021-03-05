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
                String classSkill = classInfo[0];
                int classHP = Integer.parseInt(classInfo[1]);
                String className = classInfo[2];

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
