package TopkapiUniversitesiMaasProgrami;

public class KendiReklamim  extends  Reklam{
    String CV ;
    KendiReklamim(String adsoyad , String telefonnumarasi , String mail , String CV)
    {
        super(adsoyad, telefonnumarasi, mail);
        this.CV = CV ;
    }

    public String getCV() {
        return CV;
    }

    public void setCV(String CV) {
        this.CV = CV;
    }

    @Override
    public void setAdsoyad(String adsoyad) {
        super.setAdsoyad(adsoyad);
    }

    @Override
    public String getAdsoyad() {
        return super.getAdsoyad();
    }

    @Override
    public String getTelefonnumarasi() {
        return super.getTelefonnumarasi();
    }

    @Override
    public void setTelefonnumarasi(String telefonnumarasi) {
        super.setTelefonnumarasi(telefonnumarasi);
    }

    @Override
    public String getMail() {
        return super.getMail();
    }

    @Override
    public void setMail(String mail) {
        super.setMail(mail);
    }
}
