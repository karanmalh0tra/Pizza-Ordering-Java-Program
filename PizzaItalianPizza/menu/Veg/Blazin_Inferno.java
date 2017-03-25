package PizzaItalianPizza.menu.Veg;

import java.io.*;
public class Blazin_Inferno
{
    public static int total=0,cost=0,i,j,n=1;;
    public void Display()throws IOException
    {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        do
            {
                total=0;
                System.out.println("\tType 1 for Small\tRs.225/-");
                System.out.println("\tType 2 for Medium\tRs.385/-");
                System.out.println("\tType 3 for Large\tRs.490 ");
                j = Integer.parseInt(buff.readLine());
                switch(j)
                {
                    case 1:
                    System.out.println("\tPlease enter the number of Pizza's");
                    n=Integer.parseInt(buff.readLine());
                    System.out.println("\tRs."+n*225+"/-");  
                    cost=n*225;
                    break;
                    case 2:
                    System.out.println("\tPlease enter the number of Pizza's");
                    n=Integer.parseInt(buff.readLine());
                    System.out.println("\tRs."+n*385+"/-");  
                    cost=n*385;
                    break;
                    case 3:
                    System.out.println("\tPlease enter the number of Pizza's");
                    n=Integer.parseInt(buff.readLine());
                    System.out.println("\tRs."+n*490+"/-");  
                    cost=n*490;
                    break;
                    default:
                    System.out.println("\tYou have entered a wrong choice");
                }
                total=total+cost;
                System.out.println("\tPress 1 to buy more Blazin' Inferno Pizza's.!!!");
                System.out.println("\tPress any other number to stop buying Blazin' Inferno Pizza's..!!!");
                i = Integer.parseInt(buff.readLine());
            }while(i==1);
            System.out.println("\tYour Blazin' Inferno total is: " +total);
        }
}



