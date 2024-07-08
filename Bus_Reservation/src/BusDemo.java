import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BusDemo {
    public static void main(String[] args) {
//        Bus[] buses = new Bus[50];
        Scanner sc = new Scanner(System.in);
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();
        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,false,50));
        buses.add(new Bus(3,true,48));

        for(Bus b : buses){
            b.displayBusInfo();
        }

        int userOption = 1;
        while(userOption == 1){
            System.out.println("Enter Your Option:");
            System.out.println("1)BOOK");
            System.out.println("2)EXIT\n");
            userOption = sc.nextInt();
            if(userOption == 1){
                System.out.println("Booking");
                Booking booking = new Booking();
                if(booking.isAvailable(bookings,buses)){
                    System.out.println("Your Booking is confirmed!!..\n" +
                            "Thank You For Your Booking..");
                }
                else{
                    System.out.println("The Bus is full!!!..Please select other available on the other dates..");
                }
            }
            else{
                System.out.println("----THANK YOU----");
            }
        }
    }
}