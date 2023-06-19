public class Calısan {
    
    private String isim_SoyIsim;
    private double maas;
    private double calismaSaati;
    private int isBaslangici;

    public Calısan(String isim_SoyIsim, double maas, double calısmaSaati, int isBaslangici) {
        this.isim_SoyIsim = isim_SoyIsim;
        this.maas = maas;
        this.calismaSaati = calısmaSaati;
        this.isBaslangici = isBaslangici;
    }
     
    
    //Vergi Miktarı Hesaplama 
    public void tax(){
        
        if(maas<1000){
            System.out.println("------------------------------");
            System.out.println("Maaşa Vergi Uygulanmamıştır...");
            System.out.println("------------------------------");
        }
        else{
            double vergi = (maas * 3) / 100;
            System.out.println("------------------------------");
            System.out.println("Maaş : " + maas + ", Vergi Miktarı : " + vergi);
            System.out.println("------------------------------");
        }
    }
    
    //Ekstra Çalışma Saati Hesaplama 
    public void bonus(){
        
        if(calismaSaati > 40){
            double ekstra = (calismaSaati - 40) * 30;
            maas += ekstra;  
            System.out.println("------------------------------");
            System.out.println("Ekstra Ücret : " + ekstra);
            System.out.println("------------------------------");
        }   
        else{
            System.out.println("------------------------------");
            System.out.println("Ekstra Ücret Bulunmamaktadır. ");
            System.out.println("------------------------------");
        }   
    }
    
    //Yıllık Zam Hesaplama
    public void raiseSalary(){
        
        int yilHesapla = Math.abs(2021 - isBaslangici);
        double zam = 0;
        
        if(yilHesapla < 10){
            zam = (maas * 5) / 100 ;
            maas += zam;
            System.out.println("------------------------------");
            System.out.println("Zamlı Ücret : " + maas + ", Zam Miktarı : " + zam);
            System.out.println("------------------------------");
        }
        
        else if(yilHesapla >= 9  && yilHesapla<20){
            zam = (maas * 10) / 100 ;
            maas += zam;
            System.out.println("------------------------------");
            System.out.println("Zamlı Ücret : " + maas + ", Zam Miktarı : " + zam);
            System.out.println("------------------------------");
        }
        
        else if(yilHesapla >= 19){
            zam = (maas * 15) / 100 ;
            maas += zam;
            System.out.println("------------------------------");
            System.out.println("Zamlı Ücret : " + maas + ", Zam Miktarı : " + zam);
            System.out.println("------------------------------");
        }
        else{
            System.out.println("------------------------------");
            System.out.println("Yanlış Hesaplama. Girdiğini Değerleri Lütfen Kontrol Edin!");
            System.out.println("------------------------------");
        }
    }
    
    //Çalışan Bilgilerini Görüntülme
    public void bilgileriGoster(){
        System.out.println("------------------------------");
        System.out.println("İsim Soyisim : " + isim_SoyIsim);
        System.out.println("Maaş : " + maas);
        System.out.println("Çalışma Saati : " + calismaSaati);
        System.out.println("İş Başlangıç Yılı : " + isBaslangici);
        System.out.println("------------------------------");
    }
 
}
