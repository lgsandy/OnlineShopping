package com.sandy.dao;

import java.util.List;

import com.sandy.bo.CatagoriesBO;

public interface CatagoriesDAO {
	public  List<CatagoriesBO>listCatagories();
	public CatagoriesBO getCategoryById(int id);

}
