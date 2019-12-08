package uva;

/**
UVA #11332
https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=2307

For a positive integer n, let f(n) denote the sum of the digits of n when 
represented in base 10. It is easy to see that the sequence of numbers n, f(n), 
f(f(n)), f(f(f(n))), . . . eventually becomes a single digit number that 
repeats forever. Let this single digit be denoted g(n). 

For example, consider n = 1234567892.
Then:
f(n) = 1+2+3+4+5+6+7+8+9+2 = 47
f(f(n)) = 4 + 7 = 11
f(f(f(n))) = 1 + 1 = 2
Therefore, g(1234567892) = 2.

Input
Each line of input contains a single positive integer n at most 2,000,000,000. 
Input is terminated by n = 0 which should not be processed.

Output
For each such integer, you are to output a single line containing g(n).

Sample Input
2
11
47
1234567892
0

Sample Output
2
2
2
2
*/
public class SummingDigits {

    public SummingDigits() {
        init();
    }

    private void init() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int numero, cantidadDigitos, suma = 0;
        char digito;
        
        while (true) {
            numero = sc.nextInt();
            
            if (numero == 0)
                break;
            
            cantidadDigitos = Integer.toString(numero).length();
            
            if (cantidadDigitos == 1) 
                suma = numero;
            
            while (cantidadDigitos != 1) {
                suma = 0;
                
                for (int i = 0; i < cantidadDigitos; i++) {
                    digito = Integer.toString(numero).charAt(i);
                    suma += Integer.parseInt(Character.toString(digito));
                }
                
                cantidadDigitos = Integer.toString(suma).length();
                numero = suma;
            }
            
            System.out.println(suma);
        }
    }
}