package ders_18_Arrays;

import java.util.Arrays;

public class C_03_ArrayElementleriniArttirma {
    public static void main(String[] args) {

        // Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method olusturun.
        // Eski array’i yeni haliyle kaydedin.


        int [] arr = {2,4,6,8};

        for (int i = 0; i < arr.length; i++) {

            arr[i]=arr[i]+2;
        }

        System.out.println(Arrays.toString(arr)); // [4, 6, 8, 10]

        arr= elementleriIkiArttir(arr);

        System.out.println(Arrays.toString(arr));  // [6, 8, 10, 12]
    }

    public static int[] elementleriIkiArttir (int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            arr [i]=arr[i]+2;
        }
        return arr;
    }
}
