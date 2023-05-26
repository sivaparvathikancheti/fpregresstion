package PracticeDemo;
class Demo
{
	public int job(int num1,int num2)
	{
		int result=num1+num2;
		System.out.println(result);
		return result;
	}
	public long job(long num1,long num2)
	{
		long result=num1+num2;
		System.out.println(result);
		return result;
	}
	public float job(float num1,float num2)
	{
		float result=num1+num2;
		System.out.println(result);
		return result;
	}
}
public class OverLoading {
	public static void main(String[] args)
	{
		Demo demo=new Demo();
		demo.job(34, 45);
		demo.job(34.67f,89.67f);
	}

}
