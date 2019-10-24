package collection.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
/*	public void insertMember(Member member, int index) {
		
	}
	*/
	public boolean removeMember(int memberId) {
	/*	for(int i = 0; i < arrayList.size(); i++) {
			Member member =  arrayList.get(i);
			int tempId = member.getMemberId();
			if(tempId ==  memberId) {
				arrayList.remove(i);
				return true;
			}*/
		Iterator<Member> ir = arrayList.iterator();		//Iterator��ȯ
		while(ir.hasNext()) {										//��Ұ� �ִ� ����
			Member member = ir.next();						//���� ȸ���� ��ȯ����
			int tempId = member.getMemberId();		
			if(tempId == memberId) {							//ȸ�� ���̵� �Ű������� ��ġ�ϸ�
				arrayList.remove(member);						//�ش� ȸ�� ����
				return true;											//true ��ȯ
			}
		}
		//���� ������ �����Ϸ��� ���� ã�� ���� ���
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
