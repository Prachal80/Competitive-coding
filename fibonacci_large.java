import java.util.*;
class fiblarge
{

public static void main(String[] args) 
 {
	long one=0; 
	long two=1;
	long r=0;
	long m=0;
	Scanner sc = new Scanner(System.in);
	int c= sc.nextInt();
	if(c<=1)
	{
		System.out.println(c);
	}
	else
		{
			for (int i=0;i<c-1;i++)
	 {  

	 	m=one%10 + two%10;
        r=m;
	 	one=two%10;
	  	two=r%10;
	 }
	 if(c<=5)
	 {
	 	System.out.println(r);
	 }
	 else{
	 System.out.println(m%10);
	     }
 }	
}
}
