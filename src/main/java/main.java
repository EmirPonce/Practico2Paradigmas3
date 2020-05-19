import clientesCuentas.Cuenta;
import clientesCuentas.Clientes;
import clientesCuentas.Acciones;
import clientesCuentas.Ahorro;
public class main {
    /*Crear cuenta para un cliente*/
    public static void main(String[] args){
        Cuenta cuenta001;
        Cuenta cuenta002;
        Cuenta cuenta003;
        cuenta001 = new Cuenta("Emir","Aveneu",1000,"Ahorro");
        System.out.println(cuenta001.getNombre());
        System.out.println(cuenta001.getTipo());
        System.out.println(cuenta001.getSaldo());
        System.out.println(cuenta001.getDireccion());
    }
}
/*Agregando comentario de prueba*/