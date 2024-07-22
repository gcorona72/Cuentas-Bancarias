import java.time.LocalDateTime;

public class Gasto extends Dinero{

    public Gasto(TipoDinero tipoDinero, LocalDateTime descripcion, int dinero){

        super(tipoDinero,descripcion, dinero);

    }

    @Override
    public String toString() {
        return "Gasto{" +
                "tipoDinero=" + tipoDinero +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
