package com.menum.promax.javalearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    //psvm + tab
    public static void main(String[] args) {
        //array oluşturucaksan bir sayı vermemiz gerekiyor.buda sıkıntı oluşturabilir.
        String[]  myArray = new String[4];
        myArray[0]="a";
        myArray[1]="a";
        myArray[2]="a";
        myArray[3]="a";
        //sout+tab
        System.out.println (myArray[3] );
        int [] sayi = {1,2,3,4,5};
        System.out.println (sayi[4]);

        //list : kaç eleman olacagini yazmak zorunda degiliz.
        ArrayList<String> myList = new ArrayList <> ( );
         myList.add ( "ayse" );
         myList.add ( "enes" );
         myList.add ( 0,"sevgi" );
        System.out.println (myList.get ( 1 ) );
        System.out.println (myList);

        // set : degisten sakladımız dizi gibi ancak sadece aynı elemanı bir defalık saklayabiliriz

        HashSet<String> mySet = new HashSet <> ( );
        mySet.add ( "beyza" );
        mySet.add ( "berra" );

        System.out.println (mySet.size () );

        //map :  bir deger ve onun karşısında bir anahtar saklanır

        HashMap<String,String> myhasMap = new HashMap <> ( );

        myhasMap.put ( "name","busra" );
        myhasMap.put ( "surname","tancan" );

        System.out.println (myhasMap.get ( "surname" ) );

    }
}
