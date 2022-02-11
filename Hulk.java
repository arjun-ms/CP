import java.util.Scanner;
public class Hulk{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int nooflayers;
		nooflayers = sc.nextInt();
		
		for(int i=1;i<=nooflayers;i++){
			if(i%2==0)
				System.out.print("I love");
			else
				System.out.print("I hate");
				
			if(i<nooflayers)
				System.out.print(" that ");
	
		}
		System.out.print(" it");
	}
}


