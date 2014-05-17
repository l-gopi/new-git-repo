package com.loadtest.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.oasisopen.sca.annotation.Remotable;

import com.loadtest.vo.MemberVo;


@Remotable
public interface MemberInfoService {
	/*@POST
   public boolean insertMember(MemberListVo vo);*/
	
	@POST
	@Path("save")
	   public boolean insertMember(List<MemberVo> vo);
	
	@GET
	@Path("get")
	public List<?> getMember();
	
	@GET
	public String sayHello(@QueryParam("name") String name);
}
