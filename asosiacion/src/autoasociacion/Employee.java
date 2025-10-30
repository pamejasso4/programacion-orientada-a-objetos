
import java.util.ArrayList;

public class Employee{
    private String name;
    private ArrayList <Employee> subordinates = new ArrayList<>();

    public Employee(String name){
        this.name = name;
    }

    public void addsubordinate (Employee suboordinate){
        suboordinate.add (suboordinate);
    }

    public showTeam(){
        if(subordinates.size() == 0 )


        for(Employee it : subordinates){
         System.out.println(it);   
        }
    }
}