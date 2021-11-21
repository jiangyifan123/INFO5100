package Question5_3;

public class Item extends ShoppingCart{
    private String Id;
    private int price;
    public Item(String s, int i) {
        super();
        Id = s;
        price = i;
    }

    public int getPrice() {
        return price;
    }

    public String getId() {
        return Id;
    }
}
