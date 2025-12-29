package kiosk;

public class CartItem {
    // 메뉴랑 가격 받으면 됨
    private Menu menu;
    private int count=1;

    public CartItem(Menu menu){
        this.menu=menu;
    }

    public Menu getMenu(){
        return menu;
    }

    public int getCount(){
        return count;
    }

    public void setCount(int count){
        this.count=count;
    }

    public int totalPrice(){
        return menu.getPrice()*count;
    }
}
