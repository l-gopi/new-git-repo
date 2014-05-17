package com.loadtest.service;



import java.util.List;

import javax.ws.rs.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.transaction.TransactionException;

import com.loadtest.dao.MemberInfoDao;
import com.loadtest.vo.MemberVo;

public class MemberInfoServiceImpl implements MemberInfoService {

	@Autowired
	private MemberInfoDao memberInfoDao;
	
	public boolean insertMember(List<MemberVo> voList)  {
	System.out.println("vo is.."+voList);
		try{
			if(memberInfoDao!=null){
				return memberInfoDao.save(voList);
			}else{
				System.out.println("memberInfoDao is null");
			}
		}catch(TransactionException te){
			System.out.println("TransactionException"+te.getMessage());
			throw(te);
		}catch(DataAccessException de){
			System.out.println("DataAccessException"+de.getMessage());
			throw(de);
		}catch(Exception e){
			System.out.println("exception"+e.getMessage());
		}
		return false;
	}

	
	public List<?> getMember() {
		if(memberInfoDao!=null){
			return memberInfoDao.getMembers();
		}
		return null;
	}
	
	
	public String sayHello(String name){
		return "hello "+name;
	}

}
