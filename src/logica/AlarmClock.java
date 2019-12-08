package logica;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
UVA #11677
https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=2724

Daniela is a nurse in a large hospital, which causes her working shifts to constantly change. To make
it worse, she has deep sleep, and a difficult time to wake up using alarm clocks.
Recently she got a digital clock as a gift, with several different options of alarm sounds, and she
has hope that it might help solve her problem. But, lately, she’s been very tired and want to enjoy
every single moment of rest. So she carries her new clock to every place she goes, and whenever she
has some spare time, she tries to sleep, setting her alarm clock to the time when she needs to wake up.
But, with so much anxiety to sleep, she ends up with some difficulty to fall asleep and enjoy some rest.
A problem that has been tormenting her is to know how many minutes of sleep she would have if
she felt asleep immediately and woken up when the alarm clock ringed. But she is not very good with
numbers, and asked you for help to write a program that, given the current time and the alarm time,
find out the number of minutes she could sleep.
Input
The input contains several test cases. Each test case is described in one line, containing four integers H1,
M1, H2 and M2, with H1 : M1 representing the current hour and minute, and H2 : M2 representing the
time (hour and minute) when the alarm clock is set to ring (0 ≤ H1 ≤ 23, 0 ≤ M1 ≤ 59, 0 ≤ H2 ≤ 23,
0 ≤ M2 ≤ 59).
The end of the input is indicated by a line containing only four zeros, separated by blank spaces.
Output
For each test case, your program must print one line, containing a single integer, indicating the number
of minutes Daniela has to sleep.
Sample Input
1 5 3 5
23 59 0 34
21 33 21 10
0 0 0 0
Sample Output
120
35
1417
*/
public class AlarmClock {

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GregorianCalendar calendario =  new GregorianCalendar();
        GregorianCalendar calendario2 =  new GregorianCalendar();
        int horaAct, minutoAct, horaAl, minutoAl, cantidadMinutos;
        
        while (true) {
            horaAct = sc.nextInt();
            minutoAct = sc.nextInt();
            horaAl = sc.nextInt();
            minutoAl = sc.nextInt();
            
            if (horaAct == 0 && minutoAct == 0 && horaAl == 0 && minutoAl == 0)
                return;
            
            cantidadMinutos = 0;
            
//            calendario.set(Calendar.HOUR, horaAct);
//            calendario.set(Calendar.MINUTE, minutoAct);
//            
//            calendario2.set(Calendar.HOUR, horaAl);
//            calendario2.set(Calendar.MINUTE, minutoAl);
//            
//            long name = calendario.getTimeInMillis() - calendario2.getTimeInMillis();
//            calendario.clear(); 
//            calendario.setTimeInMillis(name);
//            
//            System.out.println(calendario.get(Calendar.HOUR) + " " + 
//                    calendario.get(Calendar.MINUTE));
        }
    }
}