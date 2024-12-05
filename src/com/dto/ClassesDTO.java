package com.dto;

public class ClassesDTO {
	private String class_no;
	private String department_no;
	private String preattending_class_no;
	private String class_name;
	private String class_type;
	
	public ClassesDTO() {
		// TODO Auto-generated constructor stub
	}

	public ClassesDTO(String class_no, String department_no, String preattending_class_no, String class_name,
			String class_type) {
		super();
		this.class_no = class_no;
		this.department_no = department_no;
		this.preattending_class_no = preattending_class_no;
		this.class_name = class_name;
		this.class_type = class_type;
	}

	public String getClass_no() {
		return class_no;
	}

	public void setClass_no(String class_no) {
		this.class_no = class_no;
	}

	public String getDepartment_no() {
		return department_no;
	}

	public void setDepartment_no(String department_no) {
		this.department_no = department_no;
	}

	public String getPreattending_class_no() {
		return preattending_class_no;
	}

	public void setPreattending_class_no(String preattending_class_no) {
		this.preattending_class_no = preattending_class_no;
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public String getClass_type() {
		return class_type;
	}

	public void setClass_type(String class_type) {
		this.class_type = class_type;
	}

	@Override
	public String toString() {
		return "ClassesDTO [class_no=" + class_no + ", department_no=" + department_no + ", preattending_class_no="
				+ preattending_class_no + ", class_name=" + class_name + ", class_type=" + class_type + "]";
	}

}
