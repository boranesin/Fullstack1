public class Main {

    public static void main(String[] args) {
        int baslangic = 1;
        int bitis = 100;

        System.out.println(baslangic + " ile " + bitis + " arasındaki asal sayılar:");
        //döngü içinde döngü kurarak asal olma durumunu kontrol ediyoruz
        for (int i = baslangic; i <= bitis; i++) {
            int j;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j == i) {
                System.out.print(i + " ");
            }
        }
    }
}
