package com.springswagger.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity

public class Students {
	@Id
	@ApiModelProperty(value="unique id for student")
	private int sno;
	@Column(length=30)
	private String firstname;
	@Column(length=30)
	private String lastname;
	private int phno;
	public Students(int sno, String firstname, String lastname, int phno) {
		super();
		this.sno = sno;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phno = phno;
	}
	public Students() {
		super();
	}
	@Override
	public String toString() {
		return "Students [sno=" + sno + ", firstname=" + firstname + ", lastname=" + lastname + ", phno=" + phno + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + phno;
		result = prime * result + sno;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (phno != other.phno)
			return false;
		if (sno != other.sno)
			return false;
		return true;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	
	
	
}
