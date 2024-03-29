package uva;

/**
UVA #12372
https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=3794

Mr. Bean used to have a lot of problems packing his suitcase for holiday. So he 
is very careful for this coming holiday. He is more serious this time because 
he is going to meet his fiance and he is also keeping frequent communication 
with you as a programmer friend to have suggestions. He gets confused when he 
buys a gift box for his fiance because he can’t decide whether it will fit in 
his suitcase or not. Sometimes a box doesn’t fit in his suitcase in one 
orientation and after rotating the box to a different orientation it fits in 
the suitcase. This type of behavior makes him puzzled.

So to make things much simpler he bought another suitcase having same length, 
width and height, which is 20 inches. This measurement is taken from inside of 
the box. So a box which has length, width and height of 20 inches will just fit 
in this suitcase. He also decided to buy only rectangular shaped boxes and keep 
a measuring tape in his pocket. Whenever he chooses one gift box, which must be 
rectangular shaped, he quickly measures the length, width and height of the 
box. But still he can’t decide whether it will fit in his suitcase or not. Now 
he needs your help. Please write a program for him which calculates whether a 
rectangular box fits in his suitcase or not provided the length, width and 
height of the box. Note that, sides of the box must be parallel to the sides of 
the suitcase.

Input
Input starts with an integer T (T ≤ 100), which indicates the number of test 
cases.
Each of the next T line contains three integers L, W and H (1 ≤ L, W, H ≤ 50) 
denoting the length, width and height of a rectangular shaped box.

Output
For each test case, output a single line. If the box fits in the suitcase in 
any orientation having the sides of the box is parallel to the sides of the 
suitcase, this line will be ‘Case #: good’, otherwise it will be ‘Case #: bad’. 
In your output # will be replaced by the case number.

Please see the sample input and sample output for exact format.

Sample Input
2
20 20 20
1 2 21

Sample Output
Case 1: good
Case 2: bad
*/
public class PackingForHoliday {

    public PackingForHoliday() {
        init();
    }
    
    private void init() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int cantidad, largo, ancho, alto;
        
        cantidad = sc.nextInt();
        
        for (int i = 1; i <= cantidad; i++) {
            largo = sc.nextInt();
            ancho = sc.nextInt();
            alto = sc.nextInt();
            
            if (largo > 20 || ancho > 20 || alto > 20) 
                System.out.println("Case " + i + ": bad");
            else
                System.out.println("Case " + i + ": good");
        }
    }
}