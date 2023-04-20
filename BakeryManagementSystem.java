// Bakery Management System
// Created by Christiane A. Bacani
import java.util.Scanner;
public class BakeryManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean choose = true;
        int total = 0;
        int price[] = {5,6,7,8,9,10,11,12};
        
        System.out.print("Press enter to start : ");
        String pressEnter = input.nextLine();
        
            
        System.out.print("1.) Buy\n");
        System.out.print("2.) About\n");
        System.out.print("3.) Exit\n");
        
        System.out.print("Enter your choice here : ");
        int choice = input.nextInt();
        
        switch(choice){
            case 1:
                while(choose){
                    
                System.out.print("\tAVAILABLE BREADS\n\n");
                System.out.print("BREADS\t\t\tPRICE\n\n");
                System.out.print("1.) Pandesal\t\tP 5\n\n");
                System.out.print("2.) Ensaymada\t\tP 6\n\n");
                System.out.print("3.) Monay    \t\tP 7\n\n");
                System.out.print("4.) Pan de coco\t\tP 8\n\n");
                System.out.print("5.) Pan Amerikano\tP 9\n\n");
                System.out.print("6.) Kalihim      \tP 10\n\n");
                System.out.print("7.) Spanish Bread\tP 11\n\n");
                System.out.print("8.) Pan de bonete\tP 12\n\n");
                
                System.out.print("Enter your choice here : ");
                int userChoice = input.nextInt();
                
                System.out.print("Enter quantity : ");
                int quantity = input.nextInt();
                
                total += price[userChoice - 1] * quantity;
                
                System.out.print("Do you want to order again? (y/n): ");
                input.nextLine();
                String orderAgain = input.nextLine();
                
                if(orderAgain.equalsIgnoreCase("n")){
                    choose = false;
                    
                    System.out.print("The total price is : P " + total + "\n");
                    System.out.print("Enter your payment here : ");
                    int payment = input.nextInt();
                    
                    int change = payment - total;
                    
                    System.out.print("Change : P " + change + "\n");
                    System.out.print("\n\nTHANK YOU,PLEASE COME AGAIN!");
                }
                
                
                }
                
                break;
            
            case 2:
                System.out.print("\nTHE BAKERY MANAGEMENT APP IS DEVELOPED BY CHRISTIANE A. BACANI\nTO ENSURE THAT THE BAKERY PAYMENT SYSTEM WILL BE ADVANCE IN ANY ASPECT AND TO IMPROVE THE QUALITY OF THE STORE\n");
                break;
                
            case 3:
                System.out.print("\nTHANK YOU,PLEASE COME AGAIN!");
                break;
                
            default:
                System.out.print("\n\nINVALID CHOICE!");
        }
        
        
        
    }
}
