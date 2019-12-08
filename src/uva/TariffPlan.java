package uva;

/**
UVA #12157
https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=3309

Ampang Communications & Mobile (ACM) provides telecom services for various 
types of users. Since the people of Ampang are quite talkative, they are always 
seeking for packages that are best suited for them. To have an edge over their 
competitors, ACM provides various packages. Two of the most popular packages 
are:

• Mile
• Juice

Mile charges every 30 seconds at a rate of 10 cents. That means if you talk for 
29 seconds or less, you will be charged with 10 cents. If you talk for 30 to 59 
seconds, you will be charged with 20 cents and so on.

Juice charges every 60 seconds at a rate of 15 cents. That means if you talk 
for 59 seconds or less, you will be charged with 15 cents. Similarly, if you 
talk for 60 seconds to 119 seconds, you will be charged with 30 cents and so on.

Given a list of call durations, can you determine the package that is cheaper?

Input
The first line of input is an integer T (T < 50) that denotes the total number 
of test cases. Each case starts with a line containing an integer 
N (0 < N < 20). The next line gives a list of N call durations (In second). 
Each call duration is an integer in the range [1, 2000]. Consecutive integers 
are separated by a single space character.

Output
For each case, output the case number first. Then output the name of the 
cheaper package followed by the corresponding cost in cents. If both package 
gives the same total cost, then output both the names (‘Mile’ preceding ‘Juice’) 
followed by the cost. Look at the output for sample input for details.

Illustration
Case 1: Mile(30+10=40) & Juice(30+15=45).
Case 2: Mile(20+20+20=60) & Juice(15+15+15=45).
Case 3: Mile(30+30=60) & Juice(30+30=60).

Sample Input
3
2
61 10
3
40 40 40
2
60 65

Sample Output
Case 1: Mile 40
Case 2: Juice 45
Case 3: Mile Juice 60
*/
public class TariffPlan {

    public TariffPlan() {
        init();
    }

    private void init() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int cantidadCasos, cantidadLlamadas, llamada;
        
        cantidadCasos = sc.nextInt();
        
        for (int i = 1; i <= cantidadCasos; i++) {
            cantidadLlamadas = sc.nextInt();
            
            int precioMile = 0, precioJuice = 0;
            // Mile 30s 10c, Juice 60s 15c
            while (cantidadLlamadas-- > 0) {
                llamada = sc.nextInt();
                
                int resultadoMile = llamada / 30;
                int residuoMile = llamada % 30;
                
                if (residuoMile >= 0) 
                    resultadoMile++;
                
                precioMile += resultadoMile * 10;
                
                int resultadoJuice = llamada / 60;
                int residuoJuice = llamada % 60;
                
                if (residuoJuice >= 0)
                    resultadoJuice++;
                
                precioJuice += resultadoJuice * 15;
            }
            
            if (precioMile < precioJuice)
                System.out.println("Case " + i + ": Mile " + precioMile);
            else if (precioJuice < precioMile)
                System.out.println("Case " + i + ": Juice " + precioJuice);
            else if (precioJuice == precioMile)
                System.out.println("Case " + i + ": Mile Juice " + precioMile);
        }
    }
}