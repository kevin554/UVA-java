package logica;

/*
UVA #12136
https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=3288

Last year we set a problem on bachelor arithmetic
which made some bachelors really unhappy.
So to even things up, we are making
a problem on the tough schedule of a married
man.
Our dashing hero Danny has recently got
married and that has created a lot of problems
for him, at least that is what his friends think.
So many broken promises, so many missed appointments
and dinners. Err! Danny, now is
losing tracks of even simplest of calculations, so
you must help him to decide whether he can attend
his meeting or not. Danny is busy with his
wife for a large portion of the day. This large portion is denoted by a starting time and an ending
time. Then Danny has an important meeting in a day, he misses that if it overlaps or touches (For
example, if Danny’s time span with his wife finishes at 18:00 and the meeting starts at 18:00 then the
two schedules conflict and Danny misses the meeting) the time scheduled for his wife. Given the time
span Danny has allotted for his wife and the time span of the meeting you, will have to find whether
Danny misses that meeting or not.
Input
First line of the input file contains an integer N (0 < N < 2001) which denotes how many sets of inputs
are there. The input for each set is given in two lines. The description for each set is given below:
First line of each set contains two strings separated by a single space. These two strings denote the
time span Danny is busy with his wife. The second line also contains two strings which denotes the
time when Danny has to attend a meeting. All the strings that denote time are of the format hh:mm
(two digit for hour and two digit for minute). For example “forty five past eight” (Morning) is denoted
as ‘08:45’, “forty five past 9” (night) is denoted as ‘21:45’. You can assume that all times are valid
24-hour clock time, starting time strictly precedes ending time and all times are within a single day.
Output
For each set of input produce one line of output. This line contains the serial of output followed by
a string which denotes Danny’s decision. If Danny can attend the meeting then print ‘Hits Meeting’
and if Danny misses (Mrs) the meeting as it conflicts with the time allotted for his wife print ‘Mrs
Meeting’ instead.
Sample Input
3
17:47 22:40
06:18 17:04
10:44 17:05
01:11 01:27
03:36 19:02
14:33 15:24
Sample Output
Case 1: Hits Meeting
Case 2: Hits Meeting
Case 3: Mrs Meeting
*/
public class ScheduleOfAMarriedMan {

}