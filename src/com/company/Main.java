package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        Circle a = new Circle();
        // a.setR(in.nextInt());
        System.out.println(a.Lenth(r));
        System.out.println(a.Square(r));


    }
}