import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        int yatirilanTutar;
        int cekilenTutar;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemin numarasını giriniz : ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı : ");
                            yatirilanTutar = input.nextInt();
                            balance += yatirilanTutar;
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            cekilenTutar = input.nextInt();
                            if (cekilenTutar > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= cekilenTutar;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Bizi tercih ettiğiniz için teşekkürler. Tekrar görüşmek üzere.");
                            break;
                        default:
                            System.out.println("Geçersiz işlem. Lütfen tekrar deneyiniz.");
                            break;
                    }
                } while (select != 4);
                break;
            } else {
                right--;
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                    System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                }
            }
        }
    }
}
