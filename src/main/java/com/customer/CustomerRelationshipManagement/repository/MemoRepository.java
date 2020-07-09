package com.customer.CustomerRelationshipManagement.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.CustomerRelationshipManagement.model.Memo;
import com.customer.CustomerRelationshipManagement.model.MemoImp;





public interface MemoRepository extends JpaRepository<MemoImp, Long>{

	public default List<Memo> findAllMemos(){
		return new ArrayList<Memo>(findAll());
		
	}
	public Memo findMemoById(Long id);
	
	public default Memo createMemo(String text) {
		return save( new MemoImp(text));
	}
	
}
