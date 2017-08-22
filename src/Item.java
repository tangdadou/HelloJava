/**
 * Created by zhangzhiwei on 24/3/17.
 */

public class Item extends Object {
    String name;
    int price;
//    public Item(String itemname){
//        name = itemname;
//    }
    public void buy() {
        System.out.println("购买");
    }
    public void effect(){
        System.out.println("物品使用后，可以有效果");
    }

    @Override
    public String toString(){
        return name+price;
    }


    @Override
    public boolean equals(Object o){

        if(o instanceof Item){
            if(this.price==((Item) o).price)
                return true;
            else return false;
        }
        else return false;

    }

    public static void main(String[] args) {
        Item i = new Itemfirst();
        Item j = new Itemsec();

        i.effect();

        j.effect();




    }
}