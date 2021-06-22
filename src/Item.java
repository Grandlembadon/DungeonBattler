import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Item {
    private String itemName;
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Item(String itemName, int itemQuantity) {
        this.itemName = itemName;
    }
    public Item() {

    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void useItem(Narrator narrator){
        int newQuantity = this.getQuantity() - 1;
        this.setQuantity(newQuantity);


    }
    public void discardItem(){

    }
    public void sellItem(){

    }
    public static ArrayList<Item> createItemList() {

        BufferedReader inputStream = null;
        ArrayList<String> itemList = new ArrayList<>();

        try {
            inputStream = new BufferedReader(new FileReader(Path.ITEMLIST.path));

            String itemLine;

            while ((itemLine = inputStream.readLine()) != null) {
                itemLine = itemLine.trim();

                if ((itemLine.length() != 0)) {
                    itemList.add(itemLine);
                }

            }

        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }


        return skillList;

    }



}

