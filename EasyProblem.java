import java.util.Scanner;
public class EasyProblem{
	public static void main(String args[]){
		int noofpeople,ans=0;
		Scanner sc = new Scanner(System.in);
		noofpeople = sc.nextInt();

		for(int i=0;i<noofpeople;i++){
			int response=sc.nextInt();
			if(response==1){
				ans=1;
				break;
			}
		}
		if(ans==1)
			System.out.println("HARD");
		else
			System.out.println("EASY");

	}
}
