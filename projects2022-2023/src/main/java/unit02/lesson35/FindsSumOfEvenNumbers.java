package unit02.lesson35;

/*
5. Write a method that takes an array of ints and returns a sum of only the even values. This method must be named sumEven() and have an int[] parameter.
    This method must return an int. For example, sumEven(a) would return 6 if a = {1, 2, 3, 4, 5}.
 */
public class FindsSumOfEvenNumbers {
    public static int sumEven (int[] numbers) {
        /*Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        boolean quit = false;
        while (!quit) {
            int number = scanner.nextInt();
            if (number < 0) {
                quit = true;
            }
            numbers[count] = number;
            count++;
        }

         */
        int sum = 0;
        for(int number: numbers){
            if(number % 2 == 0){
                sum = sum + number;
            }
        }
        return sum;
    }
}
