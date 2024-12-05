package com.dto;

public class GradeDTO {
	private String term_no;
	private String student_no;
	//private String class_no;
	private float point;
	private String grade;  // 학점 컬럼을 추가하기
	
	//1대1 대응
	ClassesDTO classes;

	public GradeDTO() {
		// TODO Auto-generated constructor stub
	}

	public GradeDTO(String term_no, String student_no, float point, String grade, ClassesDTO classes) {
		super();
		this.term_no = term_no;
		this.student_no = student_no;
		this.point = point;
		this.grade = grade;
		this.classes = classes;
	}

	public String getTerm_no() {
		return term_no;
	}

	public void setTerm_no(String term_no) {
		this.term_no = term_no;
	}

	public String getStudent_no() {
		return student_no;
	}

	public void setStudent_no(String student_no) {
		this.student_no = student_no;
	}

	public float getPoint() {
		return point;
	}

	public void setPoint(float point) {
		this.point = point;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public ClassesDTO getClasses() {
		return classes;
	}

	public void setClasses(ClassesDTO classes) {
		this.classes = classes;
	}

	@Override
	public String toString() {
		return "GradeDTO [term_no=" + term_no + ", student_no=" + student_no + ", point=" + point + ", grade=" + grade
				+ ", classes=" + classes + "]";
	}

}
