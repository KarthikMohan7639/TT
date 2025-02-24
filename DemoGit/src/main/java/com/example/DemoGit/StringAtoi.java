package com.example.DemoGit;

public class StringAtoi {
    public static void main(String[] args) {
        String s=new String("    1337a");
        String s1=s.strip();
        int n=Integer.parseInt(s1);
        System.out.println(n);

    }
}
