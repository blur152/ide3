import java.util.Scanner;
import java.util.Random;
public class Main extends Employee{
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        Employee receptionist = new Employee();
        Employee deliveryPerson = new Employee();
        Factory  floorWorker = new Factory();
        Factory  floorManager = new Factory();
        Sales northernRep = new Sales();
        Sales southernRep = new Sales();
        String job;
        System.out.println("please input the name of the job you want to create from the list of: deliveryPerson, receptionist, northernRep, southernRep, floorWorker, or floorManager.");
        job = input.next();
        int max = 400;
        int min = 1;

        int receptionistId = rand.nextInt((max - min) + 1) + min;
        max = 1000;
        min = 400;
        int deliveryPersonId = rand.nextInt((max - min) + 1) + min;

        max = 1500;
        min = 1000;
        int northernRepId = rand.nextInt((max - min) + 1) + min;
        max = 2000;
        min = 1500;
        int southernRepId = rand.nextInt((max - min) + 1) + min;
        max = 300;
        min = 201;
        int northernTerritoryId = rand.nextInt((max - min) + 1) + min;

        max = 200;
        min = 100;
        int southernTerritoryId = rand.nextInt((max - min) + 1) + min;

        max = 3000;
        min = 2000;

        int floorWorkerId = rand.nextInt((max - min) + 1) + min;
        max = 3100;
        min = 3000;
        int floorManagerId = rand.nextInt((max - min) + 1) + min;

         final int NUM_OF_MACHINES=9;
         final int NUM_OF_FIRST_AID_COURSES_OFFERED =7;

        if (job.equals("receptionist")) {
            name = "receptionist";
            Salary=60000;
            receptionist.display();
            ID=receptionistId;
        } else if (job.equals("deliveryPerson")) {
            ID=deliveryPersonId;
            Salary=55000;
            name = "deliveryPerson";
            deliveryPerson.display();

        } else if (job.equals("northernRep")) {
            Salary=70000;
            tB=northernTerritoryId*10;
            name = "northernRep";
            tId=northernTerritoryId;
            ID=northernRepId;
            northernRep.display();
        } else if (job.equals("southernRep")) {
            Salary=70000;
            tB=southernTerritoryId*10;
            tId=southernRepId;
            name="southernRep";
            southernRep.display();
        } else if (job.equals("floorWorker")) {
            name="floorWorker";
            max = NUM_OF_MACHINES;
            min = 1;
            fAl = rand.nextInt((max - min) + 1) + min;
            Salary=50000;
            ID=floorWorkerId;
            max = NUM_OF_FIRST_AID_COURSES_OFFERED;
            min = 1;
            mCert = rand.nextInt((max - min) + 1) + min;
            floorWorker.display();
        }  else if (job.equals("floorManager")) {
            name="floorManager";
            Salary=80000;
            ID= floorManagerId;
            max = NUM_OF_FIRST_AID_COURSES_OFFERED;
            min = 5;
            fAl = rand.nextInt((max - min) + 1) + min;
            mCert=NUM_OF_MACHINES;
            floorManager.display();
             }
        else{
            System.out.println(" Sorry but that is not once of the jobs we can create. Our options are: deliveryPerson, receptionist, northernRep, southernRep, floorWorker, or floorManager.");
        }


    }

}