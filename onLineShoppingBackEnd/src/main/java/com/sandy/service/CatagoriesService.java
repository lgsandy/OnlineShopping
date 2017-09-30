package com.sandy.service;

import java.util.List;

import com.sandy.dto.CatatgoriesDTO;

public interface CatagoriesService {
	public List<CatatgoriesDTO>getCatList();
	public CatatgoriesDTO getCategoriesByID(int id);

}
