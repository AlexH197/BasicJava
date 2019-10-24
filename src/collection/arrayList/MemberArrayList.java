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
		Iterator<Member> ir = arrayList.iterator();		//Iterator반환
		while(ir.hasNext()) {										//요소가 있는 동안
			Member member = ir.next();						//다음 회원을 반환받음
			int tempId = member.getMemberId();		
			if(tempId == memberId) {							//회원 아이디가 매개변수와 일치하면
				arrayList.remove(member);						//해당 회원 삭제
				return true;											//true 반환
			}
		}
		//끝날 때까지 삭제하려는 값을 찾지 못한 경우
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
