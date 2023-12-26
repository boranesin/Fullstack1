import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tanımlamalar
        Scanner girdi = new Scanner(System.in);
        String userName, userPassword;

        // Kullanıcı adı alındığı alan
        System.out.println("Lütfen kullanıcı adını giriniz: ");
        userName = girdi.nextLine();

        // Kullanıcı adı kontrolü
        if (!userName.equals("patika")) {
            System.out.println("Kullanıcı adı hatalı. Lütfen ismi kontrol ediniz.");
        } else {
            // Şifre alındığı alan
            System.out.println("Lütfen şifresini giriniz: ");
            userPassword = girdi.nextLine();

            // Şifre kontrolü
            if (!userPassword.equals("Patika123")) {
                System.out.println("Şifre hatalı. Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır): ");
                String resetChoice = girdi.nextLine();

                if (resetChoice.equalsIgnoreCase("Evet")) {
                    System.out.println("Lütfen yeni şifrenizi giriniz: ");
                    String newPass = girdi.nextLine();

                    // Yeni şifre kontrolü
                    if (newPass.equals(userPassword) || newPass.equals("Patika123")) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        System.out.println("Şifre oluşturuldu.");
                    }
                }
            } else {
                System.out.println("Başarılı giriş.");
            }
        }
    }
}
