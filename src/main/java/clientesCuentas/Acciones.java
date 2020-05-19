package clientesCuentas;

public class Acciones {
    private float precio;
    private float cantidad;
    private float comision;
    
    public float getPrecio(){
        return precio;
    }
    public float getCantidad(){
        return cantidad;
    }
    public float getComision(){
        return comision;
    }
    public void setPrecio(float precio){
        this.precio=precio;
    }
    public void setCantidad(float cantidad){
        this.cantidad=cantidad;
    }
    public void setComision(float comision){
        this.comision=comision;
    }
    
    public Acciones(float precio, float cantidad, float comision){
        this.precio=precio;
        this.cantidad=cantidad;
        this.comision=comision;
    }
}
