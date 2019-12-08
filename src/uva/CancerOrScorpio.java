package uva;

/**
UVA #119 
https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=3098

Alice and Michael is a young couple who are planning on having their first 
child. Their wish their son Nelson was born on a special date for both of them.
Alice has investigated in the internet and has found that the period of 
gestation is forty weeks.
These forty weeks begin to count on the first day of the last menstrual cycle.
Michael is passionate about astrology and even more about the zodiac signs, he 
has asked Alice to investigate the range of dates that correspond to each sign.

          Sign        Begin           End
        Aquarius    January, 21     February, 19
        Pisces      February, 20    March, 20
        Aries       March, 21       April, 20
        Taurus      April, 21       May, 21
        Gemini      May, 22         June, 21
        Cancer      June, 22        July, 22
        Leo         July, 23        August, 21
        Virgo       August, 22      September, 23
        Libra       September, 24   October, 23
        Scorpio     October, 24     November, 22
        Sagittarius November, 23    December, 22
        Capricorn   December, 23    January, 20

Alice and Michael ask for help to calculate the date of birth of their son 
Nelson and his zodiac sign.

Input
The first line of input contains a single integer N, (1 ≤ N ≤ 1000) which is 
the number of datasets that follow.
Each dataset consists of a single line of input that contains only eight digits 
that represent the date of the first day of the last menstrual cycle in format 
MMDDYYYY.

Output
For each dataset, you should generate one line of output with the following 
values: The dataset number as a decimal integer (start counting at one), a 
space, the date of birth in format MM/DD/YYYY, a space, and the name 
(in lowercase) of zodiac sign that correspond according to the date of birth.
Note: Considers leap years.

Sample Input
2
01232009
01232008

Sample Output
1 10/30/2009 scorpio
2 10/29/2008 scorpio
*/
public class CancerOrScorpio {

    public CancerOrScorpio() {
        init();
    }

    private void init() {
        java.util.Calendar calendario = java.util.Calendar.getInstance();
        java.text.DateFormat formatoEntrada = 
                new java.text.SimpleDateFormat("MMddyyyy");
        java.text.DateFormat formatoSalida = 
                new java.text.SimpleDateFormat("MM/dd/yyyy");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String signoZodiacal = "";
        int cantidadFechas, dia, mes;
        
        cantidadFechas = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= cantidadFechas; i++) {
            try {
                calendario.setTime(formatoEntrada.parse(sc.nextLine()));
            } catch (java.text.ParseException ex) {
                System.out.println(ex);
            }
            
            calendario.add(java.util.Calendar.DAY_OF_YEAR, 40 * 7);
            
            mes = calendario.get(java.util.Calendar.MONTH);
            dia = calendario.get(java.util.Calendar.DAY_OF_MONTH);

            switch (mes) {
                case 0:
                    signoZodiacal = dia <= 20 ? "capricorn" : "aquarius";
                    /* 
                    if (dia <= 20) 
                        signoZodiacal = "capricorn";
                     else 
                        signoZodiacal = "aquarius"; 
                    */
                    
                    break;
                case 1:
                    signoZodiacal = dia <= 19 ? "aquarius" : "pisces";
                    
                    break;
                case 2:
                    signoZodiacal = dia <= 20 ? "pisces" : "aries";
                    
                    break;
                case 3:
                    signoZodiacal = dia <= 20 ? "aries" : "taurus";
                    
                    break;
                case 4:
                    signoZodiacal = dia <= 21 ? "taurus" : "gemini";
                    
                    break;
                case 5:
                    signoZodiacal = dia <= 21 ? "gemini" : "cancer";
                    
                    break;
                case 6:
                    signoZodiacal = dia <= 22 ? "cancer" : "leo";
                    
                    break;
                case 7:
                    signoZodiacal = dia <= 21 ? "leo" : "virgo";
                    
                    break;
                case 8:
                    signoZodiacal = dia <= 23 ? "virgo" : "libra";
                    
                    break;
                case 9:
                    signoZodiacal = dia <= 23 ? "libra" : "scorpio";
                    
                    break;
                case 10:
                    signoZodiacal = dia <= 22 ? "scorpio" : "sagittarius";
                    
                    break;
                case 11:
                    signoZodiacal = dia <= 22 ? "sagittarius" : "capricorn";
                    
                    break;
            }
            
            System.out.println((i) + " " + formatoSalida.format(calendario.getTime()) 
                    + " " + signoZodiacal);
        }
    }
}
