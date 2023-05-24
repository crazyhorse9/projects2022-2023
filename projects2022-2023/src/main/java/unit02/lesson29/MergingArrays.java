package unit02.lesson29;
/*
In this lab, you will be creating a program that merges two arrays of non-negative (equal to
or greater than 0) integers. Your program will accept each array as input from the keyboard.
You do not know ahead of time how many values will be entered, but you can assume each
array will have a maximum length of 10,000 elements. To stop entering values enter a
negative number. You may disregard any negative numbers input and not store these in the
array.
The elements of the two input arrays should be in increasing order. In other words, each
array element must have a value that is greater than or equal to the previous element
value. An array may contain repeated elements.
After the two arrays have been input, your program must check to make sure the elements
of each array have been entered in order. If an out of order element is found, print the
message “ERROR: Array not in correct order”.
Your task is to merge the two input arrays into a new array, with all elements in order,
lowest to highest. Print out each of the original arrays entered, followed by the merged
array.
Please note that your program must output the arrays with exactly one space between each
of the numbers.
Sample Run 1:
Enter the values for the first array, up to 10000 values, enter a negative number to
quit
3
3
5
6
8
9
-1

Enter the values for the second array, up to 10000 values, enter a negative number
to quit
3
4
5
6
-5
First Array:
3 3 5 6 8 9
Second Array:
3 4 5 6
Merged Array:
3 3 3 4 5 5 6 6 8 9

Sample Run 2:
Enter the values for the first array, up to 10000 values, enter a negative number to
quit
4
5
7
2
-1
Enter the values for the second array, up to 10000 values, enter a negative number
to quit
3
3
3
3
3
3
-100
 */
import java.util.Scanner;

public class MergingArrays {
    public static void main (String[] args){
        System.out.println("Enter the values for the first array, up to 10000 values, enter a negative number to quit");
        int count = 0;
        int secondCount = 0;
        int[] firstArray = new int[10000];
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        while (!quit){
            int numbers = scanner.nextInt();
            if(numbers < 0){
                quit = true;
            }
            else{
                firstArray[count] = numbers;
                if (count > 0 && firstArray[count - 1] > numbers && numbers >= 0){
                    System.out.println("Array not in correct order");
                    break;
                }
                count++;
            }
        }
        quit = false;
        System.out.println("Enter the values for the second array, up to 10000 values, enter a negative number to quit");
        int[] secondArray = new int[10000];
        while (!quit){
            int numbers = scanner.nextInt();
            if(numbers < 0){
                quit = true;
            }
            else{
                secondArray[secondCount] = numbers;
                if (secondCount > 0 && secondArray[secondCount - 1] > numbers && numbers >= 0){
                    System.out.println("Array not in correct order");
                    break;
                }
                secondCount++;
            }

        }
        System.out.println("First array: ");
        for(int i = 0; i < count; i++){
            System.out.print(firstArray[i] + " ");
        }
        System.out.println("\nSecond array: ");
        for(int i = 0; i < secondCount; i++){
            System.out.print(secondArray[i] + " ");
        }

        System.out.println("\nMerged Array: ");
        int[] mergedArray = new int[count + secondCount];
        int firstIndex = 0;
        int secondIndex = 0;
        for (int i = 0; i < mergedArray.length; i++){
            if (firstIndex < count && secondIndex < secondCount){
                if (firstArray[firstIndex] <= secondArray[secondIndex]){
                    mergedArray[i] = firstArray[firstIndex++];
                }
                else{
                    mergedArray[i] = secondArray[secondIndex++];
                }
            }
            else if (firstIndex < count){
                mergedArray[i] = firstArray[firstIndex++];
            }
            else if (secondIndex < secondCount){
                mergedArray[i] = secondArray[secondIndex++];
            }
            else{
                System.out.println("error");
            }

            System.out.print(mergedArray[i] + " ");
        }

    }
}
