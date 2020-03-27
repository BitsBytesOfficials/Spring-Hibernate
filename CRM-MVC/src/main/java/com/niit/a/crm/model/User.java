package com.niit.a.crm.model;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class User {

	@Column(name="email")
	String email;
	@Column(name="password")
	String password;
	@Id
	@Column(name="id")
	int id;
	

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		Base64.Encoder encoder= Base64.getEncoder();
		String normalString=password;
		String encodedString =encoder.encodeToString(
				normalString.getBytes(StandardCharsets.UTF_8)
				);
		this.password=encodedString;
		
		this.password = password;
	}	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
