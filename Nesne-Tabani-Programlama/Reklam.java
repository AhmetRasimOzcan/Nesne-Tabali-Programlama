package TopkapiUniversitesiMaasProgrami;

public class Reklam {
    private String adsoyad , telefonnumarasi , mail;
    Reklam(String adsoyad , String telefonnumarasi , String mail)
    {
        this.adsoyad = adsoyad ;
        this.telefonnumarasi = telefonnumarasi ;
        this.mail = mail ;
    }

    public String getAdsoyad() {
        return adsoyad;
    }

    public void setAdsoyad(String adsoyad) {
        this.adsoyad = adsoyad;
    }

    public String getTelefonnumarasi() {
        return telefonnumarasi;
    }

    public void setTelefonnumarasi(String telefonnumarasi) {
        this.telefonnumarasi = telefonnumarasi;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
