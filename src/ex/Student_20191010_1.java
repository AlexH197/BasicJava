package ex;
public class Student_20191010_1 {

	public static void main(String[] args) {
		
		Student_20191010 stu1 = new Student_20191010();
		stu1.setStudentName("홍나라");
		stu1.setStudentNumber("20180203");
		stu1.setStudentAge(19);
		stu1.setStudentPhone("01012345678");
		
		System.out.println(stu1.getStudentName());
		System.out.println(stu1.getStudentNumber());
		System.out.println(stu1.getStudentAge());
		System.out.println(stu1.getStudentPhone());
		
		Student_20191010 stu2 = new Student_20191010();
		stu2.setStudentName("참이슬");
		stu2.setStudentNumber("20170329");
		stu2.setStudentAge(18);
		stu2.setStudentPhone("01098745632");
		
		System.out.println(stu2.getStudentName());
		System.out.println(stu2.getStudentNumber());
		System.out.println(stu2.getStudentAge());
		System.out.println(stu2.getStudentPhone());
		
		Student_20191010 stu3 = new Student_20191010();
		stu3.setStudentName("강나루");
		stu3.setStudentNumber("20180301");
		stu3.setStudentAge(20);
		stu3.setStudentPhone("01085236987");
		
		System.out.println(stu3.getStudentName());
		System.out.println(stu3.getStudentNumber());
		System.out.println(stu3.getStudentAge());
		System.out.println(stu3.getStudentPhone());
		
	}

}
