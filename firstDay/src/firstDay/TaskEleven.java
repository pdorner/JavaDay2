package firstDay;

import java.util.Scanner;

public class TaskEleven {

	public static void main(String[] args) {
		int n, iterations, result = 0; 
		String output = "";
        Scanner sc = new Scanner(System.in);
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
