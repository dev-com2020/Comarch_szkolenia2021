package com.company;


import java.time.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("Mleko", 3.5);
        Product product2 = new Product("Mleko", 3.5);

        System.out.println(product1 == product2);
        System.out.println(product1.equals(product2));

        Scanner scan =new Scanner(System.in);
        String f = scan.nextLine();
        String f2 = scan.nextLine();

        System.out.println(f == f2);
        System.out.println(f.equals(f2));



    }

}




