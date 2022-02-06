import java.util.Scanner;
public class JokeProgramming{
		public static void main(String args[]){
			String word;
			int flag=0;
			Scanner sc = new Scanner(System.in);
			word = sc.next();
			for(int i=0;i<word.length();i++){
				if(word.charAt(i)== 'H' || word.charAt(i)== 'Q' || word.charAt(i)== '9'){
					flag=1;
				}			
			}
			if(flag==1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
}



























//switch(word.charAt(i)){
					//case 'H':System.out.println("YES");
					//break;
					//case 'Q':System.out.println("YES");
					//break;
					//case '9':System.out.println("YES");
					//break;
					//case '+':System.out.println("YES");
					//break;
					//default:System.out.println("NO");
				//}
