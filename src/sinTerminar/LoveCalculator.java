package sinTerminar;

import java.util.Scanner;

/*
UVA #10424
https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=1365

One day I asked Saima that how much she loves me. Her answer was “71.43%”. I was surprised as
well as shocked by her answer. I could not understand why she didn’t tell 100% and why she told
a particular and peculiar fraction like 71.43. Looking at my surprised, shocked and nervous face she
burst out laughing and told that she loves me more than any thing in this universe and it was nothing
but a silly and funny love calculation. Then she described me the calculation. In this problem you will
have to write a program so that any one can calculate love between any two persons very quickly (of
course a very silly game).
Rules:
You will be given two names. These two names can have white space or some other non-alphabetical
characters like $ & % etc. But only the alphabets from a to z or A to Z will participate in love
calculation. Each alphabet has a particular value. The values are from 1 to 26 in ascending order of
the alphabets. It’s like this, a = 1, b = 2, c = 3, ..., z = 26. Both upper case and lower case holds the
same values. Then make the sum of these numbers until it comes in one digit. [For example, consider
a name ‘bcz’. Here, b = 2, c = 3 and z = 26. So, the sum is (2+3+26) = 31 = (3+1) = 4.] Then the
ratio of these two numbers in percentage will be the result.
Remember: Result can not be more than 100% . Take the ratio carefully to avoid this problem.
Input
Your input will be two names. Each name holds not more than 25 characters. End of file will indicate
the end of input.
Output
For each pair of names your program will have to calculate the love between those two persons and
give the result as output. In result two digits to be displayed after the decimal point. All the results
must be in new lines.
Sample Input
saima
shanto
Pakistan
India
USA
USSR
Sample Output
71.43 %
100.00 %
100.00 %
*/
public class LoveCalculator {

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, otroNombre;
        int numero, porcentaje;

        while (true) {
            nombre = sc.next();
            otroNombre = sc.next();

            numero = 0;
            porcentaje = 0;

            for (int i = 0; i < nombre.length(); i++) {
                char letra = nombre.charAt(i);

                switch (letra) {
                    case 'a' | 'A':
                        numero += 1;
                        break;

                    case 'b' | 'B':
                        numero += 2;
                        break;

                    case 'c' | 'C':
                        numero += 3;
                        break;
                    case 'd' | 'D':
                        numero += 4;
                        break;
                    case 'e' | 'E':
                        numero += 5;
                        break;
                    case 'f' | 'F':
                        numero += 6;
                        break;
                    case 'g' | 'G':
                        numero += 7;
                        break;
                    case 'h' | 'H':
                        numero += 8;
                        break;
                    case 'i' | 'I':
                        numero += 9;
                        break;
                    case 'j' | 'J':
                        numero += 10;
                        break;
                    case 'k' | 'K':
                        numero += 11;
                        break;
                    case 'l' | 'L':
                        numero += 12;
                        break;
                    case 'm' | 'M':
                        numero += 13;
                        break;
                    case 'n' | 'N':
                        numero += 14;
                        break;
                    case 'o' | 'O':
                        numero += 15;
                        break;
                    case 'p' | 'P':
                        numero += 16;
                        break;
                    case 'q' | 'Q':
                        numero += 17;
                        break;
                    case 'r' | 'R':
                        numero += 18;
                        break;
                    case 's' | 'S':
                        numero += 19;
                        break;
                    case 't' | 'T':
                        numero += 20;
                        break;
                    case 'u' | 'U':
                        numero += 21;
                        break;
                    case 'v' | 'V':
                        numero += 22;
                        break;
                    case 'w' | 'W':
                        numero += 23;
                        break;
                    case 'x' | 'X':
                        numero += 24;
                        break;
                    case 'y' | 'Y':
                        numero += 25;
                        break;
                    case 'z' | 'Z':
                        numero += 26;
                        break;
                }
            }
            
            for (int i = 0; i < otroNombre.length(); i++) {
                char letra = otroNombre.charAt(i);

                switch (letra) {
                    case 'a' | 'A':
                        porcentaje += 1;
                        break;

                    case 'b' | 'B':
                        porcentaje += 2;
                        break;

                    case 'c' | 'C':
                        porcentaje += 3;
                        break;
                    case 'd' | 'D':
                        porcentaje += 4;
                        break;
                    case 'e' | 'E':
                        porcentaje += 5;
                        break;
                    case 'f' | 'F':
                        porcentaje += 6;
                        break;
                    case 'g' | 'G':
                        porcentaje += 7;
                        break;
                    case 'h' | 'H':
                        porcentaje += 8;
                        break;
                    case 'i' | 'I':
                        porcentaje += 9;
                        break;
                    case 'j' | 'J':
                        porcentaje += 10;
                        break;
                    case 'k' | 'K':
                        porcentaje += 11;
                        break;
                    case 'l' | 'L':
                        porcentaje += 12;
                        break;
                    case 'm' | 'M':
                        porcentaje += 13;
                        break;
                    case 'n' | 'N':
                        porcentaje += 14;
                        break;
                    case 'o' | 'O':
                        porcentaje += 15;
                        break;
                    case 'p' | 'P':
                        porcentaje += 16;
                        break;
                    case 'q' | 'Q':
                        porcentaje += 17;
                        break;
                    case 'r' | 'R':
                        porcentaje += 18;
                        break;
                    case 's' | 'S':
                        porcentaje += 19;
                        break;
                    case 't' | 'T':
                        porcentaje += 20;
                        break;
                    case 'u' | 'U':
                        porcentaje += 21;
                        break;
                    case 'v' | 'V':
                        porcentaje += 22;
                        break;
                    case 'w' | 'W':
                        porcentaje += 23;
                        break;
                    case 'x' | 'X':
                        porcentaje += 24;
                        break;
                    case 'y' | 'Y':
                        porcentaje += 25;
                        break;
                    case 'z' | 'Z':
                        porcentaje += 26;
                        break;
                }
            }
            
            
            
            System.out.println(numero + "." + porcentaje + "%");

        }
    }
}
