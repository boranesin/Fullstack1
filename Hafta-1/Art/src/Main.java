import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil;
        Scanner girdi = new Scanner(System.in);

        System.out.println("Yıl değerini giriniz: ");
        yil = girdi.nextInt();

        if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0)) {
            System.out.print( yil + " bir artik yildir ! ");
        } else
        { System.out.print( yil + " bir artik yil değildir ! ");}
    }
}