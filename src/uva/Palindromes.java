package uva;

/**
UVA #401
https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=342

A regular palindrome is a string of numbers or letters that is the same forward 
as backward. For example, the string “ABCDEDCBA” is a palindrome because it is 
the same when the string is read from left to right as when the string is read 
from right to left.

A mirrored string is a string for which when each of the elements of the string 
is changed to its reverse (if it has a reverse) and the string is read 
backwards the result is the same as the original string. For example, the 
string “3AIAE” is a mirrored string because ‘A’ and ‘I’ are their own reverses,
and ‘3’ and ‘E’ are each others’ reverses.

A mirrored palindrome is a string that meets the criteria of a regular 
palindrome and the criteria of a mirrored string. The string “ATOYOTA” is a
mirrored palindrome because if the string is read backwards, the string is the 
same as the original and because if each of the characters is replaced by its 
reverse and the result is read backwards, the result is the same as the 
original string. Of course, ‘A’, ‘T’, ‘O’, and ‘Y’ are all their own reverses.

A list of all valid characters and their reverses is as follows.

    Character   Reverse    | Character   Reverse    | Character   Reverse
    A           A          | M           M          | Y           Y
    B                      | N                      | Z           5
    C                      | O           O          | 1           1
    D                      | P                      | 2           S
    E           3          | Q                      | 3           E
    F                      | R                      | 4
    G                      | S           2          | 5           Z
    H           H          | T           T          | 6
    I           I          | U           U          | 7
    J           L          | V           V          | 8           8
    K                      | W           W          | 9
    L           J          | X           X

Note that ‘0’ (zero) and ‘O’ (the letter) are considered the same character and 
therefore ONLY the letter ‘O’ is a valid character.

Input
Input consists of strings (one per line) each of which will consist of one to 
twenty valid characters.
There will be no invalid characters in any of the strings. Your program should 
read to the end of file.

Output
For each input string, you should print the string starting in column 1 
immediately followed by exactly one of the following strings.

            STRING                              CRITERIA
‘ -- is not a palindrome.’      if the string is not a palindrome and is not a 
                                mirrored string
‘ -- is a regular palindrome.’  if the string is a palindrome and is not a 
                                mirrored string
‘ -- is a mirrored string.’     if the string is not a palindrome and is a 
                                mirrored string
‘ -- is a mirrored palindrome.’ if the string is a palindrome and is a mirrored 
                                string

Note that the output line is to include the ‘-’s and spacing exactly as shown in
the table above and demonstrated in the Sample Output below.
In addition, after each output line, you must print an empty line.

Sample Input
NOTAPALINDROME
ISAPALINILAPASI
2A3MEAS
ATOYOTA

Sample Output
NOTAPALINDROME -- is not a palindrome.
ISAPALINILAPASI -- is a regular palindrome.
2A3MEAS -- is a mirrored string.
ATOYOTA -- is a mirrored palindrome.
*/
public class Palindromes {

    public Palindromes() {
        init();
    }
    
    private void init() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String palabra;
        int mitad, tamano;
        char letraLadoIzquierdo, letraLadoDerecho;
        boolean esPalindromo, esCadenaReflejada;
        
        while (sc.hasNext()) {
            esPalindromo = true;
            esCadenaReflejada = true;
            
            palabra = sc.nextLine();
            
            /* la cantidad de caracteres que tiene la palabra */
            tamano = palabra.length(); 
            mitad = tamano / 2;
            
            /* Evaluamos cada letra hasta la mitad, con ésta incluida 
               'i' recorre desde la izquierda y 'j' desde la derecha */
            for (int i = 0, j = tamano - 1; i <= mitad; i++, j--) {
                letraLadoIzquierdo = palabra.charAt(i);
                letraLadoDerecho = palabra.charAt(j);
                
                /* si las letras de ambos extremos no coinciden, marcamos 
                    para evitar seguir comparando el resto */
                if (esPalindromo && letraLadoIzquierdo != letraLadoDerecho) 
                    esPalindromo = false;
                
                /* si no coincide con el criterio de cadena reflejada, 
                    saltamos el resto del proceso dentro del switch */
                if (!esCadenaReflejada) continue;
                
                switch (letraLadoIzquierdo) {
                    case 'A':
                        if (letraLadoDerecho != 'A') 
                            esCadenaReflejada = false;
                        break;
                    case 'E':
                        if (letraLadoDerecho != '3')
                            esCadenaReflejada = false;
                        break;
                    case '3':
                        if (letraLadoDerecho != 'E')
                            esCadenaReflejada = false;
                        break;
                    case 'H':
                        if (letraLadoDerecho != 'H')
                            esCadenaReflejada = false;
                        break;
                    case 'I':
                        if (letraLadoDerecho != 'I')
                            esCadenaReflejada = false;
                        break;
                    case 'J':
                        if (letraLadoDerecho != 'L')
                            esCadenaReflejada = false;
                        break;
                    case 'L':
                        if (letraLadoDerecho != 'J')
                            esCadenaReflejada = false;
                        break;
                    case 'M':
                        if (letraLadoDerecho != 'M')
                            esCadenaReflejada = false;
                        break;
                    case 'O':
                        if (letraLadoDerecho != '0' && letraLadoDerecho != 'O')
                            esCadenaReflejada = false;
                        break;
                    case 'S':
                        if (letraLadoDerecho != '2')
                            esCadenaReflejada = false;
                        break;
                    case 'T':
                        if (letraLadoDerecho != 'T')
                            esCadenaReflejada = false;
                        break;
                    case 'U':
                        if (letraLadoDerecho != 'U')
                            esCadenaReflejada = false;
                        break;
                    case 'V':
                        if (letraLadoDerecho != 'V')
                            esCadenaReflejada = false;
                        break;
                    case 'W':
                        if (letraLadoDerecho != 'W')
                            esCadenaReflejada = false;
                        break;
                    case 'X':
                        if (letraLadoDerecho != 'X')
                            esCadenaReflejada = false;
                        break;
                    case 'Y':
                        if (letraLadoDerecho != 'Y')
                            esCadenaReflejada = false;
                        break;
                    case '1':
                        if (letraLadoDerecho != '1')
                            esCadenaReflejada = false;
                        break;
                    case '2':
                        if (letraLadoDerecho != 'S')
                            esCadenaReflejada = false;
                        break;
                    case 'Z':
                        if (letraLadoDerecho != '5')
                            esCadenaReflejada = false;
                        break;
                    case '5':
                        if (letraLadoDerecho != 'Z')
                            esCadenaReflejada = false;
                        break;
                    case '8':
                        if (letraLadoDerecho != '8')
                            esCadenaReflejada = false;
                        break;
                        
                    default:
                        esCadenaReflejada = false;
                        break;
                }
            }
            
            if (esPalindromo && !esCadenaReflejada) 
                System.out.println(palabra + " -- is a regular palindrome.");
            else if (!esPalindromo && esCadenaReflejada)
                System.out.println(palabra + " -- is a mirrored string.");
            else if (esPalindromo && esCadenaReflejada)
                System.out.println(palabra + " -- is a mirrored palindrome.");
            else
                System.out.println(palabra + " -- is not a palindrome.");
            
            System.out.println();
        }
    }
}