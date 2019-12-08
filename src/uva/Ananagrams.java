package uva;

/**
UVA #156
https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=92

Most crossword puzzle fans are used to anagrams — groups of words with the same 
letters in different orders — for example OPTS, SPOT, STOP, POTS and POST. 
Some words however do not have this attribute, no matter how you rearrange 
their letters, you cannot form another word. Such words are called ananagrams, 
an example is QUIZ.

Obviously such definitions depend on the domain within which we are working; 
you might think that ATHENE is an ananagram, whereas any chemist would quickly 
produce ETHANE. One possible domain would be the entire English language, but 
this could lead to some problems. One could restrict the domain to, say, Music, 
in which case SCALE becomes a relative ananagram (LACES is not in the same 
domain) but NOTE is not since it can produce TONE.

Write a program that will read in the dictionary of a restricted domain and 
determine the relative ananagrams. Note that single letter words are, ipso 
facto, relative ananagrams since they cannot be “rearranged” at all. The 
dictionary will contain no more than 1000 words.

Input
Input will consist of a series of lines. No line will be more than 80 
characters long, but may contain any number of words. Words consist of up to 20 
upper and/or lower case letters, and will not be broken across lines. Spaces 
may appear freely around words, and at least one space separates multiple words
on the same line. Note that words that contain the same letters but of 
differing case are considered to be anagrams of each other, thus ‘tIeD’ and 
‘EdiT’ are anagrams. The file will be terminated by a line consisting of a 
single ‘#’.

Output
Output will consist of a series of lines. Each line will consist of a single 
word that is a relative ananagram in the input dictionary. Words must be output 
in lexicographic (case-sensitive) order. There will always be at least one 
relative ananagram.

Sample Input
ladder came tape soon leader acme RIDE lone Dreis peat ScAlE orb eye Rides 
dealer NotE derail LaCeS drIed noel dire Disk mace Rob dries
#

Sample Output
Disk
NotE
derail
drIed
eye
ladder
soon
*/
public class Ananagrams {

    public Ananagrams() {
        init();
    }
    
    private void init() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        java.util.ArrayList<String> listaInicial = new java.util.ArrayList<>();
        java.util.ArrayList<String> listaOrdenada = new java.util.ArrayList<>();
        java.util.ArrayList<String> listaConPalabrasRepetidas 
                = new java.util.ArrayList<>();
        String palabra, otraPalabra;
        
        while (true) {
            palabra = sc.next();
            
            if (palabra.equals("#"))
                break;
            
            listaInicial.add(palabra);
            
            palabra = palabra.toLowerCase(); /* la palabra a minusculas */
            
            char[] vector = palabra.toCharArray(); /* la palabra a array */ 
            java.util.Arrays.sort(vector); /* ordenamos el array */
            palabra = java.util.Arrays.toString(vector); /* el array a cadena */
            
            /* agregamos la cadena ordenada a una lista */
            listaOrdenada.add(palabra);
        }
        
        /* recorremos la lista ordenada (menos el ultimo elemento) */
        for (int i = 0; i < listaOrdenada.size() - 1; i++) {
            palabra = listaOrdenada.get(i);
            
            /* buscamos las palabras que le siguen a la palabra 
            (excluyendo las anteriores) */
            for (int j = i + 1; j < listaOrdenada.size(); j++) {
                otraPalabra = listaOrdenada.get(j);
                
                /* si tienen la misma cantidad de caracteres, los comparamos */
                if (palabra.length() == otraPalabra.length() && 
                        palabra.equals(otraPalabra)) {
                    /* agregamos las 2 palabras iguales */
                    listaConPalabrasRepetidas.add(listaInicial.get(i));
                    listaConPalabrasRepetidas.add(listaInicial.get(j));
                }
            }
        }
        
        /* ordenamos las palabras ingresadas al comienzo */
        java.util.Collections.sort(listaInicial);
        
        /* recorremos la lista que tiene las palabras repetidas */
        for (int i = 0; i < listaConPalabrasRepetidas.size(); i++) {
            palabra = listaConPalabrasRepetidas.get(i);
            
            int posicionPalabraRepetidaEnListaInicial = 
                    java.util.Collections.binarySearch(listaInicial, palabra);
            /* si la palabra repetida se encuentra en la primera lista, 
            la eliminamos (binarySearch devuelve la posicion del elemento, si 
            se encuentra en la lista) */
            if (posicionPalabraRepetidaEnListaInicial >= 0) {
                listaInicial.remove(posicionPalabraRepetidaEnListaInicial);
            }
        }
        
        for (int i = 0; i < listaInicial.size(); i++) {
            System.out.println(listaInicial.get(i));
        }
    }
}