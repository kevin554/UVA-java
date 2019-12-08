package logica;

/*
UVA #10339
https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=1280

It has been said that a watch that is stopped keeps better time than one that loses 1 second per day.
The one that is stopped reads the correct time twice a day while the one that loses 1 second per day
is correct only once every 43,200 days. This maxim applies to old fashioned 12-hour analog watches,
whose hands move continuously (most digital watches would display nothing at all if stopped).
Given two such analog watches, both synchronized to midnight, that keep time at a constant rate
but run slow by k and m seconds per day respectively, what time will the watches show when next they
have exactly the same time?
Input
Input consists of a number of lines, each with two distinct non-negative integers k and m between 0
and 256, indicating the number of seconds per day that each watch loses.
Output
For each line of input, print k, m, and the time displayed on each watch, rounded to the nearest minute.
Valid times range from 01:00 to 12:59.
Sample Input
1 2
0 7
Sample Output
1 2 12:00
0 7 10:17
*/
public class WatchingWatches {

}