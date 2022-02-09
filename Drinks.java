import java.util.Scanner;
public class Drinks{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int drinks;
		double overall=0;
		
		drinks = sc.nextInt();

		for(int i=0;i<drinks;i++){
			double percent=sc.nextDouble();
			overall += percent;
		}
		double volfract = overall/drinks;
		System.out.println(volfract);
	}
}

