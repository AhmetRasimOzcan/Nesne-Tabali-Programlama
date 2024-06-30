package TopkapiUniversitesiMaasProgrami;

public class OgrenciBasvuru implements Basvuru {
    String ad , soyad , eposta , telefonnumarasi ;

    public OgrenciBasvuru(String ad , String soyad ,String eposta , String telefonnumarasi)
    {
        this.ad = ad ;
        this.eposta = eposta ;
        this.soyad = soyad ;
        this.telefonnumarasi = telefonnumarasi ;
        System.out.println(this.okul);
    }

    public void  aciklama()
    {
        System.out.println(this.okul + "  " + " ' ne Hos Geldininz sizin gibi bizim okulumuzda okuyup bizimle beraber  calismak istiyen ogrencilerimizle gurur duyuyoruz assagidaki bilgileri giriniz ...");
    }
    public void kapanis()
    {
        System.out.println("Bilgilerinizi Girdiniz Icin Tesekkurler Ekibimiz size geri donus saglicaklardir Iyi gunler ... :) ");
    }
}
