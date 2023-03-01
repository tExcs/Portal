import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<People> peoples = new ArrayList<>();
    public static void main(String[] args) {


    while (true) {
        System.out.println("WELCOME TO OUR CUSTOMER PORTAL");
        System.out.println("------------------------------");

        System.out.printf("Enter a new name: ");
        Scanner scanner = new Scanner(System.in);
        String new_name = scanner.nextLine();

        if (new_name.toLowerCase().equals("exit")) {
            break;
        }

        System.out.printf("Enter age: ");
        Scanner scanner1 = new Scanner(System.in);
        int new_age = Integer.parseInt(scanner1.next());



        peoples.add(new People(new_name, new_age));

    }

    if (peoples.size() != 0) {
        for (People people : peoples) {
            System.out.println(people.new_name + " " + people.new_age);
        }
    }


    }
}