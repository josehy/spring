package com.jcpdev.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

import com.jcpdev.dao.MemberMapper;
import com.jcpdev.model.Member;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;


@Service
public class MemberServiceImpl implements MemberService {

	private final MemberMapper dao;
	
	public MemberServiceImpl(MemberMapper dao) {   //생성자 자동주입 @Autowired생략
		this.dao =dao;
	}
	
	
	@Override
	public Member login(Member user) {
		return dao.login(user);
	}
	
	
	@Override
	public Member selectOne(int idx) {
		// TODO Auto-generated method stub
		return dao.selectOne(idx);
	}

	@Override
	public int insert(Member member) {
		// TODO Auto-generated method stub
		return dao.insert(member);
	}

	@Override
	public int update(Member member) {
		// TODO Auto-generated method stub
		return dao.update(member);
	}

	@Override
	public int delete(int idx,String password) {
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("idx", idx);
		map.put("password", password);
		return dao.delete(map);
	}

	@Override
	public List<Member> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int updatepoint(Member member) {
		// TODO Auto-generated method stub
		return dao.updatepoint(member);
	}
	
	@Override
	public int IdCheck(String id) {
		int cnt= dao.IdCheck(id);
		return cnt;
	}
	@Override
	public int NickCheck(String nick) {
		int cnt= dao.IdCheck(nick);
		return cnt;
	}
	@Override
	public Member IdFound(String name,String nick) {
		Map<String,String> map = new HashMap<String, String>();
		map.put("name", name);
		map.put("nick", nick);
		return dao.IdFound(map);
	}
	
}

