package java02_operator;

public class UnaryEx_2 {
	public static void main(String[] args) {
		
		int a=5, b=6, c=10, d;
		
		d= ++a * b--; //d= 36
		System.out.println("a="+a+",b="+b+",d="+d);  //a=6, b=5
		
		d = a++ + ++c - b--; //6+11-5 = 12  -->a = 7 , b = 4, c = 11
		System.out.println("a="+a+",b="+b+",c="+c+",d="+d);//a = 7, b = 4, c = 11, d = 12
		
		
		
		
		
		
		
		
	}
	
	
}
