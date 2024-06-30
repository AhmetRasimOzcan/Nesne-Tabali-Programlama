package TopkapiUniversitesiMaasProgrami;

public class Dekanlar extends  Akademisyen {

    public Dekanlar(String ad, String soyad, double girissatiniz, double cikissatiniz, String bolum , double maas, String gorev)
    {
        super(ad, soyad, girissatiniz, cikissatiniz, bolum , maas , gorev);
    }

    @Override
    public double getGirissatiniz() {
        return super.getGirissatiniz();
    }

    @Override
    public double getCikissatiniz() {
        return super.getCikissatiniz();
    }

    @Override
    public double getMaas() {
        return super.getMaas();
    }
    public double hesaplama()
    { int sonuc ;
        return  sonuc = (int) (this.maas * (this.cikissatiniz - this.girissatiniz));
    }
}


