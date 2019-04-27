/*
    Zadanie 5: Stworzenie klasy Time używając wzorcu.
    Autor: Rafał Tęcza
    Index: s19468
*/
package pjwstk.lab3.zadanie5;

public class Main {

    public static void main(String[] args) {
        Time time = new Time(6, 20, 45);
        System.out.println(time);

        time.setTime(20, 33, 5);
        System.out.println(time);
    }
}
