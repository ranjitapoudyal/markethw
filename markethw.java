package market;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class markethw {

public static void main(String[] args){
	
	
	
	}

public String ReverseString(){					//will print as well as return reversed string
	System.out.println("Enter string to reverse:");
    
    Scanner read = new Scanner(System.in);
    String str = read.nextLine();
    String reverse = "";
    
	//String str = word;
	//String reverse = "";
    
    for(int i = str.length() - 1; i >= 0; i--)
    {
        reverse = reverse + str.charAt(i);
    }
    
    System.out.println("Reversed string is:");
    System.out.println(reverse);
    return reverse;
}

public Map<String, Integer> wordCount(String[] strings) {				//will return a map
		  Map<String, Integer> map = new HashMap<String, Integer> ();
		  for (String s:strings) {
		    
		    if (!map.containsKey(s)) {  // first time we've seen this string
		      map.put(s, 1);
		    }
		    else {
		      int count = map.get(s);
		      map.put(s, count + 1);
		    }
		  }
		  return map;
}

public void prime(int num) {						//will print true if prime else false
	 int i,m=0,flag=0;
	 
	 m=num/2;      
	  if(num==0||num==1){  
	   System.out.println(num+" is not prime number");      
	  }else{  
	   for(i=2;i<=m;i++){      
	    if(num%i==0){      
	     System.out.println(num+" is not prime number");      
	     flag=1;      
	     break;      
	    }      
	   }      
	   if(flag==0)  { System.out.println(num+" is prime number"); }  
	  }//end of else  
	}    
	
public boolean isPalindrome(String text) {						//will return true if string is palindrome else false
    String clean = text.replaceAll("\\s+", "").toLowerCase();
    int length = clean.length();
    int forward = 0;
    int backward = length - 1;
    while (backward > forward) {
        char forwardChar = clean.charAt(forward++);
        char backwardChar = clean.charAt(backward--);
        if (forwardChar != backwardChar)
            return false;
    }
    return true;
}
	
public void fibonacci(int maxNumber, int previousNumber, int nextNumber) {	
	
	
	//finds  and prints number of elements desired in the Fibonacci Series
	
			 
		  System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
	 
		  for (int i = 1; i <= maxNumber; ++i)
		        {
		       System.out.print(previousNumber+" ");
		            /* On each iteration, we are assigning second number
		             * to the first number and assigning the sum of last two
		             * numbers to the second number
		             */
	 		      
		       int sum = previousNumber + nextNumber;
		       previousNumber = nextNumber;
		       nextNumber = sum;
		     }
}

public void iterate(){								//prints the loop after iterating
	// initializing ArrayList 
    List<Integer> numbers = Arrays.asList(1, 2, 3, 			//for loop 
                                   4, 5, 6, 7, 8);
    
    List<Integer> numbers2 = Arrays.asList(1, 2, 3, 			// while loop
            4, 5, 6, 7, 8);
    
    List<Integer> numbers3 = Arrays.asList(1, 2, 3, 			//advanced for loop 
            4, 5, 6, 7, 8);
    
 // For Loop for iterating ArrayList 
    for (int i = 0; i < numbers.size(); i++) {  
        System.out.print(numbers.get(i) + " ");         
    }

    int i = 0;
	while (i < numbers2.size()) {
		System.out.println(numbers2.get(i));
		i++;
	}
    
    // For Each Loop for iterating ArrayList 
    for (Integer f : numbers3) { 
        System.out.print(i + " "); 
    }
}

public void duplicate(String str) {						//prints duplicate chars
	int cnt = 0;
	  char[] inp = str.toCharArray();
	  System.out.println("Duplicate Characters are:");
	  for (int i = 0; i < str.length(); i++) {
	   for (int j = i + 1; j < str.length(); j++) {
	    if (inp[i] == inp[j]) {
	     System.out.println(inp[j]);
	     cnt++;
	     break;
	    }
	   }
	  }
}


public void SecondLargest(int arr[]) {					//will print array and then second largest number
	//int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 }; //example array
	int largest = arr[0];
	int secondLargest = arr[0];
	
	System.out.println("The given array is:" );
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+"\t");
	}
	for (int i = 0; i < arr.length; i++) {

		if (arr[i] > largest) {
			secondLargest = largest;
			largest = arr[i];

		} else if (arr[i] > secondLargest) {
			secondLargest = arr[i];

		}
	}

	System.out.println("\nSecond largest number is:" + secondLargest);

}

public void noWhiteSpaces(String sentence) {					//will print the original then sentence without whitespaces
	//String sentence = "T    his is b  ett     er.";					//example sentence
    System.out.println("Original sentence: " + sentence);
    sentence = sentence.replaceAll("\\s", "");
    System.out.println("After replacement: " + sentence);
}

public void swap() {						//asks for 2 ints and then swaps them
	int x, y, temp;
    System.out.println("Enter x and y");
    Scanner in = new Scanner(System.in);
   
    x = in.nextInt();
    y = in.nextInt();
   
    System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
   
    temp = x;
    x = y;
    y = temp;
   
    System.out.println("After Swapping\nx = "+x+"\ny = "+y);
}

}

