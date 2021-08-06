import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Narrator {
    ArrayList<String> dialogueList;

    public Narrator() {

    }

    public void init() {
        BufferedReader inputStream = null;
        this.dialogueList = new ArrayList<>();

        try {
            inputStream = new BufferedReader(new FileReader(Path.DIALOGUE.path));

            String dialogueLine;

            while ((dialogueLine = inputStream.readLine()) != null) {
                dialogueLine = dialogueLine.trim();

                if ((dialogueLine.length() != 0)) {
                    dialogueList.add(dialogueLine);
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void playDialogue(int dialogueIndex) {
        String dialogueLine = this.dialogueList.get(dialogueIndex);
        System.out.println(dialogueLine);

    }

    public void playDialogue(int dialogueIndex) {
        String dialogueLine = this.dialogueList.get(dialogueIndex);
        System.out.println(dialogueLine);

    }


    public void playDialogueSleep(int dialogueIndex, int sleepTimeMs) {
        String dialogueLine = this.dialogueList.get(dialogueIndex);
        System.out.println(dialogueLine);
        try {
            Thread.sleep(sleepTimeMs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }

    public void playDialogueSleepSpace(int dialogueIndex, int sleepTimeMs) {
        String dialogueLine = this.dialogueList.get(dialogueIndex);
        System.out.println(dialogueLine + System.lineSeparator());
        try {
            Thread.sleep(sleepTimeMs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void playTextSleep(String text, int sleepTimeMs){
        System.out.println(text);
        try {
            Thread.sleep(sleepTimeMs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void welcomePlayer(String userName) {
        this.playTextSleep("Welcome, " + userName + ", and may your quest prove victorious.", 3000);
    }

    public boolean promptEnter() {
        Scanner scanner = new Scanner(System.in);
        String response = scanner.next();

        try {
            if (response.equalsIgnoreCase("yes")) {
                this.playDialogueSleep(4,3000);
                return true;

            } else {
                this.playDialogueSleep(5,3000);
                System.out.println("GAME OVER.");
                return false;

            }

        } catch (Exception a) {
            System.out.println("Please enter a valid input.");

        }


        return false;
    }
    public void weaponChoice(Player user) {
        if (user.getWeapon().name.contains("Staff")){
            this.playDialogueSleep(10,3000);

        } else if (user.getWeapon().name.contains("Sword")){
            this.playDialogueSleep(11,3000);
        } else if (user.getWeapon().name.contains("Dagger")){
            this.playDialogueSleep(12,3000);
        }

    }
}
