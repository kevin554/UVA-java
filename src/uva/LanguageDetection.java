package uva;

/**
UVA #12250
https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=3402

English, Spanish, German, French, Italian and Russian are the 6 most prominent 
languages in the countries of European Union. Figure on the left shows 
intensity of English speaking people in different European countries. All of
these languages have different words to represent the English word “HELLO”. For 
example in Spanish the word equivalent to “HELLO” is “HOLA”. In German, French, 
Italian and Russian language the word that means (or similar to) “HELLO” is 
“HALLO”, “BONJOUR”, “CIAO” and “ZDRAVSTVUJTE” respectively. In this problem your 
task is pretty simple. You will be given one of the six words mentioned above 
or any other word and you will have to try and detect the language it is from.

Input
Input file contains around 2000 lines of inputs.
Each line contains a string S. You can assume that all the letters of the 
string are uppercase English letters and the maximum length of the string is 14.
Input is terminated by a line containing a single ‘#’ character 
(without the quote). This line should not be processed.

Output
For each line of input except the last one produce one line of output. This 
line contains the serial of output followed by a language name. If the input 
string is ‘HELLO’ or ‘HOLA’ or ‘HALLO’ or ‘BONJOUR’ or ‘CIAO’ or ‘ZDRAVSTVUJTE’ then 
you should report the language it belongs to. If the input string is something 
other than these 6 strings print the string ‘UNKNOWN’ (without the quotes) 
instead. All characters in the output strings are uppercase as well. Look at 
the output for sample input for formatting details.

Sample Input
HELLO
HOLA
HALLO
BONJOUR
CIAO
ZDRAVSTVUJTE
#

Sample Output
Case 1: ENGLISH
Case 2: SPANISH
Case 3: GERMAN
Case 4: FRENCH
Case 5: ITALIAN
Case 6: RUSSIAN
*/
public class LanguageDetection {

    public LanguageDetection() {
        init();
    }

    private void init() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String palabra;
        
        for (int i = 1; true; i++) {
            palabra = sc.next();
            
            if (palabra.equals("#"))
                return;
            
            switch (palabra) {
                case "HELLO":
                    System.out.println("Case " + i + ": ENGLISH");
                    break;
                    
                case "HOLA":
                    System.out.println("Case " + i + ": SPANISH");
                    break;
                    
                case "HALLO":
                    System.out.println("Case " + i + ": GERMAN");
                    break;
                    
                case "BONJOUR":
                    System.out.println("Case " + i + ": FRENCH");
                    break;
                    
                case "CIAO":
                    System.out.println("Case " + i + ": ITALIAN");
                    break;
                    
                case "ZDRAVSTVUJTE":
                    System.out.println("Case " + i + ": RUSSIAN");
                    break;
                    
                default:
                    System.out.println("Case " + i + ": UNKNOWN");
                    break;
            }
        }
    }
}