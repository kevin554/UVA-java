package uva;

/**
UVA #13130
https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=5041

In Bolivia there is a very popular game called “Cacho”. 
The game consists rolling five dices (a1, a2, a3, a4, a5) and then annotate 
the result according to certain rules. This time we will focus on one case in
particular: “escala”. A “escala” is the scene in which the dices form a 
sequence of consecutive numbers.

More formally a “escala” meets the property:

ai + 1 = ai+1, 1 ≤ i ≤ 4

There are two types of “escala”: a ordinary “escala” (it satisfy the property 
described above), and a “Escala Real” (when the scenery is 1, 3, 4, 5, 6. 
In the game this case is also a valid “scala”).

Cael is a boy who is learning to play and wants you to help develop a 
program to check when five
dices are forming a “escala”. Note that the “Escala Real” is not a valid 
“escala” for Cael.

Input
The input begins with a number T ≤ 100, the number of test cases. Below are 
T lines, each with five numbers ai (1 ≤ ai ≤ 6) in no-decreasing order.

Output
In each case, if the five dices form a scale print in one line ‘Y’. Otherwise 
print in one line ‘N’ (quotes for clarity). 

Sample Input
5
1 2 3 4 5
2 3 4 5 6
1 4 4 4 5
1 3 4 5 6
1 2 2 3 6

Sample Output
Y
Y
N
N
N
 */
public class Cacho {

    public Cacho() {
        init();
    }

    private void init() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        java.util.ArrayList<Integer> numeros = new java.util.ArrayList<>();
        int cantidad, contador = 0;
        
        cantidad = sc.nextInt(); // Cantidad de numeros a introducir
        
        for (int i = 0; i < cantidad; i++) {
            for (int j = 0; j < 5; j++) {
                numeros.add(sc.nextInt());
            }
            
            for (int j = 0; j < 5; j++) {
                if (j + 1 == numeros.get(j))
                    contador++;
            }
            
            if (contador == 5) {
                System.out.println("Y");
                numeros.clear();
                contador = 0;
                continue;
            }
            
            contador = 0;
            
            for (int j = 0; j < 5; j++) {
                if (j + 2 == numeros.get(j)) 
                    contador++;
            }
            
            if (contador == 5) {
                System.out.println("Y");
                numeros.clear();
                contador = 0;
                continue;
            } 
            
            contador = 0;
            
            if (contador == 0) {
                System.out.println("N");
                numeros.clear();
            }
        }
    }
}