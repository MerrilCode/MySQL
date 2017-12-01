import  java.util.Scanner;

public class qa {
    static Scanner standardTicket = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("please enter number of standard tickets: ");

        if (standardTicket.hasNextInt()){
            int numStandard = standardTicket.nextInt();
            System.out.println("You entered " + numStandard);
        }
    }


}