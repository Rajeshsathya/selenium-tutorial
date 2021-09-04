package week1.day1;
import java.util.Scanner;
public class dataTypes
 {
	public static void main(String[] args) {
	int firstNum=0,secondNum=1,sum,range=8;
	System.out.println(firstNum);
	System.out.println(secondNum);

	for (int i = 0; i<range-2; i++) {
		sum=firstNum+secondNum;
		System.out.println(sum);
		firstNum=secondNum;
		secondNum=sum;
		
	}
	
	
	
 }
 }