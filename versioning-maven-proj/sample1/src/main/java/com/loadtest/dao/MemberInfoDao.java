package com.loadtest.dao;

import java.util.List;

import com.loadtest.vo.MemberVo;

public interface MemberInfoDao {
   public boolean save(List<MemberVo> vo);
   
   public List<?> getMembers();
}
