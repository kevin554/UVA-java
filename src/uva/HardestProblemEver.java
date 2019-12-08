package uva;

/**
UVA #12478
https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=3922

IUT once asked a group of people to prepare a number of problems for their 
yearly national contest.

That group of people (let’s call them the setters) is really enthusiastic 
problem solvers, they gratefully accepted the job. They spent day and night, 
finding interesting ideas, writing solutions, preparing test-data and problem 
descriptions. The job was almost done. I said almost because for some reason 
they could not agree on one matter — what kind of problem should be chosen as 
the easiest problem for this contest. One of the setters proposed a problem 
related to something what he is currently doing at office. But the coordinator 
of setters wasn’t really interested.

He thought this might be too hard for the newbies. This easiest problem should 
make everyone happy. No one should return home from the contest without solving 
anything. So another guy suggested a + b problem, which was also rejected. 
Reason? Some of the contestants may be really new to programming and may not 
even know how to take input, they may come to the contest only knowing how to 
print “Hello world!”. Suddenly an idea came to one of the setter’s mind. He said, 
“If we make a task to be solved with printing only, our problem is solved!” 
Voila! They just solved the hardest problem ever — that is to make a problem 
that every team can solve. 

You are given a 9 × 9 grid (in the next page). The names of the setters are 
hidden in the grid. Names are given below (in no particular order):

RAKIBUL
ANINDYA
MOSHIUR
SHIPLU
KABIR
SUNNY
OBAIDA
WASI

They are hidden in the following ways:

1. The names are present in the grid either vertically or horizontally. 
    (Letters of a particular name will be adjacent either only horizontally or 
    only vertically).
2. Each person’s name may not be in its original form, letters may be permuted. 
    For example “wasi” can be present as “iaws”.
3. Exactly the names mentioned above are given. Knowing any other name of them 
    will not give you any advantage.

Now, the task: It is guaranteed that only one name is hidden exactly twice in 
this grid. All the other names are hidden exactly once. You have to print the 
name which is hidden just twice. 

The grid

    O   B   I   D   A   I   B   K   R

    R   K   A   U   L   H   I   S   P

    H   E   I   S   A   W   H   I   A

    I   R   A   K   I   B   U   L   S

    M   F   B   I   N   T   R   N   O

    U   T   O   Y   Z   I   F   A   H

    L   E   B   S   Y   N   U   N   E

    E   M   O   T   I   O   N   A   L

One name (WASI) is shown for you.

Input
There is no input for this problem.

Output
Output just one string which is the name hidden twice in the grid.

Help for newbies: Find the name from the grid and do something like (replace 
"the name" with the name you found):

In C: printf("the name\n");
In C++: cout << "the name" << endl;
In Java: System.out.println("the name");
*/
public class HardestProblemEver {

    public HardestProblemEver() {
        init();
    }

    private void init() {
        System.out.println("KABIR");
    }
}