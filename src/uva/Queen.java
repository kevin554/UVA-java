package uva;

/**
UVA #11494
https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=2489

The game of Chess has several pieces with curious movements. One of them is the 
Queen, which can move any number of squares in any direction: in the same line, 
in the same column or in any of the diagonals, as illustrated by the figure 
below (black dots represent positions the queen may reach in one move):

The great Chess Master Kary Gasparov invented a new type of chess problem: 
given the position of a queen in an empty standard chess board (that is, 
an 8 × 8 board) how many moves are needed so that she reaches another given 
square in the board? 

Kary found the solution for some of those problems, but is having a difficult 
time to solve some others, and therefore he has asked that you write a program 
to solve this type of problem.

Input
The input contains several test cases. The only line of each test case contains 
four integers X1, Y1, X2 and Y2 (1 ≤ X1, Y1, X2, Y2 ≤ 8). The queen starts in 
the square with coordinates (X1, Y1), and must finish at the square with 
coordinates (X2, Y2). In the chessboard, columns are numbered from 1 to 8, from 
left ro right; lines are also numbered from 1 to 8, from top to bottom. The 
coordinates of a square in line X and column Y are (X, Y ).
The end of input is indicated by a line containing four zeros, separated by 
spaces.

Output
For each test case in the input your program must print a single line, 
containing an integer, indicating the smallest number of moves needed for the 
queen to reach the new position.

Sample Input
4 4 6 2
3 5 3 5
5 5 4 3
0 0 0 0

Sample Output
1
0
2
*/
public class Queen {

    /**
    La idea es determinar si la reina se encuentra en la 
    misma posicion a la que debe llegar (se requieren 0 movimientos), sino, 
    encontrar si la posicion a la que se debe llegar es la misma fila/columna o 
    diagonal (se requiere un movimiento). De no cumplirse alguna de las 2 
    condidiones mencionadas anteriormente, la reina llega en 2 movimientos.
    */
    public Queen() {
        init();
    }

    private void init() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int x1, y1, x2, y2;
        boolean seRequiereUnMovimiento;
        
        while (true) {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            
            seRequiereUnMovimiento = false;
            
            if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0)
                break;
            
            /* Si la posicion a llegar */
            if (x1 != x2 && y1 == y2 || /* se encuentra en la misma fila o */
                    x1 == x2 && y1 != y2) { /* se encuentra en la misma columna */ 
                seRequiereUnMovimiento = true;
            }
            
            /* Diagonal hacia abajo-derecha */
            for (int i = x1, j = y1; i <= 8 || j <= 8; i++, j++) {
                if (i == x2 && j == y2) 
                    seRequiereUnMovimiento = true;
            }
            
            /* Diagonal hacia arriba-izquierda*/
            for (int i = x1, j = y1; i >= 0 || j >= 0; i--, j--) {
                if (i == x2 && j == y2) 
                    seRequiereUnMovimiento = true;
            }
            
            /* Diagonal hacia arriba-derecha */
            for (int i = x1, j = y1; i <= 8 || j >= 0; i++, j--) {
                if (i == x2 && j == y2) 
                    seRequiereUnMovimiento = true;
            }
            
            /* Diagonal hacia abajo-izquierda */
            for (int i = x1, j = y1; i >= 0 || j <= 8; i--, j++) {
                if (i == x2 && j == y2) 
                    seRequiereUnMovimiento = true;
            }
            
            /* Si la posicion a llegar */
            if (x1 == x2 && y1 == y2)  /* es donde se encuentra */
                System.out.println("0");
             else if (seRequiereUnMovimiento) 
                System.out.println("1");
             else if (!seRequiereUnMovimiento) 
                System.out.println("2");
        }
    }
}
