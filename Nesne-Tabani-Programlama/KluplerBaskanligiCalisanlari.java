package TopkapiUniversitesiMaasProgrami;

public class KluplerBaskanligiCalisanlari  extends  Akademisyen{
    int etkinlikbasinaprim ;
    public  KluplerBaskanligiCalisanlari(String ad, String soyad, double girissatiniz, double cikissatiniz, String bolum , double maas , int etkinlikbasinaprim ,String gorev)
    {
        super(ad, soyad, girissatiniz, cikissatiniz, bolum, maas , gorev);
        this.etkinlikbasinaprim = etkinlikbasinaprim ;
    }
}
