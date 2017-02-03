import java.util.*;
import java.io.*;


class Dictionary {
	


	public static void main(String[] args) throws IOException {
	
		//builds dictionary
		long time = System.currentTimeMillis();
		Set<String> dictionary = new HashSet<String>(); 
		Scanner filescan = new Scanner(new File("dictionary.txt"));
	    while (filescan.hasNext()) {
	        dictionary.add(filescan.nextLine());
	    }
	    time = System.currentTimeMillis() - time;
	    System.out.println("Building This Dictionary took:  " + time + "ms");
	    
	    
	    while(true) {
	    	
		    //Grabs a word to test
		    Scanner scan = new Scanner(System.in);
		    System.out.print("Enter a string: ");
		    String input = scan.next().toLowerCase();
		    System.out.println();
		    
		    long searchTime = System.currentTimeMillis();
		    if(dictionary.contains(input)) {
		    	System.out.print("Input is a word!");
		    	System.out.println();
		    } else {
		    	System.out.print("Input is not a word");
		    	System.out.println();
		    }
		    searchTime = System.currentTimeMillis() - searchTime;
		    System.out.println("Building This Dictionary took:  " + searchTime + "ms");
	    }
	}

}