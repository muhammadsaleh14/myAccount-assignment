package oop.assignment;
import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    //main menu display
    private static void mainMenu(){
        System.out.println("Main Menu");
        System.out.println("1: Check balance\t2: Withdraw");
        System.out.println("3: Deposit      \t4: Exit");
        System.out.println("Enter choice");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //creating account objects
        ArrayList<Account> student = new ArrayList<>();
        for(int i=0; i<10; i++) {
            Account s = new Account(i, 100);
            student.add(s);
        }
        //program of menu
        for(int j=0;j>=0;j++) {
            System.out.print("Enter id: ");
            int id = input.nextInt();
            for (int i = 0; i >= 0; i++) {
                if (id >= 0 && id < 10) {
                    mainMenu();
                    int choice1 = input.nextInt();
                    if (choice1 == 1) {
                        System.out.println("Your balance is Rs " + student.get(id).getBalance());
                    } else if (choice1 == 2) {
                        System.out.println("Enter amount to withdraw ");
                        double withdraw = input.nextDouble();
                        student.get(id).withdraw(withdraw);
                    } else if (choice1 == 3) {
                        System.out.println("Enter amount to deposit ");
                        double deposit = input.nextDouble();
                        student.get(id).deposit(deposit);
                    } else if (choice1 == 4) {
                        break;
                    } else {
                        System.out.println("Enter correct value 1 - 4");
                    }
                } else {
                    System.out.println("Enter correct value 0 - 9");
                    break;
                }
            }
        }
    }
}
