package com.korea.db.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import vo.ProductVO;

@Mapper
public interface ProductMapper {
	
	// 상품추가
	public void insert(ProductVO productVO);
	
	// 상품조회
	public List<ProductVO> selectAll();
}

