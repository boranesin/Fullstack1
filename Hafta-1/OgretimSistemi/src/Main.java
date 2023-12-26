public class Main {
    public static void main(String[] args){
    Teacher t1 = new Teacher("Mahmut Hoca", "TRH" , "555" );
    t1.print();
    Course tarih = new Course("Tarih", "101", "TRH", t1);
    }
}