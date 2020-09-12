import java.util.*;
class fibmode
{

public static void main(String[] args) 
{
long a=0,b=1,c,x=0,r,d=0,i;
Scanner sc = new Scanner(System.in);
long n=sc.nextLong();
long m=sc.nextLong();
for(i=0;i<m*m;i++)
{
  		 c=(a+b)%m;
 		 a=b;
  		 b=c;
  		 if(a==0&&b==1)
   		{
   		 d=i+1;
   		 break;	
        }
         	
}
	 x = n%d;
	
	a=0;
	b=1;
	c=x;
	 for(i=1;i<x;i++)
	{
		c=(a+b)%m;
		a=b;
		b=c;
	}
	r=(c%m);
	System.out.println(r);
	}
}