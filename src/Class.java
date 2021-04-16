import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Class {
    private String classSkillName;
    private int classHP;
    private int classSP;
    private String className;

    public Class(String classSkillName, int classHP, int classSP, String className) {
        this.classSkillName = classSkillName;
        this.classHP = classHP;
        this.classSP = classSP;
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
                int classSP = Integer.parseInt(classInfo[2]);
                String className = classInfo[3];

                Class myclass = new Class(classSkillName,classHP, classSP,className);
                classList.add(myclass);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return classList;
    }

    public String getClassSkillName() {
        return classSkillName;
    }

    public void setClassSkillName(String classSkillName) {
        this.classSkillName = classSkillName;
    }

    public int getClassHP() {
        return classHP;
    }

    public void setClassHP(int classHP) {
        this.classHP = classHP;
    }

    public int getClassSP() {
        return classSP;
    }

    public void setClassSP(int classSP) {
        this.classSP = classSP;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
