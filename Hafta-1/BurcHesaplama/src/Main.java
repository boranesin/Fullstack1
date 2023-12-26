import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int birthDay, birthMonth;
        Scanner input = new Scanner(System.in);

        while (true) {
            // Ay ve gün bilgisini alıyoruz
            System.out.println("Lütfen doğduğunuz ayın rakamsal değerini giriniz");
            birthMonth = input.nextInt();

            // Ay değerini kontrol ediyoruz
            if (!(birthMonth >= 1 && birthMonth <= 12)) {
                System.out.println("Geçersiz bir ay girdiniz.");
                continue; // Hatalı giriş olduğunda tekrar döngüye git
            }

            System.out.println("Lütfen doğduğunuz günün rakamsal değerini giriniz");
            birthDay = input.nextInt();

            // Ay ve gün kontrolü
            if ((birthMonth == 1 || birthMonth == 3 || birthMonth == 5 || birthMonth == 7 || birthMonth == 8 || birthMonth == 10 || birthMonth == 12)
                    && (birthDay < 1 || birthDay > 31)) {
                System.out.println("Lütfen geçerli aralıkta bir gün giriniz");
            } else if (birthMonth == 2 && (birthDay < 1 || birthDay > 29)) {
                System.out.println("Lütfen geçerli aralıkta bir gün giriniz");
            } else if (birthDay < 1 || birthDay > 30) {
                System.out.println("Lütfen geçerli aralıkta bir gün giriniz");
            } else {
                // Doğru giriş yapıldığında döngüden çık
                break;
            }
        }

        String zodiacSign = "";

        // Burç hesaplama
        if ((birthMonth == 3 && birthDay >= 21) || (birthMonth == 4 && birthDay <= 19)) {
            zodiacSign = "Koç";
        } else if ((birthMonth == 4 && birthDay >= 20) || (birthMonth == 5 && birthDay <= 20)) {
            zodiacSign = "Boğa";
        } else if ((birthMonth == 5 && birthDay >= 21) || (birthMonth == 6 && birthDay <= 20)) {
            zodiacSign = "İkizler";
        } else if ((birthMonth == 6 && birthDay >= 21) || (birthMonth == 7 && birthDay <= 22)) {
            zodiacSign = "Yengeç";
        } else if ((birthMonth == 7 && birthDay >= 23) || (birthMonth == 8 && birthDay <= 22)) {
            zodiacSign = "Aslan";
        } else if ((birthMonth == 8 && birthDay >= 23) || (birthMonth == 9 && birthDay <= 22)) {
            zodiacSign = "Başak";
        } else if ((birthMonth == 9 && birthDay >= 23) || (birthMonth == 10 && birthDay <= 22)) {
            zodiacSign = "Terazi";
        } else if ((birthMonth == 10 && birthDay >= 23) || (birthMonth == 11 && birthDay <= 21)) {
            zodiacSign = "Akrep";
        } else if ((birthMonth == 11 && birthDay >= 22) || (birthMonth == 12 && birthDay <= 21)) {
            zodiacSign = "Yay";
        } else if ((birthMonth == 12 && birthDay >= 22) || (birthMonth == 1 && birthDay <= 19)) {
            zodiacSign = "Oğlak";
        } else if ((birthMonth == 1 && birthDay >= 20) || (birthMonth == 2 && birthDay <= 18)) {
            zodiacSign = "Kova";
        } else if ((birthMonth == 2 && birthDay >= 19) || (birthMonth == 3 && birthDay <= 20)) {
            zodiacSign = "Balık";
        }

        System.out.println("Burcunuz: " + zodiacSign);
    }
}
