package TopkapiUniversitesiMaasProgrami;

public class TemizlikCalisanlari extends  TekbikKisimCalisanlari{
    int fazladansinif ;
    public  TemizlikCalisanlari(String ad , String soyad , double girissatiniz , double cikissatiniz ,double maas , String gorev ,int fazladansinif)
    {
        super(ad, soyad, girissatiniz, cikissatiniz, maas, gorev);
        this.fazladansinif = fazladansinif ;

    }

    public int getFazladansinif() {
        return fazladansinif;
    }

    public void setFazladansinif(int fazladansinif) {
        this.fazladansinif = fazladansinif;
    }
}
