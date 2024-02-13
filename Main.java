import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //ََََQ:1
        //1. develop a program that takes the weight and height as input and calculates the BMI
//        System.out.println("please enter your weight. in kilograms");
//        double weight = s.nextDouble();
//
//        System.out.println("please enter your height. in meters.");
//        double height = s.nextDouble();
//
//        double bmi = weight / (height*height);
//        System.out.printf("your bmi is : " + "%5.2f\n", bmi);


        //day2
        //-------------------------------------------------------------------------------------

        //Q:2
        //calculate percentage.
//         System.out.println("please enter the total marks.");
//          double totalMarks = s.nextInt();
//
//          System.out.println("please enter your obtained marks.");
//          double obtainedMarks = s.nextInt();
//
//
//          if (obtainedMarks>totalMarks) {
//              System.out.println("obtained marks can not be more than the total marks");
//          }else {
//              double percentage = (obtainedMarks / totalMarks) * 100;
//              System.out.printf("percentage: "+ "%5.1f\n", percentage );
//          }

        //day2
        //-------------------------------------------------------------------------------------

        //Q:3
        //currency exchange
//        System.out.println("please enter an amount to be exchanged.");
//        double currencyAmount = s.nextDouble();
//
//        System.out.println("please enter the exchange rate.");
//        double exchangeRate = s.nextDouble();
//
//        double changedAmount = exchangeRate*currencyAmount;
//
//        System.out.println("your new amount is : "+ changedAmount);

        //day2
        //-------------------------------------------------------------------------------------


        //Q:4
        //calculate the length of a string and reversed it.
//        System.out.println("please enter a sentence to calculate its length and reverse it");
//        String userInput = s.nextLine();
//
//        StringBuilder mUserInput = new StringBuilder(userInput);
//        mUserInput.reverse();
//
//        System.out.println("the length of your sentence is : " + userInput.length() +
//                ", and your reversed sentence is : " + mUserInput + ".");

        //day2
        //-------------------------------------------------------------------------------------


        //Q:5
        //take a string from user and startIndex and endingIndex to extracts it.
//        System.out.println("input a string");
//        String userInput = s.nextLine();
//
//        System.out.println("starting index");
//        int startIndex = s.nextInt();
//
//        if(startIndex <0 || startIndex > (userInput.length()-1)){
//
//            System.out.println("starting index range should be from 0 to string length-1");
//
//        }else {
//            System.out.println("ending index");
//
//            int endIndex = s.nextInt();
//            if(startIndex > endIndex){
//                System.out.println("starting index can't be more than ending index");
//            } else {
//                  String extractedString = userInput.substring(startIndex,endIndex);
//                System.out.println("output: "+extractedString);
//            }
//        }

        //day2
        //-------------------------------------------------------------------------------------


        //Q:6
        //search for a keyword in a sentence
//        System.out.println("enter a sentence");
//        String userInput = s.nextLine();
//
//        System.out.println("enter a keyword");
//        String keyword = s.nextLine();
//
//        boolean isPresent = userInput.contains(keyword);
//
//        if(isPresent){
//            System.out.println("the keyword \"" + keyword + "\" is presented.");
//        }else {
//            System.out.println("the keyword \"" + keyword + "\" is not presented.");
//        }


        //day2
        //-------------------------------------------------------------------------------------

        //Q:7
        //user enter a sentence then a word within the sentence to replace and the replacement word
//        System.out.println("enter a sentence");
//        String userInput = s.nextLine();
//
//        System.out.println("enter a word within the sentence to replace");
//        String wordToReplace = s.nextLine();
//
//        boolean isExist = userInput.contains(wordToReplace);
//
//        if(isExist){
//
//            System.out.println("enter the replacement word");
//            String replacementWord = s.nextLine();
//
//            String modifiedUserInput = userInput.replace(wordToReplace, replacementWord);
//
//            System.out.println("old sentence: " + userInput);
//            System.out.println("word to replace is \"" + wordToReplace +
//                    "\", and replacement word is \"" + replacementWord + "\".");
//
//            System.out.println("modified sentence: " + modifiedUserInput);
//
//        }else{
//            System.out.println("the word you are trying to replace does not exist");
//        }

        //day2
        //-------------------------------------------------------------------------------------

        //Q:8
        //compares two Strings while ignoring the case.
