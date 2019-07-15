package git;

enum system { //������ system ����
	//������ ���� �ν��Ͻ��� ���� : �����ڸ� ȣ���Ͽ� �ʱ�ȭ �Ѵ� �̰������� �����ڿ� �ִ� ���ڿ� ����Ѵ�
	ON(1), OFF; //������ �� ON(1), OFF()
	int stat;
	private system() { //OFF ���½� ������ �޽��� ���
		System.out.println("Shutting down system...");
	}
	private system(int stat) { //ON(1) ���½� ������ �޽��� ���
		this.stat = stat;
		System.out.println("Boot up a System...");
	}
	
	@Override
	public String toString() {
		return "����: " + stat; //���� �ý��� ���¸� ����� 1�̸� ON����, 0�̸� OFF�����̴�
	}
}
public class ConstructorEnum {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println(system.ON);
		System.out.println(system.OFF);
	}

}
