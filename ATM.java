import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        //declare and initiallize balance,withdraw and deposit
        int balance =10000;
        int withdraw, deposit;

        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("Automated Taller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 1 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform : ");

            int choice =sc.nextInt();
            switch (choice){
                case 1:{
                    System.out.print("Enter amount to be withdraw : ");
                    withdraw=sc.nextInt();

                    //check wheather the  balance greater than or equal to the withdrawl amount
                    if(balance >= withdraw){
                        //remove the withdrawl amount from the total balance
                        balance=balance-withdraw;
                        System.out.println("Please collect your amount");
                    }else{
                        //show custom error message
                        System.out.println("Insufficient Balance");
                        System.out.println("");
                    }
                    break;
                }

                case 2:{
                    System.out.println("Enter money to be deposited : ");
                    deposit=sc.nextInt();

                    //add the deposit amount to the total balance

                    balance=balance+deposit;
                    System.out.println("Your amount has been successfully deposited");
                    System.out.println("");
                    break;
                }

                case 3:{
                    //displaying the total balance of the user
                    System.out.println("Balance : "+balance);
                    System.out.println("");
                    break;
                }

                case 4:{
                     //exit from the menu
                    System.exit(0);
                }
            }
        }
    }
}
