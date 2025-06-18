package org.example;

import java.util.Arrays;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Estudiantes[] estudiantes = new Estudiantes[20];

        Estudiantes zamir = new Estudiantes("Zamir", "Sevilla", 95);
        Estudiantes allan = new Estudiantes("Allan", "Garcia", 70);
        Estudiantes jonathan = new Estudiantes("Jonathan", "Solis", 87);
        Estudiantes ronaldo = new Estudiantes("Ronaldo", "Reyes", 89);
        Estudiantes rashiel = new Estudiantes("Rashiel", "Lopez", 80);
        Estudiantes john = new Estudiantes("John", "Diaz", 70);
        Estudiantes josue = new Estudiantes("Josue", "Lopez", 84);
        Estudiantes pablo = new Estudiantes("Pablo", "Arteaga", 69);
        Estudiantes joas = new Estudiantes("Joas", "Mendez", 94);
        Estudiantes julio = new Estudiantes("Julio", "Castillo", 79);
        Estudiantes zoila = new Estudiantes("Zoila", "Ponce", 99);
        Estudiantes marilyn = new Estudiantes("Marilyn", "Garcia", 100);
        Estudiantes neftaly = new Estudiantes("Neftaly", "Mendez", 98);
        Estudiantes ronnie = new Estudiantes("Ronnie", "Guitierres", 73);
        Estudiantes jaime = new Estudiantes("jaime", "Barbosa", 74);
        Estudiantes anielka = new Estudiantes("Anielka", "Hernandez", 96);
        Estudiantes ernesto = new Estudiantes("Ernesto", "Davila", 91);
        Estudiantes andres = new Estudiantes("Andres", "Rojo", 79);
        Estudiantes lester = new Estudiantes("Lester", "Silva", 76);
        Estudiantes jairo = new Estudiantes("jairo", "rivera", 59);

        estudiantes[0] = zamir;
        estudiantes[1] = allan;
        estudiantes[2] = jonathan;
        estudiantes[3] = ronaldo;
        estudiantes[4] = rashiel;
        estudiantes[5] = john;
        estudiantes[6] = josue;
        estudiantes[7] = pablo;
        estudiantes[8] = joas;
        estudiantes[9] = julio;
        estudiantes[10] = zoila;
        estudiantes[11] = marilyn;
        estudiantes[12] = neftaly;
        estudiantes[13] = ronnie;
        estudiantes[14] = jaime;
        estudiantes[15] = anielka;
        estudiantes[16] = ernesto;
        estudiantes[17] = andres;
        estudiantes[18] = lester;
        estudiantes[19] = jairo;

        Arrays.sort(estudiantes, Comparator.comparingInt(Estudiantes::getPromedio).reversed());

        for(Estudiantes Estudiantes : estudiantes){
            System.out.println("Nombre: "   + Estudiantes.getNombre());
            System.out.println("Apellido: "   + Estudiantes.getApellido());
            System.out.println("Promedio: "   + Estudiantes.getPromedio());
            System.out.println("---------------------------------------");


    }





    }
}