package kiosk;

import java.util.ArrayList;

public class Cart {
    ArrayList <CartItem> items=new ArrayList<>();

    public void addItem(Menu menu) {
        for(CartItem item:items){
            if(item.getMenu().getName().equals(menu.getName())){
                item.setCount(item.getCount()+1);
                return;
            }
        }
        items.add(new CartItem(menu));

    }
    public ArrayList<CartItem> getItems(){
        return items;
    }
}
