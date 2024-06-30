package TopkapiUniversitesiMaasProgrami;

public class  Akademisyen extends TopkapiUniversitesiMassProgramiCalisanlar {
    private String bolum;

    public Akademisyen(String ad, String soyad, double girissatiniz, double cikissatiniz, String bolum, double maas, String gorev) {
        super(ad, soyad, girissatiniz, cikissatiniz, maas, gorev);
        this.bolum = bolum;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }
}