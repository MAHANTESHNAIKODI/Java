package Leetcode;

import java.awt.*;
import java.sql.Array;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean res = leapYear(1800);
        System.out.println(res);
    }

    static boolean leapYear(int N){
        if(N%4==0){
            return true;
        }
        else if(N%400==0){
            return true;
        }
        else if(N%100==0){
            return false;
        }
        return false;
    }
}
