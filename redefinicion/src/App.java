public class App {
    public static void main(String[] args) throws Exception {
        Pajaro pajarito = new Pajaro("Pajarito");
        pajarito.mover();
        Rana ranita = new Rana("Ranita");
        ranita.mover();
        Pez nemo = new Pez("Nemo");
        nemo.mover();
    }
}
