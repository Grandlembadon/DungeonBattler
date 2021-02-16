import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Narrator {
    String dialogue;

    public Narrator(String dialogueLine) {
        this.dialogue = dialogueLine;
    }

    public static ArrayList<String> playDialogue(){
        BufferedReader inputStream = null;
        ArrayList<String> dialogueList = new ArrayList<>();

        try {
            inputStream = new BufferedReader(new FileReader(Path.DIALOGUE.path));

            String narrator;

            while ((narrator = inputStream.readLine()) != null)
            {
                narrator = narrator.trim();
                String dialogue = narrator;
                if ((narrator.length() != 0))
                {
                    dialogueList.add(narrator);
                }


            }

        }
    }
}
