import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //değişkenleri oluşturduk
        int mat, fizik, kimya, turkce, tarih, muzik;

        // scanner sınıfını tanittık
        Scanner inp = new Scanner(System.in);

        //şimdi verileri almaya başlayacağız
        System.out.print("Lütfen Matematik notunuzu giriniz: ");
        mat = inp.nextInt();
        System.out.print("Lütfen Fizik notunuzu giriniz: ");
        fizik = inp.nextInt();
        System.out.print("Lütfen Kimya notunuzu giriniz: ");
        kimya = inp.nextInt();
        System.out.print("Lütfen Türkçe notunuzu giriniz: ");
        turkce = inp.nextInt();
        System.out.print("Lütfen Tarih notunuzu giriniz: ");
        tarih = inp.nextInt();
        System.out.print("Lütfen Muzik notunuzu giriniz: ");
        muzik = inp.nextInt();

        // buraya kadar tanımaları yapıp değişkenlerimiz/dersler e veri girişi sağladık
        //şimdi burada bu girdilerin toplamını bir değişkene atayıp kontrolleri sağlayacağız
        int toplam = mat + fizik + kimya + turkce + muzik + tarih ;
        double ortalama = (toplam/6);

        String yiltekrari = ortalama >= 60 ? "Sınıfı geçti" : "Sınıfta galdın la!";
        System.out.println(ortalama);
        System.out.print(yiltekrari);
    }
}