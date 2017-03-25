package PizzaItalianPizza;
import PizzaItalianPizza.menu.Veg.*;
import PizzaItalianPizza.menu.Non_Veg.*;
import java.io.*;
public class menucard
{
public static int j,i,cost,total=0;
public void display()throws IOException
{
BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

System.out.println("\tPlease Choose 1 from the given Menu's");
System.out.println("\t1.Veg Section");
System.out.println("\t2.Non-Veg Section");
System.out.println("\t3.Combo's");
System.out.println("\t4.Side Orders");
System.out.println("\tPlease choose the option you want -");
j= Integer.parseInt(buff.readLine());
switch(j)
{
    case 1:
            VEGGIE obj_veg = new VEGGIE();
            obj_veg.Display();
            cost = obj_veg.total;
            break;
    case 2:
            NonVegSection obj_nonveg = new NonVegSection();
            obj_nonveg.Display();
            cost = obj_nonveg.total;
            break;
    case 3:
            ComboSection obj_combo=new ComboSection();
            obj_combo.Display();
            cost=obj_combo.total;
            break;
            case 4:
            Side_Orders obj_side=new Side_Orders();
            obj_side.Display();
            cost=obj_side.total;
            break;
    default:
            System.out.println("\tPlease Enter a number from 1 to 4");
            break;
}
total = total + cost;
}
}