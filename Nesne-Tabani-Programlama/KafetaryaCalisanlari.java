package TopkapiUniversitesiMaasProgrami;

public class KafetaryaCalisanlari  extends  TekbikKisimCalisanlari{
    int kactaneprimurunusatildi ;
    public KafetaryaCalisanlari (String ad , String soyad , double girissatiniz , double cikissatiniz ,double maas , String gorev ,int kactaneprimurunusatildi)
    {
        super(ad, soyad, girissatiniz, cikissatiniz, maas, gorev);
        this.kactaneprimurunusatildi = kactaneprimurunusatildi ;

    }

    public int getKactaneprimurunusatildi() {
        return kactaneprimurunusatildi;
    }

    public void setKactaneprimurunusatildi(int kactaneprimurunusatildi) {
        this.kactaneprimurunusatildi = kactaneprimurunusatildi;
    }
}
