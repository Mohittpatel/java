package com.cg.placement.repository;

import com.cg.placement.entities.College;

public interface ICollegeRepository 
{
	College addCollege(College college);
	College updateCollege(College college);
	College searchCollege(int id);
	void deleteCollege(int id);
	void beginTransaction();
	void commitTransaction();
}
