package TopkapiUniversitesiMaasProgrami;

public class GuvenlikGorevlisi  extends TekbikKisimCalisanlari{
    String  rutbe  ;
    public GuvenlikGorevlisi(String ad , String soyad , double girissatiniz , double cikissatiniz ,double maas , String gorev , String rutbe)
    {
        super(ad, soyad, girissatiniz, cikissatiniz, maas, gorev);
        this.rutbe = rutbe ;
    }

    public String getRutbe() {
        return rutbe;
    }

    public void setRutbe(String rutbe) {
        this.rutbe = rutbe;
    }
}
