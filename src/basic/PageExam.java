package basic;

import java.util.Scanner;

public class PageExam {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int count = 0;
		int cdata = (int)(Math.random()*100);
		int udata, mindata = 0, maxdata = 99;
		System.out.println("���� �����Ͽ����ϴ�. ���߾� ������.");
		System.out.println("0-99");
		
		while(true) { //���ѷ��� �߻�
			count++; //1�� �ٲ� 1��Ŀ���⶧��
			System.out.print(count+" >>");
			udata = s.nextInt();
			
			if(cdata == udata) {
				System.out.println("�¾ҽ��ϴ�.");
				System.out.print("�ٽ� �Ͻðڽ��ϱ� (Y/N) >>");
				if(s.next().toUpperCase().charAt(0)=='Y') { //toUpperCase()�� �߰������ν� �ҹ���, �빮�� y ��� ��밡��
					count=0;
					System.out.println("���� �����Ͽ����ϴ�. ���߾� ������. >>");
					System.out.println("0-99");
					cdata = (int)(Math.random()*100);
					mindata = 0; maxdata = 99;
				}
				else
					break;
			}
			else if(cdata > udata) {
				mindata = udata;
				System.out.println("�� ����");
				System.out.println(udata+"-"+maxdata);
			}
			else {
				maxdata = udata;
				System.out.println("�� ����");
				System.out.println(mindata+"-"+maxdata);
			}
		}
		s.close();
	}
}
