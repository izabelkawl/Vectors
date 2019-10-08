/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nauka.pkg2;

import java.util.Scanner;

/**
 *
 * @author Izabela
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Wektor w1 = new Wektor();
        System.out.println("Podaj wspolrzedne wektora w1");
        
        Scanner w11 = new Scanner(System.in);
        System.out.print("x:");
        w1.x = w11.nextInt();
        int k = w1.x;
        
        Scanner w12 = new Scanner(System.in);
        System.out.print("y:");
        w1.y = w12.nextInt();

        Wektor w2 = new Wektor();
        System.out.println("Podaj wspolrzedne wektora w2");
        
        Scanner w21 = new Scanner(System.in);
        System.out.print("x:");
        w2.x = w21.nextInt();
        
        Scanner w22 = new Scanner(System.in);
        System.out.print("y:");
        w2.y = w22.nextInt();

        System.out.println("Wektor 1: A(" + w1.x + "," + w1.y + ")");
        System.out.println("Wektor 2: A(" + w2.x + "," + w2.y + ")\n");
        
        Dodawanie doda = new Dodawanie(w1.x, w1.y, w2.x, w2.y);
        doda.dodawanie();
        Odejmowanie odejm = new Odejmowanie(w1.x, w1.y, w2.x, w2.y);
        odejm.odejmowanie();

        System.out.println("Podaj liczbę przez ktora ma być pomnozony wektor:");
        Scanner licz = new Scanner(System.in);
        int liczba = licz.nextInt();

        w1.mnozenie(liczba);
        w2.mnozenie(liczba);

        Iloczyn ilo = new Iloczyn(w1.x,w1.y,w2.x,w2.y);
        ilo.iloczyn();
        
        w1.dlugosc();
        w2.dlugosc();
    }

private static class Odejmowanie {

        int a;int b; int c;int d;
        public Odejmowanie(int a, int b, int c, int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        void odejmowanie() {
            int o1 = c - a;
            int o2 = d - b;
            System.out.println("Odejmowanie = [" + o1 + "," + o2 + "]");
        }
    }

private static class Dodawanie {
        int a;int b;int c;int d;
        
        public Dodawanie(int a, int b, int c, int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        void dodawanie() {
            int d1 = a + c;
            int d2 = b + d;
            System.out.println("Dodawanie = [" + d1 + "," + d2 + "]");
        }
    }

private static class Iloczyn {
        int a;int b;int c;int d;
        
        public Iloczyn(int a, int b, int c, int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        void iloczyn(){
            int il = a * c + b * d;
            System.out.println("Iloczyn skalarny = "+il);
        }
    }

}
