/*
 * Write a program that will ask the user to enter the amount of a purchase.
 * The program should then compute the state and country sales tax. Assume
 * the state sales tax is 4 percent and the county tax rate is 2 percent.
 * The program should display the amount of the purchase, the state sales tax,
 * the county sales tax, the total sales tax, and the total of the sale
 * (which is the sum of the amount of the purchase plus the total sales tax).
 * Hint: Use the value 0.02 to represent 2 percent, and 0.04 to represent
 * 4 percent.
 */
package java_prg_02_07_sales_tax;

import java.util.Scanner;

/**
 *
 * @author bluebackdev
 */
public class JAVA_PRG_02_07_Sales_Tax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Define constant county and state sales taxes
        final float FLT_TAX_COUNTY = 0.02f;
        final float FLT_TAX_STATE = 0.04f;
        
        // Declare variables necessary for program
        float fltUserPurchase;
        float fltUserTotal;
        float fltTaxCounty;
        float fltTaxState;
        float fltTaxTotal;
        
        // Create new keyboard to get user input
        Scanner scrKeyboard = new Scanner(System.in);
        
        // Output message to prompt user for input
        System.out.print("Please enter your purchase's total\n" +
                            "and this program will calculate tax\n"  +
                            "and final cost: $");
        
        // Get user inputs
        fltUserPurchase = scrKeyboard.nextFloat();
        
        // Calculate county, state, and total sales taxes
        fltTaxCounty = fltUserPurchase * FLT_TAX_COUNTY;
        fltTaxState = fltUserPurchase * FLT_TAX_STATE;
        fltTaxTotal = fltTaxCounty + fltTaxState;
        
        // Calculate user total cost with original price
        // plus sales tax total
        fltUserTotal = fltUserPurchase + fltTaxTotal;
        
        // Present calculated values to user via console output
        System.out.println("With a purchase of $" + fltUserPurchase +
                            "\n the county sales tax is $" + fltTaxCounty +
                            ",\nthe state sales tax is $" + fltTaxState +
                            ",\nfor a sales tax total of $" + fltTaxTotal +
                            ",\nwhich brings your total cost to $" + 
                            fltUserTotal);
    }
    
}
