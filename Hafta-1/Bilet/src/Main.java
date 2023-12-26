import java.util.Scanner;  //Kullanıcıdan giriş almak için kullanıldı.
import java.awt.Toolkit;   // kullanıcıya sesli geribildirim sağlamak amacıyla kullanıldı.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double UnitPrice = 0.1;
        byte FlyType;   // 28 nolu satırda --> "byte FlyType = sc.nextByte();" şeklinde while bloğunun içinde kullanılması switch-case tarafında tanımsız olmasına yol açtı.
        while (true) {
            System.out.println("Yolculuk tipi nedir ? \"1 veya 2 olarak giriş yapmalısınız\"  \n 1-Tek Yön \n 2-Gidiş-Dönüş  ");
            FlyType = sc.nextByte();
            if (FlyType != 1 && FlyType != 2) {
                Toolkit.getDefaultToolkit().beep();
                System.out.println("Hatalı giriş yaptınız ; tek yön için 1, gidiş-dönüş için 2 olarak giriş yapmalısınız  ");
                continue;
            }
            break;
        }

        System.out.print("Gidelecek mesafe kaç km'dir ? ");
        double RouteDistance = sc.nextDouble();
        System.out.print("Yaşınız nedir ? ");
        int UserAge = sc.nextInt();

        double FirstStepWage = RouteDistance * UnitPrice ;

        double SecondStepWage =(UserAge < 12 ) ? FirstStepWage * 0.5 :
                (UserAge > 12 && UserAge < 24 ) ? FirstStepWage * 0.9 :
                        (UserAge > 65 ) ?  FirstStepWage * 0.7 : FirstStepWage ;

        double ThirdStepWage = (FlyType == 2) ? (SecondStepWage + (SecondStepWage * 0.8))   : SecondStepWage ;

        System.out.print("Ödenecek Tutar : " + ThirdStepWage );

    }
}