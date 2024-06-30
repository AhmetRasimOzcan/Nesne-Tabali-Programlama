package TopkapiUniversitesiMaasProgrami;

public class Asistan  extends  Akademisyen{
    public int profesoreekstrakaacsaatyardim ;
    public Asistan(String ad, String soyad, double girissatiniz, double cikissatiniz, String bolum , double maas ,String gorev , int profesoreekstrakaacsaatyardim)
    {
        super(ad, soyad, girissatiniz, cikissatiniz, bolum, maas, gorev);
        this.profesoreekstrakaacsaatyardim = profesoreekstrakaacsaatyardim ;
    }

    public int getProfesoreekstrakaacsaatyardim() {
        return profesoreekstrakaacsaatyardim;
    }

    public void setProfesoreekstrakaacsaatyardim(int profesoreekstrakaacsaatyardim) {
        this.profesoreekstrakaacsaatyardim = profesoreekstrakaacsaatyardim;
    }
}
