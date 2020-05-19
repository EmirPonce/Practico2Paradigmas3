package clientesCuentas;

public class Cuenta extends Clientes {
    private float saldo;
    private String tipo;
    private Ahorro ahorro;
    private Acciones acciones;
    public float getSaldo(){
        return saldo;
    }
    public String getTipo(){
        return tipo;
    }
    public void setSaldo(float saldo){
        this.saldo=saldo;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    
    public Cuenta(String nombre, String direccion, float saldo, String tipo ){
       super(nombre, direccion);
       this.saldo= saldo;
       this.tipo= tipo;
    }
}
