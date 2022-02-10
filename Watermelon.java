import java.util.Scanner;
public class Watermelon{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int weight;
		weight = sc.nextInt();
		
		if(weight%2==0 && weight>2)
		// weight can't be 2 becoz when dividing it becomes 1 1 which is odd
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}


