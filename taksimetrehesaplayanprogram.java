package myjavaprograms;
import java.util.Scanner ;


public class taksimetrehesaplayanprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int distance, opprice;
		
		double taximeter;
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Gideceðiniz mesafeyi tam sayý cinsinden giriniz(km): ");
		distance=inp.nextInt();
		taximeter=2.20;
		opprice=10 ;
		double price = opprice + taximeter * distance ;
		System.out.println("Toplam Tutar: " + price +"TL");
		System.out.print("ProgramEND");
		
		
		

	}

}
