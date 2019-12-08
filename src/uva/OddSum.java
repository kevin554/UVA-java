package uva;

/**
UVA #10783 
https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=1724
 
Given a range [a, b], you are to find the summation of all the odd integers in 
this range. For example, the summation of all the odd integers in the range 
[3, 9] is 3 + 5 + 7 + 9 = 24.

Input
There can be at multiple test cases. The first line of input gives you the 
number of test cases, T(1 ≤ T ≤ 100). Then T test cases follow. Each test case 
consists of 2 integers a and b (0 ≤ a ≤ b ≤ 100) in two separate lines.

Output
For each test case you are to print one line of output – the serial number of 
the test case followed by the summation of the odd integers in the range [a, b].

Sample Input
2
1
5
3
5

Sample Output
Case 1: 9
Case 2: 8
 */
public class OddSum {

    public OddSum() {
        init();
    }

    private void init() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int cantidad, menor, mayor, suma = 0;
        
        while (sc.hasNext()) {
            cantidad = sc.nextInt();
            
            for (int i = 1; i <= cantidad; i++) {
                menor = sc.nextInt();
                mayor = sc.nextInt();
                
                if (menor % 2 == 0) // si es par
                    menor++; // lo hacemos impar para recorrer el ciclo de a 2
                
                for (int j = menor; j <= mayor; j += 2) {
                    suma += j;
                }
                
                System.out.println("Case " + i + ": " + suma);
                
                suma = 0;
            }
        }
    }
}