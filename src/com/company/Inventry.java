package com.company;
import java.util.Scanner;


public class Inventry{
    public void invent_(){
        Scanner sc=new Scanner(System.in);
        //array declaration
        int[] itemno={1,2,3,4,5,6,7,8,9};
        String[] name={"RICE","DAL","POTATO","CHICKEN","ONION","GARLIC","GINGER","SALT","SUJI"};
        int[] qty={100,70,80,50,40,25,10,50,40};

        int a,b,c=0;
        //output the list
        System.out.printf("%-5s%-10s%-5s\n","ITEM","NAME","QTY(in kgs)");

        //Accessing array elements
        for(int i=0;i<itemno.length;i++)
        {
            System.out.printf("%-5d%-10s%-5d\n",itemno[i],name[i],qty[i]);
            // System.out.println();
        }
        System.out.println("===========================");



        do {
            System.out.print("Enter Item number:");
            a=sc.nextInt();
            System.out.print("Enter quantity");
            b=sc.nextInt();
            System.out.print("Enter [1]-ADD [2]-REMOVE  [-1]-END:\n");
            c=sc.nextInt();
            if(a<=itemno.length)
            {
                switch(c){
                    case 1:
                        qty[a-1]=qty[a-1]+b;
                        break;
                    case 2:
                        qty[a-1]=qty[a-1]-b;
                        break;
                    default:
                        System.out.println("");
                }
            }
            else
            {
                System.out.println("wrong input");

            }

        }while(c!=-1);

        System.out.printf("%-5s%-10s%-5s\n","ITEM","NAME","QTY(in kgs)");
        for(int j=0;j<itemno.length;j++)
        {
            System.out.printf("%-5d%-10s%-5d\n",itemno[j],name[j],qty[j]);
            //System.out.println();
        }
        System.out.println("===========================");
    }


}