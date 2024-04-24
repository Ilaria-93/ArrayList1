/*Creare una classe Student che accenti nel costruttore il parametro name (String) e age (Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con n elementi e stamparlo in console.
Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //ArrayList con n elementi e stampato
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Mario", 21));
        students.add(new Student("Lisa", 22));
        students.add(new Student("Riccardo", 25));

        System.out.println("Students' list: " + students);

       //aggiunti 4 elementi e stampati
        students.add(new Student("Anna", 24));
        students.add(new Student("Marta", 23));
        students.add(new Student("Carlo", 20));
        students.add(new Student("Carlotta", 21));
        System.out.println("Updated students' list: " + students);

    }
}