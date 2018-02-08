
package deptstorecredit;

import java.util.Scanner;

/**
 *
 * @author hisso_000
 */
public class DeptStoreCredit {

   
    public static void main(String[] args) {
        int accNum = 0;
        int begBalance;
        int charges;
        int credits;
        int limit = 0;
        
        int endBalance = 0;
        int exCredit = 0;
        int TotalRecords = 0;
        
        Scanner input = new Scanner(System.in);
        
        
        
        while (accNum != -999)
        {
        System.out.println("Please enter account number: ");//prompt user
            accNum = input.nextInt();//read the account number
       
        if (accNum == -999)
        {
        System.out.printf("Customers that exceed credit limit: %d%n ",exCredit);//prints out # of customers that exceeded credit limit
        System.out.printf("Number of records process: %d%n ",TotalRecords);//prints out # of records processed
        }//End of if statement: (accNum == -999)
        else{   
        System.out.println("Please enter beginning account balance: ");
            begBalance = input.nextInt();
            
        System.out.println("Enter total of all items charged by customer this month: ");
            charges = input.nextInt(); 
            
        System.out.println("Enter total of credits applied to the customer's account this month: ");
            credits = input.nextInt();
            
        System.out.println("Enter customer's credit limit: ");
            limit = input.nextInt();
            
        endBalance = begBalance + charges - credits;
        TotalRecords++;
        System.out.printf("Customers New Balance: %d%n ", endBalance);
        }//End of else statement
        
        if (endBalance > limit)
        {
            System.out.println("*****Credit limit exceeded*****");
            exCredit++;
        } ///End of if statement: (endBalance > limit)
        
    }//End of While loop: (accNum != -999)
    
    }//End of Main string: public static void main(String[] args)
    
}//End of Class: public class DeptStoreCredit
