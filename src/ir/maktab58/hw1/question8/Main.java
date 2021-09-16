package ir.maktab58.hw1.question8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("This program tests Sequence Class and compares result to String Class");
        System.out.println("By using .replace, .concat methods the value array of Sequence changes(in contrast to string)");
        System.out.println("*".repeat(30));
        //Test concat method

        Sequence seq1 = new Sequence();
        char[] myArray1 = {'H', 'e', 'l', 'l', 'o'};
        seq1.setValue(myArray1);
        String str1 = new String(myArray1);
        Sequence seq2 = new Sequence();
        char[] myArray2 = {' ', 'T', 'a', 'b', 'a', 'n'};
        seq2.setValue(myArray2);
        String str2 = new String(myArray2);
        seq1.concat(seq2);
        str1 = str1.concat(str2);
        System.out.println("concat method results: ");
        System.out.println("Value1 is: " + Arrays.toString(myArray1)
                    + ", Value2 is: " + Arrays.toString(myArray2));
        System.out.print("Result by using Sequence Class: ");
        System.out.print(seq1.getValue());
        System.out.println(" | Result by using String Class: " + str1);
        boolean checker = isMatched(seq1, str1);
        if (checker)
            System.out.println("Result is matched :)");
        System.out.println("*".repeat(30));

        //Test indexOf method

        System.out.println("indexOf method results: ");
        char tempChar = 'l';
        seq1.setValue(myArray1);
        String newStr1 = new String(myArray1);
        System.out.println("Value is: " + Arrays.toString(myArray1)
                + ", char is: " + tempChar);
        System.out.print("Result by using Sequence Class: " + seq1.indexOf(tempChar));
        System.out.println(" | Result by using String Class: " + newStr1.indexOf(tempChar));
        checker = (seq1.indexOf(tempChar) == newStr1.indexOf(tempChar));
        if (checker)
            System.out.println("Result is matched :)");
        System.out.println("+");

        tempChar = 'L';
        System.out.println("Value is: " + Arrays.toString(myArray1)
                + ", char is: " + tempChar);
        System.out.print("Result by using Sequence Class: " + seq1.indexOf(tempChar));
        System.out.println(" | Result by using String Class: " + newStr1.indexOf(tempChar));
        checker = (seq1.indexOf(tempChar) == newStr1.indexOf(tempChar));
        if (checker)
            System.out.println("Result is matched :)");
        System.out.println("+");

        tempChar = 'e';
        System.out.println("Value is: " + Arrays.toString(myArray1)
                + ", char is: " + tempChar);
        System.out.print("Result by using Sequence Class: " + seq1.indexOf(tempChar));
        System.out.println(" | Result by using String Class: " + newStr1.indexOf(tempChar));
        checker = (seq1.indexOf(tempChar) == newStr1.indexOf(tempChar));
        if (checker)
            System.out.println("Result is matched :)");
        System.out.println("+");

        tempChar = ' ';
        System.out.println("Value is: " + Arrays.toString(myArray1)
                + ", char is: space" );
        System.out.print("Result by using Sequence Class: " + seq1.indexOf(tempChar));
        System.out.println(" | Result by using String Class: " + newStr1.indexOf(tempChar));
        checker = (seq1.indexOf(tempChar) == newStr1.indexOf(tempChar));
        if (checker)
            System.out.println("Result is matched :)");

        System.out.println("*".repeat(30));

        //Test replace method

        char[] tempChars = {'N', 'o', 'i', 's', 'e'};
        String temp = new String(tempChars);
        Sequence tempSeq = new Sequence();
        tempSeq.setValue(tempChars);
        Sequence oldSeq = new Sequence();
        char[] oldChars1 = {'i', 's', 'e'};
        oldSeq.setValue(oldChars1);
        char[] newChars1 = new char[0];
        Sequence newSeq = new Sequence();
        newSeq.setValue(newChars1);
        tempSeq.replace(oldSeq, newSeq);
        temp = temp.replace("ise", "");
        System.out.println("replace method results: ");
        System.out.println("Seq is: " + Arrays.toString(tempChars)
                + ", oldSeq is: " + Arrays.toString(oldChars1)
                + ", newSeq is: " + Arrays.toString(newChars1));
        System.out.print("Result by using Sequence Class: ");
        System.out.print(tempSeq.getValue());
        System.out.println(" | Result by using String Class: " + temp);
        checker = isMatched(tempSeq, temp);
        if (checker)
            System.out.println("Result is matched :)");
        System.out.println("+");

        char[] tempChars1 = {'N', 'o'};
        String temp1 = new String(tempChars1);
        Sequence tempSeq1 = new Sequence();
        tempSeq1.setValue(tempChars1);
        Sequence oldSeq2 = new Sequence();
        char[] oldChars2 = new char[0];
        oldSeq2.setValue(oldChars2);
        char[] newChars2 = {'+', '+'};
        Sequence newSeq2 = new Sequence();
        newSeq2.setValue(newChars2);
        tempSeq1.replace(oldSeq2, newSeq2);
        temp1 = temp1.replace("", "++");
        System.out.println("Seq is: " + Arrays.toString(tempChars1)
                + ", oldSeq is: " + Arrays.toString(oldChars2)
                + ", newSeq is: " + Arrays.toString(newChars2));
        System.out.print("Result by using Sequence Class: ");
        System.out.print(tempSeq1.getValue());
        System.out.println(" | Result by using String Class: " + temp1);
        checker = isMatched(tempSeq1, temp1);
        if (checker)
            System.out.println("Result is matched :)");
        System.out.println("+");

        char[] tempChars2 = {'H', 'e', 'r', 'm', 'a', 'n', 'o'};
        String temp2 = new String(tempChars2);
        Sequence tempSeq2 = new Sequence();
        tempSeq2.setValue(tempChars2);
        Sequence oldSeq3 = new Sequence();
        char[] oldChars3 = {'r', 'm', 'a', 'n'};
        oldSeq3.setValue(oldChars3);
        char[] newChars3 = {'l', 'l'};
        Sequence newSeq3 = new Sequence();
        newSeq3.setValue(newChars3);
        tempSeq2.replace(oldSeq3, newSeq3);
        temp2 = temp2.replace("rman", "ll");
        System.out.println("Seq is: " + Arrays.toString(tempChars2)
                + ", oldSeq is: " + Arrays.toString(oldChars3)
                + ", newSeq is: " + Arrays.toString(newChars3));
        System.out.print("Result by using Sequence Class: ");
        System.out.print(tempSeq2.getValue());
        System.out.println(" | Result by using String Class: " + temp2);
        checker = isMatched(tempSeq2, temp2);
        if (checker)
            System.out.println("Result is matched :)");
        System.out.println("+");

        char[] tempChars3 = {'P', 'i', 'v', 'o', 't'};
        String temp3 = new String(tempChars3);
        Sequence tempSeq3 = new Sequence();
        tempSeq3.setValue(tempChars3);
        Sequence oldSeq4 = new Sequence();
        char[] oldChars4 = {'i', 'v', 'y'};
        oldSeq4.setValue(oldChars4);
        char[] newChars4 = {'e', 'a', 'n', 'u'};
        Sequence newSeq4 = new Sequence();
        newSeq3.setValue(newChars4);
        tempSeq3.replace(oldSeq4, newSeq4);
        temp3 = temp3.replace("ivy", "eanu");
        System.out.println("Seq is: " + Arrays.toString(tempChars3)
                + ", oldSeq is: " + Arrays.toString(oldChars4)
                + ", newSeq is: " + Arrays.toString(newChars4));
        System.out.print("Result by using Sequence Class: ");
        System.out.print(tempSeq3.getValue());
        System.out.println(" | Result by using String Class: " + temp3);
        checker = isMatched(tempSeq3, temp3);
        if (checker)
            System.out.println("Result is matched :)");

        System.out.println("*".repeat(30));

        //Test equals method

        Sequence sequence1 = new Sequence();
        char[] array1 = {'f', 'l', 'a', 'g', 's'};
        sequence1.setValue(myArray1);
        String string1 = new String(array1);
        Sequence sequence2 = new Sequence();
        char[] array2 = {'f', 'r', 'o', 'g', 's'};
        sequence2.setValue(array2);
        String string2 = new String(array2);
        sequence1.concat(sequence2);
        string1 = string1.concat(string2);
        System.out.println("equals method results: ");
        System.out.println("Value1 is: " + Arrays.toString(array1)
                + ", Value2 is: " + Arrays.toString(array1));
        System.out.print("Result by using Sequence Class: ");
        System.out.print(sequence1.equals(sequence1));
        System.out.println(" | Result by using String Class: " + string1.equals(string1));
        checker = string1.equals(string1) == sequence1.equals(sequence1);
        if (checker)
            System.out.println("Result is matched :)");
        System.out.println("+");

        System.out.println("Value1 is: " + Arrays.toString(array1)
                + ", Value2 is: " + Arrays.toString(array2));
        System.out.print("Result by using Sequence Class: ");
        System.out.print(sequence1.equals(sequence2));
        System.out.println(" | Result by using String Class: " + string1.equals(string2));
        checker = string1.equals(string2) == sequence1.equals(sequence2);
        if (checker)
            System.out.println("Result is matched :)");

        System.out.println("*".repeat(30));
    }

    public static boolean isMatched(Sequence seq, String str){
        if (seq.getValue().length != str.length())
            return false;
        char[] array1 = seq.getValue();
        char[] array2 = new char[str.length()];
        str.getChars(0, str.length(), array2, 0);
        for (int i = 0; i < str.length(); i++)
            if (array1[i] != array2[i])
                return false;
        return true;
    }
}
