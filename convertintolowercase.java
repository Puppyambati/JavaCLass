import java.util.Scanner;
class convertintolowercase 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=sc.nextLine();
		String s2="";
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				ch=(char)(ch+32);
			}
				s2=s2+ch;
		}
				System.out.println(s2);
			}
		}

