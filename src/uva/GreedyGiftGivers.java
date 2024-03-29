package uva;

/**
UVA #119
https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=55

This problem involves determining, for a group of gift-giving friends, how much 
more each person gives than they receive (and vice versa for those that view 
gift-giving with cynicism).

In this problem each person sets aside some money for gift-giving and divides 
this money evenly among all those to whom gifts are given.

However, in any group of friends, some people are more giving than others (or 
at least may have more acquaintances) and some people have more money than 
others.

Given a group of friends, the money each person in the group spends on gifts, 
and a (sub)list of friends to whom each person gives gifts; you are to write a 
program that determines how much more (or less) each person in the group gives 
than they receive.

Input
The input is a sequence of gift-giving groups. A group consists of several 
lines:

• the number of people in the group,
• a list of the names of each person in the group,
• a line for each person in the group consisting of the name of the person, the 
    amount of money spent on gifts, the number of people to whom gifts are 
    given, and the names of those to whom gifts are given.

All names are lower-case letters, there are no more than 10 people in a group, 
and no name is more than 12 characters in length. Money is a non-negative 
integer less than 2000.

The input consists of one or more groups and is terminated by end-of-file.

Output
For each group of gift-givers, the name of each person in the group should be 
printed on a line followed by the net gain (or loss) received (or spent) by the 
person. Names in a group should be printed in the same order in which they 
first appear in the input.

The output for each group should be separated from other groups by a blank line. 
All gifts are integers. Each person gives the same integer amount of money to 
each friend to whom any money is given, and gives as much as possible. Any 
money not given is kept and is part of a person’s “net worth” printed in the 
output.

Sample Input
5
dave laura owen vick amr
dave 200 3 laura owen vick
owen 500 1 dave
amr 150 2 vick owen
laura 0 2 amr vick
vick 0 0
3
liz steve dave
liz 30 1 steve
steve 55 2 liz dave
dave 0 2 steve liz

Sample Output
dave 302
laura 66
owen -359
vick 141
amr -150
liz -3
steve -24
dave 27
*/
public class GreedyGiftGivers {

    public GreedyGiftGivers() {
        init();
    }

    private void init() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        java.util.HashMap<String, Integer> map = new java.util.LinkedHashMap<>();
        int cantidadNombres, dinero, cantidadPersonas;
        String nombre;
        boolean primeraLinea = true;
        
        while (sc.hasNext()) {
            cantidadNombres = sc.nextInt();
            map.clear();
            
            for (int i = 0; i < cantidadNombres; i++) {
                nombre = sc.next();
                
                map.put(nombre, 0);
            }
            
            for (int i = 0; i < cantidadNombres; i++) {
                nombre = sc.next();
                
                dinero = sc.nextInt();
                cantidadPersonas = sc.nextInt();
                
                if (cantidadPersonas == 0)
                    continue;
                
                if (dinero == 0) {
                    for (int j = 0; j < cantidadPersonas; j++) {
                        sc.next();
                    }
                    
                    continue;
                }
                
                map.put(nombre, map.get(nombre) - dinero); // descontamos el dinero
                map.put(nombre, map.get(nombre) + dinero % cantidadPersonas);
                
                // dividimos el dinero entre la cantidad de personas
                dinero = dinero / cantidadPersonas;
                
                for (int j = 0; j < cantidadPersonas; j++) {
                    nombre = sc.next();
                    
                    map.put(nombre, map.get(nombre) + dinero);
                }
            }
            
            if (!primeraLinea) 
                System.out.println();
            
            primeraLinea = false;
            
            for (java.util.Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}