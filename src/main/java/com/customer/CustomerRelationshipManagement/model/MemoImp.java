package com.customer.CustomerRelationshipManagement.model;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Memo")
public class MemoImp implements Memo{
	
	@Id
	@GeneratedValue
	private Long id;
	private Date time;
	private String text;	
	
	
	protected MemoImp() {}//for jpa only
	public MemoImp(String text) {
		this.text=text;
		initDate();
		
	}
	
	private void initDate() {
		Calendar today = Calendar.getInstance();
		today.set(Calendar.HOUR_OF_DAY, 0);
		time = today.getTime();
	}
	
	@Override
	public Long getId() {
		return id;
	}

	
	@Override
	public String getText() {
		
		return text;
	}
	@Override
	public Date getTime() {
		return time;
	}

}
