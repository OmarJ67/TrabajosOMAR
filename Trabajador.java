public class Trabajador {
private String nombre;
private String apellido;
private Double Salario;
public Trabajador(String nombre, String apellido, Double salario) {
    this.nombre = nombre;
    this.apellido = apellido;
    Salario = salario;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getApellido() {
    return apellido;
}
public void setApellido(String apellido) {
    this.apellido = apellido;
}
public Double getSalario() {
    return Salario;
}
public void setSalario(Double salario) {
    Salario = salario;
}
@Override
public String toString() {
    return "Trabajador [nombre=" + nombre + ", apellido=" + apellido + ", Salario=" + Salario + "]";
}

}