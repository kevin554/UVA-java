package logica;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

/*
UVA #12439
https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=279&page=show_problem&problem=3870

It is 2012, and it’s a leap year. So there is a “February 29” in this year, which is called leap day.
Interesting thing is the infant who will born in this February 29, will get his/her birthday again in
2016, which is another leap year. So February 29 only exists in leap years. Does leap year comes in
every 4 years? Years that are divisible by 4 are leap years, but years that are divisible by 100 are not
leap years, unless they are divisible by 400 in which case they are leap years.
In this problem, you will be given two different date. You have to find the number of leap days in
between them.
Input
The first line of input will contain T (≤ 500) denoting the number of cases.
Each of the test cases will have two lines. First line represents the first date and second line
represents the second date. Note that, the second date will not represent a date which arrives earlier
than the first date. The dates will be in this format — ‘month day, year’. See sample input for exact
format. You are guaranteed that dates will be valid and the year will be in between 2 ∗ 103
to 2 ∗ 109
.
For your convenience, the month list and the number of days per months are given below. You can
assume that all the given dates will be a valid date.
Output
For each case, print the case number and the number of leap days in between two given dates (inclusive).
Note:
The names of the months are {“January”, “February”, “March”, “April”, “May”, “June”, “July”,
“August”, “September”, “October”, “November” and “December”}. And the numbers of days for the
months are {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 and 31} respectively in a non-leap year. In a leap
year, number of days for February is 29 days; others are same as shown in previous line.
Sample Input
4
January 12, 2012
March 19, 2012
August 12, 2899
August 12, 2901
August 12, 2000
August 12, 2005
February 29, 2004
February 29, 2012
Sample Output
Case 1: 1
Case 2: 0
Case 3: 1
Case 4: 3
*/
public class February29 {

    public void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        GregorianCalendar calendario = new GregorianCalendar();
        //DateFormat formato = new SimpleDateFormat("MMMM dd, YYYY", Locale.US);
        SimpleDateFormat formato =new SimpleDateFormat("MMMM-dd-yyyy",Locale.US);
        int cantidad;
        String fechaInicio, fechaFin;
        String[] meses = {"January", "February", "March", "April", "May", 
            "June", "July", "August", "September", "October", "November", 
            "December"};
        
        cantidad = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= cantidad; i++) {
            String t=sc.nextLine();
            Date parse = formato.parse(t);
            Date parse2 = formato.parse(sc.nextLine());
            
            System.out.println(formato.format(parse));
            System.out.println(formato.format(parse2));
        }
    }
}