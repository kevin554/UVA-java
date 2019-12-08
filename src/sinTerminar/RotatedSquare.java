package sinTerminar;

/**
UVA 10855
https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=1796

Given a square of N rows and columns of uppercase letters, and another smaller 
square of n rows and columns of uppercase letters, we want to count the number 
of appearances in the big square of the small square in all the rotated forms.

Input
The input will consist of a series of problems, with each problem in a series 
of lines. In the first line, the dimension of the two squares, N and 
n (with 0 < n ≤ N), is indicated by two integer numbers separated by a space. 
The N lines of the first square appear in the following N lines of the input,
and then the n lines of the second square appear in the following n lines. The 
characters in a line are one after another, without spaces. The end of the 
sequence of problems is indicated with a case where N = 0 and n = 0.

Output
The solutions of the different problems appear in successive lines. For each 
problem the output consists of a line with four integers, which are the number 
of times each rotation of the small square appears in the big square. The first 
number corresponds to the number of appearances of the small square without
rotations, the second to the appearances of the square rotated 90 degrees 
(clockwise), the third to the square rotated 180 degrees, and the fourth to the 
square rotated 270 degrees.

Sample Input
4 2
ABBA
ABBB
BAAA
BABB
AB
BB
6 2
ABCDCD
BCDCBD
BACDDC
DCBDCA
DCBABD
ABCDBA
BC
CD
0 0

Sample Output
0 1 0 0
1 0 1 0
*/
public class RotatedSquare {

    public RotatedSquare() {
        init();
    }

    private void init() {
        
    }
    
    public  void main(String[] args) {
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        char[][] cuadrado, cuadradito;
        int dimensionCuadrado, dimensionCuadradito;
        int normal, derecha, abajo, izquierda;
        
        while (true) {
            dimensionCuadrado = sc.nextInt();
            dimensionCuadradito = sc.nextInt();
            
            if (dimensionCuadrado == 0 && dimensionCuadradito == 0) 
                break;
            
            cuadrado = new char[dimensionCuadrado][dimensionCuadrado];
            cuadradito = new char[dimensionCuadradito][dimensionCuadradito];
            
            for (int i = 0; i < cuadrado.length; i++) {
                String s = sc.next();
                cuadrado[i] = s.toCharArray();
            }
            
            for (int i = 0; i < cuadradito.length; i++) {
                String temp = sc.next();
                cuadradito[i] = temp.toCharArray();
            }
            
            for (int i = 0; i < cuadrado.length; i++) {
                for (int j = 0; j < cuadrado[i].length; j++) {
                    if (i > dimensionCuadrado - dimensionCuadradito ||
                            j > dimensionCuadrado - dimensionCuadradito) 
                        continue;
                    if (cuadrado[i][j] == cuadradito[i][j] && 
                            cuadrado[i][j + 1] == cuadradito[i][j + 1] && 
                            cuadrado[i + 1][j] == cuadradito[i + 1][j] &&
                            cuadrado[i + 1][j + 1] == cuadradito[i][j]) {
                        
                    }
                    
//                    System.out.println(cuadrado[i][j] + " " );
//                    System.out.println(cuadrado[i][j + 1] + " " );
//                    System.out.println(cuadrado[i + 1][j + 1] + " " );
                }
            }
            
            System.out.println();
            for (int i = 0; i < cuadrado.length; i++) {
                for (int j = 0; j < cuadrado[i].length; j++) {
                    System.out.print(cuadrado[i][j]);
                }
                
                System.out.println();
            }
        }
    }
}