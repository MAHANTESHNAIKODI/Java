package Leetcode;

import java.util.*;

class testCrio {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int grid[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        }

        String result = checkMagicSquare(n, grid);


        System.out.println(result);

    }
    static String checkMagicSquare(int n, int[][] grid) {
        System.out.println(firstRowSum(grid,n,0));
        return "Yes";
    }

    static int firstRowSum(int [][] grid, int n, int row){
        int sum=0;
        for(int col=0;col<=n-1;col++){
            sum=sum+grid[row][col];
        }
        return sum;
    }

    static int dailogSumLR(int [][] grid, int n){
        int sum=0,row =0,column=0;
        while(row<n){
            sum= sum + grid[row][column];
            row=row+1;
            column++;
        }
        return sum;
    }
}


