package scheduler;

public class RoundRobin implements Scheduler{
	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}
	
	@Override
	public void sendCallToAgent() {
		System.out.println("���� ���� �������� ��� �մϴ�.");
	}

	@Override
	public void sendCalltoAgent() {
		System.out.println("���� ���� �������� ��� �մϴ�.");		
	}
	

}
