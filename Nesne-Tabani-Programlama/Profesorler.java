package TopkapiUniversitesiMaasProgrami;

public class Profesorler extends Akademisyen
{
    public int ekstradersler ;
 public Profesorler(String ad, String soyad, double girissatiniz, double cikissatiniz, String bolum , int ekstradersler , double maas  ,String gorev)
 {
     super(ad, soyad, girissatiniz, cikissatiniz, bolum, maas , gorev);
     this.ekstradersler  = ekstradersler;
 }

    public int getEkstradersler() {
        return ekstradersler;
    }



}
