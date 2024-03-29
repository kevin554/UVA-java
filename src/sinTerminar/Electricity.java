package sinTerminar;

/*
UVA #12148
https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=3300

Martin and Isa stopped playing crazy games and finally got married. It’s good news! They’re pursuing
a new life of happiness for both and, moreover, they’re moving to a new house in a remote place, bought
with most of their savings.
Life is different in this new place. In particular, electricity is very expensive, and they want to keep
everything under control. That’s why Martin proposed to keep a daily record of how much electricity
has been consumed in the house. They have an electricity meter, which displays a number with the
amount of KWh (kilowatt-hour) that has been consumed since their arrival.
At the beginning of each day they consult the electricity meter, and write down the consumption.
Some days Martin does it, and some days Isa does. That way, they will be able to look at the differences
of consumption between consecutive days and know how much has been consumed.
But some days they simply forget to do it, so, after a long time, their register is now incomplete.
They have a list of dates and consumptions, but not all of the dates are consecutive. They want to
take into account only the days for which the consumption can be precisely determined, and they need
help.
Input
The input contains several test cases. The first line of each test case contains one integer N indicating
the number of measures that have been taken (2 ≤ N ≤ 103
). Each of the N following lines contains
four integers D, M, Y and C, separated by single spaces, indicating respectively the day (1 ≤ D ≤ 31),
month (1 ≤ M ≤ 12), year (1900 ≤ Y ≤ 2100), and consumption (0 ≤ C ≤ 106
) read at the beginning
of that day. These N lines are increasingly ordered by date, and may include leap years. The sequence
of consumptions is strictly increasing (this is, no two different readings have the same number). You
may assume that D, M and Y represent a valid date.
Remember that a year is a leap year if it is divisible by 4 and not by 100, or well, if the year is
divisible by 400.
The end of input is indicated by a line containing only one zero.
Output
For each test case in the input, your program must print a single line containing two integers separated
by a single space: the number of days for which a consumption can be precisely determined, and the
sum of the consumptions for those days.
Sample Input
5
9 9 1979 440
29 10 1979 458
30 10 1979 470
1 11 1979 480
2 11 1979 483
3
5 5 2000 6780
6 5 2001 7795
7 5 2002 8201
8
28 2 1978 112
1 3 1978 113
28 2 1980 220
1 3 1980 221
5 11 1980 500
14 11 2008 600
15 11 2008 790
16 12 2008 810
0
Sample Output
2 15
0 0
2 191
*/
public class Electricity {

}