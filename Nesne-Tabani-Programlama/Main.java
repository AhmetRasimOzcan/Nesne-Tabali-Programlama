
package TopkapiUniversitesiMaasProgrami;
import java.util.Scanner;
//MAAS PROGRAMI GUNLUK MAASI HESAPLAMAKTADIR .
public class Main {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        // Maas Degiskeni saatlik kazanctir .
        // Ekstralarin birim basina kazanci caselerin icinde tanimlidir .
        Akademisyen d = new Dekanlar("Yunus Emre", "Kaplan", 12, 13, "Yazilim Muhendisligi", 500.00, "Dekan"); // En basitinden cok Çok biçimcilik prensibine (POLYMORPHISM) ornektir .
        Profesorler p = new Profesorler("Omer ", "Agac", 9, 18, "Yazilim Muhendsiligi", 3, 350, "Profesor");
        Asistan a = new Asistan("Ahmet Rasim", "Ozcan", 9, 18, "Yazilim Muhendisligi", 150, "Asistan", 4);
        ArastirmaGorevlileri ar = new ArastirmaGorevlileri("Tan", "Eray", 9, 12, "Yazilim Muhendisligi", 0, 200, 2, "ArastirmaGorevlisi");
        KluplerBaskanligiCalisanlari k = new KluplerBaskanligiCalisanlari("Hayat", "Gursoy", 9, 12, "Yazilim Muhendisligi", 120, 3, "Klup Isleri");
        OgrenciIsleriCalisanlari o = new OgrenciIsleriCalisanlari("Tolga", "Ozturk", 9, 20, "Yazilim Muhendisligi", 125, 3, "Ogrenci Islerinde Danismanlik");
        GuvenlikGorevlisi g = new GuvenlikGorevlisi("Fatih", "Parkin", 9, 12, 150, "Guvenlik Gorevlisi", "Amir");
        TemizlikCalisanlari t = new TemizlikCalisanlari("Asya", "Comert", 9, 18, 110, "Siniflari temizleme", 10);
        ServisSoforleri s = new ServisSoforleri("Ege", "Tasdelen", 9, 14, 100, "Servis Soforu", 100);
        KafetaryaCalisanlari ka = new KafetaryaCalisanlari("Elif", "Beyaz", 9, 11, 100, "Kantini Isletmek", 5);
        TeknikKisimBasvuru t1 = new TeknikBasvuru("Berrak","Atan","berrakatan08@gmail.com","05462452003","yok tecrubesiz");
        OgrenciBasvuru ogr = new OgrenciBasvuru("Omer","Uygur","omeruygur@gmail.com","052434523342");
        Reklam reklam = new KendiReklamim("Ahmet Rasim","05453452341","ahmetrasimozcan07@gmail.com"," is tecrubesi yok");
        System.out.println("                                HOSGELDINIZ  "       );
        System.out.println(" 1 - Masinizi ogrenmek istiyorsaniz   2 -  Is basvurusu  yapmak istiyorsaniz  .... ");

