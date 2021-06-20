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



}

