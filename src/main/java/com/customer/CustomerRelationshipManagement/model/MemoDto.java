package com.customer.CustomerRelationshipManagement.model;

import java.util.Date;

public class MemoDto {
	
	public long id;
	public String text;
	public Date time;
	
	
	public MemoDto() {};
	
	public MemoDto(Memo memo) {
		id=memo.getId();
		text=memo.getText();
		time=memo.getTime();
		
	}

}
