import auto.Employee;
public class App {
    public static void main(String[] args) throws Exception{
        Employee pam = new Employee ("pame");
        Employee omar = new Employee ("omarr");
        Employee eve = new Employee ("evelyn");

        pam.addsubordinate(omar);
        pam.addsubordinate(eve);

        eve.showTeam();
        pam.showTeam();
        omar.showTeam();



    }
}
