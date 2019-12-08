package sinTerminar;

/*
UVA #10507
https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=1448

Most recent researches on Neuroanatomy have permitted us of identifying a series of large electric signal
transmision route connecting different areas of the brain. Even more, it has been found that if one slept
area X of the brain is directly connected to at least three awake areas for a year, the X area will wake
up. There is evidence of when an area X of the brain wakes up, it remains awake. Let A, B, C, . . . the
different areas of the brain and let’s imagine a brain with some initially slept areas, interconnected one
another. If three of these areas wake up by direct stimulation according to the previous researches, how
many years will all the slept areas take to wake up?
Input
The input file contains several test cases, each of them as described below. There is a blank line between
two consecutive inputs.
• The first line of the input is an integer, 3 ≤ N ≤ 26, that indicates the number of slept areas.
• The second line of the input is an integer M ≥ 0, that indicates the number of connections (if A
is connected to B, then B is connected to A, but it counts only once).
• The third line consists of three characters that indicate which areas have wake up by direct
stimulation.
• The remaining M lines consist of two characters each one, that indicate the different conections
between areas of the brain, one line per conection.
Output
The output is only one line with one of the following text messages:
‘THIS BRAIN NEVER WAKES UP’
‘WAKE UP IN, n, YEARS’, where n is the number of the years all the brain has taken to wake up.
Sample Input
6
11
HAB
AB
AC
AH
BD
BC
BF
CD
CF
CH
DF
FH
Sample Output
WAKE UP IN, 3, YEARS
*/
public class WakingUpBrain {

}