        try {


            int sec = girdi.nextInt();
            if (sec == 1) {
                int secim2;
                System.out.println("      1-Akademisyen    2- Teknik Kisim     Lutfen Secim Yapiniz...");

                secim2 = girdi.nextInt();
                if (secim2 == 1) {
                    int secim3;
                    System.out.println("Hangi AKademisyen uyesisiniz : ");
                    System.out.println("1-Dekan  2-Profesor  3-Asistan  4-Klupler Baskanligi  5-Ogrenci Isleri  6-Arastirma Gorevlisi");
                    secim3 = girdi.nextInt();
                    switch (secim3) {
                        case 1: {
                            System.out.println(d.gorev + " " + d.ad + " " + d.soyad + "  " + " " + "Bugunluk  Net Maasiniz" + ((d.getCikissatiniz() - d.getGirissatiniz()) * d.getMaas()) + " Iyi Gunler Iyi Calismalar :)");
                            break;
                        }
                        case 2: {
                            // Ekstra Ders Basina Aldigi Ucret  50 Tl dir .
                            int ekstraderssaatbasinaucret = 50;
                            System.out.println(p.gorev + " " + p.ad + " " + p.soyad + " " + "Bugunluk Net Maasiniz " + ((p.getCikissatiniz() - p.getGirissatiniz()) * p.getMaas() + p.ekstradersler * ekstraderssaatbasinaucret) + " Iyi Gunler Iyi Calismalar :)");
                            break;
                        }
                        case 3: {
                            // Ekstra Profesore Edilen  Yardima Aldigi Ucret 30 Tl dir .
                            int profesoreedilenyardimbasinaucret = 35;
                            System.out.println(a.gorev + " " + a.ad + " " + a.soyad + " " + "Bugunluk Net Maasiniz " + ((a.getCikissatiniz() - a.getGirissatiniz()) * a.getMaas() + a.profesoreekstrakaacsaatyardim * profesoreedilenyardimbasinaucret) + " Iyi Gunler Iyi Calismalar :)");
                            break;
                        }
                        case 4: {
                            //Etkinlik basina alinan prim 75 Tl dir .
                            int etkinlikbasinaalinanprim = 75;
                            System.out.println(k.gorev + " " + k.ad + " " + k.soyad + " " + "Bugunluk Net Maasiniz " + ((k.getCikissatiniz() - k.getGirissatiniz()) * k.getMaas() + k.etkinlikbasinaprim * etkinlikbasinaalinanprim) + " Iyi Gunler Iyi Calismalar :)");
                            break;
                        }
                        case 5: {
                            //Ekstra Mesai Basina  Alinan Ucret 38 Tl dir .
                            int ekstramesai = 38;
                            System.out.println(o.gorev + " " + o.ad + " " + o.soyad + " " + "Bugunluk Net Maasiniz " + ((o.getCikissatiniz() - o.getGirissatiniz()) * o.getMaas() + o.ekstramesai * ekstramesai) + " Iyi Gunler Iyi Calismalar :)");
                            break;

                        }
                        case 6: {
                            //Arastirma Gorevlileri ekstra ders basina alinan ucret 20 Tl dir .
                            int ekstradersbasinaalinanucretag = 20;
                            System.out.println(ar.gorev + " " + ar.ad + " " + ar.soyad + " " + "Bugunluk Net Maasiniz " + ((ar.getCikissatiniz() - ar.getGirissatiniz()) * ar.getMaas() + ar.ekstradersler * ekstradersbasinaalinanucretag) + " Iyi Gunler Iyi Calismalar :)");
                            break;

                        }
                        default:
                            System.out.println("Hatali Giris Yaptiniz Lutfen Daha Sonra Tekrar Deneyiniz ...");


                    }
                } else if (secim2 == 2) {
                    int secim4;
                    System.out.println("Hangi Teknik Ekib Uyesisiniz : ");
                    System.out.println("1-Guvenlik Gorevlisi  2-Temizlik Personeli  3-Servis Soforleri  4-Kafeterya Gorevlileri ");
                    secim4 = girdi.nextInt();
                    switch (secim4) {
                        case 1: {

                            System.out.println(g.gorev + " " + g.rutbe + g.ad + " " + g.soyad + " " + "Bugunluk Net Maasiniz " + ((g.getCikissatiniz() - g.getGirissatiniz()) * g.getMaas())+ " Iyi Gunler Iyi Calismalar :)");
                            break;
                        }
                        case 2: {
                            //Fazladan Sinif Basina Alinan Ucret  10 Tl dir .
                            int fazladansinifbasinaalinanucret = 10;
                            System.out.println(t.gorev + " " + t.ad + " " + t.soyad + " " + "Bugunluk Net Maasiniz " + ((t.getCikissatiniz() - t.getGirissatiniz()) * t.getMaas() + t.fazladansinif * fazladansinifbasinaalinanucret) + " Iyi Gunler Iyi Calismalar :)");
                            break;
                        }
                        case 3: {
                            // Ekstra  1 Km Basina Alinan Ucret  2 Tldir .
                            int ekstrakmbasinaucret = 2;
                            System.out.println(s.gorev + " " + s.ad + " " + s.soyad + " " + "Bugunluk Net Maasiniz " + ((s.getCikissatiniz() - s.getGirissatiniz()) * s.getMaas() + s.ekstrayol * ekstrakmbasinaucret) + " Iyi Gunler Iyi Calismalar :)");
                            break;
                        }
                        case 4: {
                            // Prim Urun Basina Alinan Ucret 7 Tl dir .
                            int primurunbasinaalinanucret = 7;
                            System.out.println(ka.gorev + " " + ka.ad + " " + ar.soyad + " " + "Bugunluk Net Maasiniz " + ((ka.getCikissatiniz() - ka.getGirissatiniz()) * ka.getMaas() + ka.kactaneprimurunusatildi * ka.kactaneprimurunusatildi) + " Iyi Gunler Iyi Calismalar :)");
                            break;
                        }
                        default:
                            System.out.println("Hatali Giris Yaptiniz Lutfen Daha Sonra Tekrar Deneyiniz ...");
                    }
                }
            } else if (sec == 2) {
                System.out.println("    Ogrencimiz olup Akademisyenlik icin basvuru yapmak istiyorsaniz - 1 i seciniz ");
                System.out.println("         Teknik Ekipte Calismak ve basvuru yapmak icin - 2 i seciniz ");
                int secim5;
                secim5 = girdi.nextInt();
                if (secim5 == 1) {
                    ogr.aciklama();
                    System.out.println("Adinizi Giriniz  :");
                    String isim = girdi.next();
                    isim = ogr.ad;

                    System.out.println("Soyadinizi Giriniz :");
                    String soyadi = girdi.next();
                    soyadi = ogr.soyad;

                    System.out.println("Mailinizi Giriniz :");
                    String mail = girdi.next();
                    mail = ogr.eposta;

                    System.out.println("Telefon Numaranizi Giriniz :");
                    String telefon = girdi.next();
                    telefon = ogr.telefonnumarasi;

                    ogr.kapanis();

                } else if (secim5 == 2) {
                    t1.karsilamaekrani();
                    System.out.println("Adinizi Giriniz  :");
                    String isim = girdi.next();
                    isim = t1.ad;

                    System.out.println("Soyadinizi Giriniz :");
                    String soyadi = girdi.next();
                    soyadi = t1.soyad;

                    System.out.println("Mailinizi Giriniz :");
                    String mail = girdi.next();
                    mail = t1.eposta;

                    System.out.println("Telefon Numaranizi Giriniz :");
                    String telefon = girdi.next();
                    telefon = t1.telefonnumarasi;

                    System.out.println("CV  Dosyanizi yukleyiniz yada kendinizden biraz bahsediniz ...");
                    String cv1 = girdi.next();
                    cv1 = t1.CV;

                    t1.gorusuruzekrani();

                }

            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
       // finally {
        //    System.out.println("Sorunsuz Program Calismaktadir.");
       // }
                 System.out.println("Isleminiz Sonlanmistir  Eger Programin Yapimcisina Iletisime Gecmek  Istiyorsaniz -1  i Seciniz Programlami Sonlandirmak Icin -0 i Seciniz .... ");

                 int secim10 = girdi.nextInt();
             if(secim10 == 1) {
                 System.out.println("Programin yapimcisi " + reklam.getAdsoyad() + " Boyle Programlar yapmak isterseniz  yada  Hata Bildirmek Icin  tel den veya mail den ulasabilirsiniz  tel= " + reklam.getTelefonnumarasi() + " mail = " + reklam.getMail() + " Iyi Gunler ....");
             } else if (secim10==0) {
                  System.out.println("IYI GUNLER :))))))");
             }
             else {
                 System.out.println("Hatali Giris Lutfen Daha Sonra Tekrar Deneyiniz ...");
             }

    }
}
