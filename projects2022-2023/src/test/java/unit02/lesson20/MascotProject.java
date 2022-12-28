package unit02.lesson20;

/*
In this assignment, you will write a program that will ask the user for their birthday as two
integers: a month and a day (in that order), and then it will tell them their birthdate as well
as their sign (details on the expected form of this output are below).
All input will be in integers. The program should write out the user's birthday in long-form
(i.e. 3 17 becomes March seventeenth). It should also then tell them their sign, and,
optionally, an "at-school appropriate" horoscope.
If an incorrect month number or date is entered the program should print “error”.
For purposes of this program, you can assume all months end on the 31st, so you don't
have to print "error" on Feb 30 or Sept 31 for example (nor do you have to worry about if
the program is run on a leap year).


*/


/**

 Sample Run 1:
 What month were you born in?(number)
 9
 What day (number)
 25
 Your birthday is: September twenty-fifth
 Libra
 Horoscope: Expect lots of hard work, but also lots of laughs this month.
 Sample Run 2:
 What month were you born in? (number)
 13What day (number)
 1
 error
 Sample Run 3:
 What month were you born in? (number)
 6
 What day (number)
 45
 error

 */


/* Notes about expected output:
        ●The month will always be capitalized.
        ●The day will always be lowercase.
        ●Hyphens will be included for compound dates, such as the twenty-first,
        twenty-second, ... , twenty-ninth, thirty-first.
        ●
        Spelling of dates must be correct. For example note that: 8th is spelled eighth,
        10th is spelled tenth, 20th is spelled twentieth and 30th is spelled thirtieth.
        Use the following dates to determine the horoscope:
        ●Aries 21 March – 19 April
        ●Taurus 20 April – 20 May
        ●Gemini 21 May – 20 June
        ●Cancer 21 June – 22 July
        ●Leo 23 July –22 August
        ●Virgo 23 August – 22 September
        ●Libra 23 September – 22 October
        ●Scorpio 23 October – 21 November
        ●Sagittarius 22 November – 21 December
        ●Capricorn 22 December – 19 January
        ●Aquarius 20 January – 18 February
        ●Pisces 19 February – 20 March

 */
import java.util.Scanner;

public class MascotProject {


    public static void main (String[] args){
        System.out.println("What month were you born in? ");
        Scanner scanner = new Scanner(System.in);
        int numericMonth = scanner.nextInt();
        System.out.println("What day (number)? ");
        int day = scanner.nextInt();

        String[] months = new String[12];
        months[0] = "January";
        months[1] = "February";
        months[2] = "March";
        months[3] = "April";
        months[4] = "May";
        months[5] = "June";
        months[6] = "July";
        months[7] = "August";
        months[8] = "September";
        months[9] = "October";
        months[10] = "November";
        months[11] = "December";

        String month = months[numericMonth-1];
        if (numericMonth == 3 && day >= 21 || numericMonth == 4 && day <= 19){
            System.out.println("Aries");
        }
        else if (numericMonth == 4 && day >= 20 || numericMonth == 5 && day <= 20){
            System.out.println("Taurus");
        }
        else if (numericMonth == 5 && day >= 21 || numericMonth == 6 && day <= 20){
            System.out.println("Gemini");
        }
        else if (numericMonth == 6 && day >= 21 || numericMonth == 7 && day <= 22){
            System.out.println("Cancer");
        }
        else if (numericMonth == 7 && day >= 23 || numericMonth == 8 && day <= 22){
            System.out.println("Leo");
        }
        else if (numericMonth == 8 && day >= 23 || numericMonth == 9 && day <= 22){
            System.out.println("Virgo");
        }
        else if (numericMonth == 9 && day >= 23 || numericMonth == 10 && day <= 22){
            System.out.println("Libra");
        }
        else if (numericMonth == 10 && day >= 23 || numericMonth == 11 && day <= 21){
            System.out.println("Scorpio");
        }
        else if (numericMonth == 11 && day >= 22 || numericMonth == 12 && day <= 21){
            System.out.println("Sagittarius");
        }
        else if (numericMonth == 12 && day >= 22 || numericMonth == 1 && day <= 19){
            System.out.println("Capricorn");
        }
        else if (numericMonth == 1 && day >= 20 || numericMonth == 2 && day <= 18){
            System.out.println("Aquarius");
        }
        else if (numericMonth == 2 && day >= 19 || numericMonth == 3 && day <= 20){
            System.out.println("Pisces");
        }
        else if (numericMonth <= 0 || numericMonth > 12 || day > 31 || day < 1){
            System.out.println("error");
        }

        String[] twoTenDigits = new String[4];
        twoTenDigits[0] = "random";
        twoTenDigits[1] = "ten";
        twoTenDigits[2] = "twenty";
        twoTenDigits[3] = "thirty";

        String[] oneDigits = new String[9];
        oneDigits[0] = "first";
        oneDigits[1] = "second";
        oneDigits[2] = "third";
        oneDigits[3] = "fourth";
        oneDigits[4] = "fifth";
        oneDigits[5] = "sixth";
        oneDigits[6] = "seventh";
        oneDigits[7] = "eighth";
        oneDigits[8] = "ninth";

        String[] overTen = new String[10];
        overTen[0] = "tenth";
        overTen[1] = "eleventh";
        overTen[2] = "twelfth";
        overTen[3] = "thirteenth";
        overTen[4] = "fourteenth";
        overTen[5] = "fifteenth";
        overTen[6] = "sixteenth";
        overTen[7] = "seventeenth";
        overTen[8] = "eighteenth";
        overTen[9] = "nineteenth";

        int remainder = day%10;
        String[] convertRemainder = new String[9];
        convertRemainder[0] = "first";
        convertRemainder[1] = "second";
        convertRemainder[2] = "third";
        convertRemainder[3] = "fourth";
        convertRemainder[4] = "fifth";
        convertRemainder[5] = "sixth";
        convertRemainder[6] = "seventh";
        convertRemainder[7] = "eighth";
        convertRemainder[8] = "ninth";

        String[] endingLetters = new String [4];
        endingLetters[0] = "blah blah blah";
        endingLetters[1] = "goo goo goo";
        endingLetters[2] = "twentieth";
        endingLetters[3] = "thirtieth";

        int leftoverTwoDigitWhenDayIsOdd = day/10;

        if (day < 10){
            String digit = oneDigits[day - 1];
            System.out.println(month + " " + digit);
        }
        else if (day % 10 == 0){
            String endingLetter = endingLetters[day/10];
            System.out.println(month + " " + endingLetter);
        }
        else if (day % 10 != 0 && day > 20){
            String convertingRemainder = convertRemainder[remainder - 1];
            String twoDigit = twoTenDigits[leftoverTwoDigitWhenDayIsOdd];
            System.out.println(month + " " + twoDigit + "-" + convertingRemainder);
        }
        else if (10 <= day && day < 20){
            String aboveTen = overTen[day - 10];
            System.out.println(month + " " + aboveTen);
        }

    }
}
