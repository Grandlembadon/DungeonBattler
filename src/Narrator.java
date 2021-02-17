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

    public Narrator() {

    }

    public static void narratorBegin(){
        Narrator narrator = new Narrator();
        Narrator.createDialogue();
        


    }

    public static void createDialogue(){
        BufferedReader inputStream = null;
        ArrayList<Narrator> dialogueList = new ArrayList<>();

        try {
            inputStream = new BufferedReader(new FileReader(Path.DIALOGUE.path));

            String narrator;

            while ((narrator = inputStream.readLine()) != null)
            {
                narrator = narrator.trim();

                if ((narrator.length() != 0))
                {
                    String dialogueLine = narrator;
                    Narrator myNarrator = new Narrator(dialogueLine);
                    dialogueList.add(myNarrator);
                }


            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String playDialogue(ArrayList<Narrator> dialogueList){


    }
}
