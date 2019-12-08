package uva;

/**
UVA #11942
https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=3093

Another tale of lumberjacks?. Let see . . .

The lumberjacks are rude, bearded workers, while foremen tend to be bossy and 
simpleminded. The foremen like to harass the lumberjacks by making them line up 
in groups of ten, ordered by the length of their beards. The lumberjacks, being 
of different physical heights, vary their arrangements to confuse the foremen. 
Therefore, the foremen must actually measure the beards in centimeters to see 
if everyone is lined up in order. 

Your task is to write a program to assist the foremen in determining whether or 
not the lumberjacks are lined up properly, either from shortest to longest 
beard or from longest to shortest.

Input
The input starts with line containing a single integer N, 0 < N < 20, which is 
the number of groups to process. Following this are N lines, each containing 
ten distinct positive integers less than 100.

Output
There is a title line, then one line per set of beard lengths. See the sample 
output for capitalization and punctuation.

Sample Input
3
13 25 39 40 55 62 68 77 88 95
88 62 77 20 40 10 99 56 45 36
91 78 61 59 54 49 43 33 26 18

Sample Output
Lumberjacks:
Ordered
Unordered
Ordered
*/
public class LumberjackSequencing {

    public LumberjackSequencing() {
        init();
    }

    private void init() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        java.util.ArrayList<Integer> lista = new java.util.ArrayList<>();
        int cantidad;
        boolean estaEnOrden;
        
        cantidad = sc.nextInt();
        
        System.out.println("Lumberjacks:");
        while (cantidad-- > 0) {
            estaEnOrden = true;
            lista.clear();
            
            for (int i = 0; i < 10; i++) {
                lista.add(sc.nextInt());
            }
            
            for (int i = 1; i < 10; i++) { // ascendente
                if (lista.get(i - 1).compareTo(lista.get(i)) > 0) {
                    estaEnOrden = false;
                    break;
                }
            }
            
            if (estaEnOrden) {
                System.out.println("Ordered");
                continue;
            }
            
            estaEnOrden = true;
            
            for (int i = 1; i < 10; i++) {
                if (lista.get(i - 1).compareTo(lista.get(i)) < 0) {
                    estaEnOrden = false;
                    
                    break;
                }
            }
            
            if (estaEnOrden)
                System.out.println("Ordered");
            else
                System.out.println("Unordered");
        }
    }
}