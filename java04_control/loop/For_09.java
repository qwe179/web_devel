package java04_control.loop;

public class For_09 {

	public static void main(String[] args) {
		
		//for 중첩
		for(int i =0; i<3; i++) {//i, 02, 3번
			
			for(int j = 0; j<3; j++) { //j, 0~2,3번
				System.out.println("i:"+i+",j:"+j);
				
			}
			
			System.out.println("---------------");
			
			//반복문 중첩 시 고려사항
			//바깥쪽 loop의 반복변수의 진행에 맞춰
			//안쪽 loop의 반복변수가 진해오디는 과정을 생각해야 한다.
		}
	}
}

