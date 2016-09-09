package lab1;

import java.util.Scanner;

public class lab1 {

	public static void main(String[] args){
		 Scanner datainput=new Scanner(System.in);
			
			System.out.print("Enter the years to work :");
			double Yearstowork=datainput.nextDouble();
			
			System.out.print("Enter the Annual Return when your employed :");
			double AnnualReturnW=datainput.nextDouble();
			
			System.out.print("Enter the Years Retired :");
			double yearsRetired=datainput.nextDouble();
			
			System.out.print("Enter the Annual Return after retired :");
			double annualReturnR=datainput.nextDouble();
			
			System.out.print("Enter the Required Income :");
			double requiredIncome=datainput.nextDouble();
			
			System.out.print("Enter the Monthly SSI :");
			double monthlySSI=datainput.nextDouble();
			
			datainput.close();
		
		// Annuity Amount
		double annunityAmount=(requiredIncome-monthlySSI);
		// Money needed to save
		double moneyneeded=annunityAmount*(1-1/Math.pow(1+annualReturnR/12,yearsRetired*12))
				/(annualReturnR/12); 
		
		// Monthly Payment
		double payment=(moneyneeded*(AnnualReturnW)/12)/(Math.pow(1+AnnualReturnW/12,Yearstowork*12)-1);
		
		System.out.printf("The total amount of money that you need to save $%.2f \n",moneyneeded);
		System.out.printf("The total amount of money that need to save for each month $%.2f",payment);
	}

}

