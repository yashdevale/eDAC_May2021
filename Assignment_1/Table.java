import java.util.Scanner;

class Table{
	public static void main(String args[]){
	int j;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number you want to see the table of ");
	j = sc.nextInt();
		for(int i=1;i<=10;i++){
		int k=j*i;
		System.out.println(k);
		}
	}
}