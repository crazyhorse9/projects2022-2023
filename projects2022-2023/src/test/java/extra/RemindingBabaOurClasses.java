package extra;

import java.util.Scanner;

/**
 * plan: let user input weekday
 * convert into number based on array
 * remind babby on what classes me and jie jie have!!!
 * AND ACTION!!!!
 */

public class RemindingBabaOurClasses {
    public static void main (String[] args){

        System.out.println("爸爸好！请输入 the day of the week:(no need for uppercase) ");
        Scanner stringScanner = new Scanner(System.in);
        String dayOfWeek = stringScanner.next();

        if(dayOfWeek.equalsIgnoreCase("sunday")){
            System.out.println("11:30 AM - 蓉蓉's Chinese Class");
            System.out.println("2:30 PM - 姐姐's CYS");
        }
        else if(dayOfWeek.equalsIgnoreCase("monday")){
            System.out.println("7:30 PM - 蓉蓉's Chess Class w/ Coach Lou (every two weeks)");
            System.out.println("3:00 PM - 姐姐's Clarinet Class");
            System.out.println("6:00 PM - 蓉蓉's ASG tournament");
        }
        else if(dayOfWeek.equalsIgnoreCase("tuesday")){
            System.out.println("5:45 PM - 蓉蓉's MVVC Practice");
        }
        else if(dayOfWeek.equalsIgnoreCase("wednesday")){
            System.out.println("N/A");
        }
        else if(dayOfWeek.equalsIgnoreCase("thursday")){
            System.out.println("7:00 PM - 蓉蓉's Chess Class w/ 李老师");
        }
        else if(dayOfWeek.equalsIgnoreCase("friday")){
            System.out.println("3:10 PM - 蓉蓉's ASG chess practice");
            System.out.println("4:20 PM - 蓉蓉's Math Class");
        }
        else if(dayOfWeek.equalsIgnoreCase("saturday")){
            System.out.println("7:45 AM - 蓉蓉's MVVC Practice");
            System.out.println("3:00 PM - 蓉蓉's Java Class");
        }

    }
}
