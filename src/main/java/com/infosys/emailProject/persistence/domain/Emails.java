package com.infosys.emailProject.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Emails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long emailID;
	
	private String from1;
	
	private String to1;
	
	private String subject;
	
	private String body;
	
	private boolean read1;
	
	private boolean deleted;

	public Emails() {}
	
	public Emails(long emailID, String from1, String to1, String subject, String body, boolean read1, boolean deleted) {
		this.emailID = emailID;
		this.from1 = from1;
		this.to1 = to1;
		this.subject = subject;
		this.body = body;
		this.read1 = read1;
		this.deleted = deleted;
	}

	public long getEmailID() {
		return emailID;
	}

	public void setEmailID(long emailID) {
		this.emailID = emailID;
	}

	public String getFrom1() {
		return from1;
	}

	public void setFrom1(String from1) {
		this.from1 = from1;
	}

	public String getTo1() {
		return to1;
	}

	public void setTo1(String to1) {
		this.to1 = to1;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public boolean isRead1() {
		return read1;
	}

	public void setRead1(boolean read1) {
		this.read1 = read1;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
}
