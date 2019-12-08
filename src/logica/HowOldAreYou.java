package logica;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
UVA #11219
https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=2160

...
- Here are the filled form.
- Thank you. Let me check... hum... OK, OK, OK... Wait, how old are you?
- 20. Did I forget to fill it?
- No. It says here that you’ll be born next month! The year is wrong...
- Oh... Sorry!
The process is going to be automatic and to avoid some human errors there will be a calculated field
that informs the age based in the current date and the birth date given. This is your task, calculate
the age, or say if there’s something wrong.
Input
The first line of input gives the number of cases, T (1 ≤ T ≤ 200). T test cases follow. Each test case
starts with a blank line, then you will have 2 lines corresponding to the current date and the birth date,
respectively. The dates are in the format DD/MM/Y Y Y Y , where DD is the day, MM the month
and Y Y Y Y the year. All dates will be valid.
Output
The output is comprised of one line for each input data set and should be as follow (quotes for clarifying
only):
‘Case #N: AGE’, where N is the number of the current test case and AGE is one of the 3 following
options:
• ‘Invalid birth date’, if the calculated age is impossible (still going to be born).
• ‘Check birth date’, if the calculated age is more than 130.
• the calculated age (years old only), otherwise.
• If the two dates are the same, the output should be ‘0’.
Sample Input
4
01/01/2007
10/02/2007
09/06/2007
28/02/1871
12/11/2007
01/01/1984
28/02/2005
29/02/2004
Sample Output
Case #1: Invalid birth date
Case #2: Check birth date
Case #3: 23
Case #4: 0
*/
public class HowOldAreYou {

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar calendario = new GregorianCalendar();
        Calendar calendarioAct = new GregorianCalendar();
        Calendar calendarioNac = new GregorianCalendar();
        String anio, anioNac;
        int cantidad;

        cantidad = sc.nextInt();

        for (int i = 1; i <= cantidad; i++) {
            anio = sc.next();
            anioNac = sc.next();

            String[] vector = anio.split("/");
            String[] vector2 = anioNac.split("/");

            calendarioAct.set(Integer.parseInt(vector[2]),
                    Integer.parseInt(vector[1]) - 1, Integer.parseInt(vector[0]));

            calendarioNac.set(Integer.parseInt(vector2[2]),
                    Integer.parseInt(vector2[1]) - 1, Integer.parseInt(vector2[0]));

            calendario.setTime(calendarioAct.getTime());
            calendario.add(Calendar.DAY_OF_MONTH, -calendarioNac.get(Calendar.DAY_OF_MONTH) - 1);
            calendario.add(Calendar.MONTH, -calendarioNac.get(Calendar.MONTH));
            calendario.add(Calendar.YEAR, -calendarioNac.get(Calendar.YEAR));

            if (calendarioAct.before(calendarioNac)) { // si la persona nacerá despues
                System.out.println("Case #" + i + ": Invalid birth date");
            } else if (calendario.get(Calendar.YEAR) > 130) {
                System.out.println("Case #" + i + " Check birth date");
            } else if (calendario.get(Calendar.YEAR) < 130) {
                System.out.println("Case #" + i + ": " + calendario.get(Calendar.YEAR));
            }
        }
    }
}
