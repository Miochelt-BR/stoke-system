package entities;

public class Product  {
    //ATRIBUTOS E METODOS LETRAS MINUSCULAS
    //
    public String name;
    public double price;
    public int quantity;

    // CRIANDOS OS METODOS OPERACOES OU FUNCOES

    //buscar
    public double totalvalueInStock(){
        return price * quantity;
    }
    // para diferenciar o atributo do metodo utilizar this.//

    //atualizar
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




