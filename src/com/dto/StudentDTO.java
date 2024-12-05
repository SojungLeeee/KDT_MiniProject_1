package com.dto;

import java.util.List;

// DTO 패턴 ( Data Transfer Object )
// 레이어 간의 데이터 전달 목적
//emp 테이블의 레코드 저장
public class StudentDTO {
	//private String stuNo; //실제로 student_no
	private String departNo; //실제로 department_no
	private String stuName; //실제로 student_name
	private String stuSsn; //실제로 student_ssn
	private String stuAddress; //실제로 student_address
	private String entDate; //실제로 entrance_date
	private char absYn; //실제로 absence_yn
	private String coachProfessorNo; //실제로 COACH_PROFESSOR_NO

	
	public StudentDTO() {
		// TODO Auto-generated constructor stub
	}
	
	//1대n 관계
	List<GradeDTO> tb_grade;


	public StudentDTO(String departNo, String stuName, String stuSsn, String stuAddress, String entDate, char absYn,
			String coachProfessorNo, List<GradeDTO> tb_grade) {
		super();
		this.departNo = departNo;
		this.stuName = stuName;
		this.stuSsn = stuSsn;
		this.stuAddress = stuAddress;
		this.entDate = entDate;
		this.absYn = absYn;
		this.coachProfessorNo = coachProfessorNo;
		this.tb_grade = tb_grade;
	}


	public String getDepartNo() {
		return departNo;
	}


	public void setDepartNo(String departNo) {
		this.departNo = departNo;
	}


	public String getStuName() {
		return stuName;
	}


	public void setStuName(String stuName) {
		this.stuName = stuName;
	}


	public String getStuSsn() {
		return stuSsn;
	}


	public void setStuSsn(String stuSsn) {
		this.stuSsn = stuSsn;
	}


	public String getStuAddress() {
		return stuAddress;
	}


	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}


	public String getEntDate() {
		return entDate;
	}


	public void setEntDate(String entDate) {
		this.entDate = entDate;
	}


	public char getAbsYn() {
		return absYn;
	}


	public void setAbsYn(char absYn) {
		this.absYn = absYn;
	}


	public String getCoachProfessorNo() {
		return coachProfessorNo;
	}


	public void setCoachProfessorNo(String coachProfessorNo) {
		this.coachProfessorNo = coachProfessorNo;
	}


	public List<GradeDTO> getTb_grade() {
		return tb_grade;
	}


	public void setTb_grade(List<GradeDTO> tb_grade) {
		this.tb_grade = tb_grade;
	}


	@Override
	public String toString() {
		return "StudentDTO [departNo=" + departNo + ", stuName=" + stuName + ", stuSsn=" + stuSsn + ", stuAddress="
				+ stuAddress + ", entDate=" + entDate + ", absYn=" + absYn + ", coachProfessorNo=" + coachProfessorNo
				+ ", tb_grade=" + tb_grade + "]";
	}

}
