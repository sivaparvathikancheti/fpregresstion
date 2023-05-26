package PracticeDemo;
class Demo3
{
	public void job()
	{
		System.out.println("pc1");
	}
	
	public void friends()
	{
		System.out.println("pc2");
	}
	public void jobs()
	{
		System.out.println("pc3");
	}
}
class Demo4 extends Demo3
{
	@Override
	public void job()
	{
		System.out.println("cc1");
	}
}

public class OverRiding {

	public static void main(String[] args) {
		Demo4 demo=new Demo4();
		demo.job();
		demo.friends();
		demo.jobs();
		
		
		

	}
	}
