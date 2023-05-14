import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        Sales northernRep = new Sales();
        Sales southernRep = new Sales();












        String job;
    int x=10;
     System.out.println("please input the name of the job you want to create");
       job = input.next();
        int max = 1000;
        int min = 400;
        int deliveryPersonId = rand.nextInt((max - min) + 1) + min;
        Employee receptionist = new Employee();
        Employee deliveryPerson = new Employee();
         max = 1500;
         min = 1000;
        int northernRepId=rand.nextInt((max - min) + 1) + min;
        max = 2000;
        min = 1500;
        int southernRepId=rand.nextInt((max - min) + 1) + min;

        int territoryId = rand.nextInt((max - min) + 1) + min;












        if (job.equals("receptionist")){
            receptionist.setSalary(60000);
            receptionist.setId(rand.nextInt(400));
            System.out.println("You created a receptionist job with a salary of $"+receptionist.getSalary()+" and an Id of "+ receptionist.getId()+".");
        }
            else if (job.equals("deliveryPerson")) {
            deliveryPerson.setSalary(55000);
            deliveryPerson.setId(deliveryPersonId);
            System.out.println("You created a deliveryPerson job with a salary of $"+deliveryPerson.getSalary()+" and an Id of "+ deliveryPerson.getId()+".");
        }
            else if (job.equals("northernRep")) {
            northernRep.setId(northernRepId);
            northernRep.setSalary(70000);
            northernRep.setTerritory(territoryId);
            System.out.println("You created a northernRep job with a salary of $"+northernRep.getSalary()+" an Id of  "+ northernRep.getId()+" and a territory Id of "+northernRep.getTerritory()+".");
        }
            else if (job.equals("southernRep")) {
            southernRep.setSalary(70000);
            southernRep.setId(southernRepId);
            southernRep.setTerritory(territoryId);
            System.out.println("You created a southernRep job with a salary of $"+southernRep.getSalary()+" an Id of "+ southernRep.getId()+" and a territory Id of "+southernRep.getTerritory()+".");

        }



    //    while (x<100) {



      //  }
            System.out.println(receptionist.getId());
            System.out.println(receptionist.getSalary());
            System.out.println(deliveryPerson.getId());
            System.out.println(deliveryPerson.getSalary());
            System.out.println(northernRep.getId());
            System.out.println(northernRep.getSalary());
            System.out.println(southernRep.getId());
            System.out.println(southernRep.getSalary());
            System.out.println();









    }
}