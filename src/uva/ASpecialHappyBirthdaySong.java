package uva;

/**
UVA #12554
https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=3999

There are n people (excluding myself) in my 30th birthday party. They sing the 
traditional “happy birthday” song:

Happy birthday to you! Happy birthday to you! Happy birthday to Rujia! Happy 
birthday to you!!! 

Since I love music, I want to hear something more interesting, not that 
everyone sings together. Ah yes, I want one person to sing one word!

For example, there are three people: Mom, Dad, Girlfriend, I’d like them to sing 
like this:

Mom: Happy
Dad: birthday
Girlfriend: to
Mom: you
Dad: Happy
Girlfriend: birthday
Mom: to
Dad: you
Girlfriend: Happy
Mom: birthday
Dad: to
Girlfriend: Rujia
Mom: Happy
Dad: birthday
Girlfriend: to
Mom: you

Very nice, right? What if there are more than 16 people? That’s easy: repeat the 
song until everyone has sung at least once :)

Please, don’t stop in the middle of the song.

Input
There is only one test case. The first line contains a single integer 
n (1 ≤ n ≤ 100). Then each of the next n lines contains a capitalized name 
(i.e. one upper-case letter followed by zero or more lowercase letters). Each 
name contains at most 100 characters and do not have whitespace characters 
inside.

Output
Output the song, formatted as above.

Sample Input
3
Mom
Dad
Girlfriend
Sample Output

Mom: Happy
Dad: birthday
Girlfriend: to
Mom: you
Dad: Happy
Girlfriend: birthday
Mom: to
Dad: you
Girlfriend: Happy
Mom: birthday
Dad: to
Girlfriend: Rujia
Mom: Happy
Dad: birthday
Girlfriend: to
Mom: you
*/
public class ASpecialHappyBirthdaySong {

    public ASpecialHappyBirthdaySong() {
        init();
    }

    private void init() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String[] cancion = {"Happy", "birthday", "to", "you", "Happy", 
            "birthday", "to", "you", "Happy", "birthday", "to", "Rujia",
            "Happy", "birthday", "to", "you"};
        int cantidad;
        String[] invitados;
        boolean todosCantaron = false;
        
        cantidad = sc.nextInt();
        invitados = new String[cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            invitados[i] = sc.next();
        }
        
        for (int i = 0, j = 0; i < cancion.length; i++, j++) {
            System.out.println(invitados[j] + ": " + cancion[i]);
            
            if (j == invitados.length - 1) {
                j = -1;
                todosCantaron = true;
            }
            
            if (i == cancion.length - 1 && todosCantaron) 
                break;
            
            if (i == cancion.length - 1) 
                i = -1;
        }
    }
}