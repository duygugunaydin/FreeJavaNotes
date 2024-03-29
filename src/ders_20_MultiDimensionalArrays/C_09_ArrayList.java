package ders_20_MultiDimensionalArrays;

import ders_18_Arrays.C_06_KullaniciyaArrayOlusturma;

import java.util.*;

public class C_09_ArrayList {

    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            C_06_KullaniciyaArrayOlusturma obj1= new C_06_KullaniciyaArrayOlusturma();

            List<Integer> sayilar = new ArrayList<>();

            // 1- List primitive data kabul etmez
            // 2- List bir interface oldugu icin direk obje olusturulamaz
            //    Onun yerine sag tarafa ArrayList<>() yazariz

            sayilar.add(4);
            sayilar.add(5);

            System.out.println(sayilar); // [4, 5]
        }
    }
