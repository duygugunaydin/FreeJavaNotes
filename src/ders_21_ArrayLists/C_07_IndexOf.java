package ders_21_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C_07_IndexOf {

    public static void main(String[] args) {

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        List<Integer> sayilar= new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            sayilar.add(arr[i]);
        }


        System.out.println(sayilar.indexOf(2)); // 1

        System.out.println(sayilar.indexOf(5)); // 4

        System.out.println(sayilar.lastIndexOf(5)); // 15
    }
}