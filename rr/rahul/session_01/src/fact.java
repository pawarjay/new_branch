import java.util.Scanner;

public class fact {
	public static void main(string [] args)
	{
		System.out.println("enter the number");
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		for(int i=1;i<=num;i++)
		{
			int res=res*i;
		}
		System.out.println("factorial number:="+res);
	}
	

}
