package TopkapiUniversitesiMaasProgrami;

public   class TeknikBasvuru extends  TeknikKisimBasvuru {

    public TeknikBasvuru(String ad , String soyad ,String eposta , String telefonnumarasi , String CV) {

        super(ad, soyad, eposta, telefonnumarasi, CV);
    }


    public   void karsilamaekrani() {
        System.out.println("Istanbul Topkapi Universitesine Hos Geldiniz   Teknik kisim icin Lutfen assagidaki bilgileri Giriniz :");

    }
    public   void gorusuruzekrani()
    {
        System.out.println("Bilgileriniz icin tesekkurler . Biz size geri donus saglicagiz .");
    }
}
