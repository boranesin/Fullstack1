import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final double pi = 3.14;
        double yaricap, alan, angel;
        Scanner girdi = new Scanner(System.in);
        //yarıçapı ve merkez açıyı kullanıcıdan temin ediyoruz. double kullandık
        System.out.println("Lütfen dairenin yarı çapını giriniz: ");
        yaricap = girdi.nextDouble();
        System.out.println("Lütfen hesaplamak istediğiniz daire dilimin merkez açısını giriniz:  ");
        angel = girdi.nextDouble();
        //hesaplamalar
        alan = (pi*yaricap*yaricap*angel)/360;
        System.out.println(alan);
        }
    }
