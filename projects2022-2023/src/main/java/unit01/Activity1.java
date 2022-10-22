package unit01;
/**
 Activity Questions
 Consider the following code:

 int y = (x * x + x)/x;

 What could be used to replace (x * x + x)/x; and still give the same answer?
 (x * x )/(x+ 1);
 (x + x)/x;
 (x + 1)/x;
 (x * x);
 x + 1;
 What is output when the following code is executed?

 */
public class Activity1 {
    public static void main(String[] args) {
        int x = 10;
        //int y = (x * x + x)/x;
        int y = x+1;
        System.out.println(y);
    }
}

