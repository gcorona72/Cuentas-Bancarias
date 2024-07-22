import java.time.LocalDateTime;

public class Dinero {

    public enum TipoDinero {Gasto,Ingreso};
    protected TipoDinero tipoDinero;
    protected int dinero;
    //Aqui almacenaremos la fecha y hora de la acción

    //En la variable descripción guardaremos la fecha del momento de la acción
    LocalDateTime descripcion;

    public Dinero(TipoDinero tipoDinero, LocalDateTime descripcion, int dinero){

        this.tipoDinero = tipoDinero;
        this.descripcion = descripcion;
        this.dinero = dinero;

    }

    public TipoDinero getTipoDinero() {
        return tipoDinero;
    }

    public void setTipoDinero(TipoDinero tipoDinero) {
        this.tipoDinero = tipoDinero;
    }

    public LocalDateTime getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(LocalDateTime descripcion) {
        this.descripcion = descripcion;
    }
    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
}
