package sec08.exam01_abstract_class;

public abstract class Phone {
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("�� ������ �մϴ�");
	}
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�");
	}
}
