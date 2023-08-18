import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Trabajador> listaTrabajadores = new ArrayList<>();

        // Crear trabajadores y agregarlos a la lista
        listaTrabajadores.add(new Trabajador("Juan", "Pérez", 2500.0));
        listaTrabajadores.add(new Trabajador("María", "López", 2800.0));
        listaTrabajadores.add(new Trabajador("Carlos", "González", 2200.0));
        listaTrabajadores.add(new Trabajador("Ana", "Martínez", 3000.0));
        listaTrabajadores.add(new Trabajador("Luis", "Rodríguez", 2600.0));
        listaTrabajadores.add(new Trabajador("Laura", "Hernández", 2400.0));
        listaTrabajadores.add(new Trabajador("Pedro", "Ramírez", 2700.0));
        listaTrabajadores.add(new Trabajador("Sofía", "Díaz", 2900.0));

        // Imprimir la lista de trabajadores y sus pagos
        for (Trabajador trabajador : listaTrabajadores) {
            System.out.println(trabajador);
        }
    }
}

