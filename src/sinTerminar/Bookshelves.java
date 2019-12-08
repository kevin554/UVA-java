package sinTerminar;

public class Bookshelves {

    public Bookshelves() {
        init();
    }

    private void init() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        java.util.ArrayList<Integer> primerEstante = new java.util.ArrayList<>();
        java.util.ArrayList<Integer> segundoEstante = new java.util.ArrayList<>();
        int cantidad, movimientos, mayorPrimerEstante, segundoPrimerEstante, 
                mayorSegundoEstante, segundoSegundoEstante;
        
        cantidad = sc.nextInt();
        movimientos = sc.nextInt();
        
        for (int i = 0; i < cantidad; i++) {
            primerEstante.add(sc.nextInt());
        }
        
        for (int i = 0; i < cantidad; i++) {
            segundoEstante.add(sc.nextInt());
        }
        
        java.util.Collections.sort(primerEstante, java.util.Collections.reverseOrder());
        java.util.Collections.sort(segundoEstante, java.util.Collections.reverseOrder());
        
        mayorPrimerEstante = java.util.Collections.max(primerEstante);
        mayorSegundoEstante = java.util.Collections.max(segundoEstante);
        
        segundoPrimerEstante = primerEstante.get(1);
        segundoSegundoEstante = segundoEstante.get(1);
        
        while (movimientos-- > 0) {
            if (mayorPrimerEstante > mayorSegundoEstante) {
                if (mayorPrimerEstante + segundoSegundoEstante <
                        mayorPrimerEstante + mayorSegundoEstante) {
                    int temp = mayorSegundoEstante;
                    segundoEstante.set(0, primerEstante.get(cantidad - 1));
                    primerEstante.set(cantidad - 1, temp);
                    
                    mayorPrimerEstante = java.util.Collections.max(primerEstante);
                    mayorSegundoEstante = java.util.Collections.max(segundoEstante);
                }
            } else { // el segundo estante es mas pesado
                if (mayorSegundoEstante + segundoPrimerEstante < 
                        mayorPrimerEstante + mayorSegundoEstante) {
                    int temp = mayorPrimerEstante;
                    primerEstante.set(0, segundoEstante.get(cantidad - 1));
                    segundoEstante.set(cantidad - 1, temp);
                    
                    mayorPrimerEstante = java.util.Collections.max(primerEstante);
                    mayorSegundoEstante = java.util.Collections.max(segundoEstante);
                }
            }
        }
        
        System.out.println(java.util.Collections.max(primerEstante) + 
                java.util.Collections.max(segundoEstante));
    }
    
    public void intercambiar(int numeroPrimerLista, int numeroSegundaLista) {
        
    }
}