package auto;

public class Auto {

    public static void main(String[] args) {
       Coche auto1 = new Coche();
       Coche auto2 = new Coche("Rojo",5,"Fitito",2006);
       
       auto2.acelerando();
       
       auto1.setColor("Verde");
       System.out.println("El color del auto1 es : "+ auto1.getColor());
    }
    
}
