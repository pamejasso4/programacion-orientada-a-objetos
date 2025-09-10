public class Animal {
    private String nombre;

    Animal(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void mover() {
        System.out.println(nombre + " Movimiendome");
    }
}
