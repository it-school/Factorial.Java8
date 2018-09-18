package com.itschool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int N = in.nextInt();
	    int result = 1;
	    for (int i = N; i >= 1; i--){
	        result *= i;
        }
        System.out.println(result);
        System.out.println(recFactoriial(N));
    }

    static int recFactoriial(int N){
        if (N <= 1) return N;
        return N*recFactoriial(N-1);
    }
}
