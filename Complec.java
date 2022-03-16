package math;

import java.util.Scanner;

public class Complec {
	String pname;
	int quantity;
	float price;

	
	void input() 
	{ 
	   Scanner S = new Scanner(System.in);
		System.out.println("enter product name ");
		pname= S.next();
		System.out. println("enter product price ");
		price = S.nextFloat();
		System.out.println("Enter quantity of product");
		quantity=S.nextInt();
	}
	
	void Show() 
	{
		System.out.println(pname +""+price+""+quantity);
		
	}
  void Calculate()
  {
	
	if (price>2000)
		System.out.println("discount is 10%");
	else
		System.out.println("discount is 7%");
	
}
public static void main(String args[])
{
	inventory r= new inventory();
		r.input();
	    r.Show();
	    r.Calculate();

}

}

