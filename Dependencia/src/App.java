package Dependencia;
public class App {
    public static void main(String[] args) throws Exception {
        Printer pri = new Printer();
        Document doc1 = new Document("Documento1");
        Document doc2=new Document("Documento2");


        pri.print(doc1);
        pri.Print(doc2);
    }
}
