package uva;

/**
UVA #10038 
https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=979

A sequence of n > 0 integers is called a jolly jumper if the absolute values of
the difference between successive elements take on all the values 1 through 
n − 1. For instance,

1 4 2 3

is a jolly jumper, because the absolutes differences are 3, 2, and 1 
respectively. The definition implies that any sequence of a single integer is a 
jolly jumper. You are to write a program to determine whether or not each of a 
number of sequences is a jolly jumper.

Input
Each line of input contains an integer n ≤ 3000 followed by n integers 
representing the sequence.

Output
For each line of input, generate a line of output saying ‘Jolly’ or ‘Not jolly’.

Sample Input
4 1 4 2 3
5 1 4 2 -1 6

Sample Output
Jolly
Not jolly
*/
public class JollyJumpers {

    public JollyJumpers() {
        init();
    }
    
    private void init() {
        java.util.ArrayList<Integer> lista = new java.util.ArrayList<>();
        java.util.ArrayList<Integer> listaFinal = new java.util.ArrayList<>();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int cantidadNumeros, numero, siguienteNumero, diferencia;
        boolean esJolly;
        
        while (sc.hasNext()) {
            esJolly = true;
            cantidadNumeros = sc.nextInt();
            
            /* Agregamos todos los numeros a la lista */
            while (cantidadNumeros-- > 0) 
                lista.add(sc.nextInt());
            
            for (int i = 0; i < lista.size() - 1; i++) {
                numero = lista.get(i);
                siguienteNumero = lista.get(i + 1);
                
                /* valor absoluto de la resta entre el numero y el siguiente */
                diferencia = Math.abs(numero - siguienteNumero);
                
                if (esJolly) {
                    /* deja de cumplir con la condicion 'jolly' si es que 
                    la diferencia: 
                    es igual a la cantidad de elementos de la lista 
                    es 0
                    se repite 2 veces */
                    if (diferencia == 0 || diferencia >= lista.size() || 
                            listaFinal.contains(diferencia)) {
                        esJolly = false;
                    } 

                    listaFinal.add(diferencia);
                }
            }
            
            if (esJolly) 
                System.out.println("Jolly");
            else 
                System.out.println("Not jolly");
            
            lista.clear();
            listaFinal.clear();
        }
    }
}