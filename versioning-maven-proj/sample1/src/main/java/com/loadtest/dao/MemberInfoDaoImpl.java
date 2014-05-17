package com.loadtest.dao;

import java.math.BigDecimal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.loadtest.entity.MemberDetailsEntity;
import com.loadtest.vo.MemberVo;

@Repository
public class MemberInfoDaoImpl implements MemberInfoDao{

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean save(List<MemberVo> voList) {
		if(sessionFactory!=null){
			Session session = sessionFactory.getCurrentSession();
		   if(voList!=null && voList.size()>0){
			  for(MemberVo vo : voList){
				  if(vo.getId()!=null){
					  //update
					 // System.out.println("id !=null");
					  MemberDetailsEntity entity = (MemberDetailsEntity)
							  						session.get(MemberDetailsEntity.class, vo.getId());
					  entity.setFirstName(vo.getFname());
					  entity.setLastName(vo.getLname());
					 // entity.setEmail(vo.getEmail());
					  entity.setDateUpdated(new Date());
					  session.update(entity);
					  if(voList.size()%20 == 0)
						  session.flush();
					  
				  }else{
					 // System.out.println("from else");
					  MemberDetailsEntity entity = new MemberDetailsEntity();
					  entity.setId(UUID.randomUUID().toString());
					  entity.setFirstName(vo.getFname());
					  entity.setLastName(vo.getLname());
					  entity.setDateCreated(new Date());
					  entity.setEmail(vo.getEmail());
					  entity.setStatusCode("ACT");

                      SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss.SSS");
					 // String time=sdf.format(new Date());
					  String time =  sdf.format(new Date());
					
					  BigDecimal decimal = new BigDecimal(time);
					  entity.setTimeDate(decimal);
					  //System.out.println("afer bibgdescimal");
					  entity.setCreatedBy(2);
					  entity.setSources(vo.getSource());
					  session.save(entity);
					  if(voList.size()%20 == 0){
						  session.flush();
					  }
				  }
			  }
			  
		  }else{
			  System.out.println("voList is null;");
		  }
		}else{
			System.out.println("sessionfactory is null");
		}
		return true;
	}

	@Transactional(readOnly=true)
	public List<?> getMembers() {
		if(sessionFactory!=null){
			return sessionFactory.getCurrentSession().createQuery("From MemberDetailsEntity").list();
		}
		return null;
	}

}
