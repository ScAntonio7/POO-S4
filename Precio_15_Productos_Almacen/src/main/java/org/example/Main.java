package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Productos[] productos = new Productos[15];
        Productos carbon = new Productos (" Carbon 1 bolsa ", 24);
        Productos frijoles = new Productos ( "Frijoles 1lb", 40);
        Productos azucar = new Productos ("Azucar 1lb", 17);
        Productos aceite = new Productos (" Aceite 1lt ", 33);
        Productos gaseosa = new Productos ( "Gaseosa 1lt", 24);
        Productos jabon = new Productos ("Jabon 1 unidad", 17);
        Productos chicles = new Productos ( "Chicles 1 unidad ", 2);
        Productos agua = new Productos ("Agua en botella 1lt", 27);
        Productos harina = new Productos ( "Harina de trigo ", 30);
        Productos spaghetti = new Productos ("Spaghetti ", 20);
        Productos sal = new Productos (" Sal en bolsa  ", 10);
        Productos jugo = new Productos ( "Jugo de Naranja ", 15);
        Productos paste = new Productos ("Paste de alambre", 10);
        Productos escoba = new Productos ("Escoba ", 65);
        Productos mayonesa = new Productos ("Mayonesa", 35);

        productos[0] = carbon;
        productos[1] = frijoles;
        productos[2] = azucar;
        productos[3] = aceite;
        productos[4] = gaseosa;
        productos[5] = jabon;
        productos[6] = chicles;
        productos[7] = agua;
        productos[8] = harina;
        productos[9] = spaghetti;
        productos[10] = sal;
        productos[11] = jugo;
        productos[12] = paste;
        productos[13] = escoba;
        productos[14] = mayonesa;

        for(Productos Productos : productos ) {
            System.out.println("Nombre: "  + Productos.getNombre());
            System.out.println("Precio:  " + Productos.getPrecio());
            System.out.println("----------------------------------");

        }


    }
}