package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int suma = 0, sk;

        do {
            System.out.print("Iveskite skaiciu ");
            sk = in.nextInt();

            suma += sk;
        } while(sk != 0);
        System.out.print("suma : " + suma);
    }
}
