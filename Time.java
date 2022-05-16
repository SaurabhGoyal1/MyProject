public class Time
{
static int hh=0,mm=0,ss=0;
public static void main(String[] args)throws InterruptedException{
		Thread t=new Thread();
		while(true)
		{
			System.out.println(hh+":"+mm+":"+ss);
			ss++;
			t.sleep(1000);
			
			if(ss==60)
			{	
				mm++;
				ss=0;

			}
			if(mm==60)
			{
				hh++;
				mm=0;
			}
		}


	}
}