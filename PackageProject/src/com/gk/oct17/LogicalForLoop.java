package com.gk.oct17;

public class LogicalForLoop {
	
	public void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
	
	public void printNumbers100to1() {
		
		for (int i=100;i>0;i--) {
			System.out.println(i);
		}
	}
	
	public void printOddNumbers() {
		for(int i=123;i<=146;i++) {
			if(i%2 !=0) {
				System.out.println(i);	
			}
		}
		
	}
	
	public int countOfOddNumbers() {
		int count=0;
		for(int i=123;i<=146;i++) {
			if(i%2 !=0) {
				count++;	
			}
		}
		return count;
		
	}
	
	void digitCount(int num) {
		int originalNum = num;
	      int digit =0;
	      if(num < 0) {
	    	  num =-1*num;
	      }
	      
	      while (num>0){
	       num/=10;
	       digit++;
	      }

	        System.out.println("Total numbers of Digits in "+originalNum+" = "+digit);

	}
	
	void sumOfAllDigits(int num) {
		
		 int sum=0;

        while (num>0){
            sum+= num % 10;
            num=num/10; 
        }
        System.out.println("Sum of All digits = "+sum);
	}
	
	
	void reverseNumber(int num) {
		int orginalNum = num;
		int reverseNumber = 0;
		if(num<0) {
		 num = -1 * num;
		}
		while(num>0) {
			int digit = num %10;
			reverseNumber=reverseNumber *10 +digit;
			num/=10;
		}
		if(orginalNum<0) {
			reverseNumber=-reverseNumber;
		}
			System.out.println("Reverse of Original number " +orginalNum+" = "+reverseNumber);	
	}
	
	void checkPalindrome(int num) {
		int originalNumber=num;
		int reverseNumber = 0;
		if(num<0) {
			num= -1* num;
		}
		while(num>0) {
			int digit = num % 10;
			reverseNumber=reverseNumber *10+digit;
			num/=10;
		}	
		if(originalNumber<0) {
			reverseNumber=-reverseNumber;
		}
		
		if(originalNumber==reverseNumber) {
			System.out.println("Given Number is A  Palindrome number " +originalNumber);
		}
		else {
			System.out.println("Given Number is not A  Palindrome number " +originalNumber);	
		}
		
	}
	
	void printSquarePattern(int num) {
		for(int i=1; i<=num;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	}
	
	void printRightAngleTriangle(int num) {
		for(int i=1; i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
		
		void printNumberPattern(int num) {
			for(int i=1; i<=num;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(i+" ");
				}
				System.out.println();
			}
		
	}
		
		void printInvertedNumberPattern(int num) {
			for(int i=num; i>=1;i--) {
				for(int j=1;j<=i;j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
		
	}
		
		
		void printDecresingInvertedNumberPattern(int num) {
			for(int i=num; i>=1;i--) {
				for(int j=1;j<=i;j++) {
					System.out.print(5-j+" ");
				}
				System.out.println();
			}
					
	}
		
		void pyramidPattern(int num) {
			
			for(int i=1;i<=num;i++) {
				
				//print Spaces
				for(int j=i;j<num;j++) {
					System.out.print(" ");
				}
				
				for(int k=1;k<=(2 * i -1);k++) {
					System.out.print("*");	
				}
				System.out.println();
			}
			
		}
		
		
		void dimondPattern(int rows) {
			
			for(int i = 1; i <= rows; i++) {
	            for(int j = i; j < rows; j++) System.out.print(" ");
	            for(int k = 1; k <= (2*i - 1); k++) System.out.print("*");
	            System.out.println();
	        }

	        // Lower part
	        for(int i = rows-1; i >= 1; i--) {
	            for(int j = rows; j > i; j--) System.out.print(" ");
	            for(int k = 1; k <= (2*i - 1); k++) System.out.print("*");
	            System.out.println();
	        }
		}
		
		
		
		
	
	

}
