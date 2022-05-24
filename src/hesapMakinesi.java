import java.util.Scanner;

public class hesapMakinesi {

	public static void main(String[] args) {
		//hesap makinesini switch-case kullanarak yapınız

		int sayi1,sayi2, secim ;
		
		Scanner sayi = new Scanner(System.in);
		
		System.out.println("lütfen birinci sayıyı giriniz ; ");
		sayi1= sayi.nextInt();
		System.out.println("lütfen ikinci sayıyı giriniz ; ");
		sayi2= sayi.nextInt();
		
		System.out.println("lütfen yapılacak işlemi seçiniz ; ");
		System.out.println(" 1-Toplama\n 2-Çıkarma\n 3-Çarpma\n 4-Bölme  ");
		secim= sayi.nextInt();
		
		
		switch ( secim) {
		
		case  1:
			 System.out.println("Toplama İşleminin Sonucu: "+ (sayi1+sayi2));
			break ;
			
		case  2:
			 System.out.println("çıkarma İşleminin Sonucu: "+ (sayi1-sayi2));
			break ;	
		case  3:
			 System.out.println("çarpma İşleminin Sonucu: "+ (sayi1*sayi2));
			break ;
		case  4:
			 System.out.println("bölme İşleminin Sonucu: "+ (sayi1/sayi2));
			break ;
			default :
			System.out.println("yanlış secim yapttınız : ");
		}
		
		
		}
		
	

}
