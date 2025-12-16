public class Persona {
    private String dni;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona (String dni, String nombre, String apellido, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void imprime() {
        System.out.println("DNI: " + dni);
        System.out.println("NOMBRE: " + nombre);
        System.out.println("APELLIDO: " + apellido);
        System.out.println("EDAD: " + dni);
    }

    public boolean mayorEdad() {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public boolean jubilado() {
        if (edad >= 65)
            return true;
        else
            return false;
    }

    public int diferenciaEdad(int edad) {
        return this.edad - getEdad();
    }
}


