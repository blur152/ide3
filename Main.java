import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        EmployeeWithTerritory northernRep = new EmployeeWithTerritory();
        EmployeeWithTerritory southernRep = new EmployeeWithTerritory();
        int job = 0;


        System.out.println("plaese put number");
        job = input.nextInt();


        Employee receptionist = new Employee();
        Employee deliveryPerson = new Employee();
        if (job == 1){
        receptionist.setSalary(input.nextDouble());
            receptionist.setId(input.nextInt());}
            else if (job==2) {
            deliveryPerson.setSalary(input.nextDouble());
            deliveryPerson.setId(input.nextInt());
        } else if (job==3) {
            northernRep.setId(input.nextInt());
            northernRep.setSalary(input.nextDouble());
        } else if (job==4) {
            southernRep.setSalary(input.nextDouble());
            southernRep.setId(input.nextInt());
        }




        System.out.println(receptionist.getId());
        System.out.println(receptionist.getSalary());
        System.out.println();




    }
}