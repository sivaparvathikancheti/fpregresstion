package Selenium.Automation;

public class Arrays {

	public static void main(String[] args) {
		String[] str=new String[6];
		str[0]="siva";
		str[1]="siva";
		str[2]="siva";
		str[3]="siva";
		for(int i=0; i<str.length; i++) {
		System.out.println(str[i]);
		}
		int[][] a1=new int[2][3];
		a1[0][0]=45;
		a1[0][1]=45;
		a1[1][0]=45;
		a1[1][1]=45;
		a1[0][2]=45;
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a1.length;j++) {
				System.out.println(a1[i][j]);
			}
		
		
		

	}

}
