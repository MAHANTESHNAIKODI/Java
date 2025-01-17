package Leetcode;

import java.util.Scanner;

public class pallindrome {
    private static void palindromeInt(String palindrome, String empty) {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//      121
        sc.nextInt();

        String palindrome="121";

      //  Scanner sc =new Scanner(System.in);
        //palindrome= Integer.parseInt(sc.nextLine());


        String empty= "";
        String abc = "";

        if(palindrome instanceof String){
            PallindromString((palindrome), empty);
        }
        else {
            Integer.parseInt(palindrome);
            palindromeInt(palindrome,empty);
        }




    }

    private static void PallindromString(String palindrome, String empty) {
        for(int i = palindrome.length()-1; i>=0; i--)    // for(i<=0;i<=length 10;i++)   i<=10;i>=0;i--
        {
             empty = empty + palindrome.charAt(i);
        }
        System.out.println(empty);
        if(palindrome.equals(empty)){
            System.out.println("IT is pallindrome");
        }
         else {
       System.out.println("Not a pallindrome");
         }
    }
}
