import java.util.Scanner;

public class YoungPhysicist {

	public static void main(String[] args)  {
		
	
Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
int x=0;
int y=0;
int z=0;
int sum1=0,sum2=0,sum3=0;
for(int i=0;i<num;i++)
{
		x =sc.nextInt();
		y =sc.nextInt();
		z =sc.nextInt();
		sum1+=x;
		sum2+=y;
		sum3+=z;
}

if(sum1==0&&sum2==0&&sum3==0)
{System.out.println("YES");
	}

else
	{System.out.println("NO");
	}
	sc.close();
	}}
