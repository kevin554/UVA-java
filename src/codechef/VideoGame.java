package codechef;

/**
 Video Game (ZCO14001)
https://www.codechef.com/ZCOPRAC/problems/ZCO14001

You are playing a video game in which several stacks of boxes are lined up on 
the floor, with a crane on top to rearrange the boxes.

The crane supports the following commands:

• Move one position left (does nothing if already at the leftmost position)
• Move one position right (does nothing if already at the rightmost position)
• Pick up a box from the current stack (does nothing if the crane already has a 
box)
• Drop a box on the current stack (does nothing if the crane doesn't already 
have a box)

Further, there is a limit H on the number of boxes on each stack. If a 'drop'
command would result in a stack having more than H boxes, the crane ignores 
this drop command. If the current stack has no boxes, a 'pick up' command is 
ignored.

You are given the initial number of boxes in each stack and the sequence of 
operations performed by the crane. You have to compute the final number of 
boxes in each stack.

For example, suppose the initial configuration of the game has 7 stacks and 
H=4. Then, after the following sequence of instructions,

1. Pick up box
2. Move right
3. Move right
4. Move right
5. Move right
6. Drop box
7. Move left
8. Pick up box
9. Move left
10. Drop box

the number of boxes in each stack from left to right would be 2,1,3,1,4,0,1.

Input format
• Line 1 : The width of the game (the number of stacks of boxes), N, followed 
by the max height H of each stack.

• Line 2 : N integers, the initial number of boxes in each stack, from left to 
right. Each number is ≤ H.

• Line 3 : A sequence of integers, each encoding a command to the crane.

    The commands are encoded as follows:

    1 : Move left
    2 : Move right
    3 : Pick up box
    4 : Drop box
    0 : Quit

• The command Quit (0) appears exactly once, and is the last command.

• The initial position of the crane is above the leftmost stack, with the crane 
not holding any box.

Output format
A single line with N integers, the number of boxes in each stack, from left to
right.

Sample input 1
7 4
3 1 2 1 4 0 1
3 2 2 2 2 4 1 3 1 4 0

Sample output 1
2 1 3 1 4 0 1

Sample input 2
3 5
2 5 2
3 2 4 2 2 2 1 4 1 1 1 1 0

Sample output 2
1 5 2 

Test data

There is only one subtask worth 100 marks. In all inputs:

• The number of commands is between 1 and 105, inclusive.

• 1 ≤ N ≤ 105

• 1 ≤ H ≤ 108.
*/
public class VideoGame {

    public VideoGame() {
        init();
    }
    
    private void init() {
        int cantidadColumnas, limite, operacion = -1, cursor = 0;
        boolean hayContenidoParaBotar = false;
        java.util.ArrayList<Integer> contenidoCaja = 
                new java.util.ArrayList<>();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        cantidadColumnas = sc.nextInt();
        limite = sc.nextInt();
        
        while (cantidadColumnas-- > 0) { // a cada columna
            // agregamos la cantidad de elementos respectiva
            contenidoCaja.add(sc.nextInt()); 
        }
        
        while (operacion != 0) {
            operacion = sc.nextInt();
            
            if (operacion == 1) { // izquierda
                if (cursor != 0)  // si no estamos en el limite izquierdo
                    cursor--;
            }
            
            if (operacion == 2) { // derecha
                if (cursor != contenidoCaja.size() - 1) 
                    cursor++;
            }
            
            if (operacion == 3) { // levantar
                // si tenemos algo para botar, no levantamos nada
                if (!hayContenidoParaBotar && 
                        contenidoCaja.get(cursor) != 0) { // la pila tiene algo
                    int cantidadElementos = contenidoCaja.get(cursor);
                    hayContenidoParaBotar = true;
                    
                    // disminuimos la cantidad de elementos (1)
                    contenidoCaja.set(cursor, cantidadElementos - 1);
                }
            }
            
            if (operacion == 4) { // botar
                // no debemos colocar más del limite establecido
                if (contenidoCaja.get(cursor) < limite &&
                        hayContenidoParaBotar) {
                    int cantidadElementos = contenidoCaja.get(cursor);
                    hayContenidoParaBotar = false;
                    
                    // aumentamos la cantidad de elementos en la columna (1)
                    contenidoCaja.set(cursor, cantidadElementos + 1);
                }
            }
        }
        
        java.util.Iterator iterador = contenidoCaja.iterator();
        while (iterador.hasNext()) {
            System.out.print(iterador.next() + " ");
        }
    }
}