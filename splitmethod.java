import java.util.Scanner;
class splitmethod 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		String [] a=s.split(" ");
		System.out.println("words present in the sentance are:");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}
}
