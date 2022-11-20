package sc202.proyectofinal_sistemadeventadeverduleria;

public class Productos {
    //Atributos de la clase parent productos
    protected String nombreProducto;
    protected Double precioProducto;
    protected String fechaIngreso;
    protected int cantidadProducto;
    
    //Constructores de la clase parent productos
    public Productos(String nombreProducto, Double precioProducto, String fechaIngreso, int cantidadProducto) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.fechaIngreso = fechaIngreso;
        this.cantidadProducto = cantidadProducto;
    }
    public Productos() {
        this.nombreProducto = "";
        this.precioProducto = 0.0;
        this.fechaIngreso = "";
        this.cantidadProducto = 0;
    }
    
    //SETs & GETs de la clase parent
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }
    
}
