package firstDay;

import java.util.ArrayList;
import java.util.Scanner;

public class exerciseOne {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			

	    double  a = 45.2;
        int b = 78;
        System.out.println("The sum is: " + (a + b));

        //Exercise 2
        int c = 123;
        double d = 592.14;
        double e = c + d;
        
        System.out.println("The sum of Exercise 2 is: "  + e);
     
     

        
        System.out.println("Insert 2 Values" + "\n");
        double g = Double.parseDouble(sc.nextLine());
        double h = Double.parseDouble(sc.nextLine());
        Calculator calc1 = new Calculator(g, h);
        System.out.println(calc1.add());
        System.out.println(calc1.sub());
        System.out.println(calc1.mult());
        System.out.println(calc1.div());

		 
        System.out.println("   J    a   v     v  a       \r\n" + 
        		"   J   a a   v   v  a a                                                 \r\n" + 
        		"J  J  aaaaa   V V  aaaaa                                                \r\n" + 
        		" JJ  a     a   V  a     a\r\n" + 
        		"");
        
        System.out.println(" +\"\"\"\"\"+                                                 \r\n" + 
        		"[| o o |]                                                \r\n" + 
        		" |  ^  |                                                 \r\n" + 
        		" | '-' |                                                 \r\n" + 
        		" +-----+");
        
        ArrayList<Double> arr = new ArrayList <> ();
        arr.add(12.0);
        arr.add(95.0);
        arr.add(3.0);
        arr.add(10.0);
        arr.add(45.7);
        arr.add(33.14);
        
        double sum = 0;
        for (int i = 0; i<arr.size(); i++) {
         sum +=arr.get(i);
        }
        System.out.println(sum/arr.size());
        
		int n, iterations, result = 0; 
		String output = "";
        System.out.print("Enter base number: ");
        n = Integer.parseInt(sc.nextLine());
        System.out.print("Enter number of iterations: ");
        iterations = Integer.parseInt(sc.nextLine());
        
        for(int i=0; i<iterations;i++) {
        	String number = "";
        	for(int j=0; j<=i ;j++) {
        		number += n;
        	}
        	
        	result += Integer.parseInt(number);
        	output += number;
        	if(i!=(iterations-1)) output += " + ";
        }
        
        output += " = "+result;
        
        System.out.println(output);
	}

}
