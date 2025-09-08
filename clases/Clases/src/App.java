public class App {
    public static void main(String[] args) {
        Student omar = new Student();
        omar.setName("Omar");
        omar.setMajor("LGDN");
        omar.setId(23017476);
        System.out.println(omar.toString());


        System.out.println("------");    
        Student diana = new Student("Diana", "LIS", 23017475);
        System.out.println(diana.toString());
    }
}
