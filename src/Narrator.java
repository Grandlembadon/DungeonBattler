import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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

                if ((narrator.length() != 0))
                {
                    String dialogueLine = narrator;
                    dialogueList.add(narrator);
                }


            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
