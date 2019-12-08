package uva;

/**
UVA #12503
https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=3947

You have a robot standing on the origin of x axis. The robot will be given some 
instructions. Your task is to predict its position after executing all the 
instructions.

• LEFT: move one unit left (decrease p by 1, where p is the position of the 
    robot before moving)
• RIGHT: move one unit right (increase p by 1)
• SAME AS i: perform the same action as in the i-th instruction. It is 
    guaranteed that i is a positive integer not greater than the number of 
    instructions before this.

Input
The first line contains the number of test cases T (T ≤ 100). Each test case 
begins with an integer n (1 ≤ n ≤ 100), the number of instructions. Each of the 
following n lines contains an instruction.

Output
For each test case, print the final position of the robot. Note that after 
processing each test case, the robot should be reset to the origin.

Sample Input
2
3
LEFT
RIGHT
SAME AS 2
5
LEFT
SAME AS 1
SAME AS 2
SAME AS 1
SAME AS 4

Sample Output
1
-5
*/
public class RobotInstructions {

    public RobotInstructions() {
        init();
    }

    private void init() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        java.util.ArrayList<Integer> listaInstrucciones = 
                new java.util.ArrayList<>();
        int cantidadCasos, cantidadMovimientos, pos;
        String instruccion;
        
        cantidadCasos = sc.nextInt();
        
        while (cantidadCasos-- > 0) {
            cantidadMovimientos = sc.nextInt();
            pos = 0;
            listaInstrucciones.clear();
            
            while (cantidadMovimientos-- > 0) {
                instruccion = sc.next();
                
                if (instruccion.equalsIgnoreCase("LEFT")) {
                    pos--;
                    listaInstrucciones.add(-1);
                } else if (instruccion.equalsIgnoreCase("RIGHT")) {
                    pos++;
                    listaInstrucciones.add(1);
                } else if (instruccion.equalsIgnoreCase("SAME")) {
                    sc.next();
                    int numeroInstruccion = sc.nextInt();
                    
                    listaInstrucciones.add(
                            listaInstrucciones.get(numeroInstruccion - 1));
                    pos += listaInstrucciones.get(numeroInstruccion - 1);
                }
            }
            
            System.out.println(pos);
        }
    }
}