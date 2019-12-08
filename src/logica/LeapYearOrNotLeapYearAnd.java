package logica;

import java.util.Scanner;

/*
UVA #10070
https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=1011

The ancient race of Gulamatu is very advanced in their year calculation scheme. They understand what
leap year is (A year that is divisible by 4 and not divisible by 100 with the exception that years that
are divisible by 400 are also leap year.) and they have also similar festival years. One is the Huluculu
festival (happens on years divisible by 15) and the Bulukulu festival (Happens on years divisible by 55
provided that is also a leap year). Given an year you will have to state what properties these years
have. If the year is not leap year nor festival year, then print the line ‘This is an ordinary year.’
The order of printing (if present) the properties is: leap year → huluculu → bulukulu.
Input
Input will contain several years as input. Each year will be in separate lines. Input is terminated by
end of file. All the years will not be less than 2000 (to avoid the earlier different rules for leap years).
Please don’t assume anything else.
Output
For each input, output the different properties of the years in different lines according to previous
description and sample output. A blank line should separate the output for each line of input. Note
that there are four different properties.
Sample Input
2000
3600
4515
2001
Sample Output
This is leap year.
This is leap year.
This is huluculu festival year.
This is huluculu festival year.
This is an ordinary year.
*/
public class LeapYearOrNotLeapYearAnd {

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long anio;
        boolean primeraLinea = true;

        while (sc.hasNext()) {
            anio = sc.nextLong();

            if (!primeraLinea) {
                System.out.println();
            }

            primeraLinea = false;

            if ((anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0)) {
                System.out.println("This is leap year.");
                
                if (anio % 15 == 0) {
                    System.out.println("This is huluculu festival year.");
                }
                if (anio % 55 == 0) {
                    System.out.println("This is bulukulu festival year.");
                }
            } else if (anio % 15 == 0) {
                System.out.println("This is huluculu festival year.");
            } else {
                System.out.println("This is an ordinary year.");
            }

//            if ((anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0)
//                    && anio % 15 == 0 && anio % 55 == 0) {
//                System.out.println("This is leap year.");
//                System.out.println("This is huluculu festival year.");
//                System.out.println("This is bulukulu festival year.");
//            } else if ((anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0)
//                    && anio % 15 == 0) {
//                System.out.println("This is leap year.");
//                System.out.println("This is huluculu festival year.");
//            } else if ((anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0)
//                    && anio % 55 == 0) {
//                System.out.println("This is leap year.");
//                System.out.println("This is bulukulu festival year.");
//            } else if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
//                System.out.println("This is leap year.");
//            } else if (anio % 15 == 0) {
//                System.out.println("This is huluculu festival year.");
//            } else if (anio % 55 == 0) {
//                System.out.println("This is bulukulu festival year.");
//            } else {
//                System.out.println("This is an ordinary year.");
//            }
        }
    }
}
