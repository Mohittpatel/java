package com.cg.placement.service;

import com.cg.placement.entities.College;


public interface ICollegeServiceImpl 
{
	College addCollege(College college);
	College updateCollege(College college);
	College searchCollege(int id);
	public boolean deleteCollege(int id);
}
