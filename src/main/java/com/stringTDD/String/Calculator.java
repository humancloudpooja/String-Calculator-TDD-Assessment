package com.stringTDD.String;

public class Calculator {

    public static int add(String text)
    {
        if(!text.equals(""))
        {

            if(containsNegative(splitNumbers(text)))
            {
                throw new IllegalArgumentException("Can Not Add Negative Number");
            }
            return sumOfString(text);
        }
        else
        {
            return 0;
        }
    }

    public static String[] splitNumbers(String text)
    {

        /*if(text.contains("\n"))
        {
            return text.split("\n");
        }
        else {
            return text.split(",");
        }*/

        String delimiter = ",|\n"; // Default delimiters are comma and newline
        if (text.startsWith("//")) {
            // Custom delimiter format detected
            int delimiterIndex = text.indexOf("\n");
            delimiter = text.substring(2, delimiterIndex); // Extract custom delimiter
            text = text.substring(delimiterIndex + 1); // Remove the delimiter line
        }
        return text.split(delimiter);
    }
    public static boolean containsNegative(String arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(stringToInt(arr[i])< 0)
            {
                return true;
            }
        }
        return false;
    }
    public static int stringToInt(String number)
    {
        return Integer.parseInt(number);
    }
    public static int sumOfString(String str) {
        int sum = 0;
        // Assuming splitNumbers is a method that splits the string into an array of numbers as strings
        String[] strArray = splitNumbers(str);
        for (int i = 0; i < strArray.length; i++) {
            sum = sum + stringToInt(strArray[i]);
        }
        return sum;
    }


}
