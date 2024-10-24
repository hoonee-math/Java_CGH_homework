package com.student.controller;

import com.student.model.dao.StudentDao;
import com.student.model.vo.Student;
import com.student.view.MainView;

public class StudentController { 
	private StudentDao dao=new StudentDao();
	private MainView view=new MainView();
	//1.메인 화면 출력해주는 서비스
	public void initMenu() {
		view.mainMenu(this); 
	}
	
	//2.학생등록 메소드
	public void insertStudent() {
		// 1. 학생등록화면 -> 화면은 view 에 있음.
		Student s=new MainView().inputStudent();	// MainVeiw 의 inputStudent 메소드를 호출해 학생정보를 객체로 받아옴. s 에 저장!
		System.out.println(s.infoStudent());		// 받아온 객체 s 를 한 번 출력해서 보여줌.
		
		// 2. 등록된 학생을 저장소에 저장 -> 저장하는 것은 Dao 의 기능
		boolean result = dao.insertStudent(s);		// 받아온 객체 s 를 매개변수로하는 Dao 클래스의 insertStudent 를 호출함. 데이터를 실제로 저장시킴.
		// 3. 등록이 끝나면 client 에게 결과 화면을 출력해줌 -> 다시 View 에게 요청을 함.
		String msg = result?"정상적으로 학생을 등록했습니다."
				:"학생등록 실패, 관리자에게 문의하세요 :(";
		view.printMessage(msg); 
	}
	
	//3. 2 학생수정 메소드
	//4. 3 학생삭제 메소드
	public void deleteStudent() {
		// 1. 저장된 학생 전체 출력 -> 기존 기능 이용
		// 2.학생 번호 입력 -> view
		int studentNo = view.inputStudentNum(this,"삭제");  
		// 3.학생 삭제 ->dao
		boolean result = dao.deleteStudent(studentNo);
		// 4.삭제 출력
		view.deleteStudent(result?"정상 삭제되었습니다.":"삭제 실패");
	}
	
	// 전체조회 메소드
	public void searchAllStudents() {
		String result = dao.searchAllStudents();
		view.printStudents(result);
	}
	// 학생 번호로조회 메소드
	public void searchStudentByNumber() {
		// 1. 조회번호를 입력
		int studentNo = view.inputStudentNum(this,"조회");
		// 2. 입력된 번호와 일치하는 학생을 조회
		//  결과가 하나밖에 안나오기 때문에 객체 자체를 그대로 받아서 출력해줘도 됨.
		view.printStudents(dao.searchStudentByNumber(studentNo));
	}
	
	// 학년으로조회 메소드
	public void searchStudentByGrade() {
		// 1. 조회 학년을 입력
		int grade = view.inputStudentGrade();
		view.printStudents(dao.searchStudentByGrade(grade));
	}
	
	// 학생 정보 수정 기능
	public void modifyStudentInfo() {
		// 학생 번호로 조회 메소드 실행시키기
		int studentNo = view.inputStudentNum(this,"수정");
		
		// view.inputModiyStudentInfo() 로 받아온 문자열 분리, 수정사항 번호, 내용 // 학년(1), 반(2), 전화번호(3), 주소(4) + 내용
		String inputModifyStudentInfo = view.inputModiyStudentInfo();
		
		// 수정할 항목 번호로 저장 modifyNo
		int modifyNo = (int)(inputModifyStudentInfo.charAt(0)-'0');
		
		// 삽입할 내용 String 으로 저장 modifyInfo
		String modifyInfo = inputModifyStudentInfo.substring(1, inputModifyStudentInfo.length());
		
		// Dao 클래스에서 modifyStudentInfo 실행시키기, 매개변수(학생번호, 수정할 항목, 삽입할 내용)
		String result = dao.modifyStudentInfo(studentNo,modifyNo,modifyInfo);
		view.printStudents(dao.searchStudentByNumber(studentNo));
	}
	
	// 학생 정보 기본 예시 입력
	public void insertExample() {
		dao.insertExample();
		view.insertExampleStudents(dao.searchAllStudents());
	}
	
	// 학생 이름으로 조회 기능
	public void searchStudentByName() {
		// view 에서 학생 이름 받아와서 dao 에 학생 정보를 찾도록 매개변수로 넘겨줌.
		String result = dao.searchStudentByName(view.inputStudentName()); 
		view.printStudents(result);
	}
}




