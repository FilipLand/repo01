package Objetos;

public class Paciente {
    //Valores
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    private Boolean sexoOff;
    private String nacionalidad;
    private int telefono;
    private String cuidad;
    private String correo;

    //Constructor
    public Paciente(String nombre, String apellido, int edad, String sexo, Boolean sexoOff, String nacionalidad, int telefono, String cuidad, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.sexoOff = sexoOff;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
        this.cuidad = cuidad;
        this.correo = correo;
    }
    //Constructor Vacio
    public Paciente() {}
    //Getter & Setters
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Boolean getSexoOff() {
        return sexoOff;
    }

    public void setSexoOff(Boolean sexoOff) {
        this.sexoOff = sexoOff;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    //toString

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' +
                ", sexoOff=" + sexoOff +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", telefono=" + telefono +
                ", cuidad='" + cuidad + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
