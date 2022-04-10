package Unit_01;

/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */
import java.util.*;
public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s1);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) {
		{  
			 int r,sum=0,temp;    
			  int n=75457;//It is the number variable to be checked for palindrome  
			  
			  temp=n;    
			  while(n>0){    
			   r=n%10;  //getting remainder  
			   sum=(sum*10)+r;    
			   n=n/10;    
			  }    
			  if(temp==sum)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");    
		   }  

	}

	void reverseOfAString(String s) {
		String stringInput = "7545a";   

	    //Get the String length

	    int iStrLength = stringInput.length();    

	    //Using While loop

	while(iStrLength >0)

	{

	System.out.print(stringInput.charAt(iStrLength-1)); 

	iStrLength--;

	}

	}
	
	void stringEqualOrNot(String s1,String s2) {
		  
		     
		   System.out.print(s1==s2);//true (because both refer to same instance)  
		   
		
	}
}