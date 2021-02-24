//Gunnar Jaeck
//CS141 Chapter 5
//Exercise 3

import java.util.*;
import java.lang.*;

class CS141_Ch05_Ex03 {
    public static void main(String[] args) {
        System.out.println("Gunnar Jaeck\nCS141 Chapter 5\nExercise 3\n");
        System.out.println(toBinary(4));
    }

    public static String toBinary(int base10) {
        
        int quotient = base10;
        StringBuilder binaryStrBld = new StringBuilder();
        
        do {
            binaryStrBld.append(quotient % 2);
            quotient /= 2;
        } while (quotient != 0);

        return binaryStrBld.reverse().toString();

    }
}