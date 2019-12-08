package uva;

/**
UVA #12468
https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=3912

I’m a big fan of watching TV. However, I don’t like to watch a single channel; 
I’m constantly zapping between different channels.

My dog tried to eat my remote controller and unfortunately he partially 
destroyed it. The numeric buttons I used to press to quickly change channels 
are not working anymore. Now, I only have available two buttons to change 
channels: one to go up to the next channel (the △ button) and one to go down to 
the previous channel (the ▽ button). This is very annoying because if I’m 
watching channel 3 and want to change to channel 9 I have to press the △ button 
6 times!

My TV has 100 channels conveniently numbered 0 through 99. They are cyclic, in 
the sense that if I’m on channel 99 and press △ I’ll go to channel 0. Similarly, 
if I’m on channel 0 and press ▽ I’ll change to channel 99.

I would like a program that, given the channel I’m currently watching and the 
channel I would like to change to, tells me the minimum number of button 
presses I need to reach that channel.

Input
The input contains several test cases (at most 200).

Each test case is described by two integers a and b in a single line. a is the 
channel I’m currently watching and b is the channel I would like to go 
to (0 ≤ a, b ≤ 99).

The last line of the input contains two ‘-1’s and should not be processed.

Output
For each test case, output a single integer on a single line — the minimum 
number of button presses needed to reach the new channel (Remember, the only 
two buttons I have available are △ and ▽).

Sample Input
3 9
0 99
12 27
-1 -1

Sample Output
6
1
15
*/
public class Zapping {

    public Zapping() {
        init();
    }

    private void init() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int canalActual, canalALlegar, cantidadCanales;
        
        while (true) {
            canalActual = sc.nextInt();
            canalALlegar = sc.nextInt();
            
            if (canalActual == -1 && canalALlegar == -1)
                return;
            
            cantidadCanales = 0;
            
            for (int i = canalActual, j = canalActual; i < 100 || j > 0; i++, j--) {
                if (canalActual == canalALlegar)
                    break;
                
                cantidadCanales++;
                
                if (i == 99) 
                    i = -1;
                
                if (j == 0) {
                    j = 100;
                }
                
                if (i + 1 == canalALlegar || j - 1 == canalALlegar)
                    break;
            }
            
            System.out.println(cantidadCanales);
        }
    }
}