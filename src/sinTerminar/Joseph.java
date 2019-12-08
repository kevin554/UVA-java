package sinTerminar;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

/**
UVA #305
https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=241

The Joseph’s problem is notoriously known. For those who are not familiar with 
the original problem: from among n people, numbered 1, 2, ..., n, standing in 
circle every m-th is going to be executed and only the life of the last 
remaining person will be saved. Joseph was smart enough to choose the position
of the last remaining person, thus saving his life to give us the message about 
the incident. For example when n = 6 and m = 5 then the people will be executed 
in the order 5, 4, 6, 2, 3 and 1 will be saved.

Suppose that there are k good guys and k bad guys. In the circle the first k 
are good guys and the last k bad guys. You have to determine such minimal m 
that all the bad guys will be executed before the first good guy.

Input
The input file consists of separate lines containing k. The last line in the 
input file contains ‘0’. You can suppose that 0 < k < 14.

Output
The output file will consist of separate lines containing m corresponding to k 
in the input file.

Sample Input
3
4
0

Sample Output
5
30
*/
public class Joseph {

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        ArrayList<Boolean> lista = new ArrayList<>();
        int numero, m;
        boolean losBuenosSeEliminaronDeUltimo;
        
        while (true) {
            numero = sc.nextInt();
            
            if (numero == 0)
                return;
            
            m = numero + 1;
            
            while (true) {
                losBuenosSeEliminaronDeUltimo = true;
                dq.clear();
                
                for (int i = 1; i <= numero * 2; i++) {
                    dq.addLast(i);
                }
                
                for (int i = 1; dq.size() > 1; i++) { // optimizar el incremento?
                    int temp = dq.pollFirst();
                    dq.addLast(temp);
                    
                    if (i > numero * m)
                        break;
                    
                    if (i % m == 0) {
                        if (dq.peekLast() <= numero) {
                            losBuenosSeEliminaronDeUltimo = false;
                            break;
                        }
                        
                        dq.removeLast();
                    }
                }
                
                if (losBuenosSeEliminaronDeUltimo) 
                    break;
                
                m++;
            }
            
            System.out.println(m);
        }
    }
}