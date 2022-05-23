package com.cg.placement.service;

import com.cg.placement.entities.College;
import com.cg.placement.entities.Student;
import com.cg.placement.repository.CollegeRepositoryImpl;
import com.cg.placement.repository.ICollegeRepository;


public class CollegeServiceImpl implements ICollegeServiceImpl
{
	private ICollegeRepository dao;
	public CollegeServiceImpl()
	{
		dao=new CollegeRepositoryImpl();
				
	}
	
	@Override
	public College addCollege(College college)
	{
		dao.beginTransaction();
		dao.addCollege(college);
		dao.commitTransaction();
		return college;
	}
	@Override
	public College updateCollege(College college) 
	{
		dao.beginTransaction();
		dao.updateCollege(college);
		dao.commitTransaction();
		return college;
	}
	@Override
	public College searchCollege(int id) 
	{
		College college = dao.searchCollege( id);
		return college;
	}
	@Override
	public boolean deleteCollege(int id)
	{
		dao.beginTransaction();
		dao.deleteCollege(id);
		dao.commitTransaction();
		return false;
	}
	
	

}
