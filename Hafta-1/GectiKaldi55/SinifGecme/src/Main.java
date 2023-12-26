import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int matematik, fizik, turkce, kimya, muzik;

        System.out.println("Lütfen Matematik notunuzu giriniz: ");
        matematik = girdi.nextInt();
        System.out.println("Lütfen Fizik notunuzu giriniz: ");
        fizik = girdi.nextInt();
        System.out.println("Lütfen Türkçe notunuzu giriniz: ");
        turkce = girdi.nextInt();
        System.out.println("Lütfen Kimya notunuzu giriniz: ");
        kimya = girdi.nextInt();
        System.out.println("Lütfen Muzik notunuzu giriniz: ");
        muzik = girdi.nextInt();

        // Notları kontrol et ve geçerli olmayanları 0 yap
        matematik = notlarGecerli(matematik);
        fizik = notlarGecerli(fizik);
        turkce = notlarGecerli(turkce);
        kimya = notlarGecerli(kimya);
        muzik = notlarGecerli(muzik);

        // Ortalamayı hesapla
        double ortalama = (matematik + fizik + turkce + kimya + muzik) / 5.0;
        System.out.println("Not Ortalaması: " + ortalama);

        // Notları kontrol et ve mesajı yazdır
        String durum = (ortalama >= 55) ? "Sınıfı geçtin. Aferin!" : "Sınıfta kaldın. Başarılar dilerim.";
        System.out.println(durum);
    }

    // Notları 0 ile 100 arasında kontrol et, değilse 0 olarak kabul et
    public static int notlarGecerli(int not) {
        return (not >= 0 && not <= 100) ? not : 0;
    }
}
