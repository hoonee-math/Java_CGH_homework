package com.student.model.dao;

import com.student.model.vo.Student;

// Student 를 저장하고 관리하는 녀석!
public class StudentDao { 
	private Student s, s1, s2; 
	private Student[] students = new Student[3];
	
	// [중복 체크 강사님ver] 
	private boolean checkDuplicate(Student s) {
		for(Student savedStudent : students) {
			if(savedStudent.equals(s)) //Student 클래스에서 equals Override 해서 사용하기! 객체 비교!
				return true;
		}
		return false;
	}
	
	// [객체 배열] 길이 늘리기
	public Student[] plusStudents(Student[] originStudents) {
		
		Student[] students = new Student[originStudents.length+1];
		System.arraycopy(originStudents, 0, students, 0, originStudents.length);
		
		return students;
	}
	
	// [객체 배열] // 내 저장소에 학생들을 저장시킬 기능 
	public boolean insertStudent(Student newStudent) { 
		if(!checkDuplicate(newStudent)) { // [중복 체크 강사님ver] 학생 입력하기
			for(int i = 0 ; i< students.length; i++) {
				if(students[i]==null) {
					students[i]=newStudent;
					return true;
				}
				if(i==students.length-1) {
					students = plusStudents(students);
					students[students.length-1] = newStudent;
					return true;
				}
			}
		}
		return false;
	}
	
	
	// [객체 배열] // 전체 데이터 전달해주기!
	public String searchAllStudents() {
		String infoAll="";
		for(int i=0; i<students.length;i++) {
			if(students[i]!=null) {
				if(!infoAll.equals("")) { // 내용이 있는 경우에 개행
					infoAll += "\n";
				}
				infoAll += students[i].infoStudent();
			}
		}
		return infoAll;
	}
	
	public boolean deleteStudent(int studentNo) {
		
		for(int i = 0 ; i < students.length ; i++ ) {
			if( students[i]!=null && students[i].getStudentNo()==studentNo) {
				students[i]=null;
				return true;
			}
		}
		return false;
	}
	
	public String searchStudentByNumber(int studentNo) {
		
		String result ="";
		
//		for(int i = 0 ; i < students.length ; i++ ) {
//			if(students[i]!=null && studentNo == students[i].getStudentNo() ) {
//				if(!result.equals("")) result+="\n";
//				result += students[i].infoStudent();
//			}
//		}
		for( Student s : students ) {
			if(s!=null && studentNo == s.getStudentNo() ) {
				if(!result.equals("")) result+="\n";
				result += s.infoStudent();
			}
		}
		if(result.equals("")) {
			result += studentNo+"번 학생은 존재하지 않습니다.";
		}
		return result;
	}
	
	public String searchStudentByGrade(int grade) {
		String result = "";
		
		for(int i = 0 ; i < students.length ; i++ ) {
			if(students[i]!=null && grade == students[i].getGrade() ) {
				result += students[i].infoStudent()+"\n";
			}
		}
		if(result.equals("")) {
			result += grade+"학년 학생은 존재하지 않습니다.";
		}
		return result;
	}
	
	// 학생 정보 수정을 위한 메소드
	public String modifyStudentInfo(int studentNo,int modifyNo, String modifyInfo) {
		
		for( int i=0 ; i<students.length ; i++) {
			if(students[i].getStudentNo()==studentNo) { // 학생 번호로 학생정보 호출 후 modifyNo 로 수정할 항목 접근해서 수정
				switch(modifyNo) {
					case 1 :
						int grade = (int)(modifyInfo.charAt(0)-'0');
						students[i].setGrade(grade);
						return students[i].infoStudent();
					case 2 :
						int classNumber = (int)(modifyInfo.charAt(0)-'0'); 
						students[i].setClassNumber(classNumber); 
						return students[i].infoStudent();
					case 3 : 
						students[i].setPhone(modifyInfo); 
						return students[i].infoStudent();
					case 4 : 
						students[i].setAddress(modifyInfo); 
						return students[i].infoStudent();
					default : return "잘못된 입력입니다.";
				}
			}
		}	
		return "잘못된 입력입니다.";
	}
	
	public boolean insertExample() {
		students[0] = new Student("유병승",19,1,5,"010-1234-1234","경기도 안산",180.5,'남');
		students[1] = new Student("최광훈",33,2,6,"010-1234-5678","충남 천안",173.5,'남');
		students[2] = new Student("오민현",20,3,7,"010-9876-5432","서울",190,'남');
		return true;
	}
	
	public String searchStudentByName(String name) {
		String result ="";
		for(int i = 0 ; i < students.length ; i++ ) {
			if(students[i]!=null && students[i].getName().equals(name) ) {
				if(!result.equals("")) {
					result += "\n";
				}
				result += students[i].infoStudent();
			}
		}
		if(result.equals("")) {
			result += name+" 학생은 존재하지 않습니다.";
		}
		return result;
	}
	
}
