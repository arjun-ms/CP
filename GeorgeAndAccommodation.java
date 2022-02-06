import java.util.Scanner;
public class GeorgeAndAccommodation{
	public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			int totalrooms,i;
			int pplinroom,roomcapacity;
			int space=0;
			totalrooms = sc.nextInt();
			for(i=0;i<totalrooms;i++){
				pplinroom = sc.nextInt();
				roomcapacity = sc.nextInt();
				if(roomcapacity-pplinroom >=2){
						space++;
				}
			}
			System.out.println(space);
	}
}
