import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Narrator {
    ArrayList<String> dialogueList;

    public Narrator() {

    }

    public void init(){
        BufferedReader inputStream = null;
        this.dialogueList = new ArrayList<>();

        try {
            inputStream = new BufferedReader(new FileReader(Path.DIALOGUE.path));

            String dialogueLine;

            while ((dialogueLine = inputStream.readLine()) != null)
            {
                dialogueLine = dialogueLine.trim();

                if ((dialogueLine.length() != 0))
                {
                    dialogueList.add(dialogueLine);
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void playDialogue(int dialogueIndex){
        String dialogueLine = this.dialogueList.get(dialogueIndex);
        System.out.println(dialogueLine);

    }
}
