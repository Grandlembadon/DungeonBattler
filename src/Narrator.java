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

    public void playDialogueSleep(int dialogueIndex, int sleepTimeMs) {
        String dialogueLine = this.dialogueList.get(dialogueIndex);
        System.out.println(dialogueLine);
        try {
            Thread.sleep(sleepTimeMs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void welcomePlayer(String userName) {
        System.out.println("Welcome, " + userName + ", and may your quest prove victorious.");
    }

    public void promptEnter() {
        Scanner scanner = new Scanner(System.in);
        String response = scanner.next();

        try {
            if (response.equalsIgnoreCase("yes")) {
                this.playDialogueSleep(4,3000);

            } else {
                this.playDialogue(5);
            }

        } catch (Exception a) {
            System.out.println("Please enter a valid input.");

        }


    }
    public void weaponChoice(ArrayList<Weapon> weaponlist) {
        if (weaponlist.= )

    }
}
