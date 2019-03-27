package com.menum.promax.javalearning;

public class OperatorsAndFlows {
    public static void main(String[] args) {
        int x = 5;
        x = x+1;
        System.out.println (x);
        x++;
        System.out.println (x );
        x--;
        System.out.println (x );
        x = x*5;
        System.out.println (x );

        int y = 4;
        System.out.println (x>y);//true
        System.out.println (y<=x );
        System.out.println (y==x );
        System.out.println (y!=x );

        //"and && "
        // "or ||"

        //if flows
        if (x>y){
            System.out.println ("x is bigger");
        } else if (y>x){
            System.out.println ("y is bigger" );
        } else
            System.out.println ("x = y" );

        //switch

        int day = 1;
        String dayName ="";
        //hangi değişken kontrol edilecekse switch icine yazilir
        switch (day){
            case 1 :
                dayName = "Monday";
                break;

            case 2 :
                dayName = "Sunday";
                break;

            default:
                dayName = "Wednesday";
                break;
        }







    }
}
