package org.application;

import java.util.Locale;
import  java.util.Scanner;
import  entities.Product;
public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("in coming to stoke system:");

        Product product = new Product();
        System.out.println(" Enter  product date:");
        System.out.println("name: ");
        product.name= sc.nextLine();
        System.out.println("price: ");
        product.price= sc.nextDouble();
        System.out.print("Quantity In Stoke:");
       product.quantity= sc.nextInt();
        System.out.println("prduct data:"+ product);
        System.out.println();

        // entrada  em Stock:
        System.out.println("Enter com  numero de produtcts to be added in stock:");
        int quantity= sc.nextInt();
        product.addProduct(quantity);
        System.out.println();
        System.out.println("updated data:"+ product);

        System.out.println();

        System.out.println("Enter com  numero de produtcts to be removed in stock:");
        quantity = sc.nextInt();
        product.removeProduct(quantity);
        System.out.println("updated data:"+ product);


        System.out.println();



        //anteriormente sem usar a funcao tostring
        //~system.out.println(product.name + ","+product.price + ","+product.quantity);
        sc.close();
}
}