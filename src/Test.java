
import java.util.Scanner;

public class Test {
    
    public static void main(String[]args){
        
        Scanner scanner = new Scanner(System.in);
        //String isim_SoyIsim, double maas, double calısmaSaati, int isBaslangici
        
        System.out.print("Lütfen İsim ve Soyisim Girin : ");
        String name = scanner.nextLine();
        
        System.out.print("Lütfen Maaş Miktarını Girin : ");
        double maas = scanner.nextDouble();
        
        System.out.print("Lütfen Haftalık Çalışma Saatini Girin : ");
        double calismaSaati = scanner.nextDouble();
        
        
        System.out.print("Lütfen İş Başlangıç Tarihini Girin : ");
        int isBaslangic = scanner.nextInt();
        
        
        Calısan calisan1 = new Calısan(name,maas,calismaSaati,isBaslangic);
        calisan1.tax();
        calisan1.bonus();
        calisan1.raiseSalary();
        calisan1.bilgileriGoster();
    }
}
