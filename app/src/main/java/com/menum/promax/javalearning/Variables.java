package com.menum.promax.javalearning;

public class Variables {
    public static void main(String[] args) {
        System.out.println ("firs Log" );
        System.out.println (5*5);
        //değiskenler
        int x = 5;
        int y = 6;
        System.out.println (x*y);
      //double / float
        double pi = 3.14;
        double r = 5.0;
        System.out.println ("Dairenin çevresi:" + 2*pi*r );
        float z = 1.2f;//hafıza problemi olan ygulamalarda double yerine kullanılabilir
        // Strings
         String name = "Busra";
         String surname = "Sinanoglu";
         String fullname = name +" "+ surname;
        System.out.println ( fullname );

        //Boolean
         boolean isAlive = true;
         isAlive = false;

        System.out.println (isAlive );

    }
}
