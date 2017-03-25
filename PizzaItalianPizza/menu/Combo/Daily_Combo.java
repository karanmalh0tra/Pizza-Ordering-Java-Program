package PizzaItalianPizza.menu.Combo;
import java.io.*;
import java.util.*;
public class Daily_Combo
 {
     public static int a=1,cost=0,total=0,i=1,n;
     public void Display() throws IOException
     {
         BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
         
         Calendar c=Calendar.getInstance();
         int b=c.get(Calendar.DAY_OF_WEEK);
         String day;
         if(b==1)
         day="Sunday";
         else if(b==2)
         day="Monday";
         else if(b==3)
         day="Tuesday";
         else if(b==4)
         day="Wednesday";
         else if(b==5)
         day="Thursday";
         else if(b==6)
         day="Friday";
         else
         day="Saturday";
         System.out.println(day+"'s Combo offer are");
         do
         {
            switch(b)
            {
             case 1: System.out.println(" Press 1 For Sunday's Veg Combo");
                     System.out.println(" Press 2 For Sunday's Non Veg Combo ");
                     int j=Integer.parseInt(buff.readLine());
                     switch(j)
                     {
                         case 1: total=0;
                                 System.out.println("1)Medium Virtuous Veg, Coke and Ginger Garlic Bread\t\tRs.200 only ");
                                 System.out.println("2)Medium Cheesy Bites and get 1 Small Margherita Free\t\tRs.220 only");
                                 System.out.println("3)Large Margherita,Medium Cheesy Bites and Coke\t\t\tRs.300 only");
                                 a=Integer.parseInt(buff.readLine());
                                 switch(a)
                                 {
                                     case 1:
                                     System.out.println("Welcome to Sunday Veg Combo 1 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*200;
                                     break;
                                     case 2:
                                     System.out.println("Welcome to Sunday Veg Combo 2 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*220;
                                     break;
                                     case 3:
                                     System.out.println("Welcome to Sunday Veg Combo 3 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*300;
                                     break;
                                     default:
                                     System.out.println("Enter a number from 1 to 3");
                                     break;
                                    }
                         case 2: total=0;
                                 System.out.println("1)Medium Chicken Delight, Coke and Ginger Garlic Bread\t\t\tRs. 400 Only");
                                 System.out.println("2)Medium BBQ Americano and get 1 Small Chicken Delight Free\tRs.450 Only");
                                 System.out.println("3)Large Hawaiin,Medium Chicken Diablo and Coke\t\t\t\t\tRs.600 Only");
                                 a=Integer.parseInt(buff.readLine());
                                 switch(a)
                                 {
                                     case 1:
                                     System.out.println("Welcome to Sunday Non Veg Combo 1 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*400;
                                     break;
                                     case 2:
                                     System.out.println("Welcome to Sunday Non Veg Combo 2 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*450;
                                     break;
                                     case 3:
                                     System.out.println("Welcome to Sunday Non Veg Combo 3 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*600;
                                     break;
                                     default:
                                     System.out.println("Enter a number from 1 to 3");
                                     break;
                                    }
                                }
             case 2: System.out.println(" Press 1 For Monday's Veg Combo");
                     System.out.println(" Press 2 For Monday's Non Veg Combo ");
                     j=Integer.parseInt(buff.readLine());
                     switch(j)
                     {
                         case 1: total=0;
                                 System.out.println("1)Medium Virtuous Veg, Coke and Ginger Garlic Bread\t\t\tRs.155 Only");
                                 System.out.println("2)Medium Thin Italian and get 1 Small Margherita Free\t\t\tRs.240 Only");
                                 System.out.println("3)Large Virtuous Veg,Medium Margherita and Coke\t\t\t\tRs.280 Only");
                                 a=Integer.parseInt(buff.readLine());
                                 switch(a)
                                 {
                                     case 1:
                                     System.out.println("Welcome to Monday Veg Combo 1 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*155;
                                     break;
                                     case 2:
                                     System.out.println("Welcome to Monday Veg Combo 2 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*240;
                                     break;
                                     case 3:
                                     System.out.println("Welcome to Monday Veg Combo 3 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*280;
                                     break;
                                     default:
                                     System.out.println("Enter a number from 1 to 3");
                                     break;
                                    }
                                    break;
                         case 2: total=0;
                                 System.out.println("1)Medium Shrimply Delicious, Coke and Ginger Garlic Bread\t\t\tRs. 450 Only");
                                 System.out.println("2)Medium BBQ Americano and get 1 Small Shrimply Delicious Free\t\tRs.450 Only");
                                 System.out.println("3)Large Chicken Supreme,Medium Hawaiin and Coke\t\t\t\t\tRs.700 Only");
                                 a=Integer.parseInt(buff.readLine());
                                 switch(a)
                                 {
                                     case 1:
                                     System.out.println("Welcome to Monday Non Veg Combo 1 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*450;
                                     break;
                                     case 2:
                                     System.out.println("Welcome to Monday Non Veg Combo 2 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*450;
                                     break;
                                     case 3:
                                     System.out.println("Welcome to Monday Non Veg Combo 3 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*700;
                                     break;
                                     default:
                                     System.out.println("Enter a number from 1 to 3");
                                     break;
                                    }
                                }
                                break;
             case 3: System.out.println(" Press 1 For Tuesday's Veg Combo");
                     System.out.println(" Press 2 For Tuesday's Non Veg Combo ");
                     j=Integer.parseInt(buff.readLine());
                     switch(j)
                     {
                         case 1: total=0;
                                 System.out.println("1)Medium Virtuous Veg, Coke and Ginger Garlic Bread\tRs.200 only ");
                                 System.out.println("2)Medium Cheesy Bites and get 1 Small Margherita Free  Rs.220 only");
                                 System.out.println("3)Large Margherita,Medium Cheesy Bites and Coke\t\tRs.300 only");
                                 a=Integer.parseInt(buff.readLine());
                                 switch(a)
                                 {
                                     case 1:
                                     System.out.println("Welcome to Tuesday Veg Combo 1 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*200;
                                     break;
                                     case 2:
                                     System.out.println("Welcome to Tuesday Veg Combo 2 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*220;
                                     break;
                                     case 3:
                                     System.out.println("Welcome to Tuesday Veg Combo 3 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*300;
                                     break;
                                     default:
                                     System.out.println("Enter a number from 1 to 3");
                                     break;
                                    }
                                    break;
                         case 2: total=0;
                                 System.out.println("1)Medium Chicken Delight, Coke and Ginger Garlic Bread\t\t\tRs. 400 Only");
                                 System.out.println("2)Medium BBQ Americano and get 1 Small Chicken Delight Free\t\tRs.450 Only");
                                 System.out.println("3)Large Hawaiin,Medium Chicken Diablo and Coke\t\t\t\t\t\tRs.600 Only");
                                 a=Integer.parseInt(buff.readLine());
                                 switch(a)
                                 {
                                     case 1:
                                     System.out.println("Welcome to Tuesday Non Veg Combo 1 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*400;
                                     break;
                                     case 2:
                                     System.out.println("Welcome to Tuesday Non Veg Combo 2 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*450;
                                     break;
                                     case 3:
                                     System.out.println("Welcome to Tuesday Non Veg Combo 3 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*600;
                                     break;
                                     default:
                                     System.out.println("Enter a number from 1 to 3");
                                     break;
                                    }
                                }
                                break;
             case 4: System.out.println(" Press 1 For Wednesday's Veg Combo");
                     System.out.println(" Press 2 For Wednesday's Non Veg Combo ");
                     j=Integer.parseInt(buff.readLine());
                     switch(j)
                     {
                         case 1: total=0;
                                 System.out.println("1)Medium Virtuous Veg, Coke and Ginger Garlic Bread\t\tRs.155 Only");
                                 System.out.println("2)Medium Thin Italian and get 1 Small Margherita Free\t\tRs.240 Only");
                                 System.out.println("3)Large Virtuous Veg,Medium Margherita and Coke\t\t\tRs.280 Only");
                                 a=Integer.parseInt(buff.readLine());
                                 switch(a)
                                 {
                                     case 1:
                                     System.out.println("Welcome to Wednesday Veg Combo 1 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*155;
                                     break;
                                     case 2:
                                     System.out.println("Welcome to Wednesday Veg Combo 2 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*240;
                                     break;
                                     case 3:
                                     System.out.println("Welcome to Wednesday Veg Combo 3 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*280;
                                     break;
                                     default:
                                     System.out.println("Enter a number from 1 to 3");
                                     break;
                                    }
                                    break;
                         case 2: total=0;
                                 System.out.println("1)Medium Shrimply Delicious, Coke and Ginger Garlic Bread\t\t\tRs.450 Only");
                                 System.out.println("2)Medium BBQ Americano and get 1 Small Shrimply Delicious Free\t\tRs.450 Only");
                                 System.out.println("3)Large Chicken Supreme,Medium Hawaiin and Coke\t\t\t\t\tRs.700 Only");
                                 a=Integer.parseInt(buff.readLine());
                                 switch(a)
                                 {
                                     case 1:
                                     System.out.println("Welcome to Wednesday Non Veg Combo 1 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*450;
                                     break;
                                     case 2:
                                     System.out.println("Welcome to Wednesday Non Veg Combo 2 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*450;
                                     break;
                                     case 3:
                                     System.out.println("Welcome to Wednesday Non Veg Combo 3 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*700;
                                     break;
                                     default:
                                     System.out.println("Enter a number from 1 to 3");
                                     break;
                                    }
                                }
                                break;
             case 5: System.out.println(" Press 1 For Thursday's Veg Combo");
                     System.out.println(" Press 2 For Thursday's Non Veg Combo ");
                     j=Integer.parseInt(buff.readLine());
                     switch(j)
                     {
                         case 1: total=0;
                                 System.out.println("1)Medium Stuffed Crust, Coke and Ginger Garlic Bread\t\tRs.350 only ");
                                 System.out.println("2)Medium Blazin Inferno and get 1 Small Vurtuous Veg Free\tRs.385 only");
                                 System.out.println("3)Large Spicy Hot Veggie,Medium Blazin Inferno and Coke\tRs.550 only");
                                 a=Integer.parseInt(buff.readLine());
                                 switch(a)
                                 {
                                     case 1:
                                     System.out.println("Welcome to Thursday Veg Combo 1 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*350;
                                     break;
                                     case 2:
                                     System.out.println("Welcome to Thursday Veg Combo 2 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*385;
                                     break;
                                     case 3:
                                     System.out.println("Welcome to Thursday Veg Combo 3 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*550;
                                     break;
                                     default:
                                     System.out.println("Enter a number from 1 to 3");
                                     break;
                                    }
                                    break;
                         case 2: total=0;
                                 System.out.println("1)Medium Posh Proscuitto, Coke and Ginger Garlic Bread\t\tRs. 300 Only");
                                 System.out.println("2)Medium Meat Feast and get 1 Small Chicken Delight Fre\tRs.450 Only");
                                 System.out.println("3)Large Meat Feast,Medium Farmhouse and Coke\t\t\t\tRs.900 Only");
                                 a=Integer.parseInt(buff.readLine());
                                 switch(a)
                                 {
                                     case 1:
                                     System.out.println("Welcome to Thursday Non Veg Combo 1 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*300;
                                     break;
                                     case 2:
                                     System.out.println("Welcome to Thursday Non Veg Combo 2 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*450;
                                     break;
                                     case 3:
                                     System.out.println("Welcome to Thursday Non Veg Combo 3 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*900;
                                     break;
                                     default:
                                     System.out.println("Enter a number from 1 to 3");
                                     break;
                                    }
                                }
                                break;
             case 6: System.out.println(" Press 1 For Friday's Veg Combo");
                     System.out.println(" Press 2 For Friday's Non Veg Combo ");
                     j=Integer.parseInt(buff.readLine());
                     switch(j)
                     {
                         case 1: total=0;
                                 System.out.println("1)Medium Virtuous Veg, Coke and Ginger Garlic Bread\t\t\tRs.155 Only");
                                 System.out.println("2)Medium Thin Italian and get 1 Small Margherita Free\t\t\tRs.240 Only");
                                 System.out.println("3)Large Virtuous Veg,Medium Margherita and Coke\t\t\t\tRs.280 Only");
                                 a=Integer.parseInt(buff.readLine());
                                 switch(a)
                                 {
                                     case 1:
                                     System.out.println("Welcome to Friday Veg Combo 1 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*155;
                                     break;
                                     case 2:
                                     System.out.println("Welcome to Friday Veg Combo 2 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*240;
                                     break;
                                     case 3:
                                     System.out.println("Welcome to Friday Veg Combo 3 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*280;
                                     break;
                                     default:
                                     System.out.println("Enter a number from 1 to 3");
                                     break;
                                    }
                                    break;
                         case 2: total=0;
                                 System.out.println("1)Medium Shrimply Delicious, Coke and Ginger Garlic Bread\t\tRs. 450 Only");
                                 System.out.println("2)Medium BBQ Americano and get 1 Small Shrimply Delicious Free Rs.450 Only");
                                 System.out.println("3)Large Chicken Supreme,Medium Hawaiin and Coke\t\t\t\tRs.700 Only");
                                 a=Integer.parseInt(buff.readLine());
                                 switch(a)
                                 {
                                     case 1:
                                     System.out.println("Welcome to Friday Non Veg Combo 1 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*450;
                                     break;
                                     case 2:
                                     System.out.println("Welcome to Friday Non Veg Combo 2 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*450;
                                     break;
                                     case 3:
                                     System.out.println("Welcome to Friday Non Veg Combo 3 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*700;
                                     break;
                                     default:
                                     System.out.println("Enter a number from 1 to 3");
                                     break;
                                    }
                                }
                                break;
             case 7: System.out.println(" Press 1 For Saturday's Veg Combo");
                     System.out.println(" Press 2 For Saturday's Non Veg Combo ");
                     j=Integer.parseInt(buff.readLine());
                     switch(j)
                     {
                         case 1: total=0;
                                 System.out.println("1)Medium Stuffed Crust, Coke and Ginger Garlic Bread\t\tRs.350 only ");
                                 System.out.println("2)Medium Blazin Inferno and get 1 Small Vurtuous Veg Free\tRs.385 only");
                                 System.out.println("3)Large Spicy Hot Veggie,Medium Blazin Inferno and Coke\tRs.550 only");
                                 a=Integer.parseInt(buff.readLine());
                                 switch(a)
                                 {
                                     case 1:
                                     System.out.println("Welcome to Saturday Veg Combo 1 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*350;
                                     break;
                                     case 2:
                                     System.out.println("Welcome to Saturday Veg Combo 2 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*385;
                                     break;
                                     case 3:
                                     System.out.println("Welcome to Saturday Veg Combo 3 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*550;
                                     break;
                                     default:
                                     System.out.println("Enter a number from 1 to 3");
                                     break;
                                    }
                                    break;
                         case 2: total=0;
                                 System.out.println("1)Medium Posh Proscuitto, Coke and Ginger Garlic Bread\t\tRs.300 Only");
                                 System.out.println("2)Medium Meat Feast and get 1 Small Chicken Delight Free\tRs.450 Only");
                                 System.out.println("3)Large Meat Feast,Medium Farmhouse and Coke\t\t\t\tRs.900 Only");
                                 a=Integer.parseInt(buff.readLine());
                                 switch(a)
                                 {
                                     case 1:
                                     System.out.println("Welcome to Saturday Non Veg Combo 1 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*300;
                                     break;
                                     case 2:
                                     System.out.println("Welcome to Saturday Non Veg Combo 2 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*450;
                                     break;
                                     case 3:
                                     System.out.println("Welcome to Saturday Non Veg Combo 3 ");
                                     System.out.println("Enter the quantity");
                                     n=Integer.parseInt(buff.readLine());
                                     cost=n*900;
                                     break;
                                     default:
                                     System.out.println("Enter a number from 1 to 3");
                                     break;
                                    }
                                }
                                break;
                            }
                                total=total+cost;
                                System.out.println("Press 1 to buy more Daily Combo Pizza's.!!!");
                                System.out.println("Press any other key to stop buying From Daily Combo Section..!!!");
                                i = Integer.parseInt(buff.readLine());
                        }while(i==1);
                        System.out.println("Daily Combo cost is "+total);
                    }
                }
             
                                     
    
        
         
        
    

            
            
             
    
