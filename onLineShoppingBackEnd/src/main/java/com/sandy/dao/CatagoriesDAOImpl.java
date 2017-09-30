package com.sandy.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sandy.bo.CatagoriesBO;

@Repository("dao")
public class CatagoriesDAOImpl implements CatagoriesDAO {
	

	@Override
	public  List<CatagoriesBO> listCatagories() {
	  List<CatagoriesBO>listCat=new ArrayList<>();
		CatagoriesBO catbo=new CatagoriesBO();
		catbo.setId(101);
		catbo.setName("MObile");
		catbo.setDescription("Mobile catagories Lists");
		listCat.add(catbo);
		catbo=new CatagoriesBO();
		catbo.setId(102);
		catbo.setName("Television");
		catbo.setDescription("Television catagories Lists");
		listCat.add(catbo);
		catbo=new CatagoriesBO();
		catbo.setId(103);
		catbo.setName("Sports");
		catbo.setDescription("Sports catagories Lists");
		listCat.add(catbo);
		
		return listCat;
	}

	@Override
	public CatagoriesBO getCategoryById(int id) {
		new CatagoriesDAOImpl().listCatagories();
		for(CatagoriesBO catBo:new CatagoriesDAOImpl().listCatagories()) {
			if(catBo.getId()==id) return catBo;
		}
		return null;
	}

}
