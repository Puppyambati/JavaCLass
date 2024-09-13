import java.util.Scanner;
class convertstringintegertointeger
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		int k=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			k=k*10+((int)s.charAt(i)-48);
		}
			System.out.println(k);
		
	}
}
