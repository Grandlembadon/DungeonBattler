import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Class {
    String classSkillName;
    int classHP;
    String className;

    public Class(String classSkillName, int classHP, String className) {
        this.classSkillName = classSkillName;
        this.classHP = classHP;
        this.className = className;
    }

    public Class() {
    }

    public static ArrayList<Class> classList() {

        BufferedReader inputStream = null;
        ArrayList<Class> classList = new ArrayList<>();

        try {
            inputStream = new BufferedReader(new FileReader(Path.CLASSES.path));

            String classline;

            while ((classline = inputStream.readLine()) != null) {
                String [] classInfo = classline.split(",");
                String classSkillName = classInfo[0];
                int classHP = Integer.parseInt(classInfo[1]);
                String className = classInfo[2];

                Class myclass = new Class(classSkillName,classHP,className);
                classList.add(myclass);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return classList;
    }
}
