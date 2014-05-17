package com.loadtest.vo;

public class MemberVo {
  private String id;
  private String email;
  private String fname;
  private String lname;
  private String source;
  
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}

public int hashCode() {
	final int prime = 31;
	int result = 27;
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	return result;
}

public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	MemberVo other = (MemberVo) obj;
	if (email == null) {
		if (other.email != null)
			return false;
	} else if (!email.equals(other.email))
		return false;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	return true;
}

public String toString(){
	return id+""+fname+" "+lname+" "+email;
}
}
