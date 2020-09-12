import java.util.*;
class mode7
{

public static void main(String[] args) 
{
long a=0,b=1,c,x,y,d=0,i,j,p=0,q=1,r,s=0;
Scanner sc = new Scanner(System.in);
long m=sc.nextLong();
long n=sc.nextLong();

//long m=sc.nextLong();
/*for(i=0;i<100;i++){
   c=(a+b)%10;
   a=b;
   b=c;
   if(a==0&&b==1)
    {
   	d=i+1;
   	break;
    }
   }*/
   //System.out.println(d);
	 x = m%60;
	 y = n%60;
	for(i=0;i<x;i++)
	{
		c=(a+b)%10;
		//r=(p+q)%10;
		a=b;
	//	p=q;
		b=c;
	//	q=r;
	}
	for(j=0;j<y+1;j++)
	{
		//c=(a+b)%10;
		r=(p+q)%10;
		//a=b;
		p=q;
		//b=c;
		q=r;
	}

	d=(b%10);
	s=(q%10);
	if(s-d<0)
	 {
	 	System.out.println(s-d+10);
	 } 
	else
	System.out.println((s-d));
	

 }
}