//        System.out.println("enter the first sentence");
//        String firstSentence = s.nextLine();
//
//        System.out.println("enter the second sentence");
//        String secondSentence = s.nextLine();
//
//        boolean isEquals = firstSentence.equalsIgnoreCase(secondSentence);
//
//        if(isEquals){
//            System.out.println("Strings are equal (ignoring case).");
//        }else {
//            System.out.println("Strings are not equal (ignoring case).");
//        }



        //day3
        //-------------------------------------------------------------------------------------


        //Q:1
        //takes a string as a role and prints the welcome message
//        System.out.println("enter a role, existing roles are admin, superUser and user");
//        String role = s.nextLine();
//
//        boolean isAdmin = role.equalsIgnoreCase("admin");
//        boolean isSuperUser = role.equalsIgnoreCase("superUser");
//
//        if(isAdmin){
//            System.out.println("welcome admin");
//        }else if(isSuperUser){
//            System.out.println("welcome superUser");
//        }else {
//            System.out.println("welcome user");
//        }

        //day3
        //-------------------------------------------------------------------------------------

        //Q:2
        //compare three numbers and print the greatest number, can't enter duplicated numbers.
//        System.out.println("enter a number (1 of 3), the greatest number will be printed.");
//        int number1 = s.nextInt();
//
//        System.out.println("enter a number (2 of 3)");
//        int number2 = s.nextInt();
//
//        if(number2 == number1){
//            System.out.println("you can't enter a duplicated number.");
//        }else{
//
//            System.out.println("enter a number (3 of 3)");
//            int number3 = s.nextInt();
//
//            if(number3 == number2){
//                System.out.println("you can't enter a duplicated number.");
//            }else{
//
//                boolean num1 = number1 > number2 && number1 > number3;
//                boolean num2 = number2 > number1 && number2 > number3;
//                if(num1){
//                    System.out.println("first number was the greatest: "+ number1);
//                }else if(num2){
//                    System.out.println("second number was the greatest: " + number2);
//                }else {
//                    System.out.println("third number was the greatest: " + number3);
//                }
//            }
//        }

        //day3
        //-------------------------------------------------------------------------------------


        //Q:3
        //using Random class to generate numbers from 1 to 7 and prints the corresponding day of week
//        Random randomNumGenerator = new Random();
//        int randomNum = randomNumGenerator.nextInt(7);
//
//        System.out.println("generated number: " + (randomNum+1));;
//
//        int num = 1 + randomNum;
//
//        switch(num){
//            case 1:
//                System.out.println("sunday");
//                break;
//            case 2:
//                System.out.println("monday");
//                break;
//            case 3:
//                System.out.println("tuesday");
//                break;
//            case 4:
//                System.out.println("wednesday");
//                break;
//            case 5:
//                System.out.println("thursday");
//                break;
//            case 6:
//                System.out.println("friday");
//                break;
//            case 7:
//                System.out.println("saturday");
//                break;
//        }

        //day3
        //-------------------------------------------------------------------------------------

        //Q:4
        //user can enter a numeric score and get the corresponding letter grade
//        System.out.println("enter your numeric score");
//        int numericScore = s.nextInt();
//
//        if(numericScore<=100 && numericScore>=90){
//            System.out.println("Numeric score: " + numericScore);
//            System.out.println("Letter Grade: A");
//        }else if(numericScore<=89 && numericScore>=80){
//            System.out.println("Numeric score: " + numericScore);
//            System.out.println("Letter Grade: B");
//        }else if(numericScore<=79 && numericScore>=70){
//            System.out.println("Numeric score: " + numericScore);
//            System.out.println("Letter Grade: C");
//        } else if (numericScore<=69 && numericScore>=60) {
//            System.out.println("Numeric score: " + numericScore);
//            System.out.println("Letter Grade: D");
//        } else {
//            System.out.println("Numeric score: " + numericScore);
//            System.out.println("Letter Grade: f");
//        }


        //day3
        //-------------------------------------------------------------------------------------

        //Q:5
        //based on entered aged the user will be categorized as adult, teenager or child.

//        System.out.println("enter your age");
//        int age = s.nextInt();
//
//        if(age>=0 && age<13){
//            System.out.println("you are a child");
//
//        } else if(age>=13 && age<=19) {
//            System.out.println("you are a teenager");
//
//        } else{
//            System.out.println("you are an adult");
//        }
    }
}
