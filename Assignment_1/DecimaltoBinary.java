import java.util.*;

class DecimaltoBinary{
	public static void main(String[]args){
		int a,q,r,q1,r1,q2,r2,q3,r3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		a= sc.nextInt();
		q = a/2;
		r = a%2;
		//System.out.println(+r);
		
		q1 = q/2;
		r1 = q%2;
		//System.out.println(+r1);
		
		q2 = q1/2;
		r2 = q1%2;
		//System.out.println(+r2);
		
		q3 = q2/2;
		r3 = q2%2;
		//System.out.println(+r3);
		System.out.print("The Binary conversion of entered number is "+r3+" "+r2+" "+r1+" "+r);
		
		
	}
}