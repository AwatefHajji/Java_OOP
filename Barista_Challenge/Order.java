import java.util.ArrayList;
public class Order{
    //member variables
    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items;
     // Constractor
    public Order(){
        this.name = "Guest";
        this.total = total;
        this.ready = ready;
        this.items = new ArrayList<Item>();
    }
    public Order(String name){
        this.name = name;
        this.total = total;
        this.ready = ready;
        this.items = new ArrayList<Item>();
    }
    public void addItem(Item item) {
        this.items.add(item);
    }
    public String getStatusMessage(){
        if(getIsReady() == true) return "Your order is ready";
        else return "Thank you for waiting. Your order will be ready soon.";   
    }
    public double getOrderTotal(){
        double orderTotal =0;
        for(Item item : items){
            orderTotal+= item.getPrice();
        }
        return orderTotal;
    }
    public String display(){
        String affichage="";
        System.out.println(getName());
        for(Item item : items){
            affichage.concat(item.getName() + "- $" + item.getPrice());
        }
    return affichage;
    }



    // getter & setter
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public boolean getIsReady(){
        return this.ready;
    }
    public void setIsReady(boolean isReady){
        this.ready = isReady;
    }
    public ArrayList<Item> getItems(){
        return this.items;
    }
    public void setItems(ArrayList<Item> items){
        this.items= items;
    }

}