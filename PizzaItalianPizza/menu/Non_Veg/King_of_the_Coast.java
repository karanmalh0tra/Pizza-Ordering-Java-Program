package PizzaItalianPizza.menu.Non_Veg;

import java.io.*;
public class King_of_the_Coast
{
    public static int total=0,cost=0,i,j,n=1;;
    public void Display()throws IOException
    {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        do
            {
                total=0;
                System.out.println("\tType 1 for Small\tRs.310/-");
                System.out.println("\tType 2 for Medium\tRs.430/-");
                System.out.println("\tType 3 for Large\tRs.550 ");
                j = Integer.parseInt(buff.readLine());
                switch(j)
                {
                    case 1:
                    System.out.println("\tPlease enter the number of Pizza's");
                    n=Integer.parseInt(buff.readLine());
                    System.out.println("\tRs."+n*310+"/-");  
                    cost=n*310;
                    break;
                    case 2:
                    System.out.println("\tPlease enter the number of Pizza's");
                    n=Integer.parseInt(buff.readLine());
                    System.out.println("\tRs."+n*430+"/-");  
                    cost=n*430;
                    break;
                    case 3:
                    System.out.println("\tPlease enter the number of Pizza's");
                    n=Integer.parseInt(buff.readLine());
                    System.out.println("\tRs."+n*550+"/-");  
                    cost=n*550;
                    break;
                    default:
                    System.out.println("\tYou have entered a wrong choice");
                }
                total=total+cost;
                System.out.println("\tPress 1 to buy more King of the Coast Pizza's.!!!");
                System.out.println("\tPress any other number to stop buying King of the Coast Pizza's..!!!");
                i = Integer.parseInt(buff.readLine());
            }while(i==1);
            System.out.println("\tYour King of the Coast total is: " +total);
        }
}

