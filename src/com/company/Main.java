package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
        int k;
        Scanner inp= new Scanner(System.in);


        System.out.println("Sınır Değerini Giriniz");
        k= inp.nextInt();
        for(int i = 1; i <=k ; i=i*4) {


                System.out.print( i+",");

            }
        for(int i = 1; i <=k ; i=i*5) {


            System.out.print( i+"," );

        }






    }
}
