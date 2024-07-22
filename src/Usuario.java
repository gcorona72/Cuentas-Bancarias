import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usuario {

    String nombre;

    int edad;

    String dni;

    public Usuario(String nombre, int edad, String dni){

        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public Usuario(String dni){
        this.dni = dni;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public boolean verificar(){

        String formato = "[0-9]{8}-*[A-Z]";

        Pattern regex = Pattern.compile(formato);

        Matcher matcher = regex.matcher(dni);

        if (matcher.matches()){

            return true;

        }else{return false;}

    }


    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                '}';
    }
}
