package PizzaItalianPizza.menu.Non_Veg;

import java.io.*;
public class Posh_Prosciutto
{
    public static int total=0,cost=0,i,j,n=1;;
    public void Display()throws IOException
    {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        do
            {
                total=0;
                System.out.println("\tType 1 for Small\tRs.450/-");
                System.out.println("\tType 2 for Medium\tRs.320/-");
                System.out.println("\tType 3 for Large\tRs.320 ");
                j = Integer.parseInt(buff.readLine());
                switch(j)
                {
                    case 1:
                    System.out.println("\tPlease enter the number of Pizza's");
                    n=Integer.parseInt(buff.readLine());
                    System.out.println("\tRs."+n*450+"/-");  
                    cost=n*450;
                    break;
                    case 2:
                    System.out.println("\tPlease enter the number of Pizza's");
                    n=Integer.parseInt(buff.readLine());
                    System.out.println("\tRs."+n*320+"/-");  
                    cost=n*320;
                    break;
                    case 3:
                    System.out.println("\tPlease enter the number of Pizza's");
                    n=Integer.parseInt(buff.readLine());
                    System.out.println("\tRs."+n*320+"/-");  
                    cost=n*320;
                    break;
                    default:
                    System.out.println("\tYou have entered a wrong choice");
                }
                total=total+cost;
                System.out.println("\tPress 1 to buy more Posh Prosciutto Pizza's.!!!");
                System.out.println("\tPress any other number to stop buying Posh Prosciutto Pizza's..!!!");
                i = Integer.parseInt(buff.readLine());
            }while(i==1);
            System.out.println("\tYour Posh Prosciutto total is: " +total);
        }
}
