package com.menum.promax.javalearning;

public class Loops {
    public static void main(String[] args) {

        //for loop
        int [] myNumbers = {1,2,3,4,5};
        //tek degerle ilgili islem
        int x = myNumbers[1]*30/6;
        System.out.println (x);

        //dizinin tüm degerlerine uygulanan islem

        for(int i = 0; i<myNumbers.length; i++){
            int y = myNumbers[i]*30/6;
            System.out.println (y);
        }

        //özellikle diziler cin kullanılır. yukarıdaki forla aynı sonucu veriyor
        for (int number : myNumbers){
            int z = number*30/6;
            System.out.println (z );
        }

        //while : bir şey olurken
        int j = 0;
        while (j<10){
            int m = j*10;
            System.out.println (m);
            j++;
        }
    }
}
