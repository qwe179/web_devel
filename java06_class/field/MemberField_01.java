package java06_class.field;

public class MemberField_01 {

	//멤버 필드
	private int num = 999;
	private String name = "Alice";
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;///this.name 하게되면 
	}
	
	

	//getters And Setter 자동생성 단축키
	
	//alt+shift+s 
	//r
	//alt + a
	//alt + r
}
