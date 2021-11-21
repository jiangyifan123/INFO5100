package Question5_3;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> list;
    ShoppingCart(){
        list = new ArrayList<>();
    }

    public void addItem(Item item1) {
        list.add(item1);
    }

    public void removeItem(Item item1){
        list.remove(item1);
    }

    public int calculateTotal(){
        int sum = 0;
        for(Item item: list){
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy ps){
        ps.pay(this.calculateTotal());
    }
}
