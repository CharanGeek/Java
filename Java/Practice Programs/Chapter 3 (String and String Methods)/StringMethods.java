public class StringMethods {
    public static void main(String[] args) {
        String name = "Aditya";
        String whiteSpaceString = "     Now Aint    I         Right?    ha ha ha ha ha ha   ";
        String sentence = "My name is Mud, not to be confused by Pete, Jack, David or Dennis";

        System.out.println("The original strings are:\n\n\t1) name = "+name+" \n\t2) whiteSpaceString = "+whiteSpaceString+" \n\t3) Sentence = "+sentence);


        // 1st String Method ==> 'length()'
        int nameLen = name.length();
        System.out.println("\nThe total characters in the string 'name' is ==> "+nameLen);
        // SUMMARY ==> This method prints the number of characters in the string (this also counts the whitespace)


        // 2nd String Method ==> 'toLowerCase()'
        String lowerCaseName = sentence.toLowerCase();
        System.out.println("'sentence' in lowercase is ==> "+lowerCaseName);
        // SUMMARY ==> This converts all characters to lowercase


        // 3rd String Method ==> 'toUpperCase()'
        String upperCaseName = name.toUpperCase();
        System.out.println("'name' in uppercase is ==> "+upperCaseName);
        // SUMMARY ==> This converts all characters to uppercase


        // 4th String Method ==> 'trim()'
        String trimmedString = whiteSpaceString.trim();
        System.out.println("'whiteSpaceString' after trimming is: ==> "+trimmedString);
        // SUMMARY ==> This removes the whitespaces from the starting and the ending of the string but will not remove the whitespaces in between


        // 4th String Method ==> 'substring(int start,int end)'
        String subStringWithoutEnd = sentence.substring(4);
        System.out.println("'sentence' variable's substring starting from index 4 is ==> "+subStringWithoutEnd);


        String subStringWithEnd = sentence.substring(4,13);
        System.out.println("'sentence' variable's substring starting from index 4 and ending on 13 is ==> "+subStringWithEnd);
        // SUMMARY ==> This deletes the characters before the start index and after the end index (the end index is optional)
        // This includes the startIndex but excludes the endIndex


        // 5th String Method ==> 'replace(target,replacement)'
        String replacedName = upperCaseName.replace("AD", "DA");
        System.out.println("'name' where characters 'AD' are replaced with 'DA' is ==> "+replacedName);
        // SUMMARY ==> This replaces the EVERY target character (in this case, 'a') with its replacement (in this case, 'z')
        // Plus the target and replacement are case-sensitive 


        // 6th String Method ==> 'startsWith("theCharater(s)YouWantToFind")'
        boolean checkIfNameStarts = upperCaseName.startsWith("AD");
        System.out.println("'upperCaseName' starts with 'AD' ? ==> "+checkIfNameStarts);
        // SUMMARY ==> This checks weather the given String/Char starts with the parameter provided
        // Plus the result value is boolean


        // 7th String Method ==> 'endsWith("theCharater(s)YouWantToFind")'
        boolean checkIfNameEnds = sentence.endsWith("pak");
        System.out.println("'sentence' ends with 'pak' ? ==> "+checkIfNameEnds);
        // SUMMARY ==> This checks weather the given String/Char ends with the parameter provided
        // Plus the result value is boolean


        // 8th String Method ==> 'charAt(int indexNo)'
        char charAtGivenIndex = name.charAt(2);
        System.out.println("'name' variable's character at index 2 is ==> "+charAtGivenIndex);
        // SUMMARY ==> Finds the character at the given index number


        // 9th String Method ==> 'indexOf(target,indexNumberYouWantToStartTheSearchFrom)'
        int indexOfGiven = sentence.indexOf("Pete");
        System.out.println("'sentence' variable's index at character 'Pete' is ==> "+indexOfGiven);
        System.out.println("'sentence' variable's index at character 'Jack' starting from index no. 38  is ==> "+sentence.indexOf("David",38));
        // SUMMARY ==> This finds the index number (only first occurrence) of the given char/string
        // In the case of a string it'll find the index number of the first character of that string and the second param (indexNumberYouWantToStartTheSearchFrom) is optional
        // If the target is not found then the value is -1
        

        // 10th String Method ==> 'lastIndexOf(target,indexNumberYouWantToStartTheSearchFrom'
        int lastIndexOfGiven = whiteSpaceString.lastIndexOf("ja");
        System.out.println("'whiteSpaceString' variable's last index of the string 'ja' is ==> "+lastIndexOfGiven);
        System.out.println("'whiteSpaceString' variable's last index of the string 'ja' is ==> "+whiteSpaceString.lastIndexOf("ja",45));
        // SUMMARY ==> This finds the index number (only last occurrence) of the given char/string
        // In the case of a string it'll find the index number of the first character of that string and the second param (indexNumberYouWantToStartTheSearchFrom) is optional
        // If the target is not found then the value is -1


        // 11th String Method ==> 'equals(target)'
        boolean isNameEqualTo_aditya = name.equals("aditya");
        System.out.println("'name' is equals to 'aditya' or not? ==> "+isNameEqualTo_aditya);
        // SUMMARY ==> It will find weather you target is equals to the variables (in this case, meinName)
        // It is case sensitive
        

        // 12th String Method ==> 'equalsIgnoreCase(target)'
        boolean isNameEqualToAditya = upperCaseName.equalsIgnoreCase("aditya");
        System.out.println("'upperCaseName' is equals to 'aditya or not (not case sensitive) ==> "+isNameEqualToAditya);
        // SUMMARY ==> It will find weather you target is equals to the variables (in this case, upperCaseName)
        // It is NOT case sensitive

    }
}