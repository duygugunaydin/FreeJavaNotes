package ders_14_MethodOlusturma;

public class C_06_Soru {

    // Soru 2- Kullanicidan main method icinde
    // ayri ayri isim ve soyismini alin
    // Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
    // isim bosluk soyisim seklinde bize donduren bir method olusturun
    // input : isim : Ali , soyisim : YILMAZ  >>  output : Ali YILMAZ

    public static void main(String[] args) {

        String isim = "Ali";
        String soyisim = "YILMAZ";

        System.out.println(isimSoyisimDuzenle(isim, soyisim));

        System.out.println(isimSoyisimDuzenle("heysem","renkoglu"));

    }

    public static String isimSoyisimDuzenle (String isim,String soyisim){

        String yeniIsimSoyisim = isim.substring(0,1).toUpperCase() +
                                 isim.substring(1).toLowerCase()+
                                 " " +
                                 soyisim.substring(0,1).toUpperCase()+
                                 soyisim.substring(1).toLowerCase();

        return yeniIsimSoyisim ;
    }
}
