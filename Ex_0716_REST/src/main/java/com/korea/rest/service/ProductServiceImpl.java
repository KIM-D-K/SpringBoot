package com.korea.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.korea.rest.dao.ProductDAO;
import com.korea.rest.vo.ProductVO;

import lombok.RequiredArgsConstructor;

@Service
//service가 필요한 이유
//지금은 컨트롤러 하나에 하나의 쿼리가 나가기 때문에 서비스에 대한
//목적이 두드러지지 않으나 기능을 계속 추가하다보면 하나의 서비스에 여러개의 쿼리가
//필요하다보니 여러개의 쿼리를 호출하는 메서드를 하나로 묶어서 처리하기 위해 존재한다.
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

	final ProductDAO productDAO;
	
	@Override
	public void register(ProductVO productVO) {
		productDAO.save(productVO);
	}

	@Override
	public List<ProductVO> getList() {
		return productDAO.findAll();
	}

	@Override
	public ProductVO getProduct(int productId) {
		return productDAO.findById(productId);
	}

}
