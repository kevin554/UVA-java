package sinTerminar;

/**
UVA #161
https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=97

One way of achieving a smooth and economical drive to work is to ‘catch’ every 
traffic light, that is have every signal change to green as you approach it. 
One day you notice as you come over the brow of a hill that every traffic light 
you can see has just changed to green and that therefore your chances of 
catching every signal is slight. As you wait at a red light you begin to wonder 
how long it will be before all the lights again show green, not necessarily all 
turn green, merely all show green simultaneously, even if it is only for a 
second.

Write a program that will determine whether this event occurs within a 
reasonable time. Time is measured from the instant when they all turned green 
simultaneously, although the initial portion while they are all still green is 
excluded from the reckoning.

Input
Input will consist of a series of scenarios. Data for each scenario will 
consist of a series of integers representing the cycle times of the traffic 
lights, possibly spread over many lines, with no line being longer than 100 
characters. Each number represents the cycle time of a single signal. The cycle 
time is the time that traffic may move in one direction; note that the last 5 
seconds of a green cycle is actually orange.

Thus the number 25 means a signal that (for a particular direction) will spend 
20 seconds green, 5 seconds orange and 25 seconds red. Cycle times will not be 
less than 10 seconds, nor more than 90 seconds. There will always be at least 
two signals in a scenario and never more than 100. Each scenario will be 
terminated by a zero (0).

The file will be terminated by a line consisting of three zeroes (0 0 0).

Output
Output will consist of a series of lines, one for each scenario in the input. 
Each line will consist of the time in hours, minutes and seconds that it takes 
for all the signals to show green again after at least one of them changes to 
orange. Follow the format shown in the examples. Time is measured from the 
instant they all turn green simultaneously. If it takes more than five hours 
before they all show green simultaneously, the message ‘Signals fail to 
synchronise in 5 hours’ should be written instead.

Sample Input
19 20 0
30
25 35 0
0 0 0

Sample Output
00:00:40
00:05:00
*/
public class TrafficLigths {

}