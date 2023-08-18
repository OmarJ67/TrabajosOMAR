public class Ejemplo {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 25);
        Persona persona2 = new Persona("Pedro", 30);

        System.out.println("Nombre de persona 1: " + persona1.getNombre());
        System.out.println("Edad de persona 1: " + persona1.getEdad());

        System.out.println("Nombre de persona 2: " + persona2.getNombre());
        System.out.println("Edad de persona 2: " + persona2.getEdad());

        
        persona1.setEdad(26);
        persona2.setNombre("Carlos");

        
        System.out.println("Edad actualizada de persona 1: " + persona1.getEdad());
        System.out.println("Nombre actualizado de persona 2: " + persona2.getNombre());
    }
}
