package TopkapiUniversitesiMaasProgrami;

public class OgrenciIsleriCalisanlari extends  Akademisyen
{
    int ekstramesai ;
    public OgrenciIsleriCalisanlari(String ad, String soyad, double girissatiniz, double cikissatiniz, String bolum , double maas, int ekstramesai ,String gorev)
    {
       super(ad, soyad, girissatiniz, cikissatiniz, bolum, maas , gorev);
       this.ekstramesai = ekstramesai ;
    }

    public int getEkstramesai() {
        return ekstramesai;
    }

    public void setEkstramesai(int ekstramesai) {
        this.ekstramesai = ekstramesai;
    }
}
