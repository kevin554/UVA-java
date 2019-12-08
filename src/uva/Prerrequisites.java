package uva;

/**
UVA #10919
https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=1860

Freddie the frosh has chosen to take k courses. 

To meet the degree requirements, he must take courses from each of several 
categories.

Can you assure Freddie that he will graduate, based on his course selection?

Input
Input consists of several test cases. For each case, the first line of input 
contains 1 ≤ k ≤ 100, the number of courses Freddie has chosen, and 
0 ≤ m ≤ 100, the number of categories. 

One or more lines follow containing k 4- digit integers follow; each is the 
number of a course selected by Freddie. Each category is represented by a line 
containing 1 ≤ c ≤ 100, the number of courses in the category, 0 ≤ r ≤ c, the 
minimum number of courses from the category that must be taken, and the c 
course numbers in the category. Each course number is a 4-digit integer. The 
same course may fulfil several category requirements. Freddie’s selections, and 
the course numbers in any particular category, are distinct. A line containing 
‘0’ follows the last test case.

Output
For each test case, output a line containing ‘yes’ if Freddie’s course selection 
meets the degree requirements; otherwise output ‘no’.

Sample Input
3 2
0123 9876 2222
2 1 8888 2222
3 2 9876 2222 7654
3 2
0123 9876 2222
2 2 8888 2222
3 2 7654 9876 2222
0

Sample Output
yes
no
*/
public class Prerrequisites {

    public void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        java.util.ArrayList<Integer> lista = new java.util.ArrayList<>();
        int cursos, categorias, categoria, minimaCantidad;
        boolean cumpleConElRequsito;
        
        while (true) {
            cursos = sc.nextInt();
            
            if (cursos == 0)
                return;
            
            categorias = sc.nextInt();
            lista.clear();
            
            for (int i = 0; i < cursos; i++) {
                lista.add(sc.nextInt());
            }
            
            cumpleConElRequsito = true;
            
            for (int i = 0; i < categorias; i++) {
                categoria = sc.nextInt();
                minimaCantidad = sc.nextInt();
                
                for (int j = 0; j < categoria; j++) {
                    int curso = sc.nextInt();
                    
                    if (lista.contains(curso)) 
                        minimaCantidad--;
                }
                
                if (minimaCantidad > 0) 
                    cumpleConElRequsito = false;
            }
            
            if (cumpleConElRequsito)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}