import java.util.Locale;
import java.util.Scanner;
import java.util.function.ToDoubleBiFunction;

public class Proje_1 {
    public static void main(String[] args) {
        // Scanner class tanimlayin...
        Scanner strOku=new Scanner(System.in);

        // Kullanicidan ismini girmesini isteyin ve girilen ismin ilk hafrini buyuk harfe donusturun...
        System.out.print("Merhaba, lutfen isminizi girini:");
        String ad=strOku.nextLine();
        String isim ="";
        for (int i = 0; i < ad.length(); i++) {
            if (i == 0) {
                isim = isim + ad.toUpperCase().charAt(i);
            } else {
                isim = isim + ad.charAt(i);
            }
        }


        // Kullanicinin girdigi ismi ekrana yazdirarak, " Ahmet hosgeldin, soyismini girer misin?" diye soralim...
        System.out.print(isim+" hosgeldiniz, soyisminizi giriniz:");
        String soyAd=strOku.nextLine();

        String soyIsim ="";
        for (int i = 0; i < soyAd.length(); i++) {
            if (i == 0) {
                soyIsim = soyIsim + soyAd.toUpperCase().charAt(i);
            } else {
                soyIsim = soyIsim + soyAd.charAt(i);
            }
        }
        // Kullanici nin ismini ve soyismini ilk harfi buyuk digerleri kucuk olacak sekilde yazdiralim...
        // Ekranda gorulen isim soyisim dogru ise "Y" tusuna basarak devam edilecek sekilde dongu olusturalim...
        // Eger kullanici "Y" haricinde bir tusa basarsa "Tercihinizi dogru yapmadiniz...Lutfen tekrar deneyin..."
        // ikazi verelim
        // Kullaniciyi tekrar "Y" tusuna basana kadar donguye devam edelim...
        System.out.print(isim+" "+soyIsim+" isminiz doguru ise devam etmek icin 'Y' tusuna basiniz:");
        String yTusu=strOku.nextLine();
        while (!yTusu.equalsIgnoreCase("y")){
            System.out.println("Tercihinizi dogu yapmadiniz, Lutfen tekrar deneyiniz.");
            System.out.print(isim+" "+soyIsim+" isminiz doguru ise devam etmek icin 'Y' tusuna basiniz:");
            yTusu=strOku.nextLine();
        }


        // Kullanici "Y" tusuna bastiginda "Isim ve Soyisminiz sisteme basarili bir sekilde kayit edilmistir..."
        // ikazi verelim
        System.out.println("Isim ve Soyisminiz sisteme basarili bir sekilde kayit edilmistir");


        // Kullanici adi belirleme adimi ile devam edelim ->" Lutfen kullanici adnizi belirleyin...:"
        System.out.print("Lutfen kullanici adnizi belirleyin:");
        String kulanciAdi=strOku.nextLine();

        // Sifre belirleme ile devam edelim...->" Lutfen sifrenizi belirleyiniz...:"
        System.out.print("Lutfen sifrenizi belirleyiniz:");
        String sifre=strOku.nextLine();

        // Sifre tekrar girilmelidir -> " Sifrenizi tekrar giriniz...:"
        System.out.print("Sifrenizi tekrar giriniz:");
        String sifreTekrar=strOku.nextLine();

        // Girilen iki sifre birbiri ile ayni olmalidir... Degilse "Yanlis veya hatali bir sifre girdiniz,
        // lutfen tekrar deneyin..." ikazi verelim
        while (!sifre.equals(sifreTekrar)){
            System.out.println("Yanlis veya hatali bir sifre girdiniz, lutfen tekrar deneyin...");
            System.out.print("Lutfen sifrenizi belirleyiniz:");
            sifre=strOku.nextLine();
            System.out.print("Sifrenizi tekrar giriniz:");
            sifreTekrar=strOku.nextLine();
        }

        // Sifreler birbiri ile ayni ise "Tebrikler... "+ username + " kullanici adiyla sisteme kayit oldunuz..."
        // ikazi verelim...
        System.out.println("Tebrikler..."+kulanciAdi+" kullanici adiyla sisteme kayit oldunuz...");



    }
}
