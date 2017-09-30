package com.sandy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandy.bo.CatagoriesBO;
import com.sandy.dao.CatagoriesDAO;
import com.sandy.dto.CatatgoriesDTO;

@Service("service")
public class CatagoriesServiceImpl implements CatagoriesService {
	@Autowired()
	private CatagoriesDAO dao;

	@Override
	public List<CatatgoriesDTO> getCatList() {
		List<CatatgoriesDTO> list = new ArrayList<>();
		List<CatagoriesBO> listbo = null;
		CatatgoriesDTO dto = null;
		// call dao clas method to get list
		listbo = dao.listCatagories();
		// convert listbo to list dto
		for (CatagoriesBO bo : listbo) {
			dto = new CatatgoriesDTO();
			BeanUtils.copyProperties(bo, dto);
			list.add(dto);
		}
		return list;
	}

	@Override
	public CatatgoriesDTO getCategoriesByID(int id) {
		CatagoriesBO catbo=null;
		CatatgoriesDTO catDTO=null;
		//call dao class method to get CategoryBy Id
		catbo=dao.getCategoryById(id);
		//convert catBo to CatDTO
		catDTO=new CatatgoriesDTO();
		BeanUtils.copyProperties(catbo, catDTO);
		return catDTO;
	}

}
