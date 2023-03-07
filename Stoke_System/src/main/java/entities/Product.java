package entities;

public class Product  {
    //ATTRIBUTES AND METHODS LOWERCASE LETTERS
    //
    public String name;
    public double price;
    public int quantity;

    // CREATING METHODS OF OPERATIONS OR FUNCTIONS

    //search
    public double totalvalueInStock(){
        return price * quantity;
    }
    // para diferenciar o atributo do metodo utilizar this.//

    to update
    public void addProduct( int quantity){
        this.quantity += quantity;
    }
    //remover//
    public void removeProduct( int quantity){
        this.quantity -= quantity;
    }
    // metodo  tostring
    public String toString(){
        return name
                + " ,$"
                + String.format("%.2f",price)
                + ","
                +quantity
                + "units, total : $"
                + String.format("%.2f",totalvalueInStock());

    }





   }




