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

    public Item(String itemName) {
        this.itemName = itemName;
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
        ArrayList<Item> itemList = new ArrayList<>();

        try {
            inputStream = new BufferedReader(new FileReader(Path.ITEMLIST.path));

            String itemname;

            while ((itemname = inputStream.readLine()) != null) {
                

            }

        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }


        return itemList;

    }



}

