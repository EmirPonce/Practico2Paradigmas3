package clientesCuentas;

public class Ahorro {
    private float tasaInteres;
    private byte meses;
    public float getTasaInteres(){
        return tasaInteres;
    }
    public void setTasaInteres(float tasaInteres){
        this.tasaInteres=tasaInteres;
    }
    public byte getMeses(){
        return meses;
    }
    public void setMeses(byte meses){
        this.meses=meses;
    }
    
    public Ahorro(float tasaInteres, byte meses){
        this.tasaInteres=tasaInteres;
        this.meses=meses;
    }
}
