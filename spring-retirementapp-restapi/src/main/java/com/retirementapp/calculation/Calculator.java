package com.retirementapp.calculation;
import java.lang.Math;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
	int frequency=1;
	double maturityAmount;

	public double maturityAmount401k(double initialAmount,double depositAmount,int duration) {

		System.out.println("Rate of interest for 401k plan is : 7%");
		double var1=Math.pow((1+0.07), (frequency*duration));
		double var2=var1-1;
		double var3=((1+0.07)/0.07);
		return maturityAmount=(initialAmount*var1)+(depositAmount*var2*var3);

	}

	public double maturityAmount403b(double initialAmount,double depositAmount,int duration) {

		System.out.println("Rate of interest for 403b plan is : 9%");
		double var1=Math.pow((1+0.09), (frequency*duration));
		double var2=var1-1;
		double var3=((1+0.09)/0.09);
		return maturityAmount=(initialAmount*var1)+(depositAmount*var2*var3);


	}

	public double maturityAmount457(double initialAmount,double depositAmount,int duration) {

		System.out.println("Rate of interest for 403b plan is : 10%");
		double var1=Math.pow((1+0.10), (frequency*duration));
		double var2=var1-1;
		double var3=((1+0.10)/0.10);
		return maturityAmount=(initialAmount*var1)+(depositAmount*var2*var3);
	}

	public double maturityAmountIRA(double initialAmount,double depositAmount,int duration) {

		System.out.println("Rate of interest for 403b plan is : 11%");
		double var1=Math.pow((1+0.09), (frequency*duration));
		double var2=var1-1;
		double var3=((1+0.11)/0.11);
		return maturityAmount=(initialAmount*var1)+(depositAmount*var2*var3);
	}
}
