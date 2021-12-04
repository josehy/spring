package com.jcpdev.dao;

import com.jcpdev.model.PetProfile;

public interface PetProfileMapper {
	
	int insert(PetProfile pet);
	int p_check(PetProfile pet);
}
