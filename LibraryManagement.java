package inSideClassFile;
import java.util.Scanner;
abstract class Library
{
abstract void btech();
abstract void polytechnic();
abstract void ba();
abstract void bsc();
}	
class ImplimentAllCourses extends Library
{
	void btech()
	{
		
		System.out.println("\t\tWelcome To B.Tech");
		System.out.println("Branches:");
		System.out.println("1.Computer Science(CS)");
		System.out.println("2.Macanical Engineear(ME)");
		System.out.println("3.Electronic Engineear(ECE)");
		System.out.println("4.Civil Engineear(CE)");
		System.out.println("5.Exit");
		System.out.println("Select Your Branch..");
		Scanner sc=new Scanner(System.in);
			
		int ch=sc.nextInt();
	if( ch==1||ch==2||ch==3||ch==4)
		{
			whichYear();
			
		}
		else if(ch==5)
		{
			System.out.println("Thank You...");
			System.exit(0);
		}
		else{
			System.out.println("No,Match Branch Above List\nTry Again...");
			btech();
		}
			
	}
	void polytechnic(){
		System.out.println("No,Match Branch Above List\nTry Again...");
	}
	void ba(){
		System.out.println("No,Match Branch Above List\nTry Again...");
	}
	void bsc(){
		System.out.println("No,Match Branch Above List\nTry Again...");
	}
	
	void bookFirstYear()
	{int ch;
	Scanner sc=new Scanner(System.in);
	do{
		System.out.println("1.DataBig");
		System.out.println("2.Data Structure");
		System.out.println("3.Java");
		System.out.println("4.C Language");
		System.out.println("5.Exit");
		System.out.println("6.All Exit");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:System.out.println("Hello,I am First Book");
				break;
			
			case 2:System.out.println("Hello,I am Second Book");
				break;
			
			case 3:System.out.println("Hello,I am Third Book");
				break;
			
			case 4:System.out.println("Hello,I am Fourth Book");
				break;
			case 6:System.out.println("Thank You...");
			System.exit(0);
			
		}}while(ch!=5);
		
	}
	void bookSecondYear()
	{int ch;
	Scanner sc=new Scanner(System.in);
	do{
		System.out.println("1.DataBig");
		System.out.println("2.Data Structure");
		System.out.println("3.Java");
		System.out.println("4.C Language");
		System.out.println("5.Exit");
		System.out.println("6.All Exit");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:System.out.println("Hello,I am First Book");
				break;
			
			case 2:System.out.println("Hello,I am Second Book");
				break;
			
			case 3:System.out.println("Hello,I am Third Book");
				break;
			
			case 4:System.out.println("Hello,I am Fourth Book");
				break;
			case 6:System.out.println("Thank You...");
			System.exit(0);
			
		}}while(ch!=5);
		
	}
	void bookThirdYear()
	{int ch;
	Scanner sc=new Scanner(System.in);
	do{
		System.out.println("1.DataBig");
		System.out.println("2.Data Structure");
		System.out.println("3.Java");
		System.out.println("4.C Language");
		System.out.println("5.Exit");
		System.out.println("6.All Exit");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:System.out.println("Hello,I am First Book");
				break;
			
			case 2:System.out.println("Hello,I am Second Book");
				break;
			
			case 3:System.out.println("Hello,I am Third Book");
				break;
			
			case 4:System.out.println("Hello,I am Fourth Book");
				break;
			case 6:System.out.println("Thank You...");
			System.exit(0);
			
		
		
		}}while(ch!=5);
		
	}
	void bookForthYear()
	{
		int ch;
		Scanner sc=new Scanner(System.in);
	do{
		System.out.println("1.DataBig");
		System.out.println("2.Data Structure");
		System.out.println("3.Java");
		System.out.println("4.C Language");
		System.out.println("5.Exit");
		System.out.println("6.All Exit");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:System.out.println("Hello,I am First Book");
				break;
			
			case 2:System.out.println("Hello,I am Second Book");
				break;
			
			case 3:System.out.println("Hello,I am Third Book");
				break;
			
			case 4:System.out.println("Hello,I am Fourth Book");
				break;
			case 6:System.out.println("Thank You...");
			System.exit(0);
			
		}}while(ch!=5);
		
		
	}
	void whichYear()
	{
		int ch;
		System.out.println("Years");
		do{
		System.out.println("1.Ith Year");
		System.out.println("2.IInd Year");
		System.out.println("3.IIIrd Year");
		System.out.println("4.IVth Year");
		System.out.println("5.Exit Programe");
		System.out.println("6.All Exit");
		
		System.out.println("Select Your Year..");
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:bookFirstYear();
				break;
			
			case 2:bookSecondYear();
				break;
			
			case 3:bookThirdYear();
				break;
			
			case 4:bookForthYear();
				break;
			case 6:System.out.println("Thank You...");
			System.exit(0);
			
		}}while(ch!=5);
		
			
		
		
		btech();
		
		
	}
	


}
public class LibraryManagement
{
	public static void main(String[] args)
	{
		ImplimentAllCourses im=new ImplimentAllCourses();
		im.btech();
	
	
	}
}
