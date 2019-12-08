package uva;

/**
UVA #11995 
https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=3146

There is a bag-like data structure, supporting two operations:

_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
| 1 x | Throw an element x into the bag. |
| 2   | Take out an element from the bag.|
¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ 

Given a sequence of operations with return values, you’re going to guess 
the data structure. It is a stack (Last-In, First-Out), a queue (First-In, 
First-Out), a priority-queue (Always take out larger elements first) or 
something else that you can hardly imagine!

Input
There are several test cases. Each test case begins with a line containing a 
single integer n (1 ≤ n ≤ 1000). Each of the next n lines is either a type-1 
command, or an integer 2 followed by an integer x.

That means after executing a type-2 command, we get an element x without 
error. The value of x is always a positive integer not larger than 100. The 
input is terminated by end-of-file (EOF).

Output
For each test case, output one of the following:
stack It’s definitely a stack.
queue It’s definitely a queue.
priority queue It’s definitely a priority queue.
impossible It can’t be a stack, a queue or a priority queue.
not sure It can be more than one of the three data structures mentioned
above.

Sample Input
6
1 1
1 2
1 3
2 1
2 2
2 3
6
1 1
1 2
1 3
2 3
2 2
2 1
2
2 1
2 2
4
1 2
1 1
2 1
2 2
7
1 2
1 5
1 1
1 3
2 5
1 4
2 4

Sample Output
queue
not sure
impossible
stack
priority queue
 */
public class ICanGuessTheDataStructure {
    
    public ICanGuessTheDataStructure() {
        init();
    }
    
    private void init() {
        boolean esPila, esCola, esColaDePrioridad, esImposible;
        java.util.Stack<Integer> pila = new java.util.Stack<>();
        java.util.Queue<Integer> cola = new java.util.LinkedList<>();
        java.util.PriorityQueue<Integer> colaPrioridad = new java.util.
                PriorityQueue<>(10, java.util.Collections.reverseOrder());
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int cantidadOperaciones, operacion, dato;
        
        while (sc.hasNextInt()) {
            cantidadOperaciones = sc.nextInt();
            
            esPila = true;
            esCola = true;
            esColaDePrioridad = true;
            esImposible = false;
            
            pila.clear();
            cola.clear();
            colaPrioridad.clear();

            for (int i = 0; i < cantidadOperaciones; i++) {
                operacion = sc.nextInt();
                dato = sc.nextInt();

                if (operacion == 1) { // insertar
                    pila.push(dato);
                    cola.offer(dato);
                    colaPrioridad.offer(dato);
                } else { // obtener
                    // Si intenta obtener sin haber insertado
                    if (pila.isEmpty() || cola.isEmpty()
                            || colaPrioridad.isEmpty()) {
                        esImposible = true;
                        
                        continue;
                    }

                    if (esCola && cola.peek() == dato) 
                        cola.poll();
                     else 
                        esCola = false;

                    if (esPila && pila.peek() == dato) 
                        pila.pop();
                     else 
                        esPila = false;

                    if (esColaDePrioridad && colaPrioridad.peek() == dato) 
                        colaPrioridad.poll();
                     else 
                        esColaDePrioridad = false;
                }
            }

            if (!esPila && !esCola && !esColaDePrioridad || esImposible) {
                System.out.println("impossible");
            } else if (esPila && esColaDePrioridad ||
                    esPila && esCola && esColaDePrioridad || esPila && esCola ||
                    esCola && esColaDePrioridad) {
                System.out.println("not sure");
            } else if (esPila) {
                System.out.println("stack");
            } else if (esCola) {
                System.out.println("queue");
            } else if (esColaDePrioridad) {
                System.out.println("priority queue");
            }
        }
    }
}