package com.itschool;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 0;
        int N = in.nextInt();
        boolean Negative = false;
        for (int i = 1; i <= N; ){
            if (Negative) {
                result += recFactoriial(i);
                System.out.println(result);
                Negative = false;
            } else {
                result -= recFactoriial(i);
                System.out.println(result);
                Negative = true;
            }
            i+=2;
        }

        System.out.println(result);
    }

    static int recFactoriial(int N){
        if (N <= 1) return N;
        return N*recFactoriial(N-1);
    }
}
