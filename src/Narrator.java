import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Narrator {
    String dialogueLine;

    public Narrator(String dialogueLine) {
        this.dialogueLine = dialogueLine;
    }

    public static ArrayList<String> playDialogue(){
        BufferedReader inputStream = null;
        ArrayList<String> dialogueList = new ArrayList<>();

        try {
            inputStream = new BufferedReader(new FileReader(Path.DIALOGUE.path));

            String dialogue;

            while ((dialogue = inputStream.readLine()) != null) {

            }

        }
    }
}
