package git;

enum system { //열거형 system 생성
	//열거형 값이 인스턴스인 이유 : 생성자를 호출하여 초기화 한다 이과정에서 생성자에 있는 문자열 출력한다
	ON(1), OFF; //열거형 값 ON(1), OFF()
	int stat;
	private system() { //OFF 상태시 종료중 메시지 출력
		System.out.println("Shutting down system...");
	}
	private system(int stat) { //ON(1) 상태시 부팅중 메시지 출력
		this.stat = stat;
		System.out.println("Boot up a System...");
	}
	
	@Override
	public String toString() {
		return "상태: " + stat; //현재 시스템 상태를 출력함 1이면 ON상태, 0이면 OFF상태이다
	}
}
public class ConstructorEnum {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		System.out.println(system.ON);
		System.out.println(system.OFF);
	}

}
