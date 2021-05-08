import java.util.*;

class DecimaltoHexa{
	public static void main(String[]args){
		int a,q,r,q1,r1,q2,r2,q3,r3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		a= sc.nextInt();
		q = a/16;
		r = a%16;
		
		q1 = q/16;
		r1 = q%16;
		
		q2 = q1/16;
		r2 = q1%16;
		
		q3 = q2/16;
		r3 = q2%16;
		System.out.print("The Binary conversion of entered number is: "+r3+" "+r2+" "+r1+" "+r);
		
		
	}
}
