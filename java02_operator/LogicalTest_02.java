package java02_operator;

public class LogicalTest_02 {
	public static void main(String[] args) {
		int a=5, b=6, c=10;

		boolean res1;
		res1 = a<b || --a>c++;  //4 < 6  || 4 > 10    true || false ---> OR ������ �� ������ true�� �������� �������, �ڿ��� ���� x
		System.out.println("a="+a+",b="+b+",c="+c);
		
		// OR ������ �ǿ����� �� �߿� �ϳ��� ���̸�
		//�������� ��(true)���� �����Ѵ�
		//	-> OR�������� ���� �ǿ����ڰ� ���� ���
		//	  ������ �ǿ����ڸ� Ȯ��(����)���� �ʴ´�

		
		boolean res2;
		res2 = c<b++ && c-->++a; 
		System.out.println("a="+a+",b="+b+",c="+c);
		
		// AND ������ �ǿ����� �� �߿� �ϳ��� �����̸�
		//�������� ����(false)���� �����Ѵ�
		//	-> AND�������� ���� �ǿ����ڰ� ������ ���
		//	  ������ �ǿ����ڸ� Ȯ��(����)���� �ʴ´�

	}
}






