public class Item{
    //member variables
    private String name;
    private double price;
    // Constractor
    public Item(String name, double price){
        this.name=name;
        this.price=price;
    }
     // getter and setter
    
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price=price;
    }

}