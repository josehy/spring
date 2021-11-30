package com.jcpdev.dao;

import java.util.List;
import java.util.Map;

import com.jcpdev.model.Member;

public interface MemberMapper {
	List<Member> selectAll();
	Member selectOne(int idx);
	int insert(Member member);
	int update(Member member);
	int delete(Map<String,Object> map); //댓글 수정	
	Member login(Member member);
	int updatepoint(Member member);
	int IdCheck(String id);
	int NickCheck(String nick);
	Member IdFound(Map<String,String> map);
}
