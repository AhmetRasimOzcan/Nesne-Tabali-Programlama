package TopkapiUniversitesiMaasProgrami;

public class ArastirmaGorevlileri extends Profesorler{
    int ozeldersler ;
    public ArastirmaGorevlileri(String ad, String soyad, double girissatiniz, double cikissatiniz, String bolum , int ekstradersler , double maas , int ozeldersler ,String gorev) {
        super(ad, soyad, girissatiniz, cikissatiniz, bolum, ekstradersler, maas , gorev);
        this.ozeldersler = ozeldersler ;
    }

    public int getOzeldersler() {
        return ozeldersler;
    }

    public void setOzeldersler(int ozeldersler) {
        this.ozeldersler = ozeldersler;
    }
}
