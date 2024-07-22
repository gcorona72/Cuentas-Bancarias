import java.time.LocalDateTime;

public class Ingreso extends Dinero{

    public Ingreso(TipoDinero tipoDinero, LocalDateTime descripcion, int dinero){

        super(tipoDinero,descripcion,dinero);

    }

    @Override
    public String toString() {
        return "Gasto{" +
                "tipoDinero=" + tipoDinero +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
