package TopkapiUniversitesiMaasProgrami;

public class ServisSoforleri extends TekbikKisimCalisanlari{
    int ekstrayol ;
    public  ServisSoforleri(String ad , String soyad , double girissatiniz , double cikissatiniz ,double maas , String gorev , int ekstrayol)
    {
        super(ad, soyad, girissatiniz, cikissatiniz, maas, gorev);
        this.ekstrayol = ekstrayol ;
    }

    public int getEkstrayol() {
        return ekstrayol;
    }

    public void setEkstrayol(int ekstrayol) {
        this.ekstrayol = ekstrayol;
    }
}
