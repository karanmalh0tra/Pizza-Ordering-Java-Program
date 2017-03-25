package PizzaItalianPizza.menu.Veg;

import java.io.*;
public class Virtuous_Veg
{
    public static int total=0,cost=0,i,j,n=1;;
    public void Display()throws IOException
    {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        do
            {
                total=0;
                System.out.println("\tType 1 for Small\tRs.75/-");
                System.out.println("\tType 2 for Medium\tRs.155/-");
                System.out.println("\tType 3 for Large\tRs.295 ");
                j = Integer.parseInt(buff.readLine());
                switch(j)
                {
                    case 1:
                    System.out.println("\tPlease enter the number of Pizza's");
                    n=Integer.parseInt(buff.readLine());
                    System.out.println("\tRs."+n*75+"/-");  
                    cost=n*75;
                    break;
                    case 2:
                    System.out.println("\tPlease enter the number of Pizza's");
                    n=Integer.parseInt(buff.readLine());
                    System.out.println("\tRs."+n*155+"/-");  
                    cost=n*155;
                    break;
                    case 3:
                    System.out.println("\tPlease enter the number of Pizza's");
                    n=Integer.parseInt(buff.readLine());
                    System.out.println("\tRs."+n*295+"/-");  
                    cost=n*295;
                    break;
                    default:
                    System.out.println("\tYou have entered a wrong choice");
                }
                total=total+cost;
                System.out.println("\tPress 1 to buy more Virtuous Veg Pizza's.!!!");
                System.out.println("\tPress any other number to stop buying Virtuous Veg Pizza's..!!!");
                i = Integer.parseInt(buff.readLine());
            }while(i==1);
            System.out.println("\tYour Virtuous Veg total is: " +total);
        }
}





