package com.jcpdev.service;

import org.springframework.stereotype.Service;

import com.jcpdev.dao.PetProfileMapper;
import com.jcpdev.model.PetProfile;


@Service
public class PetProfileServiceImpl implements PetProfileService {
	private final PetProfileMapper dao;

	public PetProfileServiceImpl(PetProfileMapper dao) {
		this.dao = dao;
	}

	@Override
	public int insert(PetProfile pet) {
		// TODO Auto-generated method stub
		return dao.insert(pet);
	}
	

	@Override
	public int p_check(PetProfile pet) {
		
		int result = dao.p_check(pet);
		
		return result;
	}
}
