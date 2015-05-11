package ua.infopulse.hometask_l7;
/*A string consisting of the words. Delete first occurrence of a given word from the string.
Option 1 - Use the class String.
Option 2 -Use class StringBuffer.*/

public class StringIndexOfAndBufferDelete {
    public static void main (String [] args){
        String str1 = "Iryna Iryna";
        int beginIndex = 0;

        System.out.println("str = " + str1);
        int i = str1.indexOf("yn");
        System.out.println(" ");

        System.out.println("First variant with method indexof and substring");
        if (i != -1){
            beginIndex = i;
            int endIndex = i + 2;
            String strNewFirstPart = str1.substring(0, beginIndex);
            String strNewSecondPart = str1.substring(endIndex);
            System.out.println("strNew = " + strNewFirstPart + strNewSecondPart);
        }

        System.out.println(" ");
        System.out.println("Second variant with class StringBuffer");
        StringBuffer str2 = new StringBuffer("Iryna Iryna");
                if (i != -1) {
            beginIndex = i;
            int endIndex = i + 2;
            str2.delete(beginIndex, endIndex);
            System.out.println("strNew = " + str2);
        }
    }
}
