package com.jcpdev.service;

import java.util.List;
import java.util.Map;

import com.jcpdev.model.Member;
import com.jcpdev.model.PageDto2;
import com.jcpdev.model.Rboard;

public interface RboardService {
	List<Rboard> getList(PageDto2 dto);
	Rboard selectByIdx(int r_idx);
	int getCount();
	int update(Rboard dto);
	int delete(int r_idx);
	void readCount(int r_idx);
	int insert(Rboard rboard);
	int resultCount(String nick);
	List<Member> psByNick(PageDto2 dto);
	List<Member> getPsList(PageDto2 dto);
	int psCount();
	int searchCount(Map<String,Object>map);
}
