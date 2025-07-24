package Activities;

//import java.util.Arrays;
import java.util.*;

public class Activity2 {
	public static void main(String [] args) {
		int[] num= {10,34,10,11,10};
		System.out.println("originalArray is :"+ Arrays.toString(num));
		
		int findnum=10;
		int expectedsum=30;
		
		System.out.println("Result :"+ result(num,findnum,expectedsum));
	}
	public static boolean result(int [] numbers,int findnum,int expectedsum) {
		int temp_sum=0;
		for(int number: numbers) {
			if(number==findnum) {
				temp_sum+=findnum;
			}
			if(temp_sum>expectedsum) {
				break;
			}
		}
		
		return temp_sum==expectedsum;
	}

}
