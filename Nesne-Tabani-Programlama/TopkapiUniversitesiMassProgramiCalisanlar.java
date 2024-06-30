package TopkapiUniversitesiMaasProgrami;
import java.util.Scanner;
public class TopkapiUniversitesiMassProgramiCalisanlar
{
    Scanner girdi = new Scanner(System.in);
  public   String   ad , soyad  , gorev;
    public double girissatiniz  , cikissatiniz  ;
    public   double maas ;
   public TopkapiUniversitesiMassProgramiCalisanlar(String ad , String soyad , double girissatiniz , double cikissatiniz ,double maas, String gorev)
   {
       this.ad = ad ;
       this.soyad = soyad ;
       this.girissatiniz = girissatiniz ;
       this.cikissatiniz = cikissatiniz ;
       this.gorev = gorev ;
       this.maas = maas ;

   }

    public String getAd() {
        return ad;
    }

    public boolean setAd(String ad) {
        this.ad = ad;
        return false;
    }

    public String getGorev() {
        return gorev;
    }
    public void setGorev(String gorev) {
        this.gorev = gorev;
    }
    public double getCikissatiniz() {
        return cikissatiniz;
    }

    public void setCikissatiniz(double cikissatiniz) {
        this.cikissatiniz = cikissatiniz;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public double getGirissatiniz() {
        return girissatiniz;
    }

    public void setGirissatiniz(double girissatiniz) {
        this.girissatiniz = girissatiniz;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

/*    public void secim(int sec)
    {
        System.out.println("Masinizi ogrenmek istiyorsaniz  1 . yoksa Is basvurusu  yapmak istiyorsaniz 2 yi seciniz .... ");
        sec  = girdi.nextInt() ;
        if(sec == 1)
        {
            int secim2 ;
            System.out.println("Akademisyen iseniz - 1 . Teknis islerdenseniz - 2 yi seciniz ...");
            secim2 = girdi.nextInt();
            if(sec==1)
            {
                int secim3;
                System.out.println("Hagi AKademisyen uyesisiniz : ");
                System.out.println("1-Dekan  2-Profesor  3-Asistan  4-Klupler Baskanligi  5-Ogrenci Isleri  6-Arastirma Gorevlisi");
                secim3 = girdi.nextInt();
                switch(secim3)
                {
                case 1:
                {
                     System.out.println();
                }
            }

        }
      //  if(sec )
        //    System.out.println("1-Akademisyen 2-TeknikEkip Calisani");
     //   sec  = girdi.nextInt() ;
    } */

}
