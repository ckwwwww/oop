//Inheritance: The classes helicopter, car, and train inherit from the vehicle class, establishing an "is-a" relationship. 
//Method Overriding: The move() method in the derived classes (helicopter, car, and train) overrides the move() method in the base class (vehicle).
//Polymorphism: The code demonstrates polymorphism by using a common base class reference (vehicle) to create instances of different derived classes (helicopter, car, and train). 

package labexam;
import java.util.*;

class vehicle{
    void move(){
        System.out.println("runs");
    }
}

class helicopter extends vehicle{
    void move(){
        System.out.println("the Helicopter Flies in Air");
    }
}

class car extends vehicle{
    void move(){
        System.out.println("the Car Drives on Road ");
    }
}

class train extends vehicle{
    void move(){
        System.out.println("the Train Runs on Track");
    }
}


public class lab_4_vehicle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which kind of vehicle u want to order?");
        System.out.println("Enter\n 1 for Helicopter \n 2 for car \n 3 for train");
        vehicle vehicle;
        int n = sc.nextInt();
        if(n==1){
            // vehicle = new helicopter();
            // vehicle.move();
            vehicle v = new helicopter();
            v.move();
        }
        else if(n==2){
            vehicle = new car();
            vehicle.move();
        }
        else if(n==3){
            vehicle = new train();
            vehicle.move();
        }
        else{
            System.out.println("Enter right choice");
        }
    }
}
