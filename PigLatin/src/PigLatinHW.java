import java.util.Scanner;

public class PigLatinHW {

	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Write a word to turn it into Pig Latin");
	    String myString = (sc.next());
	  
//created an array of vowels
	    char[] myArray = new char[] {'a', 'e', 'i', 'o', 'u'};

	    for(int i = 0; i < myArray.length; i++){
	    	  if(myString.charAt(0) == myArray[i]){
	    	    myString = myString + "yay";
	    	    System.out.println(myString);
	    	   } 
	    	}
	    
	    	boolean hasVowels = false;
	    	for(int i = 0; i < myString.length(); i++){
	    	  for(int j = 0; j < myArray.length; j++){
	    	   if(myString.charAt(i) == myArray[j]){
	    	    hasVowels = true; 
	    	   } 
	    	  }
	    	}
	    	
	    	if(hasVowels == false){
	    	  myString += "ay";
	    	  System.out.println(myString);

	    	  }
	    	
	    	boolean hasAnyVowel = false;
	    	String wordsWithVowel = "";
	    	String wordsWithOutVowel = "";
	    	String solution = "";
	    	int lastVowel = 0;
	    	
	    
	    	for(int i = myString.length()-1; i >= 0; i--){
	    	  for(int j = myString.length()-1; j >=0; j--){
	    	   if(myString.charAt(i) == myArray[j]){
	    		lastVowel = i;
	    	    hasAnyVowel = true; 
//	    	   System.out.println("this is: "+ lastVowel);
	    	   } 
	    	  }
	    	}
	    	if(hasAnyVowel == true) {
	    		 wordsWithVowel = wordsWithVowel + myString.substring(0, lastVowel);
		    	    wordsWithOutVowel = wordsWithOutVowel + myString.substring(lastVowel);
		    	    solution = solution + wordsWithOutVowel + wordsWithVowel + "ay";
	    		 System.out.println(solution);
	    	}
   }
  }