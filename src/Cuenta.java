import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Cuenta {

        Usuario usuario;

        int saldo;

        ArrayList<Gasto> gastos;

        ArrayList<Ingreso> ingresos;

        private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        public Cuenta(Usuario nombre, int saldo, ArrayList<Gasto> gastos, ArrayList<Ingreso> ingresos) {
                this.usuario = nombre;
                this.saldo = saldo;
                this.gastos = gastos;
                this.ingresos = ingresos;
        }

        public Usuario getUsuario() {
                return usuario;
        }

        public void setUsuario(Usuario usuario) {
                this.usuario = usuario;
        }

        public int getSaldo() {
                return saldo;
        }

        public void setSaldo(int saldo) {
                this.saldo = saldo;
        }



        //Lista de gastos
        public ArrayList<Gasto> getGastos() {

                for (int i = 0; i < gastos.size(); i++) {

                        LocalDateTime now = gastos.get(i).descripcion;
                        String formatDateTime = now.format(formatter);
                        System.out.println("Se realizo un " + gastos.get(i).getTipoDinero() + " de " + gastos.get(i).getDinero() + " $ el " + formatDateTime);

                }

                return gastos;
        }

        public void setGastos(ArrayList<Gasto> gastos) {
                this.gastos = gastos;
        }

        //Lista de ingreso
        public ArrayList<Ingreso> getIngresos() {

                for (int i = 0; i < ingresos.size(); i++) {

                        LocalDateTime now = ingresos.get(i).descripcion;
                        String formatDateTime = now.format(formatter);
                        System.out.println("Se realizo un " + ingresos.get(i).getTipoDinero() + " de " + ingresos.get(i).getDinero() + " $ el " + formatDateTime);

                }

                return ingresos;
        }

        public void setIngresos(ArrayList<Ingreso> ingresos) {
                this.ingresos = ingresos;
        }

        public int verificarIngreso(int ingreso){

                saldo += ingreso;

                ingresos.add(new Ingreso(Dinero.TipoDinero.Ingreso, LocalDateTime.now(), ingreso));

                return saldo;

        }

        public boolean verificarGasto(int gasto){

                if(saldo >= gasto){

                        saldo -= gasto;

                        gastos.add(new Gasto(Dinero.TipoDinero.Gasto,LocalDateTime.now(),gasto));

                        return true;

                }else{

                        System.out.println("No hay saldo suficiente");
                        return false;

                }

        }


        @Override
        public String toString() {
                return "Cuenta{" +
                        "Usuario=" + usuario +
                        ", saldo=" + saldo +
                        '}';
        }
}
