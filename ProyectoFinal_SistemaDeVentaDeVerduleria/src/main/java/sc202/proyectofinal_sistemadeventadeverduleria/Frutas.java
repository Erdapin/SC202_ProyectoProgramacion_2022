package sc202.proyectofinal_sistemadeventadeverduleria;

public class Frutas extends Productos {
    //Atributos propios de la clase
    private String temporadaFrutas;
    
    //Constructores
    public Frutas(String temporadaFrutas, String nombreProducto, Double precioProducto, String fechaIngreso, int cantidadProducto) {
        super(nombreProducto, precioProducto, fechaIngreso, cantidadProducto);
        this.temporadaFrutas = temporadaFrutas;
    }
    public Frutas() {
        super();
        this.temporadaFrutas = "";
    }
    
    //GETs y SETs
    public String getTemporadaFrutas() {
        return temporadaFrutas;
    }

    public void setTemporadaFrutas(String temporadaFrutas) {
        this.temporadaFrutas = temporadaFrutas;
    }
    
}
