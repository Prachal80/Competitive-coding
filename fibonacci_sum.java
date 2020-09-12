import java.util.*; 

class fibo{

 public static void main(String[] args) 
 {
	
	 long a=0;
	 long b=1;
	 long r=0;
     Scanner sc = new Scanner(System.in);
     long c= sc.nextLong();
    
	
	for (long i=0 ;i<c+1;i++){
		 
		
		a=b;
		b=r;
		r=(a+b);
		
	    }
	    System.out.println(b);
	   
	}
}	
