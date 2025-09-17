
package auto;

public class Coche {
    private String color;
    private int cantPuertas;
    private String marca;
    private int anio;

    public Coche() {
    }

    public Coche(String color, int cantPuertas, String marca, int anio) {
        this.color = color;
        this.cantPuertas = cantPuertas;
        this.marca = marca;
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    public void acelerando(){
        System.out.println("El auto esta acelerando");
    
    }
    
}
