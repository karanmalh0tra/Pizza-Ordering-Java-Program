import java.io.*;
import PizzaItalianPizza.*;
public class PIZZA
{
public int i,j,cost,total=0;
public String name;
static double final_price;

public void Display()throws IOException
{
   char ch,t;
   BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
   do
   {
    System.out.println("\t WELCOME TO PIZZA ITALIAN PIZZA");
    menucard obj_menu = new menucard();
    obj_menu.display();
    cost=obj_menu.cost;
    total=total+cost;
    System.out.println("Press 1 to go the MENU ");
    System.out.println("Press any other key to EXIT");
    j = Integer.parseInt(buff.readLine());
   }while(j==1);
    if(total>=1000 && total<1500)
        {
            final_price= 0.9*total;
            System.out.println("\tYour Total is "+final_price);
        }
        else if(total>=1500)
        {
            final_price=0.7*total;
            System.out.println("\tYour Total is "+final_price);
        }
        else
        {
            final_price=total;
            System.out.println("\tYour Total is "+final_price);
        }
        System.out.println(" THANK YOU FOR COMING TO PIZZA ITALIAN PIZZA");
        System.out.println(" Please Enter you Name ");
        name=buff.readLine();
        System.out.println(" Please Enter your Contact Number so that we can alert you on latest discounts and combo's");
        long number=Long.parseLong(buff.readLine());
        
        System.out.println(" Did You Like Our Pizza's ? ");
        System.out.println(" Y for Yes and N for No ");
       String ch1=buff.readLine();
        if(ch1.equalsIgnoreCase("y"))
        {
            System.out.println("Thank You for Loving our Pizza's");
        }
        else
        {
            System.out.println("Sorry For Now. We Hope to Provide You Delicious Pizza's Next Time ");
        }
    
    System.out.println("Please type your suggestions on how we could improve our Services");
    String sug=buff.readLine();
    System.out.println("Thank You For Your Suggestions ");
}
}

    
        
        
    
        