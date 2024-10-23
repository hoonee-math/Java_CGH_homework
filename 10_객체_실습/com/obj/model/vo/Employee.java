package com.obj.model.vo;

//06_객체/04_필드실습.txt
public class Employee {
//	com.obj.model.vo패키지에
//	사원클래스를 만들어보자
//	이름, 부서, 직책, 월급, 보너스가 있고
//	이름, 부서 는 외부패키지에서 수정, 접근이 가능하게 설정
//	직책, 월급 내부패키지에서만 수정, 접근이 가능
//	보너스는 클래스 내부에서만 수정, 접근이 가능
//
//	main클래스에서 사원클래스 두개를 (생성)만들고 
//	이름 부서에 각각
//	유병승 강사부
//	은세계 학생부 로 등록하고 출력할것
//	객체는 두개를 생성
//

	public String name;
	public String team;
	protected String position;
	protected int income;
	private double bonus;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String team, String position, int income, double bonus) {
		super();
		this.name = name;
		this.team = team;
		this.position = position;
		this.income = income;
		this.bonus = bonus;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
}
