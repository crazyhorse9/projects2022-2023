package unit02.lesson25;
/*
In this assignment you will write a Tweet Tester.
Twitter allows users to send messages of 140 characters or less. Users direct tweets to
specific users by using @mentions and label tweets by using #hashtags. Tweets may also
contain links that start with http://.
For this lab you will ask the user to enter a potential tweet. First you will check to see if it is
a valid tweet by checking that the length is less than or equal to 140 characters.
If the tweet is too long print out the number of characters over 140.
If the tweet is valid print Length Correct and count the number of @mentions, #hashtags
and number of links using the following rules:
● Every mention will start with the '@' character and have at least one
non-space or non-tab character following it.
● All hashtags will start with the '#' character and have at least one non-space
or non-tab character following it.
● All links will start with the string "http://". Twitter ignores case, so HTTP and
http are counted as the same set of characters. You do not need to check for
any characters following the http:// .
Remember that the escape sequence, '\t', can be used to check for a tab character.
Sample Run 1:
Please enter a tweet:
This is a #long tweet. An extra long #link. So, when @you write your code it should ignore all of the #hastags and @mentions since it is too long. It should also ignore all http://links
Excess Characters: 45
Sample Run 2:
Please enter a tweet:
This #tweet is #short and has several #hashtags. And HTtp://links @and @mentions
Length Correct
Number of Hashtags: 3
Number of Attributions: 2
Number of Links: 1

s = "hTtp://xyz"

if (s.startsWith("http://")) { <-- false
   //
}

if (s.lowerCase().startsWith("http://"))


 */

import java.util.Scanner;

public class Tweeting {
    public static void main(String args[]) {
        System.out.println("Enter a tweet: ");
        Scanner tweetScanner = new Scanner(System.in);
        String tweet = tweetScanner.nextLine();
        int numberOfMentions = 0;
        int numberOfLinks = 0;
        int numberOfHashtags = 0;
        if (tweet.length() > 140) {
            int excess = tweet.length() - 140;
            System.out.println("\nExcess characters: " + excess);
        }
        else {
            System.out.println("\nLength is correct");
            for (int i = 0; i < tweet.length(); i++) {
                char currentChar = tweet.charAt(i);
                if (currentChar == 'h' || currentChar == 'H') {
                    if(tweet.toLowerCase().substring(i,i + 7).equals("http://")) {
                        numberOfLinks++;
                        i = i + 6;
                    }
                }
                if (tweet.charAt(i) == '@') {
                    int nextIndex = i + 1;
                    if (tweet.length() > nextIndex && tweet.charAt(nextIndex) != ' ' && tweet.charAt(nextIndex) != '\t') {
                        numberOfMentions++;
                    }
                }
                if (tweet.charAt(i) == '#') {
                    int nextIndex = i + 1;
                    if (tweet.length() > nextIndex && tweet.charAt(nextIndex) != ' ' && tweet.charAt(nextIndex) != '\t') {
                        numberOfHashtags++;
                    }
                }

            }
            System.out.println("Number Of Links: " + numberOfLinks);
            System.out.println("Number of mentions: " + numberOfMentions);
            System.out.println("Number of hashtags: " + numberOfHashtags);
        }




    }
}
