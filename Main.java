package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        {
            int n1=1,n2=1,n3,i,count=4;
            System.out.print(n1+" "+n2);//printing 0 and 1

            for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
            {
                n3=n1+n2;
                System.out.print(" "+n3);
                n1=n2;
                n2=n3;
            }

        }}
    // write your code here
    }

