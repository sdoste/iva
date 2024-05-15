public class ClienteDiscoteca {
    private String nombre;
    private int edad;
    private String dirección;
    private int telefono;

    public ClienteDiscoteca(String nombre, int edad, String dirección, int telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.dirección = dirección;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    @Override
    public String toString() {
        return this.nombre + ", de " + this.edad + " años. Dirección: " + this.dirección + ", y teléfono: " + this.telefono;
    }
}
