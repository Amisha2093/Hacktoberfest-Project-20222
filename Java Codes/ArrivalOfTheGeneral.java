import java.util.*;


public class ArrivalOfTheGeneral {
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int size[]=new int[n+1];
	int maxvalue=0;
	int minvalue=1000;
	int maxindex=0;
	int minindex=0;

	for(int i=0;i<n;i++)
		{	
		size[i] = sc.nextInt(); //getting the heights
		}
	
	
//	this code is for getting the index  max value 
	for(int i=0;i<n;i++)
	{
	if(size[i]>maxvalue){
			maxindex=i;
			maxvalue=size[i];
		}
//	 this is to get index of min value
		 if(size[i]<=minvalue){
			minindex=i;
			minvalue=size[i];
		 }
		}
		
	if(maxindex>minindex){
			System.out.println((maxindex-1)+(n-minindex)-1);
		}
		else{
			System.out.println((maxindex-1)+(n-minindex));

		}
		
		
		sc.close();
}}
