package ders_08_Ternary_Switch;

import java.util.Scanner;

public class C_07_Switch_Case {
    public static void main(String[] args) {

        // J : Java
        // D : Devolepment
        // K : Kit
        // Kullanicidan bir harf alin,
        // Alinan harf, J, D, K 'dan biri ise yukaridaki kelimeleri yazdirin.
        // Bu harflerden biri degilse "Gecersiz harf" yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz:");
        char harf = scan.next().charAt(0);

        switch (harf){
            case 'J' :
            case 'j':
                System.out.println("Java");
                break;
            case 'D':
            case 'd':
                System.out.println("Devolepment");
                break;
            case 'K':
            case 'k':
                System.out.println("Kit");
                break;
            default:
                System.out.println("Gecersiz harf");
        }

        // NOT >> Switch Statements'da switch parantezinde <long,double,float ve boolean> kullanilmaz!!!!










    }
}
