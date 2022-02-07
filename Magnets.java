import java.util.Scanner;
public class Magnets{
	public static void main(String args[]){
		int noofmagnets,count=0;
		Scanner sc = new Scanner(System.in);
		noofmagnets = sc.nextInt();
		int pair[] = new int[noofmagnets+1];
		for(int i=0;i<noofmagnets;i++){
			pair[i] = sc.nextInt();
		}
		
		for(int i=0;i<noofmagnets;i++){
			if(pair[i]!=pair[i+1]){
				count++;
			}
		}
		
		System.out.println(count);
		
	}
}
