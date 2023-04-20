package com.hemanth;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 19;
        int i=0;
        for (i=1;i<=10;i++)
        {
            System.out.println(String.format("%s * %s = %s",num, i,(num * i)));
        }
    }
}
