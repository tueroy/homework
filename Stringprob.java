package Homework1;

import java.util.Arrays;
import java.util.Scanner;

public class Stringprob {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String flip = reverseString("god");
        System.out.println(flip);


    }

    public static boolean checkPalidrome(String string){
        String flip = reverseString(string);
        if(string.equals(string)){
            return true;
        }else{
            return false;
        }
    }
    public static boolean Anagramcheck(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }else{
            char[] str1value = str1.toCharArray();
            char[] str2value = str2.toCharArray();
            Arrays.sort(str1value);
            Arrays.sort(str2value);
            return Arrays.equals(str1value, str2value);

        }
    }

    public static String reverseString(String letter){
        char[] name = new char[letter.length()];
        int index = 0;
        for(int i = letter.length() -1; i >= 0; i --){
            name[index] = letter.charAt(i);
            index++;
        }
        String flip = "";
        for(int i = 0; i < letter.length(); i ++){
            flip += name[i];
        }
        return flip;
    }

}
