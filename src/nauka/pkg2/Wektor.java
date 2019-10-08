package nauka.pkg2;
public class Wektor {

    int x;
    int y;

    Wektor() {
//        this.x = x;
//        this.y = y;
    }

    void dlugosc() {
        double a = Math.sqrt(x * x + y * y);
        System.out.println("Dlugosc wektora: " + a);
    }

    void mnozenie(int liczba) {
        int m1 = liczba * x;
        int m2 = liczba * y;
        System.out.println("Mnożenie wektora przez " + liczba + " = [" + m1 + "," + m2 + "]");
    }
    
}
