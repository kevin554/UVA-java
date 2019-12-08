package logica;

/*
UVA #10371
https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=1312

Prior to the late nineteenth century, time keeping was a purely local phenomenon. Each town would
set their clocks to noon when the sun reached its zenith each day. A clockmaker or town clock would
be the “official” time and the citizens would set their pocket watches and clocks to the time of the
town — enterprising citizens would offer their services as mobile clock setters, carrying a watch with
the accurate time to adjust the clocks in customer’s homes on a weekly basis. Travel between cities
meant having to change one’s pocket watch upon arrival.
However, once railroads began to operate and move people rapidly across great distances, time
became much more critical. In the early years of the railroads, the schedules were very confusing
because each stop was based on a different local time. The standardization of time was essential to
efficient operation of railroads.
In 1878, Canadian Sir Sanford Fleming proposed the system of worldwide time zones that we use
today. He recommended that the world be divided into twenty-four time zones, each spaced 15 degrees
of longitude apart. Since the earth rotates once every 24 hours and there are 360 degrees of longitude,
each hour the earth rotates one-twenty-fourth of a circle or 15o of longitude. Sir Fleming’s time zones
were heralded as a brilliant solution to a chaotic problem worldwide.
United States railroad companies began utilizing Fleming’s standard time zones on November 18,
1883. In 1884 an International Prime Meridian Conference was held in Washington D.C. to standardize
time and select the Prime Meridian. The conference selected the longitude of Greenwich, England as
zero degrees longitude and established the 24 time zones based on the Prime Meridian. Although the
time zones had been established, not all countries switched immediately. Though most U.S. states
began to adhere to the Pacific, Mountain, Central, and Eastern time zones by 1895, Congress didn’t
make the use of these time zones mandatory until the Standard Time Act of 1918.
Today, many countries operate on variations of the time zones proposed by Sir Fleming. All of
China (which should span five time zones) uses a single time zone - eight hours ahead of Coordinated
Universal Time (known by the abbreviation UTC - based on the time zone running through Greenwich at
0
o
longitude). Russia adheres to its designated time zones although the entire country is on permanent
Daylight Saving Time and is an hour ahead of their actual zones. Australia uses three time zones - its
central time zone is a half-hour ahead of its designated time zone. Several countries in the Middle East
and South Asia also utilize half-hour time zones.
Since time zones are based on segments of longitude and lines of longitude narrow at the poles,
scientists working at the North and South Poles simply use UTC time. Otherwise, Antarctica would
be divided into 24 very thin time zones!
Time zones have recently been given standard capital-letter abbreviations as follows:
UTC Coordinated Universal Time
GMT Greenwich Mean Time, defined as UTC
BST British Summer Time, defined as UTC+1 hour
IST Irish Summer Time, defined as UTC+1 hour
WET Western Europe Time, defined as UTC
WESTWestern Europe Summer Time, defined as UTC+1 hour
CET Central Europe Time, defined as UTC+1
CEST Central Europe Summer Time, defined as UTC+2
EET Eastern Europe Time, defined as UTC+2
EEST Eastern Europe Summer Time, defined as UTC+3
MSK Moscow Time, defined as UTC+3
MSD Moscow Summer Time, defined as UTC+4
AST Atlantic Standard Time, defined as UTC-4 hours
ADT Atlantic Daylight Time, defined as UTC-3 hours
NST Newfoundland Standard Time, defined as UTC-3.5 hours
NDT Newfoundland Daylight Time, defined as UTC-2.5 hours
EST Eastern Standard Time, defined as UTC-5 hours
EDT Eastern Daylight Saving Time, defined as UTC-4 hours
CST Central Standard Time, defined as UTC-6 hours
CDT Central Daylight Saving Time, defined as UTC-5 hours
MST Mountain Standard Time, defined as UTC-7 hours
MDT Mountain Daylight Saving Time, defined as UTC-6 hours
PST Pacific Standard Time, defined as UTC-8 hours
PDT Pacific Daylight Saving Time, defined as UTC-7 hours
HST Hawaiian Standard Time, defined as UTC-10 hours
AKST Alaska Standard Time, defined as UTC-9 hours
AKDTAlaska Standard Daylight Saving Time, defined as UTC-8 hours
AEST Australian Eastern Standard Time, defined as UTC+10 hours
AEDT Australian Eastern Daylight Time, defined as UTC+11 hours
ACST Australian Central Standard Time, defined as UTC+9.5 hours
ACDTAustralian Central Daylight Time, defined as UTC+10.5 hours
AWSTAustralian Western Standard Time, defined as UTC+8 hours
Given the current time in one time zone, you are to compute what time it is in another time zone.
Input
The first line of input contains N, the number of test cases. For each case a line is given with a time,
and 2 time zone abbreviations. Time is given in standard a.m./p.m. format with midnight denoted
‘midnight’ and noon denoted ‘noon’ (12:00 a.m. and 12:00 p.m. are oxymorons).
Output
Assuming the given time is the current time in the first time zone, give the current time in the second
time zone.
Note: that Standard am/pm notation means times are in this order: midnight, 12:01 a.m., . . . 11:59
a.m., noon, 12:01 p.m. . . . 11:59 p.m, midnight, and so on
Sample Input
4
noon HST CEST
11:29 a.m. EST GMT
6:01 p.m. CST UTC
12:40 p.m. ADT MSK
Sample Output
midnight
4:29 p.m.
12:01 a.m.
6:40 p.m.
*/
public class TimeZones {

}